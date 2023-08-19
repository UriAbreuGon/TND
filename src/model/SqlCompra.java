package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SqlCompra {
    private final Connection conexion;

    public SqlCompra(Connection conexion) {
        this.conexion = conexion;
    }

    public List<Compra> buscarComprasPorIDTarjetaRecarga(int idTarjetaRecarga) {
        List<Compra> compras = new ArrayList<>();
        String query = "SELECT * FROM compras WHERE IDTarjetaRecarga = ?";

        try ( PreparedStatement stmt = conexion.prepareStatement(query)) {
            stmt.setInt(1, idTarjetaRecarga);

            try ( ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    int idTarjetaRecargaResultado = rs.getInt("IDTarjetaRecarga");
                    String fechaCompra = rs.getString("Fechacompra");
                    int cantidadRecargas = rs.getInt("Cantidadrecargas");
                    int montoCompra = rs.getInt("Montocompra");
                    int idTarjeta = rs.getInt("Idtarjeta");

                    Compra compra = new Compra(idTarjetaRecargaResultado, fechaCompra, fechaCompra, cantidadRecargas);
                    compras.add(compra);
                }
            }
        } catch (SQLException e) {

        }

        return compras;
    }

    public boolean insertarCompra(Compra nuevaCompra) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}


