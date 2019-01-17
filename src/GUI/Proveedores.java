/**
 * @author Ingrid Carmona Diaz
 * date 21/Diciembre/2018 Mysql
 * date 03/Enero/2019 java
 *
 * Proveedores 17/Enero/2019
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

public class Proveedores extends javax.swing.JFrame {

    ConexionBDsql Conexion = new ConexionBDsql();
    Connection Connection = Conexion.conexion();
    String atributo = "ID";

    public Proveedores() {
        initComponents();
        this.setLocation(400, 2);
        Fechas();
        TablaMostrar("");
        Bloquear();
    //    AgregarItem();
        AgregarItemBuscar();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jdCalendario = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        btNuevoPr = new javax.swing.JButton();
        btAgregarPro = new javax.swing.JButton();
        btLimpiar = new javax.swing.JButton();
        txFecha = new javax.swing.JTextField();
        txNomEmpresa = new javax.swing.JTextField();
        txNit = new javax.swing.JTextField();
        txDireccion = new javax.swing.JTextField();
        txMunicipio = new javax.swing.JTextField();
        txBarrio = new javax.swing.JTextField();
        txNomVendedor = new javax.swing.JTextField();
        txCc = new javax.swing.JTextField();
        txTel = new javax.swing.JTextField();
        txProductos = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtCons = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        txBuscarPro = new javax.swing.JTextPane();
        jcBuscar = new javax.swing.JComboBox<>();
        btBuscar = new javax.swing.JButton();
        btRefresBuscar = new javax.swing.JButton();
        btEliminar = new javax.swing.JButton();
        btRefresModificar = new javax.swing.JButton();
        btModificar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        btRegre = new javax.swing.JButton();
        btREporte = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "REGISTRO DE PROVEEDORES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel1.setText("Nombre de la empresa:");

        jLabel2.setText("Nombre Vendedor:");

        jLabel3.setText("Nit:");

        jLabel4.setText("Dirección:");

        jLabel5.setText("Cédula:");

        jLabel6.setText("Municipio:");

        jLabel7.setText("Barrio:");

        jLabel8.setText("Telefonos:");

        jLabel13.setText("Productos que venden:");

        jLabel9.setText("Fecha:");

        btNuevoPr.setText("NUEVO");
        btNuevoPr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNuevoPrActionPerformed(evt);
            }
        });

        btAgregarPro.setText("AGREGAR");
        btAgregarPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAgregarProActionPerformed(evt);
            }
        });

        btLimpiar.setText("LIM");
        btLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txNomVendedor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                                .addComponent(txBarrio, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txCc, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txMunicipio, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btNuevoPr))
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(btAgregarPro)
                                .addGap(60, 60, 60)
                                .addComponent(btLimpiar))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txTel, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txNit, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                            .addComponent(txNomEmpresa)
                            .addComponent(txFecha))))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(252, 252, 252)
                .addComponent(jdCalendario, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jdCalendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txNomEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txNit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txBarrio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txNomVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txCc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btNuevoPr)
                    .addComponent(btAgregarPro)
                    .addComponent(btLimpiar))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("BUSCAR/CONSULTAR UN PROVEEDOR"));

        jtCons.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jtCons);

        jScrollPane2.setViewportView(txBuscarPro);

        btBuscar.setText("B");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        btRefresBuscar.setText("R");
        btRefresBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRefresBuscarActionPerformed(evt);
            }
        });

        btEliminar.setText("E");

        btRefresModificar.setText("R");
        btRefresModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRefresModificarActionPerformed(evt);
            }
        });

        btModificar.setText("MODIFICAR");
        btModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jcBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 318, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btRefresModificar)
                                .addGap(38, 38, 38)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(btBuscar)
                                .addGap(18, 18, 18)
                                .addComponent(btRefresBuscar))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(btEliminar)
                                .addContainerGap())))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btBuscar)
                        .addComponent(btRefresBuscar)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btModificar)
                            .addComponent(btRefresModificar)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btEliminar)))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        jLabel10.setText("PROVEEDORES");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(469, 469, 469)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel10)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        btRegre.setText("Regres");
        btRegre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegreActionPerformed(evt);
            }
        });

        btREporte.setText("Reporte");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(btREporte)
                        .addGap(184, 184, 184)
                        .addComponent(btRegre)))
                .addContainerGap(24, Short.MAX_VALUE))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btREporte)
                            .addComponent(btRegre)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(89, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    void Fechas() {
        DateFormat DateF = DateFormat.getDateInstance();
        Date FechaActual = new Date();
        jdCalendario.setDate(FechaActual);
        txFecha.setText(DateF.format(FechaActual));
    }
    //--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------

    public void TablaMostrar(String ValorB) {
        DefaultTableModel RegistroProductos = new DefaultTableModel();
        RegistroProductos.addColumn("ID");
        RegistroProductos.addColumn("FECHA");
        RegistroProductos.addColumn("NOMBRE EMPRESA");
        RegistroProductos.addColumn("NIT");
        RegistroProductos.addColumn("DIRECCIÓN");
        RegistroProductos.addColumn("MUNICIPIO");
        RegistroProductos.addColumn("BARRIO");
        RegistroProductos.addColumn("NOMBRE PROVEEDOR");
        RegistroProductos.addColumn("CEDULA");
        RegistroProductos.addColumn("TELEFONO ");
        RegistroProductos.addColumn("PRODUCTOS");
        jtCons.setModel(RegistroProductos);

        String Sql = " ";
        if (ValorB.equals("")) {
            Sql = "SELECT * FROM proveedores";
        } else {
            Sql = "SELECT * FROM proveedores WHERE  " + atributo + "= ' " + ValorB + " ' ";
        }

        String Datos[] = new String[11];

        Statement Stt;
        try {
            Stt = Connection.createStatement();
            ResultSet Rst = Stt.executeQuery(Sql);

            while (Rst.next()) {
                Datos[0] = Rst.getString(1);
                Datos[1] = Rst.getString(2);
                Datos[2] = Rst.getString(3);
                Datos[3] = Rst.getString(4);
                Datos[4] = Rst.getString(5);
                Datos[5] = Rst.getString(6);
                Datos[6] = Rst.getString(7);
                Datos[7] = Rst.getString(8);
                Datos[8] = Rst.getString(9);
                Datos[9] = Rst.getString(10);
                Datos[10] = Rst.getString(11);
                RegistroProductos.addRow(Datos);
            }
            jtCons.setModel(RegistroProductos);//TABLA DATOS 

        } catch (SQLException ex) {
            Logger.getLogger(Inventario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------    

//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------
    public void Limpiar() {
        txNomEmpresa.setText("");
        txNit.setText("");
        txDireccion.setText("");
        txMunicipio.setText("");
        txBarrio.setText("");
        txNomVendedor.setText("");
        txCc.setText("");
        txTel.setText("");
        txProductos.setText("");
        txBuscarPro.setText("");
    }
//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------
//    public void AgregarItem() {
//        jcProductos.addItem("Linea Blanda");
//        jcProductos.addItem("Linea Dura");
//        jcProductos.addItem("Instrumental Medico");
//        jcProductos.addItem("Repuestos");
//    }
//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------
    public void AgregarItemBuscar() {
        jcBuscar.addItem("Nombre Empresa");
        jcBuscar.addItem("Nit");
        jcBuscar.addItem("Nombre Vendedor");
        jcBuscar.addItem("Cédula");
        jcBuscar.addItem("Productos");
    }
//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------

//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------
    public void Bloquear() {
        txFecha.setEditable(false);
        txNomEmpresa.setEditable(false);
        txNit.setEditable(false);
        txDireccion.setEditable(false);
        txMunicipio.setEditable(false);
        txBarrio.setEditable(false);
        txNomVendedor.setEditable(false);
        txCc.setEditable(false);
        txTel.setEditable(false);
        txProductos.setEditable(false);

        btAgregarPro.setEnabled(false);
        btLimpiar.setEnabled(false);
        btNuevoPr.setEnabled(true);
    }
//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------

//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------
    public void Desbloquear() {
        txFecha.setEditable(true);
        txNomEmpresa.setEditable(true);
        txNit.setEditable(true);
        txDireccion.setEditable(true);
        txMunicipio.setEditable(true);
        txBarrio.setEditable(true);
        txNomVendedor.setEditable(true);
        txCc.setEditable(true);
        txTel.setEditable(true);
        txProductos.setEditable(true);
    }
//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------

//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------
    private void btNuevoPrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNuevoPrActionPerformed
        Desbloquear();
        btAgregarPro.setEnabled(true);
        btLimpiar.setEnabled(true);
        btNuevoPr.setEnabled(false);
    }//GEN-LAST:event_btNuevoPrActionPerformed
//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------

//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------
    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        atributo = jcBuscar.getSelectedItem().toString();
        TablaMostrar(txBuscarPro.getText());
    }//GEN-LAST:event_btBuscarActionPerformed
//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------

//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------
    private void btRegreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegreActionPerformed
        Principal prin = new Principal();
        prin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btRegreActionPerformed

    private void btAgregarProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAgregarProActionPerformed
        try {
            PreparedStatement ps = Connection.prepareStatement("INSERT INTO proveedores (Fecha, NomEmpresa, Nit, Direccion, Municipio, Barrio, NomVendedor, Cedula, Telefono, Productos) VALUES (?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, txFecha.getText());
            ps.setString(2, txNomEmpresa.getText());
            ps.setString(3, txNit.getText());
            ps.setString(4, txDireccion.getText());
            ps.setString(5, txMunicipio.getText());
            ps.setString(6, txBarrio.getText());
            ps.setString(7, txNomVendedor.getText());
            ps.setString(8, txCc.getText());
            ps.setString(9, txTel.getText());
            ps.setString(10, txProductos.getText());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "¡Se han agregado los productos!");

                TablaMostrar("");
            Limpiar();
            Bloquear();
        } catch (SQLException ex) {
            Logger.getLogger(Proveedores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btAgregarProActionPerformed


    private void btLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimpiarActionPerformed
        Limpiar();
    }//GEN-LAST:event_btLimpiarActionPerformed

    private void btRefresBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRefresBuscarActionPerformed
        TablaMostrar("");
    }//GEN-LAST:event_btRefresBuscarActionPerformed

    private void btModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModificarActionPerformed
//        int Fila = jtCons.getSelectedRow();
//
//        if (Fila >= 0) {
//
//            txFecha.setText(jtCons.getValueAt(Fila, 0).toString());
//            txNomEmpresa.setText(jtCons.getValueAt(Fila, 1).toString());
//            txNit.setText(jtCons.getValueAt(Fila, 2).toString());
//            txDireccion.setText(jtCons.getValueAt(Fila, 3).toString());
//            txMunicipio.setText(jtCons.getValueAt(Fila, 4).toString());
//            txBarrio.setText(jtCons.getValueAt(Fila, 5).toString());
//            txNomVendedor.setText(jtCons.getValueAt(Fila, 6).toString());
//            txCc.setText(jtCons.getValueAt(Fila, 7).toString());
//            txTel.setText(jtCons.getValueAt(Fila, 8).toString());
//            txProductos.setText(jtCons.getValueAt(Fila, 9).toString());
//            Desbloquear();
//
//            btLimpiar.setEnabled(true);
//            btRefresModificar.setEnabled(true);
//            btRefresBuscar.setEnabled(true);
//            btNuevoPr.setEnabled(false);
//            btBuscar.setEnabled(false);
//
//        } else {
//            JOptionPane.showMessageDialog(null, "¡Casilla no seleccionada!");
//        }
    }//GEN-LAST:event_btModificarActionPerformed

    private void btRefresModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRefresModificarActionPerformed
//        try {
//            PreparedStatement pps = Connection.prepareStatement("UPDATE proveedores SET Fecha=' " + txFecha.getText() + " ' ,NomEmpresa=' " + txNomEmpresa.getText()
//                    + " ' ,Nit=' " + txNit.getText() + " ' ,Direccion=' " + txDireccion.getText() + " ' ,Municipio=' " + txMunicipio.getText()
//                    + " ' ,Barrio=' " + txBarrio.getText() + " ' ,NomVendedor=' " + txNomVendedor.getText() + " ' ,Cedula" + txCc.getText() + "',telefono" + txTel.getText() + " ' ,Productos" + txProductos.getText() + " ' WHERE Id=' " + txBuscarPro.getText() + " ' ");
//            pps.executeUpdate();
//            JOptionPane.showMessageDialog(null, "Se actualizarón los datos");
//
//            Limpiar();
//            TablaMostrar("");
//            Bloquear();
//
//        } catch (SQLException ex) {
//            Logger.getLogger(Inventario.class.getName()).log(Level.SEVERE, null, ex);
//        }

    }//GEN-LAST:event_btRefresModificarActionPerformed

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
            java.util.logging.Logger.getLogger(Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Proveedores().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAgregarPro;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btEliminar;
    private javax.swing.JButton btLimpiar;
    private javax.swing.JButton btModificar;
    private javax.swing.JButton btNuevoPr;
    private javax.swing.JButton btREporte;
    private javax.swing.JButton btRefresBuscar;
    private javax.swing.JButton btRefresModificar;
    private javax.swing.JButton btRegre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> jcBuscar;
    private com.toedter.calendar.JDateChooser jdCalendario;
    private javax.swing.JTable jtCons;
    private javax.swing.JTextField txBarrio;
    private javax.swing.JTextPane txBuscarPro;
    private javax.swing.JTextField txCc;
    private javax.swing.JTextField txDireccion;
    private javax.swing.JTextField txFecha;
    private javax.swing.JTextField txMunicipio;
    private javax.swing.JTextField txNit;
    private javax.swing.JTextField txNomEmpresa;
    private javax.swing.JTextField txNomVendedor;
    private javax.swing.JTextField txProductos;
    private javax.swing.JTextField txTel;
    // End of variables declaration//GEN-END:variables
}
