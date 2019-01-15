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

public class Clientes extends javax.swing.JFrame {

    ConexionBDsql Conex = new ConexionBDsql();
    Connection Con = Conex.conexion();
    String atributo = "Id";
//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------

//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------
    public Clientes() {
        initComponents();
        this.setLocation(400, 15);
        Fechas();
        Bloquear();
        MostrarTabla("");
        AgregarItemParentesco();
        AgregarItem();
    }
//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------

//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------
    void Fechas() {
        DateFormat DateF = DateFormat.getDateInstance();
        Date FechaActual = new Date();
        jdateCalendario.setDate(FechaActual);
        txFecha.setText(DateF.format(FechaActual));
    }
//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------

//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------
    public void Bloquear() {
        txFecha.setEditable(false);
        txNom.setEditable(false);
        txApe.setEditable(false);
        txCc.setEditable(false);
        txTel.setEditable(false);
        txDireccion.setEditable(false);
        txOcupacion.setEditable(false);
        txMunicipio.setEditable(false);
        txBarrio.setEditable(false);

        txNomRef.setEditable(false);
        txApeRef.setEditable(false);
        txTelRef.setEditable(false);
        txEmpresa.setEditable(false);
        txMunicipioRef.setEditable(false);
        txBarrioRef.setEditable(false);

        txNomPaciente.setEditable(false);
        txApePaciente.setEditable(false);
        txTelPaciente.setEditable(false);
        txObser.setEditable(false);

        btAgregar.setEnabled(false);
        btLimpiar.setEnabled(false);
        btNuevo.setEnabled(true);
    }
//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------

//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------
    public void Desbloquear() {
        txFecha.setEditable(true);
        txNom.setEditable(true);
        txApe.setEditable(true);
        txCc.setEditable(true);
        txTel.setEditable(true);
        txDireccion.setEditable(true);
        txOcupacion.setEditable(true);
        txMunicipio.setEditable(true);
        txBarrio.setEditable(true);

        txNomRef.setEditable(true);
        txApeRef.setEditable(true);
        txTelRef.setEditable(true);
        txEmpresa.setEditable(true);
        txMunicipioRef.setEditable(true);
        txBarrioRef.setEditable(true);

        txNomPaciente.setEditable(true);
        txApePaciente.setEditable(true);
        txTelPaciente.setEditable(true);
        txObser.setEditable(true);
    }
//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------

//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------
    @SuppressWarnings("unchecked")
//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------
    public void MostrarTabla(String ValorBuscar) {
        DefaultTableModel RegistroClientes = new DefaultTableModel();
        RegistroClientes.addColumn("ID");
        RegistroClientes.addColumn("FECHA");
        RegistroClientes.addColumn("NOMBRE");
        RegistroClientes.addColumn("APELLIDO");
        RegistroClientes.addColumn("CEDULA");
        RegistroClientes.addColumn("TELEFONOS");
        RegistroClientes.addColumn("DIRECCIÓN");
        RegistroClientes.addColumn("MUNICIPIO");
        RegistroClientes.addColumn("BARRIO");
        RegistroClientes.addColumn("OCUPACIÓN");
        RegistroClientes.addColumn("NOMBRE REF");
        RegistroClientes.addColumn("APELLIDO REF");
        RegistroClientes.addColumn("TELEFONOS REF");
        RegistroClientes.addColumn("PARENTESCO REF");
        RegistroClientes.addColumn("EMPRESA REF");
        RegistroClientes.addColumn("MUNICIPIO REF");
        RegistroClientes.addColumn("BARRIO REF");
        RegistroClientes.addColumn("NOMBRE PACIENTE");
        RegistroClientes.addColumn("APELLIDO PACIENTE");
        RegistroClientes.addColumn("TELEFONOS PACIENTE");
        RegistroClientes.addColumn("OBSERVACIONES");
        jtMostrar.setModel(RegistroClientes);

        String Sql = "";

        if (ValorBuscar.equals("")) {
            Sql = "SELECT * FROM registro_clientes";
        } else {
            Sql = "SELECT * FROM registro_clientes WHERE " + atributo + "='" + ValorBuscar + "'";
        }

        String Datos[] = new String[22];

        Statement St;
        try {
            St = Con.createStatement();
            ResultSet Rst = St.executeQuery(Sql);

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
                Datos[11] = Rst.getString(12);
                Datos[12] = Rst.getString(13);
                Datos[13] = Rst.getString(14);
                Datos[14] = Rst.getString(15);
                Datos[15] = Rst.getString(16);
                Datos[16] = Rst.getString(17);
                Datos[17] = Rst.getString(18);
                Datos[18] = Rst.getString(19);
                Datos[19] = Rst.getString(20);
                Datos[20] = Rst.getString(21);
                Datos[21] = Rst.getString(22);
                RegistroClientes.addRow(Datos);
            }
            jtMostrar.setModel(RegistroClientes);

        } catch (SQLException ex) {
            Logger.getLogger(Inventario.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------    

//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------  
    public void LimpiarAgregar() {
        txNom.setText("");
        txApe.setText("");
        txCc.setText("");
        txTel.setText("");
        txDireccion.setText("");
        txOcupacion.setText("");
        txMunicipio.setText("");
        txBarrio.setText("");

        txNomRef.setText("");
        txApeRef.setText("");
        txTelRef.setText("");
        txEmpresa.setText("");
        txMunicipioRef.setText("");
        txBarrioRef.setText("");

        txNomPaciente.setText("");
        txApePaciente.setText("");
        txTelPaciente.setText("");
        txObser.setText("");

    }
//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------  

//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------  
    public void AgregarItem() {
        jcBuscar.addItem("Nombre");
        jcBuscar.addItem("Apellido");
        jcBuscar.addItem("Cedula");
        jcBuscar.addItem("Ocupació");
        jcBuscar.addItem("Nombre Referencia");
        jcBuscar.addItem("Apellido Referencia");
        jcBuscar.addItem("Empresa Referencia");
        jcBuscar.addItem("Nombre Paciente");
        jcBuscar.addItem("Apellido Paciente");

    }
//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------  

//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------  
    public void AgregarItemParentesco() {
        jcParentesco.addItem("Hija/HIjo");
        jcParentesco.addItem("Tia/Tio");
        jcParentesco.addItem("Hermana/Hermano");
        jcParentesco.addItem("Prima/Primo");
        jcParentesco.addItem("Cuñada/Cuñado");
        jcParentesco.addItem("Esposa/Esposo");
        jcParentesco.addItem("Papá");
        jcParentesco.addItem("Mamá");
    }
//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------  

//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jpAgregar = new javax.swing.JPanel();
        btNuevo = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txNomRef = new javax.swing.JTextField();
        txApeRef = new javax.swing.JTextField();
        txTelRef = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txEmpresa = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jcParentesco = new javax.swing.JComboBox<>();
        txMunicipioRef = new javax.swing.JTextField();
        txBarrioRef = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txNomPaciente = new javax.swing.JTextField();
        txTelPaciente = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txObser = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txApePaciente = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txNom = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txApe = new javax.swing.JTextField();
        txCc = new javax.swing.JTextField();
        txTel = new javax.swing.JTextField();
        txDireccion = new javax.swing.JTextField();
        txOcupacion = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txFecha = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txMunicipio = new javax.swing.JTextField();
        txBarrio = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jdateCalendario = new com.toedter.calendar.JDateChooser();
        btAgregar = new javax.swing.JButton();
        btLimpiar = new javax.swing.JButton();
        jBActualizarAgregar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        btRegresar = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jcBuscar = new javax.swing.JComboBox<>();
        txBuscar = new javax.swing.JTextField();
        btBuscar = new javax.swing.JButton();
        btActulizarBuscar = new javax.swing.JButton();
        btLimpiarBuscar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtMostrar = new javax.swing.JTable();
        btModificar = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btNuevo.setText("NUEVO");
        btNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNuevoActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("REFERENCIA PERSONAL"));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel8.setText("Nombres:");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel9.setText("Telefonos:");

        jLabel19.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel19.setText("Apellidos:");

        jLabel14.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel14.setText("Parentesco:");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel7.setText("Empresa:");

        jLabel13.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel13.setText("Barrio:");

        jcParentesco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcParentescoActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel21.setText("Municipio:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txNomRef, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txApeRef, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txTelRef, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(31, 31, 31)
                        .addComponent(jcParentesco, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(31, 31, 31)
                        .addComponent(txEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(31, 31, 31)
                        .addComponent(txMunicipioRef, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(31, 31, 31)
                        .addComponent(txBarrioRef, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txNomRef, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txApeRef, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txTelRef, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcParentesco, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txMunicipioRef, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txBarrioRef, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("DATOS DEL PACIENTE"));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel10.setText("Nombres:");

        jLabel11.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel11.setText("Telefonos:");

        txObser.setColumns(20);
        txObser.setRows(5);
        jScrollPane1.setViewportView(txObser);

        jLabel16.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel16.setText("Observaciones:");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel2.setText("Apellidos:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txNomPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(txApePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGap(0, 6, Short.MAX_VALUE)
                                .addComponent(jLabel16)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txTelPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txNomPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txApePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txTelPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel16))))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel3.setText("Cédula:");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel4.setText("Telefonos:");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel5.setText("Dirección:");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel6.setText("Municipio:");

        jLabel15.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel15.setText("Ocupación:");

        txNom.setMinimumSize(new java.awt.Dimension(6, 30));
        txNom.setPreferredSize(new java.awt.Dimension(6, 30));

        jLabel18.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel18.setText("Nombres: ");

        txApe.setMinimumSize(new java.awt.Dimension(6, 30));
        txApe.setPreferredSize(new java.awt.Dimension(6, 30));

        txCc.setMinimumSize(new java.awt.Dimension(6, 30));
        txCc.setPreferredSize(new java.awt.Dimension(6, 30));

        txTel.setMinimumSize(new java.awt.Dimension(6, 30));
        txTel.setPreferredSize(new java.awt.Dimension(6, 30));

        txDireccion.setMinimumSize(new java.awt.Dimension(6, 30));
        txDireccion.setPreferredSize(new java.awt.Dimension(6, 30));

        txOcupacion.setMinimumSize(new java.awt.Dimension(6, 30));
        txOcupacion.setPreferredSize(new java.awt.Dimension(6, 30));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel12.setText("Fecha:");

        txFecha.setMinimumSize(new java.awt.Dimension(6, 30));
        txFecha.setPreferredSize(new java.awt.Dimension(6, 30));

        jLabel20.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel20.setText("Apellidos:");

        txMunicipio.setMinimumSize(new java.awt.Dimension(6, 30));
        txMunicipio.setPreferredSize(new java.awt.Dimension(6, 30));

        txBarrio.setMinimumSize(new java.awt.Dimension(6, 30));
        txBarrio.setPreferredSize(new java.awt.Dimension(6, 30));

        jLabel17.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel17.setText("Barrio:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(93, 93, 93)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txOcupacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                    .addComponent(txNom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txFecha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txApe, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txCc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txTel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txMunicipio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txBarrio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addComponent(txNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel18))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txApe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txCc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txBarrio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txOcupacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addContainerGap(143, Short.MAX_VALUE))
        );

        btAgregar.setText("AGREGAR");
        btAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAgregarActionPerformed(evt);
            }
        });

        btLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesInventario/Limpiar8.png"))); // NOI18N
        btLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimpiarActionPerformed(evt);
            }
        });

        jBActualizarAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesInventario/Refrescar8.png"))); // NOI18N
        jBActualizarAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActualizarAgregarActionPerformed(evt);
            }
        });

        jLabel1.setText("Boton refrescar, \n");

        jLabel22.setText("solo cuando se vaya ");

        jLabel23.setText("a modifcar algun cliente");

        btRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesInventario/CAsa2.2.png"))); // NOI18N
        btRegresar.setToolTipText("");
        btRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpAgregarLayout = new javax.swing.GroupLayout(jpAgregar);
        jpAgregar.setLayout(jpAgregarLayout);
        jpAgregarLayout.setHorizontalGroup(
            jpAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpAgregarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel23)
                .addGap(272, 272, 272))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpAgregarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel22)
                .addGap(280, 280, 280))
            .addGroup(jpAgregarLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jpAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpAgregarLayout.createSequentialGroup()
                        .addGroup(jpAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpAgregarLayout.createSequentialGroup()
                                .addComponent(btRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jpAgregarLayout.createSequentialGroup()
                                .addComponent(btAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(jBActualizarAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpAgregarLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jdateCalendario, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpAgregarLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(291, 291, 291))))
        );
        jpAgregarLayout.setVerticalGroup(
            jpAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAgregarLayout.createSequentialGroup()
                .addGroup(jpAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpAgregarLayout.createSequentialGroup()
                        .addComponent(jdateCalendario, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addGroup(jpAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpAgregarLayout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(45, 45, 45)
                        .addGroup(jpAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBActualizarAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpAgregarLayout.createSequentialGroup()
                        .addGap(678, 678, 678)
                        .addComponent(btRegresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("AGREGAR", jpAgregar);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesInventario/buscar5.png"))); // NOI18N
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        btActulizarBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesInventario/refresh2-8.png"))); // NOI18N
        btActulizarBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btActulizarBuscarActionPerformed(evt);
            }
        });

        btLimpiarBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesInventario/Limpiar8.png"))); // NOI18N
        btLimpiarBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimpiarBuscarActionPerformed(evt);
            }
        });

        jtMostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(jtMostrar);

        btModificar.setText("MODIFICAR");
        btModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jcBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(txBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btActulizarBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 217, Short.MAX_VALUE)
                .addComponent(btModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btLimpiarBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jScrollPane3)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jcBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                            .addComponent(txBuscar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btActulizarBuscar))
                            .addComponent(btLimpiarBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(33, 33, 33)))
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("BUSCAR", jPanel7);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 846, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------

