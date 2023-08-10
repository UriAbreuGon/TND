
package model;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class SqlUsuarios extends ConexionMysql {
    
    public boolean registrar(Usuarios usr){
        
        PreparedStatement ps = null;
        Connection con = conectar();
        
        String sql = "INSERT INTO usuarios (nomU, Usuario, Password, Correo, Telefono, IdTipo) VALUES (?,?,?,?,?,?)";
        
        try {
            ps = (PreparedStatement) con.prepareStatement(sql);
            ps.setString(1, usr.getNombre());
            ps.setString(2, usr.getUsuario());
            ps.setString(3, usr.getPassword());
            ps.setString(4, usr.getCorreo());
            ps.setString(5, usr.getTelefono());
            ps.setInt(6, usr.getTipoUsuario());
            
            ps.execute();
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(SqlUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    
    public boolean login(Usuarios usr) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = conectar();

        String sql = "SELECT u.IDusuario, u.NomU, u.Usuario, u.Password, u.Correo, u.Telefono, u.IdTipo FROM usuarios AS u  WHERE usuario = ?";

        try {
            ps = (PreparedStatement) con.prepareStatement(sql);
            ps.setString(1, usr.getUsuario());
            rs = ps.executeQuery();

            if (rs.next()) {

                if (usr.getPassword().equals(rs.getString(4))) {

                    usr.setIdUsuario(rs.getInt(1));
                    usr.setNombre(rs.getString(2));
                    usr.setCorreo(rs.getString(5));
                    usr.setTelefono(rs.getString(6));
                    usr.setTipoUsuario(rs.getInt(7));
                    
                    
                    return true;
                    
                    

                } else {
                    return false;

                }

            }

            return false;

        } catch (SQLException ex) {
            Logger.getLogger(SqlUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }
    public int existeUsuario(String usuario){
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = conectar();
        
        String sql = "SELECT count(IDusuario) FROM usuarios WHERE usuario = ?";
        
        
        try {
            ps = (PreparedStatement) con.prepareStatement(sql);
            ps.setString(1, usuario);
            rs = ps.executeQuery();
            
            if(rs.next()){
               return rs.getInt(1);
            }
            
            return 1;
            
            
        } catch (SQLException ex) {
            Logger.getLogger(SqlUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            return 1;
        }
        
    }
    
    public boolean validarCorreo(String correo) {

        Pattern pattern = Pattern.compile("^[A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+) * (\\. [A-Za-z]{2,})$");

        Matcher matcher = pattern.matcher(correo);

        return matcher.find();
    }
    
  
}
