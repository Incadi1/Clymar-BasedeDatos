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
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

public class Inventario extends javax.swing.JFrame {

    ConexionBDsql Conex = new ConexionBDsql();
    Connection Conne = Conex.conexion();
    String atributo = "Referencia";

    public Inventario() {
        initComponents();
       this.setLocation(400, 5);
        TablaMostrar("");
        Fechas();
        AgregarItem();
        Bloquear();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jgBotones = new javax.swing.ButtonGroup();
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
        btNuevo = new javax.swing.JButton();
        jdateCalendar = new com.toedter.calendar.JDateChooser();
        jPaConsulta = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTaConsultaInventario = new javax.swing.JTable();
        btModificar = new javax.swing.JButton();
        btEliminar = new javax.swing.JButton();
        btRefrescar = new javax.swing.JButton();
        btBuscar = new javax.swing.JButton();
        txBuscar = new javax.swing.JTextField();
        jItemBuscar = new javax.swing.JComboBox<>();
        btReporte = new javax.swing.JButton();
        btRegresar = new javax.swing.JButton();
        btActualizar = new javax.swing.JButton();
        jpTitulo = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPAgregarProducto.setBackground(new java.awt.Color(255, 252, 252));
        jPAgregarProducto.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Agregar nuevo producto...", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 17))); // NOI18N
        jPAgregarProducto.setName(""); // NOI18N
        jPAgregarProducto.setPreferredSize(new java.awt.Dimension(983, 534));

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
        btLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesInventario/Limpiar8.png"))); // NOI18N
        btLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimpiarActionPerformed(evt);
            }
        });

        btNuevo.setBackground(new java.awt.Color(246, 246, 246));
        btNuevo.setText("NUEVO");
        btNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPAgregarProductoLayout = new javax.swing.GroupLayout(jPAgregarProducto);
        jPAgregarProducto.setLayout(jPAgregarProductoLayout);
        jPAgregarProductoLayout.setHorizontalGroup(
            jPAgregarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPAgregarProductoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPAgregarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPAgregarProductoLayout.createSequentialGroup()
                        .addGroup(jPAgregarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPAgregarProductoLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(95, 95, 95)
                                .addComponent(txFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txRef, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                                .addGroup(jPAgregarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txVrVenta, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                                    .addComponent(txObservaciones))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPAgregarProductoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPAgregarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPAgregarProductoLayout.createSequentialGroup()
                                .addComponent(jdateCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPAgregarProductoLayout.createSequentialGroup()
                                .addComponent(btNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(btAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(289, 289, 289)
                                .addComponent(btLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );
        jPAgregarProductoLayout.setVerticalGroup(
            jPAgregarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPAgregarProductoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jdateCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                    .addComponent(btNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btLimpiar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPaConsulta.setBackground(new java.awt.Color(255, 252, 252));
        jPaConsulta.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar/Consultar un producto en inventario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 17))); // NOI18N

        jTaConsultaInventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTaConsultaInventario);

        btModificar.setBackground(new java.awt.Color(246, 246, 246));
        btModificar.setText("MODIFICAR");
        btModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModificarActionPerformed(evt);
            }
        });

        btEliminar.setBackground(new java.awt.Color(246, 246, 246));
        btEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesInventario/Borrar10.png"))); // NOI18N
        btEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarActionPerformed(evt);
            }
        });

        btRefrescar.setBackground(new java.awt.Color(246, 246, 246));
        btRefrescar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesInventario/Refrescar8.png"))); // NOI18N
        btRefrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRefrescarActionPerformed(evt);
            }
        });

        btBuscar.setBackground(new java.awt.Color(246, 246, 246));
        btBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesInventario/buscar5.png"))); // NOI18N
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        jItemBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItemBuscarActionPerformed(evt);
            }
        });

        btReporte.setBackground(new java.awt.Color(255, 255, 255));
        btReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesInventario/Reporte8.png"))); // NOI18N
        btReporte.setMaximumSize(new java.awt.Dimension(100, 100));
        btReporte.setMinimumSize(new java.awt.Dimension(50, 50));
        btReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btReporteActionPerformed(evt);
            }
        });

        btRegresar.setBackground(new java.awt.Color(255, 255, 255));
        btRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesInventario/CAsa2.2.png"))); // NOI18N
        btRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegresarActionPerformed(evt);
            }
        });

        btActualizar.setBackground(new java.awt.Color(246, 246, 246));
        btActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesInventario/refresh2-8.png"))); // NOI18N
        btActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPaConsultaLayout = new javax.swing.GroupLayout(jPaConsulta);
        jPaConsulta.setLayout(jPaConsultaLayout);
        jPaConsultaLayout.setHorizontalGroup(
            jPaConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaConsultaLayout.createSequentialGroup()
                .addGroup(jPaConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPaConsultaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(jPaConsultaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jItemBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btRefrescar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(225, 225, 225)
                        .addComponent(btModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(btEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPaConsultaLayout.setVerticalGroup(
            jPaConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaConsultaLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPaConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPaConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btEliminar)
                        .addGroup(jPaConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btRefrescar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btBuscar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jItemBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPaConsultaLayout.createSequentialGroup()
                        .addComponent(btModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4))
                    .addComponent(btActualizar, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPaConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btReporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jpTitulo.setBackground(new java.awt.Color(231, 248, 233));
        jpTitulo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jpTitulo.setPreferredSize(new java.awt.Dimension(983, 534));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel8.setText("Inventario\n");

        javax.swing.GroupLayout jpTituloLayout = new javax.swing.GroupLayout(jpTitulo);
        jpTitulo.setLayout(jpTituloLayout);
        jpTituloLayout.setHorizontalGroup(
            jpTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTituloLayout.createSequentialGroup()
                .addGap(378, 378, 378)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpTituloLayout.setVerticalGroup(
            jpTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPaConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPAgregarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 1003, Short.MAX_VALUE)
                    .addComponent(jpTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 1003, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPAgregarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------

    void Fechas() {
        DateFormat DateF = DateFormat.getDateInstance();
        Date FechaActual = new Date();
        jdateCalendar.setDate(FechaActual);
        txFecha.setText(DateF.format(FechaActual));
    }
//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------

//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------
    private void btAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAgregarActionPerformed
        try {
            PreparedStatement pps = Conne.prepareStatement("INSERT INTO inventario(Fecha, Referencia, Cantidad, Nombre_Producto, "
                    + "Observaciones, Valor, Valor_Venta) VALUE(?,?,?,?,?,?,?)");
            pps.setString(1, txFecha.getText());
            pps.setString(2, txRef.getText());
            pps.setString(3, txCant.getText());
            pps.setString(4, txNomProducto.getText());
            pps.setString(5, txObservaciones.getText());
            pps.setString(6, txVrProduto.getText());
            pps.setString(7, txVrVenta.getText());
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null, "¡Se han agregado los productos!");
            TablaMostrar("");
            
            Limpiar();
            Bloquear();
            
            

        } catch (SQLException ex) {
            Logger.getLogger(Inventario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btAgregarActionPerformed
//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------

//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------
    public void TablaMostrar(String ValorBuscar) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("FECHA");
        modelo.addColumn("REFERENCIA");
        modelo.addColumn("CANTIDAD");
        modelo.addColumn("NOMBRE PRODUCTO");
        modelo.addColumn("OBSERVACIONES");
        modelo.addColumn("VALOR");
        modelo.addColumn("VALOR VENTA");
        jTaConsultaInventario.setModel(modelo);

        String Sql = "";

        if (ValorBuscar.equals("")) {
            Sql = "SELECT * FROM inventario";
        } else {
            Sql = "SELECT * FROM inventario WHERE " + atributo + "='" + ValorBuscar + "'";
        }

        String Datos[] = new String[7];

        Statement Stt;
        try {
            Stt = Conne.createStatement();
            ResultSet Rst = Stt.executeQuery(Sql);

            while (Rst.next()) {
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
            Logger.getLogger(Inventario.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------    

//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------
    public void Limpiar() {
        txRef.setText("");
        txCant.setText("");
        txNomProducto.setText("");
        txObservaciones.setText("");
        txVrProduto.setText("");
        txVrVenta.setText("");
        txBuscar.setText("");
    }
//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------

//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------
    private void btLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimpiarActionPerformed
        Limpiar();
        Bloquear();
    }//GEN-LAST:event_btLimpiarActionPerformed
//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------

//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------
    private void btModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModificarActionPerformed
        int Fila = jTaConsultaInventario.getSelectedRow();

        if (Fila >= 1) {

            txFecha.setText(jTaConsultaInventario.getValueAt(Fila, 0).toString());
            txRef.setText(jTaConsultaInventario.getValueAt(Fila, 1).toString());
            txCant.setText(jTaConsultaInventario.getValueAt(Fila, 2).toString());
            txNomProducto.setText(jTaConsultaInventario.getValueAt(Fila, 3).toString());
            txObservaciones.setText(jTaConsultaInventario.getValueAt(Fila, 4).toString());
            txVrProduto.setText(jTaConsultaInventario.getValueAt(Fila, 5).toString());
            txVrVenta.setText(jTaConsultaInventario.getValueAt(Fila, 6).toString());
            txBuscar.setText(jTaConsultaInventario.getValueAt(Fila, 1).toString());
            Desbloquear();
            btLimpiar.setEnabled(true);
            btActualizar.setEnabled(true);
            btNuevo.setEnabled(true);
            
        } else {
            JOptionPane.showMessageDialog(null, "¡Casilla no seleccionada!");
        }

    }//GEN-LAST:event_btModificarActionPerformed
//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------

//--------------------------------------------------------------------------------------/NO FUNCIONA/--------------------------------------------------------------------------------------
    private void btActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btActualizarActionPerformed
        try {
            PreparedStatement pps = Conne.prepareStatement("UPDATE inventario SET '" + ",Fecha='" + txFecha.getText() + ",Referencia='" + txRef.getText()
                    + ",Cantidad='" + txCant.getText() + ",Nombre_Producto='" + txNomProducto.getText() + ",Observaciones='"
                    + txObservaciones.getText() + "',Valor='" + txVrProduto.getText() + ",Valor_Venta='" + txVrVenta.getText() + "WHERE Ref'erencia= " + txBuscar.getText() + "'");
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se actualizarón los datos");

            Limpiar();
            TablaMostrar("");
            Bloquear();
            
        } catch (SQLException ex) {
            Logger.getLogger(Inventario.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btActualizarActionPerformed
//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------

//---   /FALLA- SELECCIONO EL QUE QUIERO BORRAR U SE ELIMINAN OTROS QUE NO ESTAN SELECCIONADOS/--------------------------------------------------------------------------
    private void btEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarActionPerformed
        int FilaEliminar = jTaConsultaInventario.getSelectedRow();
        String Valor = jTaConsultaInventario.getValueAt(WIDTH, 1).toString();

        if (FilaEliminar >= 1) {
            try {
                PreparedStatement pps = Conne.prepareStatement("DELETE FROM inventario WHERE Referencia= '" + Valor + " '");
                pps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Se elimino el producto");
                TablaMostrar("");

            } catch (SQLException ex) {
                Logger.getLogger(Inventario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btEliminarActionPerformed
//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------

//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------

    private void btRefrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRefrescarActionPerformed
        TablaMostrar("");
    }//GEN-LAST:event_btRefrescarActionPerformed
//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------

//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------
    public void AgregarItem() {
        jItemBuscar.addItem("Fecha");
        jItemBuscar.addItem("Referencia");
        jItemBuscar.addItem("Cantidad");
        jItemBuscar.addItem("Nombre Producto");
        jItemBuscar.addItem("Observaciones");
    }
//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------

//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed

        atributo = jItemBuscar.getSelectedItem().toString();
        TablaMostrar(txBuscar.getText());

    }//GEN-LAST:event_btBuscarActionPerformed

    private void btRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegresarActionPerformed
        Principal prin = new Principal();
        prin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btRegresarActionPerformed
//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------

//-------------------------------------------------/NO MUESTRA EL REPORTE/--------------------------------------------------------------------------------------

    private void btReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btReporteActionPerformed
        try {
            JasperReport Reporte = JasperCompileManager.compileReport("InventarioReport.jrxml");
            JasperPrint Print = JasperFillManager.fillReport(Reporte, null, this.Conne);
            JasperViewer View = new JasperViewer(Print, false);
            View.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(Inventario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btReporteActionPerformed

    
    //--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------
    public void Bloquear(){
        txFecha.setEditable(false);
        txNomProducto.setEditable(false);
        txObservaciones.setEditable(false);
        txRef.setEditable(false);
        txVrProduto.setEditable(false);
        txVrVenta.setEditable(false);
        txCant.setEditable(false);
        
        btAgregar.setEnabled(false);
        btActualizar.setEnabled(false);
        btLimpiar.setEnabled(false);
        btNuevo.setEnabled(true);
    }
//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------
 public void Desbloquear(){
        txFecha.setEditable(true);
        txNomProducto.setEditable(true);
        txObservaciones.setEditable(true);
        txRef.setEditable(true);
        txVrProduto.setEditable(true);
        txVrVenta.setEditable(true);
        txCant.setEditable(true);
        
    
 }
    private void btNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNuevoActionPerformed
        Desbloquear();
        btAgregar.setEnabled(true);
        btLimpiar.setEnabled(true);
        btNuevo.setEnabled(false);
    }//GEN-LAST:event_btNuevoActionPerformed

    private void jItemBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jItemBuscarActionPerformed
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
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Inventario().setVisible(true);
                
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
    private javax.swing.JButton btNuevo;
    private javax.swing.JButton btRefrescar;
    private javax.swing.JButton btRegresar;
    private javax.swing.JButton btReporte;
    private javax.swing.JComboBox<String> jItemBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPAgregarProducto;
    private javax.swing.JPanel jPaConsulta;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTaConsultaInventario;
    private com.toedter.calendar.JDateChooser jdateCalendar;
    private javax.swing.ButtonGroup jgBotones;
    private javax.swing.JPanel jpTitulo;
    private javax.swing.JTextField txBuscar;
    private javax.swing.JTextField txCant;
    private javax.swing.JTextField txFecha;
    private javax.swing.JTextField txNomProducto;
    private javax.swing.JTextField txObservaciones;
    private javax.swing.JTextField txRef;
    private javax.swing.JTextField txVrProduto;
    private javax.swing.JTextField txVrVenta;
    // End of variables declaration//GEN-END:variables
}