//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------
    private void btLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimpiarActionPerformed
        LimpiarAgregar();
    }//GEN-LAST:event_btLimpiarActionPerformed
//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------

//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------
    private void btLimpiarBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimpiarBuscarActionPerformed
        txBuscar.setText("");
    }//GEN-LAST:event_btLimpiarBuscarActionPerformed
//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------

//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------
    private void btNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNuevoActionPerformed
        Desbloquear();
        btAgregar.setEnabled(true);
        btLimpiar.setEnabled(true);
        btNuevo.setEnabled(false);
    }//GEN-LAST:event_btNuevoActionPerformed
//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------

//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------
    private void btAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAgregarActionPerformed
        try {
            PreparedStatement ps = Con.prepareStatement("INSERT INTO registro_clientes(Fecha, Nombre, Apellido, Cedula, Telefono, Direccion, Municipio, Barrio, Ocupacion"
                    + "Nombre_Referencia, Apellidos_Referencia, Telefonos_Referencia, Parentesco_Referencia, Empresa_Referencia"
                    + " Municipio_Referencia, Barrio_Referencia, Nombre_Paciente, Apellidos_Pacientes, Telefonos_Pacientes,Observacione_Pacientes) VALUE(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, txFecha.getText());
            ps.setString(2, txNom.getText());
            ps.setString(3, txApe.getText());
            ps.setString(4, txCc.getText());
            ps.setString(5, txTel.getText());
            ps.setString(6, txDireccion.getText());
            ps.setString(7, txOcupacion.getText());
            ps.setString(8, txMunicipio.getText());
            ps.setString(9, txBarrio.getText());
            ps.setString(10, txNomRef.getText());
            ps.setString(11, txApeRef.getText());
            ps.setString(12, txTelRef.getText());
            ps.setString(13, jcParentesco.getSelectedItem().toString());
            ps.setString(14, txEmpresa.getText());
            ps.setString(15, txMunicipioRef.getText());
            ps.setString(16, txBarrioRef.getText());
            ps.setString(17, txNomPaciente.getText());
            ps.setString(18, txApePaciente.getText());
            ps.setString(19, txTelPaciente.getText());
            ps.setString(20, txObser.getText());

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "¡Se ha registrado el cliente!");
            MostrarTabla("");

            LimpiarAgregar();
            Bloquear();

        } catch (SQLException ex) {
            Logger.getLogger(Inventario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btAgregarActionPerformed

//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------
    private void btModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModificarActionPerformed
        int Fila = jtMostrar.getSelectedRow();

        if (Fila >= 1) {

            txFecha.setText(jtMostrar.getValueAt(Fila, 0).toString());
            txNom.setText(jtMostrar.getValueAt(Fila, 1).toString());
            txApe.setText(jtMostrar.getValueAt(Fila, 2).toString());
            txCc.setText(jtMostrar.getValueAt(Fila, 3).toString());
            txTel.setText(jtMostrar.getValueAt(Fila, 4).toString());
            txDireccion.setText(jtMostrar.getValueAt(Fila, 5).toString());
            txOcupacion.setText(jtMostrar.getValueAt(Fila, 6).toString());
            txMunicipio.setText(jtMostrar.getValueAt(Fila, 7).toString());
            txBarrio.setText(jtMostrar.getValueAt(Fila, 8).toString());
            txNomRef.setText(jtMostrar.getValueAt(Fila, 9).toString());
            txApeRef.setText(jtMostrar.getValueAt(Fila, 10).toString());
            txTelRef.setText(jtMostrar.getValueAt(Fila, 11).toString());
            txEmpresa.setText(jtMostrar.getValueAt(Fila, 12).toString());
            txMunicipioRef.setText(jtMostrar.getValueAt(Fila, 13).toString());
            txBarrioRef.setText(jtMostrar.getValueAt(Fila, 14).toString());
            txNomPaciente.setText(jtMostrar.getValueAt(Fila, 15).toString());
            txApePaciente.setText(jtMostrar.getValueAt(Fila, 16).toString());
            txTelPaciente.setText(jtMostrar.getValueAt(Fila, 17).toString());
            txObser.setText(jtMostrar.getValueAt(Fila, 18).toString());
            Desbloquear();
            btLimpiar.setEnabled(true);
            jBActualizarAgregar.setEnabled(true);
            btNuevo.setEnabled(true);

        } else {
            JOptionPane.showMessageDialog(null, "¡Casilla no seleccionada!");
        }

    }//GEN-LAST:event_btModificarActionPerformed
//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------

//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------
    private void btRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegresarActionPerformed
        Principal prin = new Principal();
        prin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btRegresarActionPerformed
//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------

//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------
    private void jBActualizarAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBActualizarAgregarActionPerformed
        try {
            PreparedStatement pps = Con.prepareStatement("UPDATE registro_clientes SET '" + ",Fecha='" + txFecha.getText() + "Nombre= " + txNom.getText() + "Apellido= " + txApe.getText() + "Cedula= " + txCc.getText() + "Telefono= " + txTel.getText() + "Direccion= "
                    + txDireccion.getText() + "Municipio= " + txMunicipio.getText() + "Barrio= " + txBarrio.getText() + "Ocupacion= " + txOcupacion.getText()
                    + "Nombre_Referencia= " + txNomRef.getText() + "Apellidos_Referencia= " + txApeRef.getText() + "Telefonos_Referencia= " + txTelRef.getText() + "Parentesco_Referencia= " + jcParentesco.getSelectedItem().toString() + "Empresa_Referencia= " + txEmpresa.getText()
                    + "Municipio_Referencia= " + txMunicipioRef.getText() + "Barrio_Referencia= " + txBarrioRef.getText() + "Nombre_Paciente= " + txNomPaciente.getText() + "Apellidos_Pacientes= " + txApePaciente.getText() + "Telefonos_Pacientes= " + txTelPaciente.getText()
                    + "Observacione_Pacientes= " + txObser.getText() + "WHERE Id= " + txBuscar.getText() + "'");
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se actualizarón los datos");

            LimpiarAgregar();
            MostrarTabla("");
            Bloquear();

        } catch (SQLException ex) {
            Logger.getLogger(Inventario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBActualizarAgregarActionPerformed
//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------

//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------
    private void btActulizarBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btActulizarBuscarActionPerformed
        MostrarTabla("");
    }//GEN-LAST:event_btActulizarBuscarActionPerformed
//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------

//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------
    private void jcParentescoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcParentescoActionPerformed

    }//GEN-LAST:event_jcParentescoActionPerformed
//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------

//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------
    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        atributo = jcBuscar.getSelectedItem().toString();
        MostrarTabla(txBuscar.getText());
    }//GEN-LAST:event_btBuscarActionPerformed
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
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clientes().setVisible(true);
            }
        });
    }
