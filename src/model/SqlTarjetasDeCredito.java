/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SqlTarjetasDeCredito extends ConexionMysql {

public boolean registrarCompra(Compra compra) {
    PreparedStatement ps = null;
    Connection con = conectar();

    String sql = "INSERT INTO compras (`Fecha de compra`, `MontoCompra`, Cantidadrecargas) VALUES (?,?,?)";

    try {
        ps = (PreparedStatement) con.prepareStatement(sql);
        ps.setString(1, compra.getFechaCompra());
        ps.setInt(2, compra.getMontoCompra());
        ps.setInt(3, compra.getCantidadRecargas());

        ps.execute();
        return true;

    } catch (SQLException ex) {
        Logger.getLogger(SqlTarjetasDeCredito.class.getName()).log(Level.SEVERE, null, ex);
        return false;
    }
}

    public int obtenerCantidadCompras(int idUsuario) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = conectar();

        String sql = "SELECT COUNT(*) AS cantidad FROM compras WHERE Idtarjeta = ?";

        try {
            ps = (PreparedStatement) con.prepareStatement(sql);
            ps.setInt(1, idUsuario);
            rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt("cantidad");
            } else {
                return 0;
            }
        } catch (SQLException ex) {
            Logger.getLogger(SqlTarjetasDeCredito.class.getName()).log(Level.SEVERE, "Error al obtener cantidad de compras", ex);
            return 0;
        } finally {
            cerrarRecursos(rs, ps, con);
        }
    }

    public int obtenerIdUsuarioPorTarjeta(int numeroTarjeta) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = conectar();

        String sql = "SELECT IdUsuario FROM tarjetas WHERE NumeroTarjeta = ?"; // Cambiar "tarjetas" al nombre correcto de la tabla

        try {
            ps = (PreparedStatement) con.prepareStatement(sql);
            ps.setInt(1, numeroTarjeta);
            rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt("IdUsuario");
            } else {
                return -1; // Indicador de que no se encontró el usuario
            }
        } catch (SQLException ex) {
            Logger.getLogger(SqlTarjetasDeCredito.class.getName()).log(Level.SEVERE, "Error al obtener ID de usuario por tarjeta", ex);
            return -1; // Indicador de error
        } finally {
            cerrarRecursos(rs, ps, con);
        }
    }

    private void cerrarRecursos(ResultSet rs, PreparedStatement ps, Connection con) {
        try {
            if (rs != null) {
                rs.close();
            }
            cerrarRecursos(ps, con);
        } catch (SQLException ex) {
            Logger.getLogger(SqlTarjetasDeCredito.class.getName()).log(Level.SEVERE, "Error al cerrar recursos", ex);
        }
    }

    private void cerrarRecursos(PreparedStatement ps, Connection con) {
        try {
            if (ps != null) {
                ps.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(SqlTarjetasDeCredito.class.getName()).log(Level.SEVERE, "Error al cerrar recursos", ex);
        }
    }
    
        public String obtenerInformacionPorId(int idUsuario) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = conectar();

        String sql = "SELECT * FROM usuarios WHERE IDUsuario = ?"; 

        try {
            ps = (PreparedStatement) con.prepareStatement(sql);
            ps.setInt(1, idUsuario);
            rs = ps.executeQuery();

            if (rs.next()) {
                int id = rs.getInt("IDUsuario");
                String nombre = rs.getString("Nombre");
                String email = rs.getString("Email");
                
               

                return "ID: " + id + "\n" +
                       "Nombre: " + nombre + "\n" +
                       "Email: " + email;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(SqlTarjetasDeCredito.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
        
    public List<Compra> buscarComprasPorIDTarjetaRecarga(int idTarjetaRecarga) {
        List<Compra> comprasList = new ArrayList<>();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = conectar();

        String sql = "SELECT * FROM compras WHERE IDTarjetaRecarga = ?";

        try {
            ps = (PreparedStatement) con.prepareStatement(sql);
            ps.setInt(1, idTarjetaRecarga);
            rs = ps.executeQuery();

            while (rs.next()) {
                int idTarjetaRecargaResultado = rs.getInt("IDTarjetaRecarga");
                String fechaCompra = rs.getString("Fechacompra");
                int cantidadRecargas = rs.getInt("Cantidadrecargas");
                int montoCompra = rs.getInt("Montocompra");

                Compra compra = new Compra(idTarjetaRecargaResultado, fechaCompra, fechaCompra, cantidadRecargas);
                compra.setIdTarjetaRecarga(rs.getInt("IDTarjetaRecarga"));
                compra.setFechaCompra(rs.getString("Fechacompra"));
                compra.setCantidadRecargas(rs.getInt("Cantidadrecargas"));
                compra.setMontoCompra(rs.getInt("Montocompra"));

                comprasList.add(compra);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SqlTarjetasDeCredito.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            cerrarRecursos(rs, ps, con);
        }

        return comprasList;
    }

}
