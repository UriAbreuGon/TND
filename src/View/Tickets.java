
package View;

import com.mysql.jdbc.Connection;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import model.Compra;
import model.SqlCompra;
import model.SqlUsuarios;
import model.Usuarios;
import model.ConexionMysql;
import model.SqlTarjetasDeCredito;


public class Tickets extends javax.swing.JPanel {
    
    private final SqlUsuarios sqlUsuarios;
    private final SqlCompra sqlCompra;
    private final Connection conexion;

    public Tickets() {
        initComponents();
        sqlUsuarios = new SqlUsuarios();
        tblUsuarios.setModel(new DefaultTableModel());
        
        ConexionMysql conexionMysql = new ConexionMysql();
        conexion = conexionMysql.conectar();

        sqlCompra = new SqlCompra(conexion);
    }
    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        rSPanelMaterialImage2 = new RSMaterialComponent.RSPanelMaterialImage();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCantida = new javax.swing.JTextField();
        Cancelar = new javax.swing.JButton();
        Aceptar = new javax.swing.JButton();
        txtUsuarioNombre = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        IngresaDatos = new javax.swing.JTextField();
        examine = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        btnTickets = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PAGO DE TICKETS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 36))); // NOI18N

        rSPanelMaterialImage2.setImagen(new javax.swing.ImageIcon(getClass().getResource("/View/images/tarjeta-de-credito.png"))); // NOI18N

        javax.swing.GroupLayout rSPanelMaterialImage2Layout = new javax.swing.GroupLayout(rSPanelMaterialImage2);
        rSPanelMaterialImage2.setLayout(rSPanelMaterialImage2Layout);
        rSPanelMaterialImage2Layout.setHorizontalGroup(
            rSPanelMaterialImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        rSPanelMaterialImage2Layout.setVerticalGroup(
            rSPanelMaterialImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 168, Short.MAX_VALUE)
        );

        jLabel1.setText("NUMERO DE TARJETA");

        jLabel2.setText("CANTIDA DE RECARGA");

        jLabel4.setText("FECHA DE RECARGA");

        txtCantida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidaActionPerformed(evt);
            }
        });

        Cancelar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Cancelar.setText("CANCELAR");
        Cancelar.setPreferredSize(new java.awt.Dimension(130, 70));
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        Aceptar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Aceptar.setText("ACEPTAR");
        Aceptar.setPreferredSize(new java.awt.Dimension(70, 70));
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });

        txtUsuarioNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioNombreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(Aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 69, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUsuarioNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCantida, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(107, 107, 107))
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(rSPanelMaterialImage2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(rSPanelMaterialImage2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUsuarioNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCantida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(113, 113, 113)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 96, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(253, 253, 253)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(382, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("COMPRA", jPanel14);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "RESERVAS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 36))); // NOI18N

        examine.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        examine.setText("NOMBRE");
        examine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                examineActionPerformed(evt);
            }
        });

        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblUsuarios);

        btnTickets.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnTickets.setText("Boletos");
        btnTickets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTicketsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IngresaDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 909, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(examine, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btnTickets, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTickets, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(examine, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(IngresaDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 9, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 73, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 33, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("CONSULTA", jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 660));
    }// </editor-fold>//GEN-END:initComponents

    private void btnTicketsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTicketsActionPerformed
    String idTarjetaRecargaText = IngresaDatos.getText();

    if (!idTarjetaRecargaText.isEmpty()) {
        try {
            int idTarjetaRecarga = Integer.parseInt(idTarjetaRecargaText);

            
            SqlTarjetasDeCredito sqlTarjetasDeCredito = new SqlTarjetasDeCredito();

            
            List<Compra> comprasList = sqlTarjetasDeCredito.buscarComprasPorIDTarjetaRecarga(idTarjetaRecarga);

            if (comprasList.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No se encontraron compras para el ID de tarjeta de recarga especificado.", "Resultado de búsqueda", JOptionPane.INFORMATION_MESSAGE);
            } else {
                cargarDatosEnTablaCompras(comprasList);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese un ID de tarjeta de recarga válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(this, "Por favor ingrese un ID de tarjeta de recarga para buscar.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnTicketsActionPerformed

    private void tblUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUsuariosMouseClicked

    }//GEN-LAST:event_tblUsuariosMouseClicked

    private void examineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_examineActionPerformed
        String nombreUsuario = IngresaDatos.getText();

        if (!nombreUsuario.isEmpty()) {
            List<Usuarios> usuariosList = sqlUsuarios.buscarUsuariosPorNombre(nombreUsuario);

            if (usuariosList.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No se encontraron usuarios con el nombre de usuario especificado.", "Resultado de búsqueda", JOptionPane.INFORMATION_MESSAGE);
            } else {
                cargarDatosEnTabla(usuariosList);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor ingrese un nombre de usuario para buscar.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_examineActionPerformed

    private void txtUsuarioNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioNombreActionPerformed

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed
    try {
        
        int numeroTarjeta = Integer.parseInt(txtUsuarioNombre.getText());
        int cantidadRecargar = Integer.parseInt(txtCantida.getText());
        String fechaCompra = txtFecha.getText();

        
        String mensaje = "Número de Tarjeta: " + numeroTarjeta + "\n"
                + "Cantidad de Recargas: " + cantidadRecargar + "\n"
                + "Fecha de Compra: " + fechaCompra + "\n";
        JOptionPane.showMessageDialog(this, mensaje, "Datos de Compra", JOptionPane.INFORMATION_MESSAGE);

        
        Compra nuevaCompra = new Compra(numeroTarjeta, "", fechaCompra, cantidadRecargar);

        
        if (conexion != null) {
            if (sqlCompra.insertarCompra(nuevaCompra)) {
                JOptionPane.showMessageDialog(this, "Compra registrada correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo registrar la compra", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "No hay conexión a la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Por favor ingrese valores válidos", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_AceptarActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        txtUsuarioNombre.setText("");
        txtCantida.setText("");
        txtFecha.setText("");

    }//GEN-LAST:event_CancelarActionPerformed

    private void txtCantidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidaActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JButton Cancelar;
    private javax.swing.JTextField IngresaDatos;
    private javax.swing.JButton btnTickets;
    private javax.swing.JButton examine;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private RSMaterialComponent.RSPanelMaterialImage rSPanelMaterialImage2;
    private javax.swing.JTable tblUsuarios;
    private javax.swing.JTextField txtCantida;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtUsuarioNombre;
    // End of variables declaration//GEN-END:variables
private void cargarDatosEnTabla(List<Usuarios> usuariosList) {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Nombre");
        model.addColumn("Usuario");
        model.addColumn("Correo");
        model.addColumn("Teléfono");
        model.addColumn("Tipo de Usuario");

        for (Usuarios usuario : usuariosList) {
            Object[] rowData = {
                usuario.getId(),
                usuario.getNombre(),
                usuario.getUsuario(),
                usuario.getCorreo(),
                usuario.getTelefono(),
                usuario.getNombreTipo()
            };
            model.addRow(rowData);
        }

        tblUsuarios.setModel(model);
    }

    private void cargarDatosEnTablaCompras(List<Compra> comprasList) {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("IDTarjetaRecarga");
        model.addColumn("FechaCompra");
        model.addColumn("CantidadRecargas");
        model.addColumn("MontoCompra");
        model.addColumn("IDTarjeta");

        for (Compra compra : comprasList) {
            Object[] rowData = {
                compra.getIdTarjetaRecarga(),
                compra.getFechaCompra(),
                compra.getCantidadRecargas(),
                compra.getMontoCompra(),
                
            };
            model.addRow(rowData);
        }

        tblUsuarios.setModel(model);
    }
    
    private String obtenerFechaActual() {
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
    Date date = new Date();
    return dateFormat.format(date);
} 


}






