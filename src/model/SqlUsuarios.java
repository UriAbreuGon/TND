
package model;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SqlUsuarios extends ConexionMysql {
    
    public boolean registrar(Usuarios usr){
        
        PreparedStatement ps = null;
        Connection con = conectar();
        
        String sql = "INSERT INTO usuarios (nomU, Usuario, Password, Correo, Telefono) VALUES (?,?,?,?,?)";
        
        try {
            ps = (PreparedStatement) con.prepareStatement(sql);
            ps.setString(1, usr.getNombre());
            ps.setString(2, usr.getUsuario());
            ps.setString(3, usr.getPassword());
            ps.setString(4, usr.getCorreo());
            ps.setString(5, usr.getTelefono());
            
            ps.execute();
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(SqlUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    
    }
    
}
