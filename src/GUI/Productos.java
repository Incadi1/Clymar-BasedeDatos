/**
 * @author Ingrid Carmona Diaz
 * date 21/Diciembre/2018 Mysql
 * date 03/Enero/2019 java
 */
package GUI;

import Control.ConexionBDsql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Productos extends javax.swing.JFrame  {
    ConexionBDsql Conex  = new ConexionBDsql();
    Connection Conne  =  Conex.conexion();
    
    
    public Productos() {
        initComponents();
        TablaMostrar();
        Fechas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPAgregarProducto = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txRef = new javax.swing.JTextField();
        txCant = new javax.swing.JTextField();
        txNomProducto = new javax.swing.JTextField();
        txObservaciones = new javax.swing.JTextField();
        txVrProduto = new javax.swing.JTextField();
        txVrVenta = new javax.swing.JTextField();
        btAgregar = new javax.swing.JButton();
        btLimpiar = new javax.swing.JButton();
        txFecha = new javax.swing.JTextField();
        btActualizar = new javax.swing.JButton();
        jPaConsulta = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTaConsultaInventario = new javax.swing.JTable();
        jLRefeBusqueda = new javax.swing.JLabel();
        txRefBusqueda = new javax.swing.JTextField();
        btBuscar = new javax.swing.JButton();
        btModificar = new javax.swing.JButton();
        btEliminar = new javax.swing.JButton();
        jdateCalendar = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INVENTARIO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 3, 36))); // NOI18N

        jPAgregarProducto.setBackground(new java.awt.Color(255, 252, 252));
        jPAgregarProducto.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Agregar nuevo producto...", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 17))); // NOI18N
        jPAgregarProducto.setName(""); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel1.setText("Fecha");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel2.setText("Referencia");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel3.setText("Cantidad");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel4.setText("Nombre del Producto");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel5.setText("Observaciones");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel6.setText("Valor del producto");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel7.setText("Valor para la venta");

        btAgregar.setBackground(new java.awt.Color(246, 246, 246));
        btAgregar.setText("AGREGAR");
        btAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAgregarActionPerformed(evt);
            }
        });

        btLimpiar.setBackground(new java.awt.Color(246, 246, 246));
        btLimpiar.setText("LIMPIAR");
        btLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimpiarActionPerformed(evt);
            }
        });

        btActualizar.setBackground(new java.awt.Color(246, 246, 246));
        btActualizar.setText("ACTUALIZAR");
        btActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPAgregarProductoLayout = new javax.swing.GroupLayout(jPAgregarProducto);
        jPAgregarProducto.setLayout(jPAgregarProductoLayout);
        jPAgregarProductoLayout.setHorizontalGroup(
            jPAgregarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPAgregarProductoLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPAgregarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPAgregarProductoLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(95, 95, 95)
                        .addComponent(txFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txRef, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(44, 44, 44)
                        .addComponent(txCant, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPAgregarProductoLayout.createSequentialGroup()
                        .addGroup(jPAgregarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(49, 49, 49)
                        .addGroup(jPAgregarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txVrProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txNomProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(jPAgregarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(39, 39, 39)
                        .addGroup(jPAgregarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txObservaciones)
                            .addComponent(txVrVenta))))
                .addGap(50, 50, 50))
            .addGroup(jPAgregarProductoLayout.createSequentialGroup()
                .addGap(338, 338, 338)
                .addComponent(btAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPAgregarProductoLayout.setVerticalGroup(
            jPAgregarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPAgregarProductoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPAgregarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPAgregarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(txRef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txCant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txFecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPAgregarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPAgregarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addGroup(jPAgregarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txObservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txNomProducto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPAgregarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPAgregarProductoLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPAgregarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txVrProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(jPAgregarProductoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txVrVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPAgregarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPaConsulta.setBackground(new java.awt.Color(255, 252, 252));
        jPaConsulta.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar/Consultar un producto en inventario por la referencia...", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 17))); // NOI18N

        jTaConsultaInventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTaConsultaInventario);

        jLRefeBusqueda.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLRefeBusqueda.setText("Referencia");

        btBuscar.setBackground(new java.awt.Color(246, 246, 246));
        btBuscar.setText("BUSCAR");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        btModificar.setBackground(new java.awt.Color(246, 246, 246));
        btModificar.setText("MODIFICAR");
        btModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModificarActionPerformed(evt);
            }
        });

        btEliminar.setBackground(new java.awt.Color(246, 246, 246));
        btEliminar.setText("ELIMINAR");
        btEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPaConsultaLayout = new javax.swing.GroupLayout(jPaConsulta);
        jPaConsulta.setLayout(jPaConsultaLayout);
        jPaConsultaLayout.setHorizontalGroup(
            jPaConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1038, Short.MAX_VALUE)
            .addGroup(jPaConsultaLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLRefeBusqueda)
                .addGap(40, 40, 40)
                .addComponent(txRefBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(btBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPaConsultaLayout.setVerticalGroup(
            jPaConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPaConsultaLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPaConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLRefeBusqueda)
                    .addComponent(txRefBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(btModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(btEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPaConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPAgregarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jdateCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jdateCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPAgregarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jPaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------
    void Fechas(){
        DateFormat DateF = DateFormat.getDateInstance();
        Date FechaActual = new Date();
        jdateCalendar.setDate(FechaActual);
        txFecha.setText(DateF.format(FechaActual));
    }
//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------
        
//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------
    private void btAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAgregarActionPerformed
        try {
       PreparedStatement pps = Conne.prepareStatement("INSERT INTO inventario(Fecha, Referencia, Cantidad, Nombre_Producto, Observaciones, Valor, Valor_Venta) VALUE(?,?,?,?,?,?,?)");
       pps.setString(1, txFecha.getText()); 
       pps.setString(2, txRef.getText());
       pps.setString(3, txCant.getText());
       pps.setString(4, txNomProducto.getText());
       pps.setString(5, txObservaciones.getText());
       pps.setString(6, txVrProduto.getText());
       pps.setString(7, txVrVenta.getText());
       pps.executeUpdate();
       
            JOptionPane.showMessageDialog(null, "¡Se han agregado los productos!");
        } catch (SQLException ex) {
            Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btAgregarActionPerformed
//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------

//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------
    public void TablaMostrar(){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("FECHA");
        modelo.addColumn("REFERENCIA");
        modelo.addColumn("CANTIDAD"); 
        modelo.addColumn("NOMBRE PRODUCTO");
        modelo.addColumn("OBSERVACIONES");
        modelo.addColumn("VALOR");
        modelo.addColumn("VALOR VENTA");
        jTaConsultaInventario.setModel(modelo);
        
        String Sql = "SELECT * FROM inventario";
        
        String Datos[ ] = new String[7];
        
        Statement Stt;  
        try {
            Stt = Conne.createStatement();
            ResultSet Rst = Stt.executeQuery(Sql);
            
            while(Rst.next()){
                Datos[0] = Rst.getString(1);
                Datos[1] = Rst.getString(2);
                Datos[2] = Rst.getString(3);
                Datos[3] = Rst.getString(4);
                Datos[4] = Rst.getString(5);
                Datos[5] = Rst.getString(6);
                Datos[6] = Rst.getString(7);
                modelo.addRow(Datos);                
            }
            jTaConsultaInventario.setModel(modelo);//TABLA DATOS 
        } catch (SQLException ex) {
            Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------    
 
//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------   
    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
       
    }//GEN-LAST:event_btBuscarActionPerformed
//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------

//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------
   public void Limpiar(){
        txFecha.setText("");
        txRef.setText("");
        txCant.setText("");
        txNomProducto.setText("");
        txObservaciones.setText("");
        txVrProduto.setText("");
        txVrVenta.setText("");
        txRefBusqueda.setText("");
    }
//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------
    
//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------
    //BOTON LIMPIAR
    private void btLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimpiarActionPerformed
        Limpiar();
    }//GEN-LAST:event_btLimpiarActionPerformed
//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------

    
//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------
    private void btModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModificarActionPerformed
    int Fila =  jTaConsultaInventario.getSelectedRow();
    
    if(Fila >= 0){
       txRefBusqueda.setText(jTaConsultaInventario.getValueAt(Fila, 0).toString());
        txFecha.setText(jTaConsultaInventario.getValueAt(Fila, 1).toString());
        txRef.setText(jTaConsultaInventario.getValueAt(Fila, 2).toString());
        txNomProducto.setText(jTaConsultaInventario.getValueAt(Fila, 3).toString());
        txObservaciones.setText(jTaConsultaInventario.getValueAt(Fila, 4).toString());  
        txVrProduto.setText(jTaConsultaInventario.getValueAt(Fila, 5).toString());
        txVrVenta.setText(jTaConsultaInventario.getValueAt(Fila, 6).toString());
    }
        
    }//GEN-LAST:event_btModificarActionPerformed
//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------

//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------
    private void btActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btActualizarActionPerformed
       try {
                    PreparedStatement pps = Conne.prepareStatement("UPDATE inventario SET Fecha'" + txFecha.getText() +"'Ref'"+ txRef.getText()+"'Cantidad'"+txCant.getText()+"'Nombre_Producto'"+txNomProducto.getText()+"'Observaciones'"+txObservaciones.getText()+"'Valor'"+ txVrProduto.getText()+"'Valor_Venta'"+txVrVenta.getText()+ "'WHERE Ref'" + txRefBusqueda.getText()+ "'");
                     pps.executeUpdate();
                     JOptionPane.showMessageDialog(null, "Se actualizarón los datos");
                     
                     Limpiar();
                     TablaMostrar();
       } catch (SQLException ex) {
            Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
        }

                
    }//GEN-LAST:event_btActualizarActionPerformed
//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------

//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------
    private void btEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarActionPerformed
        
    }//GEN-LAST:event_btEliminarActionPerformed
//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------

//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------
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
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Productos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btActualizar;
    private javax.swing.JButton btAgregar;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btEliminar;
    private javax.swing.JButton btLimpiar;
    private javax.swing.JButton btModificar;
    private javax.swing.JLabel jLRefeBusqueda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPAgregarProducto;
    private javax.swing.JPanel jPaConsulta;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTaConsultaInventario;
    private com.toedter.calendar.JDateChooser jdateCalendar;
    private javax.swing.JTextField txCant;
    private javax.swing.JTextField txFecha;
    private javax.swing.JTextField txNomProducto;
    private javax.swing.JTextField txObservaciones;
    private javax.swing.JTextField txRef;
    private javax.swing.JTextField txRefBusqueda;
    private javax.swing.JTextField txVrProduto;
    private javax.swing.JTextField txVrVenta;
    // End of variables declaration//GEN-END:variables
}
