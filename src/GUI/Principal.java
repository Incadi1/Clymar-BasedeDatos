/**
 * @author Ingrid Carmona Diaz
 * date 21/Diciembre/2018 Mysql
 * date 03/Enero/2019 java
 */
package GUI;


public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jPanel = new javax.swing.JPanel();
        jlClymar = new javax.swing.JLabel();
        BtInventario = new javax.swing.JButton();
        BtVentas = new javax.swing.JButton();
        BtVentas1 = new javax.swing.JButton();
        BtVentas2 = new javax.swing.JButton();
        BtVentas3 = new javax.swing.JButton();
        BtVentas4 = new javax.swing.JButton();
        BtVentas5 = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jmOpciones = new javax.swing.JMenu();
        jrmInformacion = new javax.swing.JRadioButtonMenuItem();
        jrmSalir = new javax.swing.JRadioButtonMenuItem();
        jMenu4 = new javax.swing.JMenu();

        jMenu5.setText("File");
        jMenuBar3.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar3.add(jMenu6);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setName(""); // NOI18N

        jPanel.setBackground(new java.awt.Color(255, 255, 255));
        jPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jlClymar.setFont(new java.awt.Font("Baskerville Old Face", 1, 50)); // NOI18N
        jlClymar.setText("CLYMAR");

        BtInventario.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        BtInventario.setIcon(new javax.swing.ImageIcon("C:\\Users\\MSI-PC\\Desktop\\CLYMAR\\SistemaClymar\\Imagenes\\Productos.png")); // NOI18N
        BtInventario.setText("INVENTARIO");
        BtInventario.setToolTipText("");
        BtInventario.setMaximumSize(new java.awt.Dimension(253, 151));
        BtInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtInventarioActionPerformed(evt);
            }
        });

        BtVentas.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        BtVentas.setIcon(new javax.swing.ImageIcon("C:\\Users\\MSI-PC\\Desktop\\CLYMAR\\SistemaClymar\\Imagenes\\Ventas.png")); // NOI18N
        BtVentas.setText("VENTAS");

        BtVentas1.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        BtVentas1.setIcon(new javax.swing.ImageIcon("C:\\Users\\MSI-PC\\Desktop\\CLYMAR\\SistemaClymar\\Imagenes\\Ventas.png")); // NOI18N
        BtVentas1.setText("VENTAS");

        BtVentas2.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        BtVentas2.setIcon(new javax.swing.ImageIcon("C:\\Users\\MSI-PC\\Desktop\\CLYMAR\\SistemaClymar\\Imagenes\\Ventas.png")); // NOI18N
        BtVentas2.setText("VENTAS");

        BtVentas3.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        BtVentas3.setIcon(new javax.swing.ImageIcon("C:\\Users\\MSI-PC\\Desktop\\CLYMAR\\SistemaClymar\\Imagenes\\Ventas.png")); // NOI18N
        BtVentas3.setText("VENTAS");

        BtVentas4.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        BtVentas4.setIcon(new javax.swing.ImageIcon("C:\\Users\\MSI-PC\\Desktop\\CLYMAR\\SistemaClymar\\Imagenes\\Ventas.png")); // NOI18N
        BtVentas4.setText("VENTAS");

        BtVentas5.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        BtVentas5.setIcon(new javax.swing.ImageIcon("C:\\Users\\MSI-PC\\Desktop\\CLYMAR\\SistemaClymar\\Imagenes\\Ventas.png")); // NOI18N
        BtVentas5.setText("VENTAS");

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BtVentas2, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jlClymar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BtVentas3, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtVentas5, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtVentas1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtVentas4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53))))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jlClymar)
                .addGap(50, 50, 50)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtVentas1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtVentas2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtVentas3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtVentas4, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(BtVentas5, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        jmOpciones.setText("Opciones");
        jmOpciones.setToolTipText("");

        jrmInformacion.setSelected(true);
        jrmInformacion.setText("Información");
        jrmInformacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrmInformacionActionPerformed(evt);
            }
        });
        jmOpciones.add(jrmInformacion);

        jrmSalir.setSelected(true);
        jrmSalir.setText("Salir");
        jmOpciones.add(jrmSalir);

        jMenuBar2.add(jmOpciones);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtInventarioActionPerformed
        Inventario inve = new Inventario();
        inve.setVisible(true);
        dispose();
    }//GEN-LAST:event_BtInventarioActionPerformed

    private void jrmInformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrmInformacionActionPerformed
        
    }//GEN-LAST:event_jrmInformacionActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtInventario;
    private javax.swing.JButton BtVentas;
    private javax.swing.JButton BtVentas1;
    private javax.swing.JButton BtVentas2;
    private javax.swing.JButton BtVentas3;
    private javax.swing.JButton BtVentas4;
    private javax.swing.JButton BtVentas5;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JPanel jPanel;
    private javax.swing.JLabel jlClymar;
    private javax.swing.JMenu jmOpciones;
    private javax.swing.JRadioButtonMenuItem jrmInformacion;
    private javax.swing.JRadioButtonMenuItem jrmSalir;
    // End of variables declaration//GEN-END:variables
}