//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------

//--------------------------------------------------------------------------------------//--------------------------------------------------------------------------------------
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btActulizarBuscar;
    private javax.swing.JButton btAgregar;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btLimpiar;
    private javax.swing.JButton btLimpiarBuscar;
    private javax.swing.JButton btModificar;
    private javax.swing.JButton btNuevo;
    private javax.swing.JButton btRegresar;
    private javax.swing.JButton jBActualizarAgregar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> jcBuscar;
    private javax.swing.JComboBox<String> jcParentesco;
    private com.toedter.calendar.JDateChooser jdateCalendario;
    private javax.swing.JPanel jpAgregar;
    private javax.swing.JTable jtMostrar;
    private javax.swing.JTextField txApe;
    private javax.swing.JTextField txApePaciente;
    private javax.swing.JTextField txApeRef;
    private javax.swing.JTextField txBarrio;
    private javax.swing.JTextField txBarrioRef;
    private javax.swing.JTextField txBuscar;
    private javax.swing.JTextField txCc;
    private javax.swing.JTextField txDireccion;
    private javax.swing.JTextField txEmpresa;
    private javax.swing.JTextField txFecha;
    private javax.swing.JTextField txMunicipio;
    private javax.swing.JTextField txMunicipioRef;
    private javax.swing.JTextField txNom;
    private javax.swing.JTextField txNomPaciente;
    private javax.swing.JTextField txNomRef;
    private javax.swing.JTextArea txObser;
    private javax.swing.JTextField txOcupacion;
    private javax.swing.JTextField txTel;
    private javax.swing.JTextField txTelPaciente;
    private javax.swing.JTextField txTelRef;
    // End of variables declaration//GEN-END:variables
}
