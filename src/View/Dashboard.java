/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

/**
 *
 * @author uriab
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        rSButtonIconTwo1 = new RSMaterialComponent.RSButtonIconTwo();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        rSPanelMaterialImage1 = new RSMaterialComponent.RSPanelMaterialImage();
        rSButtonMaterialIconTwo1 = new RSMaterialComponent.RSButtonMaterialIconTwo();
        rSButtonMaterialIconTwo2 = new RSMaterialComponent.RSButtonMaterialIconTwo();
        rSButtonMaterialIconTwo3 = new RSMaterialComponent.RSButtonMaterialIconTwo();
        rSButtonMaterialIconTwo4 = new RSMaterialComponent.RSButtonMaterialIconTwo();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(58, 66, 226));

        rSButtonIconTwo1.setHideActionText(true);
        rSButtonIconTwo1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.MENU);
        rSButtonIconTwo1.setSizeIcon(50.0F);

        jLabel1.setFont(new java.awt.Font("Perpetua", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SISTEMA DE TICKETS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(rSButtonIconTwo1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 409, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSButtonIconTwo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 70));

        jPanel3.setForeground(new java.awt.Color(242, 242, 242));

        rSPanelMaterialImage1.setBackground(new java.awt.Color(242, 242, 242));
        rSPanelMaterialImage1.setBgShade(new java.awt.Color(242, 242, 242));
        rSPanelMaterialImage1.setImagen(new javax.swing.ImageIcon(getClass().getResource("/View/images/LOGO.png"))); // NOI18N

        javax.swing.GroupLayout rSPanelMaterialImage1Layout = new javax.swing.GroupLayout(rSPanelMaterialImage1);
        rSPanelMaterialImage1.setLayout(rSPanelMaterialImage1Layout);
        rSPanelMaterialImage1Layout.setHorizontalGroup(
            rSPanelMaterialImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        rSPanelMaterialImage1Layout.setVerticalGroup(
            rSPanelMaterialImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        rSButtonMaterialIconTwo1.setBackground(new java.awt.Color(242, 242, 242));
        rSButtonMaterialIconTwo1.setText("HOME");
        rSButtonMaterialIconTwo1.setBackgroundHover(new java.awt.Color(242, 242, 242));
        rSButtonMaterialIconTwo1.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        rSButtonMaterialIconTwo1.setForegroundHover(new java.awt.Color(0, 0, 0));
        rSButtonMaterialIconTwo1.setForegroundIcon(new java.awt.Color(0, 0, 0));
        rSButtonMaterialIconTwo1.setForegroundIconHover(new java.awt.Color(0, 0, 0));
        rSButtonMaterialIconTwo1.setForegroundText(new java.awt.Color(0, 0, 0));
        rSButtonMaterialIconTwo1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.HOME);
        rSButtonMaterialIconTwo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconTwo1ActionPerformed(evt);
            }
        });

        rSButtonMaterialIconTwo2.setBackground(new java.awt.Color(242, 242, 242));
        rSButtonMaterialIconTwo2.setText("RUTA");
        rSButtonMaterialIconTwo2.setBackgroundHover(new java.awt.Color(242, 242, 242));
        rSButtonMaterialIconTwo2.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        rSButtonMaterialIconTwo2.setForegroundHover(new java.awt.Color(0, 0, 0));
        rSButtonMaterialIconTwo2.setForegroundIcon(new java.awt.Color(0, 0, 0));
        rSButtonMaterialIconTwo2.setForegroundIconHover(new java.awt.Color(0, 0, 0));
        rSButtonMaterialIconTwo2.setForegroundText(new java.awt.Color(0, 0, 0));
        rSButtonMaterialIconTwo2.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.TRAFFIC);
        rSButtonMaterialIconTwo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconTwo2ActionPerformed(evt);
            }
        });

        rSButtonMaterialIconTwo3.setBackground(new java.awt.Color(242, 242, 242));
        rSButtonMaterialIconTwo3.setText("TRANSPORTE");
        rSButtonMaterialIconTwo3.setBackgroundHover(new java.awt.Color(242, 242, 242));
        rSButtonMaterialIconTwo3.setForegroundHover(new java.awt.Color(0, 0, 0));
        rSButtonMaterialIconTwo3.setForegroundIcon(new java.awt.Color(0, 0, 0));
        rSButtonMaterialIconTwo3.setForegroundIconHover(new java.awt.Color(0, 0, 0));
        rSButtonMaterialIconTwo3.setForegroundText(new java.awt.Color(0, 0, 0));
        rSButtonMaterialIconTwo3.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        rSButtonMaterialIconTwo3.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.TRAIN);
        rSButtonMaterialIconTwo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconTwo3ActionPerformed(evt);
            }
        });

        rSButtonMaterialIconTwo4.setBackground(new java.awt.Color(242, 242, 242));
        rSButtonMaterialIconTwo4.setText("TICKETS");
        rSButtonMaterialIconTwo4.setBackgroundHover(new java.awt.Color(242, 242, 242));
        rSButtonMaterialIconTwo4.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        rSButtonMaterialIconTwo4.setForegroundHover(new java.awt.Color(0, 0, 0));
        rSButtonMaterialIconTwo4.setForegroundIcon(new java.awt.Color(0, 0, 0));
        rSButtonMaterialIconTwo4.setForegroundIconHover(new java.awt.Color(0, 0, 0));
        rSButtonMaterialIconTwo4.setForegroundText(new java.awt.Color(0, 0, 0));
        rSButtonMaterialIconTwo4.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.STORAGE);
        rSButtonMaterialIconTwo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconTwo4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelMaterialImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rSButtonMaterialIconTwo1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonMaterialIconTwo3, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonMaterialIconTwo2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonMaterialIconTwo4, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 2, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(rSPanelMaterialImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rSButtonMaterialIconTwo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rSButtonMaterialIconTwo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rSButtonMaterialIconTwo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rSButtonMaterialIconTwo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 84, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 160, 420));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 700, 420));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rSButtonMaterialIconTwo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconTwo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonMaterialIconTwo1ActionPerformed

    private void rSButtonMaterialIconTwo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconTwo4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonMaterialIconTwo4ActionPerformed

    private void rSButtonMaterialIconTwo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconTwo3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonMaterialIconTwo3ActionPerformed

    private void rSButtonMaterialIconTwo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconTwo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonMaterialIconTwo2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private RSMaterialComponent.RSButtonIconTwo rSButtonIconTwo1;
    private RSMaterialComponent.RSButtonMaterialIconTwo rSButtonMaterialIconTwo1;
    private RSMaterialComponent.RSButtonMaterialIconTwo rSButtonMaterialIconTwo2;
    private RSMaterialComponent.RSButtonMaterialIconTwo rSButtonMaterialIconTwo3;
    private RSMaterialComponent.RSButtonMaterialIconTwo rSButtonMaterialIconTwo4;
    private RSMaterialComponent.RSPanelMaterialImage rSPanelMaterialImage1;
    // End of variables declaration//GEN-END:variables
}
