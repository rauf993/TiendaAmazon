
import Datos.Clientes;
import Datos.Piezas;
import Datos.Reparaciones;
import Datos.Tabla;
import Datos.Usuarios;
import Datos.Vehiculos;
import Metodos.DbClientes;
import Metodos.DbPiezas;
import Metodos.DbReparaciones;
import Metodos.DbTabla;
import Metodos.DbUsuarios;
import Metodos.DbVehiculos;
import com.sun.tools.javac.Main;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class main extends javax.swing.JFrame {

    private DbUsuarios dbUser;//primera parte
    private Usuarios user;//primera parte
    private DbClientes dbClient;//parte 2 segunda pestaña
    private Clientes client;//para la segunda pestaña
    private DbVehiculos dbVehiculo;//tercera parte 
    private Vehiculos vehiculo;//pestaña 3 vehiculos 
    private DbPiezas dbPiezas;//para la cuerta parte
    private Piezas piezas;//para la parte 4 ya casisiiiiiiiii
    private DbReparaciones dbRep;//la ultima parte 
    private Reparaciones rep;
    private DbTabla dbtabla;
    private DefaultTableModel modelo;

    
       ArrayList<Clientes> list= new ArrayList<>();
       ArrayList <Tabla> list1 = new ArrayList<>();
         int contadorIndice=1;
         boolean estatus=true;
    public main() {
        initComponents();
        txId_cl.setEnabled(false);  
         txId_ve.setEnabled(false);

        dbUser = new DbUsuarios();//primera parte
        dbClient=new DbClientes();//para la segunda parte 
        dbVehiculo=new DbVehiculos();//para la tercera parte
        dbPiezas=new DbPiezas();//Para la tercera
        dbRep=new DbReparaciones(); //la quita parte 
        
    
       getClientes();
       
       getNamesPiezas();
       
       getMatriculas();
        
  
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        txUsername_lg = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txPassword_lg = new javax.swing.JPasswordField();
        jLabel12 = new javax.swing.JLabel();
        btAutentificar_lg = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txUsuarionombre_us = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btBuscar_us = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txId_us = new javax.swing.JTextField();
        txNombre_us = new javax.swing.JTextField();
        txAp_us = new javax.swing.JTextField();
        txAm_us = new javax.swing.JTextField();
        txTelefono_us = new javax.swing.JTextField();
        txUsername_us = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btNuevo_us = new javax.swing.JButton();
        btSalvar_us = new javax.swing.JButton();
        btCancelar_us = new javax.swing.JButton();
        btEditar_us = new javax.swing.JButton();
        btRemover_us = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txPassword_us = new javax.swing.JTextField();
        txDireccion_us = new javax.swing.JTextField();
        cbPerfil_us = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txId_ve = new javax.swing.JTextField();
        txMatricula_ve = new javax.swing.JTextField();
        txMarca_ve = new javax.swing.JTextField();
        txNodelo_ve = new javax.swing.JTextField();
        txFecha_ve = new javax.swing.JTextField();
        btNuevo_ve = new javax.swing.JButton();
        btSalvar_ve = new javax.swing.JButton();
        btCancelar_ve = new javax.swing.JButton();
        btEditar_ve = new javax.swing.JButton();
        btRemover_ve = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        txMatricula = new javax.swing.JTextField();
        btBuscarMatricula = new javax.swing.JButton();
        cbId_us2 = new javax.swing.JComboBox<>();
        jLabel31 = new javax.swing.JLabel();
        txtid_usuario = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        txBuscarPiezaId = new javax.swing.JTextField();
        btBuscarIdPieza = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        txPiezaId = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txNombre_pi = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txStock = new javax.swing.JTextField();
        btNuevo_pi = new javax.swing.JButton();
        btSalvar_pi = new javax.swing.JButton();
        btCancelar_pi = new javax.swing.JButton();
        btEditar_pi = new javax.swing.JButton();
        btRemover_pi = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txUsuarionombre_cl = new javax.swing.JTextField();
        btBuscar_cl = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        cbId_us = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txId_cl = new javax.swing.JTextField();
        txNombre_cl = new javax.swing.JTextField();
        txAp_cl = new javax.swing.JTextField();
        txAm_cl = new javax.swing.JTextField();
        txRfc_cl = new javax.swing.JTextField();
        btNuevo_cl = new javax.swing.JButton();
        btSalvar_cl = new javax.swing.JButton();
        btCancelar_cl = new javax.swing.JButton();
        btEditar_cl = new javax.swing.JButton();
        btRemover_cl = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        txBuscarReparacionId = new javax.swing.JTextField();
        btBuscar_re = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        txFolio_re = new javax.swing.JTextField();
        txFalla_re = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        cbPieza_Id = new javax.swing.JComboBox<>();
        jLabel38 = new javax.swing.JLabel();
        txFecha_en = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        txFecha_sa = new javax.swing.JTextField();
        txCantidad = new javax.swing.JLabel();
        txCantidad_pi = new javax.swing.JTextField();
        btNuevo_re = new javax.swing.JButton();
        btSalvar_re = new javax.swing.JButton();
        btCancelar_re = new javax.swing.JButton();
        btEditar_re = new javax.swing.JButton();
        btRemover_re = new javax.swing.JButton();
        buton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel41 = new javax.swing.JLabel();
        txCantidad_ca = new javax.swing.JTextField();
        comboMatricula = new javax.swing.JComboBox<>();
        prueba = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel11.setText("Usuario:");

        jLabel12.setText("Password:");

        btAutentificar_lg.setText("Autentificar");
        btAutentificar_lg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAutentificar_lgActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txUsername_lg, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
                            .addComponent(txPassword_lg)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(btAutentificar_lg)))
                .addContainerGap(658, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txUsername_lg, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txPassword_lg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(btAutentificar_lg, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(4322, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Login", jPanel1);

        jLabel1.setText("Ingrese Nombre para Buscar:");

        btBuscar_us.setText("Buscar");
        btBuscar_us.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscar_usActionPerformed(evt);
            }
        });

        jLabel2.setText("ID:");

        jLabel3.setText("Apellido Paterno:");

        jLabel4.setText("Nombre:");

        jLabel6.setText("Telefono:");

        jLabel7.setText("Username:");

        jLabel5.setText("Apellido Materno:");

        btNuevo_us.setText("Nuevo");
        btNuevo_us.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNuevo_usActionPerformed(evt);
            }
        });

        btSalvar_us.setText("Salvar");
        btSalvar_us.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvar_usActionPerformed(evt);
            }
        });

        btCancelar_us.setText("Cancelar");
        btCancelar_us.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelar_usActionPerformed(evt);
            }
        });

        btEditar_us.setText("Editar");
        btEditar_us.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditar_usActionPerformed(evt);
            }
        });

        btRemover_us.setText("Eliminar");
        btRemover_us.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemover_usActionPerformed(evt);
            }
        });

        jLabel8.setText("Password:");

        jLabel9.setText("Direccion:");

        jLabel10.setText("Perfil:");

        cbPerfil_us.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gerente", "Administrador" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txUsuarionombre_us, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btBuscar_us))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(btNuevo_us, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btSalvar_us, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btCancelar_us, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(31, 31, 31))
                                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txId_us, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txUsername_us, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txTelefono_us, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txNombre_us, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txAm_us, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txAp_us, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txPassword_us, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btEditar_us, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btRemover_us, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txDireccion_us, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbPerfil_us, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(1, 1, 1))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txUsuarionombre_us, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscar_us))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txId_us, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txNombre_us, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txAp_us, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txAm_us, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cbPerfil_us, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txTelefono_us, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txDireccion_us, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txUsername_us, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txPassword_us, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btNuevo_us, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSalvar_us, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCancelar_us, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEditar_us, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btRemover_us, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        jTabbedPane1.addTab("Usuarios", jPanel2);

        jLabel20.setText("Selecciones Cliente:");

        jLabel21.setText("Vehiculos ID:");

        jLabel22.setText("Modelo:");

        jLabel23.setText("Matricula:");

        jLabel24.setText("Marco:");

        jLabel25.setText("Fecha:");

        btNuevo_ve.setText("Nuevo");
        btNuevo_ve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNuevo_veActionPerformed(evt);
            }
        });

        btSalvar_ve.setText("Salvar");
        btSalvar_ve.setToolTipText("");
        btSalvar_ve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvar_veActionPerformed(evt);
            }
        });

        btCancelar_ve.setText("Cancelar");
        btCancelar_ve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelar_veActionPerformed(evt);
            }
        });

        btEditar_ve.setText("Editar");
        btEditar_ve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditar_veActionPerformed(evt);
            }
        });

        btRemover_ve.setText("Eliminar");
        btRemover_ve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemover_veActionPerformed(evt);
            }
        });

        jLabel26.setText("Ingrese Matricula:");

        txMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txMatriculaActionPerformed(evt);
            }
        });

        btBuscarMatricula.setText("Buscar");
        btBuscarMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarMatriculaActionPerformed(evt);
            }
        });

        cbId_us2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbId_us2ActionPerformed(evt);
            }
        });

        jLabel31.setText("Id usuario");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btBuscarMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txMatricula_ve, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                                        .addComponent(txMarca_ve)
                                        .addComponent(txNodelo_ve)
                                        .addComponent(txFecha_ve))
                                    .addComponent(txId_ve, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(btNuevo_ve, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(btSalvar_ve, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btCancelar_ve, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(cbId_us2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btEditar_ve, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btRemover_ve, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtid_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)))
                .addGap(58, 58, 58))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btBuscarMatricula, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txMatricula))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbId_us2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtid_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txId_ve, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txMatricula_ve, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txMarca_ve, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txNodelo_ve, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txFecha_ve, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btRemover_ve, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btEditar_ve, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btCancelar_ve, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btSalvar_ve, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btNuevo_ve, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40))
        );

        jTabbedPane1.addTab("Vehiculos", jPanel4);

        jLabel27.setText("Ingrese ID a buscar:");

        btBuscarIdPieza.setText("Buscar");
        btBuscarIdPieza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarIdPiezaActionPerformed(evt);
            }
        });

        jLabel28.setText("Pieza ID:");

        jLabel29.setText("Descripcion:");

        jLabel30.setText("Stock:");

        btNuevo_pi.setText("Nuevo");
        btNuevo_pi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNuevo_piActionPerformed(evt);
            }
        });

        btSalvar_pi.setText("Salvar");
        btSalvar_pi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvar_piActionPerformed(evt);
            }
        });

        btCancelar_pi.setText("Cancelar");
        btCancelar_pi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelar_piActionPerformed(evt);
            }
        });

        btEditar_pi.setText("Editar");
        btEditar_pi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditar_piActionPerformed(evt);
            }
        });

        btRemover_pi.setText("Eliminar");
        btRemover_pi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemover_piActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(0, 358, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txStock, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btNuevo_pi, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btSalvar_pi, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btCancelar_pi)
                        .addGap(18, 18, 18)
                        .addComponent(btEditar_pi, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btRemover_pi)))
                .addGap(342, 342, 342))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txNombre_pi, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txPiezaId, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(txBuscarPiezaId, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btBuscarIdPieza, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txBuscarPiezaId, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscarIdPieza, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txPiezaId, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txNombre_pi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txStock, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btNuevo_pi, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSalvar_pi, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCancelar_pi, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEditar_pi, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btRemover_pi, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(358, 358, 358))
        );

        jTabbedPane1.addTab("Piezas", jPanel5);

        jLabel13.setText("Ingrese Nombre a Buscar:");

        btBuscar_cl.setText("Buscar");
        btBuscar_cl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscar_clActionPerformed(evt);
            }
        });

        jLabel14.setText("RFC:");

        cbId_us.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbId_usActionPerformed(evt);
            }
        });

        jLabel15.setText("Seleccione ID Usuario:");

        jLabel16.setText("Nombre:");

        jLabel17.setText("Cliente ID:");

        jLabel18.setText("Apellido Paterno:");

        jLabel19.setText("Apellido Materno:");

        txId_cl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txId_clActionPerformed(evt);
            }
        });

        txNombre_cl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txNombre_clActionPerformed(evt);
            }
        });

        txAm_cl.setToolTipText("");

        btNuevo_cl.setText("Nuevo");
        btNuevo_cl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNuevo_clActionPerformed(evt);
            }
        });

        btSalvar_cl.setText("Salvar");
        btSalvar_cl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvar_clActionPerformed(evt);
            }
        });

        btCancelar_cl.setText("Cancelar");
        btCancelar_cl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelar_clActionPerformed(evt);
            }
        });

        btEditar_cl.setText("Editar");
        btEditar_cl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditar_clActionPerformed(evt);
            }
        });

        btRemover_cl.setText("Remover");
        btRemover_cl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemover_clActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel15)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel19)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txUsuarionombre_cl, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btBuscar_cl))
                            .addComponent(cbId_us, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txId_cl, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txNombre_cl, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txAp_cl, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txAm_cl, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txRfc_cl, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btNuevo_cl, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btSalvar_cl, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btCancelar_cl, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btEditar_cl, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btRemover_cl)))
                .addContainerGap(644, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btBuscar_cl, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txUsuarionombre_cl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbId_us, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txId_cl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(txNombre_cl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txAp_cl, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(txAm_cl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txRfc_cl)
                        .addGap(3, 3, 3)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btNuevo_cl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btSalvar_cl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btCancelar_cl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEditar_cl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btRemover_cl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        jTabbedPane1.addTab("Clientes", jPanel3);

        jLabel35.setText("Buscar Folio :");

        txBuscarReparacionId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txBuscarReparacionIdActionPerformed(evt);
            }
        });

        btBuscar_re.setText("Buscar");
        btBuscar_re.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscar_reActionPerformed(evt);
            }
        });

        jLabel32.setText("Matricula:");

        jLabel33.setText("Folio");

        jLabel36.setText("Descripcion de la falla:");

        jLabel37.setText("Nombre Pieza:");

        cbPieza_Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPieza_IdActionPerformed(evt);
            }
        });

        jLabel38.setText("Fecha Entrada:");

        jLabel39.setText("Fecha Salida:");

        txCantidad.setText("Cantidad Piezas:");

        btNuevo_re.setText("Nuevo");
        btNuevo_re.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNuevo_reActionPerformed(evt);
            }
        });

        btSalvar_re.setText("Salvar");
        btSalvar_re.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvar_reActionPerformed(evt);
            }
        });

        btCancelar_re.setText("Cancelar");
        btCancelar_re.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelar_reActionPerformed(evt);
            }
        });

        btEditar_re.setText("Editar");
        btEditar_re.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditar_reActionPerformed(evt);
            }
        });

        btRemover_re.setText("Eliminar");
        btRemover_re.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemover_reActionPerformed(evt);
            }
        });

        buton.setText("add_Pieza");
        buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butonActionPerformed(evt);
            }
        });

        jButton2.setText("Quitar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "", "", ""},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "indice", "ID pieza ", "Pieza", "Cantidad"
            }
        ));
        jScrollPane1.setViewportView(table);

        jLabel41.setText("Cantidad disponible");

        txCantidad_ca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txCantidad_caActionPerformed(evt);
            }
        });

        comboMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMatriculaActionPerformed(evt);
            }
        });

        prueba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pruebaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(prueba, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addComponent(jLabel35)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txBuscarReparacionId, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txFolio_re, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btNuevo_re, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btSalvar_re, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(27, 27, 27)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btEditar_re, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                            .addComponent(btRemover_re, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(38, 38, 38)
                                            .addComponent(btCancelar_re, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(txFalla_re, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addGap(357, 357, 357)
                        .addComponent(btBuscar_re, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel38)
                                .addGap(18, 18, 18)
                                .addComponent(txFecha_en, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(135, 135, 135))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addComponent(txCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel37)
                                .addGap(52, 52, 52)
                                .addComponent(cbPieza_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(txCantidad_pi, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel41)))
                        .addGap(31, 31, 31)
                        .addComponent(txCantidad_ca, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txFecha_sa, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(147, 147, 147)
                        .addComponent(buton)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)))
                .addContainerGap(431, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txBuscarReparacionId, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txFolio_re, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txFecha_en, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txFecha_sa, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(prueba, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txFalla_re, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btNuevo_re, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btEditar_re, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btSalvar_re, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btRemover_re, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btCancelar_re, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btBuscar_re, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbPieza_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txCantidad_pi, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txCantidad_ca, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(buton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(174, 4088, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Reparaciones", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    
   
    private void btBuscar_usActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscar_usActionPerformed
        try {
            user = new Usuarios();
            user.setNombre(txUsuarionombre_us.getText());
            user = dbUser.buscar(user);
            if (user != null) {
                txId_us.setText(String.valueOf(user.getUsuarioid()));
                txNombre_us.setText(user.getNombre());
                txAp_us.setText(user.getaPaterno());
                txAm_us.setText(user.getaMaterno());
                txTelefono_us.setText(user.getTelefono());
                txDireccion_us.setText(user.getDireccion());
                txUsername_us.setText(user.getUsername());
                txPassword_us.setText(user.getPassword());
                cbPerfil_us.setSelectedItem(user.getPerfil());
                /*
                txId_us.setEnabled(false);
                txNombre_us.setEnabled(false);
                txAp_us.setEnabled(false);
                txAm_us.setEnabled(false);
                txTelefono_us.setEnabled(false);
                txDireccion_us.setEnabled(false);
                txUsername_us.setEnabled(false);
                txPassword_us.setEnabled(false);
                cbPerfil_us.setEnabled(false);

                btNuevo_us.setEnabled(false);
                btSalvar_us.setEnabled(false);
                btCancelar_us.setEnabled(false);
                btEditar_us.setEnabled(true);
                btRemover_us.setEnabled(true);
                */
            } else {
                JOptionPane.showMessageDialog(this, "Usuario no encontrado.");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Ocurrió un error al buscar el usuario.");
        }
    }//GEN-LAST:event_btBuscar_usActionPerformed
  
    
    private void getClientes(){
         try{

            list=dbClient.getClientes();
     


            

            cbId_us.removeAllItems();
            cbId_us2.removeAllItems();

            cbId_us.addItem("");
             cbId_us2.addItem("");
            for (Clientes a : list){
                cbId_us.addItem(a.getNombre());
                 cbId_us2.addItem(a.getNombre());
       
                
            }
        }catch(IOException e){
            System.out.println(e);
            
        }
    }
    private void getNamesPiezas(){
         try {
    cbPieza_Id.removeAllItems();
    ArrayList<String> piezasNombre = dbPiezas.comboBox();
    for (String nombre : piezasNombre) {
        cbPieza_Id.addItem(nombre); 
    }
    cbPieza_Id.addActionListener(e -> {
        String nombreSeleccionado = (String) cbPieza_Id.getSelectedItem(); 
        
        if (nombreSeleccionado != null) {
            try {
                Piezas pieza = dbPiezas.buscarPiezaPorNombre(nombreSeleccionado); 
                if (pieza != null) {
                    txPiezaId.setText(String.valueOf(pieza.getPiezaid()));
                } else {
                    txPiezaId.setText("");
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    });
} catch (IOException ex) {
    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
}
    }
    private void getMatriculas(){
         try {
            comboMatricula.removeAllItems();
            ArrayList<String> matricula = dbVehiculo.comboBox();
            for (String nombre : matricula) {
                comboMatricula.addItem(nombre); 
            }
      
} catch (IOException ex) {
    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
}
    }
    private void btNuevo_usActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNuevo_usActionPerformed

        txId_us.setText("");
        txNombre_us.setText("");
        txAp_us.setText("");
        txAm_us.setText("");
        txTelefono_us.setText("");
        txDireccion_us.setText("");
        txUsername_us.setText("");
        txPassword_us.setText("");
        cbPerfil_us.setSelectedItem("");
        user = new Usuarios();
        
        int nuevoID = dbUser.aumentarID();
        user.setUsuarioid(nuevoID);
        /*
        txId_us.setText(String.valueOf(nuevoID));
        btNuevo_us.setEnabled(false);
        btSalvar_us.setEnabled(true);
        btCancelar_us.setEnabled(true);
        btEditar_us.setEnabled(false);
        btRemover_us.setEnabled(false);
        */
    }//GEN-LAST:event_btNuevo_usActionPerformed

    private void btSalvar_usActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvar_usActionPerformed
        
        user = new Usuarios();
        user.setUsuarioid(Integer.parseInt(txId_us.getText()));
        user.setNombre(txNombre_us.getText());
        user.setaPaterno(txAp_us.getText());
        user.setaMaterno(txAm_us.getText());
        user.setTelefono(txTelefono_us.getText());
        user.setDireccion(txDireccion_us.getText());
        user.setUsername(txUsername_us.getText());
        user.setPassword(txPassword_us.getText());
        user.setPerfil(cbPerfil_us.getSelectedItem().toString());
        dbUser.salvar(user);
        
        txId_us.setText("");
        txNombre_us.setText("");
        txAp_us.setText("");
        txAm_us.setText("");
        txTelefono_us.setText("");
        txDireccion_us.setText("");
        txUsername_us.setText("");
        txPassword_us.setText("");
        cbPerfil_us.setSelectedItem("");
        /*
        btNuevo_us.setEnabled(true);
        btSalvar_us.setEnabled(false);
        btCancelar_us.setEnabled(false);
        btEditar_us.setEnabled(false);
        btRemover_us.setEnabled(false);
        */
    }//GEN-LAST:event_btSalvar_usActionPerformed

    private void btCancelar_usActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelar_usActionPerformed
        
        user = new Usuarios();
        txId_us.setText("");
        txNombre_us.setText("");
        txAp_us.setText("");
        txAm_us.setText("");
        txTelefono_us.setText("");
        txDireccion_us.setText("");
        txUsername_us.setText("");
        txPassword_us.setText("");
        cbPerfil_us.setSelectedItem("");
        /*
        btNuevo_us.setEnabled(true);
        btSalvar_us.setEnabled(false);
        btCancelar_us.setEnabled(false);
        btEditar_us.setEnabled(false);
        btRemover_us.setEnabled(false);        
        */
    }//GEN-LAST:event_btCancelar_usActionPerformed

    private void btEditar_usActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditar_usActionPerformed
        /*
        try {
        user=new Usuarios();
        user.setUsuarioid(Integer.parseInt(txId_us.getText()));
        user.setNombre(txNombre_us.getText());
        user.setaPaterno(txAp_us.getText());
        user.setaMaterno(txAm_us.getText());
        user.setTelefono(txTelefono_us.getText());
        user.setDireccion(txDireccion_us.getText());
        user.setUsername(txUsername_us.getText());
        user.setPassword(txPassword_us.getText());
         user.setPerfil(cbPerfil_us.getSelectedItem().toString());
         /*
        txId_us.setEnabled(false);
        txNombre_us.setEnabled(true);
        txAp_us.setEnabled(true);
        txAm_us.setEnabled(true);
        txTelefono_us.setEnabled(true);
        txDireccion_us.setEnabled(true);
        txUsername_us.setEnabled(true);
        txPassword_us.setEnabled(true);
        cbPerfil_us.setEnabled(true);
        
        btNuevo_us.setEnabled(false);
        btSalvar_us.setEnabled(true);
        btCancelar_us.setEnabled(true);
        btEditar_us.setEnabled(false);
        btRemover_us.setEnabled(false);
    } catch (NumberFormatException ex) {
    }*/
       
                                         
    try {
        user = new Usuarios();
        user.setUsuarioid(Integer.parseInt(txId_us.getText()));
        user.setNombre(txNombre_us.getText());
        user.setaPaterno(txAp_us.getText());
        user.setaMaterno(txAm_us.getText());
        user.setTelefono(txTelefono_us.getText());
        user.setDireccion(txDireccion_us.getText());
        user.setUsername(txUsername_us.getText());
        user.setPassword(txPassword_us.getText());
        user.setPerfil(cbPerfil_us.getSelectedItem().toString());
        
        // Llamar al método editar en DbUsuarios para actualizar el archivo
        dbUser.editar(user); // Asegúrate de que este método se haya implementado correctamente en DbUsuarios
        
        // Confirmar que los datos se han editado
        JOptionPane.showMessageDialog(this, "Datos del usuario editados correctamente.");
        
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Por favor ingrese un ID válido.", "Error", JOptionPane.ERROR_MESSAGE);
    }


        
    }//GEN-LAST:event_btEditar_usActionPerformed

    private void btRemover_usActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemover_usActionPerformed
        try {
        user=new Usuarios();
        
        txId_us.setEnabled(true);
        txNombre_us.setEnabled(true);
        txAp_us.setEnabled(true);
        txAm_us.setEnabled(true);
        txTelefono_us.setEnabled(true);
        txDireccion_us.setEnabled(true);
        txUsername_us.setEnabled(true);
        txPassword_us.setEnabled(true);
        cbPerfil_us.setEnabled(true);
        
        user.setUsuarioid(Integer.parseInt(txId_us.getText()));
        user.setNombre(txNombre_us.getText());
        user.setaPaterno(txAp_us.getText());
        user.setaMaterno(txAm_us.getText());
        user.setTelefono(txTelefono_us.getText());
        user.setDireccion(txDireccion_us.getText());
        user.setUsername(txUsername_us.getText());
        user.setPassword(txPassword_us.getText());
        user.setPerfil(cbPerfil_us.getSelectedItem().toString());
        dbUser.remover(user);
        txId_us.setText("");
        txNombre_us.setText("");
        txAp_us.setText("");
        txAm_us.setText("");
        txTelefono_us.setText("");
        txDireccion_us.setText("");
        txUsername_us.setText("");
        txPassword_us.setText("");
        cbPerfil_us.setSelectedItem("");
        /*
        btNuevo_us.setEnabled(true);
        btSalvar_us.setEnabled(false);
        btCancelar_us.setEnabled(false);
        btEditar_us.setEnabled(false);
        btRemover_us.setEnabled(false);
        */
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btRemover_usActionPerformed

    private void btAutentificar_lgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAutentificar_lgActionPerformed
        /*
        try {
            String nombreIngresado = txUsername_lg.getText();
            String passwordIngresada = new String(txPassword_lg.getText());
            if (nombreIngresado.isEmpty() || passwordIngresada.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, ingrese ambos campos.");
                return;
            }
            String usuarioFijo = "A";
            String passwordFijo = "123";
            if (nombreIngresado.equals(usuarioFijo) && passwordIngresada.equals(passwordFijo)) {
                JOptionPane.showMessageDialog(this, "Autenticación exitosa. Perfil: admin");
                Tabla.setEnabledAt(1, true);
                Tabla.setEnabledAt(2, true);
                Tabla.setEnabledAt(3, true);
                Tabla.setEnabledAt(4, true);
                Tabla.setEnabledAt(5, true);
                return;
            }
            String perfil = dbUser.autenticar(nombreIngresado, passwordIngresada);
            if (perfil != null) {
                perfil = perfil.trim().toLowerCase();
                JOptionPane.showMessageDialog(this, "Autenticación exitosa. Perfil: " + perfil);
                switch (perfil) {
                    case "admin":
                    JOptionPane.showMessageDialog(null, "¡Bienvenido Admin!");
                    Tabla.setEnabledAt(1, true);
                    Tabla.setEnabledAt(2, true);
                    Tabla.setEnabledAt(3, true);
                    Tabla.setEnabledAt(4, true);
                    Tabla.setEnabledAt(5, true);
                    String idUsuarioAutenticado = dbUser.comboBox(nombreIngresado);
                    cbId_us.addItem(idUsuarioAutenticado);
                    break;
                    case "secretaria":
                    JOptionPane.showMessageDialog(null, "¡Bienvenida Secretaria!");
                    Tabla.setEnabledAt(1, false);
                    Tabla.setEnabledAt(2, true);
                    Tabla.setEnabledAt(3, true);
                    Tabla.setEnabledAt(4, false);
                    Tabla.setEnabledAt(5, false);
                    idUsuarioAutenticado = dbUser.comboBox(nombreIngresado);
                    cbId_us.addItem(idUsuarioAutenticado);
                    break;
                    case "mecanico":
                    JOptionPane.showMessageDialog(null, "¡Bienvenido Mecánico!");
                    Tabla.setEnabledAt(1, false);
                    Tabla.setEnabledAt(2, false);
                    Tabla.setEnabledAt(3, false);
                    Tabla.setEnabledAt(4, true);
                    Tabla.setEnabledAt(5, true);
                    break;
                    default:
                    JOptionPane.showMessageDialog(this, "Perfil desconocido.");
                    break;
                }
            } else {
                JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos.");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error inesperado: " + ex.getMessage());
            ex.printStackTrace();
        }
        */
        
    try {
        String nombreIngresado = txUsername_lg.getText();
        String passwordIngresada = txPassword_lg.getText();
        if (nombreIngresado.isEmpty() || passwordIngresada.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese ambos campos.");
            return;
        }
        String usuarioFijo = "A";
        String passwordFijo = "123";
        if (nombreIngresado.equals(usuarioFijo) && passwordIngresada.equals(passwordFijo)) {
            JOptionPane.showMessageDialog(this, "Autenticación exitosa. Perfil: admin");
            // Aquí se eliminan las líneas que habilitan las pestañas
            return;
        }
        String perfil = dbUser.autenticar(nombreIngresado, passwordIngresada);
        if (perfil != null) {
            perfil = perfil.trim().toLowerCase();
            JOptionPane.showMessageDialog(this, "Autenticación exitosa. Perfil: " + perfil);
            switch (perfil) {
                case "admin":
                    JOptionPane.showMessageDialog(null, "¡Bienvenido Admin!");
                    // Aquí se eliminan las líneas que habilitan las pestañas
                    String idUsuarioAutenticado = dbUser.comboBox(nombreIngresado);
                    cbId_us.addItem(idUsuarioAutenticado);
                    break;
                case "secretaria":
                    JOptionPane.showMessageDialog(null, "¡Bienvenida Secretaria!");
                    // Aquí se eliminan las líneas que habilitan las pestañas
                    idUsuarioAutenticado = dbUser.comboBox(nombreIngresado);
                    cbId_us.addItem(idUsuarioAutenticado);
                    break;
                case "mecanico":
                    JOptionPane.showMessageDialog(null, "¡Bienvenido Mecánico!");
                    // Aquí se eliminan las líneas que habilitan las pestañas
                    break;
                default:
                    JOptionPane.showMessageDialog(this, "Perfil desconocido.");
                    break;
            }
        } else {
            JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos.");
        }
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Error inesperado: " + ex.getMessage());
        ex.printStackTrace();
    }
        
    }//GEN-LAST:event_btAutentificar_lgActionPerformed

    private void btBuscar_clActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscar_clActionPerformed
        try {
            client = new Clientes();
            System.out.println(txUsuarionombre_cl.getText());
            client.setNombre(txUsuarionombre_cl.getText());
            
           
            client = dbClient.buscar(client);
            if (client != null) {
                txId_cl.setText(String.valueOf(client.getClienteid()));
                txNombre_cl.setText(client.getNombre());
                txAp_cl.setText(client.getaPaterno());
                txAm_cl.setText(client.getaMaterno());
                txRfc_cl.setText(client.getRfc());
                /*
                txId_cl.setEnabled(false);
                txNombre_cl.setEnabled(false);
                txAp_cl.setEnabled(false);
                txAm_cl.setEnabled(false);
                txRfc_cl.setEnabled(false);
                
                btNuevo_cl.setEnabled(false);
                btSalvar_cl.setEnabled(false);
                btCancelar_cl.setEnabled(false);
                btEditar_cl.setEnabled(true);
                btRemover_cl.setEnabled(true);
                */
            } else {
                JOptionPane.showMessageDialog(this, "Usuario no encontrado.");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Ocurrió un error al buscar el usuario.");
        }
    }//GEN-LAST:event_btBuscar_clActionPerformed

    private void btNuevo_clActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNuevo_clActionPerformed
        txId_cl.setText("");
        txNombre_cl.setText("");
        txAp_cl.setText("");
        txAm_cl.setText("");
        txRfc_cl.setText("");
        client = new Clientes();
        int nuevoID;
        nuevoID = dbClient.getID(); //client.setClienteid(nuevoID);
        /*
        btNuevo_cl.setEnabled(false);
        btSalvar_cl.setEnabled(true);
        btCancelar_cl.setEnabled(true);
        btEditar_cl.setEnabled(false);
        btRemover_cl.setEnabled(false);
         */
        txId_cl.setText(String.valueOf(nuevoID));
    }//GEN-LAST:event_btNuevo_clActionPerformed

    private void btSalvar_clActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvar_clActionPerformed
                                            

    client = new Clientes();
    dbClient= new DbClientes();

          int idCliente = dbClient.getID();
        System.out.println("lo que llega es " + idCliente);
        client.setClienteid(idCliente); 

    client.setNombre(txNombre_cl.getText());                   // Obtiene el nombre del cliente
    client.setaPaterno(txAp_cl.getText());                     // Obtiene el apellido paterno
    client.setaMaterno(txAm_cl.getText());                     // Obtiene el apellido materno
    client.setRfc(txRfc_cl.getText());                          // Obtiene el RFC del cliente

    // Guardar el cliente utilizando el objeto dbClient
    dbClient.Salvar(client);
  

    // Limpiar los campos de texto después de guardar los datos
    txId_cl.setText("");
    txNombre_cl.setText(""); 
    txAp_cl.setText("");
    txAm_cl.setText("");
    txRfc_cl.setText("");  
      //cbId_us.removeAllItems();
      getClientes();

    
    }//GEN-LAST:event_btSalvar_clActionPerformed

    private void btCancelar_clActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelar_clActionPerformed
        txId_cl.setText("");
        txNombre_cl.setText("");
        txAp_cl.setText("");
        txAm_cl.setText("");
        txRfc_cl.setText("");
        /*
        btNuevo_cl.setEnabled(true);
        btSalvar_cl.setEnabled(false);
        btCancelar_cl.setEnabled(false);
        btEditar_cl.setEnabled(false);
        btRemover_cl.setEnabled(false);
        */
    }//GEN-LAST:event_btCancelar_clActionPerformed

    private void btEditar_clActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditar_clActionPerformed
        /*
        try {
            client=new Clientes();
            client.setUsuarioid(Integer.parseInt(txId_cl.getText()));
            client.setNombre(txNombre_cl.getText());
            client.setaPaterno(txAp_cl.getText());
            client.setaMaterno(txAm_cl.getText());
            client.setaMaterno(txRfc_cl.getText());
            txId_cl.setEnabled(false);
            txNombre_cl.setEnabled(true);
            txAp_cl.setEnabled(true);
            txAm_cl.setEnabled(true);
            txRfc_cl.setEnabled(true);
        } catch (NumberFormatException ex) {
        }
        */
    try {
        // Crear un nuevo objeto Cliente
        client = new Clientes();
        
        // Validar que el ID sea un número válido
        int id = Integer.parseInt(txId_cl.getText());
        client.setUsuarioid(id);
        
        // Obtener valores de los campos de texto
        client.setNombre(txNombre_cl.getText());
        client.setaPaterno(txAp_cl.getText());
        client.setaMaterno(txAm_cl.getText());
        client.setRfc(txRfc_cl.getText());  // Aquí corregimos el error de setaMaterno

        // Habilitar los campos para edición
        txId_cl.setEnabled(false);  // ID no debería editarse
        txNombre_cl.setEnabled(true);
        txAp_cl.setEnabled(true);
        txAm_cl.setEnabled(true);
        txRfc_cl.setEnabled(true);
        
        // Llamar al método editar en DbClient para actualizar el archivo
        dbClient.editar(client); // Asegúrate de que este método esté bien implementado en DbUsuarios
        
        // Confirmar que los datos se han editado correctamente
        JOptionPane.showMessageDialog(this, "Datos del usuario editados correctamente.");
        
    } catch (NumberFormatException ex) {
   
        JOptionPane.showMessageDialog(this, "Por favor ingrese un ID válido.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    
        
    }//GEN-LAST:event_btEditar_clActionPerformed

    private void btRemover_clActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemover_clActionPerformed
        try {
            client =new Clientes();
            txId_cl.setEnabled(true);
            txNombre_cl.setEnabled(true);
            txAp_cl.setEnabled(true);
            txAm_cl.setEnabled(true);
            txRfc_cl.setEnabled(true);
            client.setClienteid(Integer.parseInt(txId_cl.getText()));
            client.setNombre(txNombre_cl.getText());
            client.setaPaterno(txAp_cl.getText());
            client.setaMaterno(txAm_cl.getText());
            client.setRfc(txRfc_cl.getText());
            dbClient.remover(client);
            txId_cl.setText("");
            txNombre_cl.setText("");
            txAp_cl.setText("");
            txAm_cl.setText("");
            txRfc_cl.setText("");
            /*
            btNuevo_cl.setEnabled(true);
            btSalvar_cl.setEnabled(false);
            btCancelar_cl.setEnabled(false);
            btEditar_cl.setEnabled(false);
            btRemover_cl.setEnabled(false);
            */
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btRemover_clActionPerformed

    private void btNuevo_veActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNuevo_veActionPerformed
        txId_ve.setText("");
        txMatricula_ve.setText("");
        txMarca_ve.setText("");
        txNodelo_ve.setText("");
        txFecha_ve.setText("");
        vehiculo = new Vehiculos();
   ;
        /*
        btNuevo_ve.setEnabled(false);
        btSalvar_ve.setEnabled(true);
        btCancelar_ve.setEnabled(true);
        btEditar_ve.setEnabled(false);
        btRemover_ve.setEnabled(false);
        */
      
    }//GEN-LAST:event_btNuevo_veActionPerformed

    private void btSalvar_veActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvar_veActionPerformed
        vehiculo = new Vehiculos();
        dbVehiculo=new DbVehiculos();
        vehiculo.setVehiculoid(dbVehiculo.getID());
        vehiculo.setMatricula(txMatricula_ve.getText());
        vehiculo.setMarca(txMarca_ve.getText());
        vehiculo.setModelo(txNodelo_ve.getText());
        vehiculo.setFecha(txFecha_ve.getText());
        dbVehiculo.Salvar(vehiculo);
        txId_ve.setText("");
        txMatricula_ve.setText("");
        txMarca_ve.setText("");
        txNodelo_ve.setText("");
        txFecha_ve.setText("");
        
        
     /*   btNuevo_ve.setEnabled(true);
        btSalvar_ve.setEnabled(false);
        btCancelar_ve.setEnabled(false);
        btEditar_ve.setEnabled(false);
        btRemover_ve.setEnabled(false);
*/
        
     

    }//GEN-LAST:event_btSalvar_veActionPerformed

    private void btCancelar_veActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelar_veActionPerformed
        txId_ve.setText("");
        txMatricula_ve.setText("");
        txMarca_ve.setText("");
        txNodelo_ve.setText("");
        txFecha_ve.setText("");
        /*
        btNuevo_ve.setEnabled(true);
        btSalvar_ve.setEnabled(false);
        btCancelar_ve.setEnabled(false);
        btEditar_ve.setEnabled(false);
        btRemover_ve.setEnabled(false);
        */
    }//GEN-LAST:event_btCancelar_veActionPerformed

    private void btEditar_veActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditar_veActionPerformed
       
    try {
        vehiculo = new Vehiculos();
        vehiculo.setVehiculoid(Integer.parseInt(txId_ve.getText()));
        vehiculo.setMatricula(txMatricula_ve.getText());
        vehiculo.setMarca(txMarca_ve.getText());  // Corrección: antes estaba con Modelo
        vehiculo.setModelo(txNodelo_ve.getText()); // Corrección: antes estaba con Marca
        vehiculo.setFecha(txFecha_ve.getText());

        dbVehiculo.editar(vehiculo);
        JOptionPane.showMessageDialog(this, "Datos del vehículo editados correctamente.");
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Por favor ingrese un ID válido.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btEditar_veActionPerformed

    private void btRemover_veActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemover_veActionPerformed
        try {
            vehiculo =new Vehiculos();
            txId_ve.setEnabled(true);
            txMatricula_ve.setEnabled(true);
            txMarca_ve.setEnabled(true);
            txNodelo_ve.setEnabled(true);
            txFecha_ve.setEnabled(true);
            vehiculo.setVehiculoid(Integer.parseInt(txId_ve.getText()));
            vehiculo.setMatricula(txMatricula_ve.getText());
            vehiculo.setModelo(txMarca_ve.getText());
            vehiculo.setMarca(txNodelo_ve.getText());
            vehiculo.setFecha(txFecha_ve.getText());
            dbVehiculo.remover(vehiculo);
            txId_ve.setText("");
            txMatricula_ve.setText("");
            txMarca_ve.setText("");
            txNodelo_ve.setText("");
            txFecha_ve.setText("");
            /*
            btNuevo_ve.setEnabled(true);
            btSalvar_ve.setEnabled(false);
            btCancelar_ve.setEnabled(false);
            btEditar_ve.setEnabled(false);
            btRemover_ve.setEnabled(false);
            */
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btRemover_veActionPerformed

    private void btBuscarMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarMatriculaActionPerformed
        try {
            vehiculo = new Vehiculos();
            vehiculo.setMatricula(txMatricula.getText());
            vehiculo = dbVehiculo.buscar(vehiculo);
            if (vehiculo != null) {
                txId_ve.setText(String.valueOf(vehiculo.getVehiculoid()));
                txMatricula_ve.setText(vehiculo.getMatricula());
                txMarca_ve.setText(vehiculo.getMarca());
                txNodelo_ve.setText(vehiculo.getModelo());
                txFecha_ve.setText(vehiculo.getFecha());
                /*
                txId_ve.setEnabled(false);
                txMatricula_ve.setEnabled(false);
                txMarca_ve.setEnabled(false);
                txNodelo_ve.setEnabled(false);
                txFecha_ve.setEnabled(false);
                btNuevo_ve.setEnabled(false);
                btSalvar_ve.setEnabled(false);
                btCancelar_ve.setEnabled(false);
                btEditar_ve.setEnabled(true);
                btRemover_ve.setEnabled(true);
                */
            } else {
                JOptionPane.showMessageDialog(this, "Usuario no encontrado.");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Ocurrió un error al buscar el usuario.");
        }
    }//GEN-LAST:event_btBuscarMatriculaActionPerformed

    private void btBuscarIdPiezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarIdPiezaActionPerformed
        try {
            piezas = new Piezas();
            int piezaId = Integer.parseInt(txBuscarPiezaId.getText());
            piezas.setPiezaid(piezaId);
            piezas = dbPiezas.buscar(piezas);

            if (piezas != null) {
                txPiezaId.setText(String.valueOf(piezas.getPiezaid()));
                txNombre_pi.setText(piezas.getNombre());
                txStock.setText(piezas.getStock());
                /*
                txPiezaId.setEnabled(false);
                txMatricula_ve.setEnabled(false);
                txMarca_ve.setEnabled(false);
                btNuevo_pi.setEnabled(false);
                btSalvar_pi.setEnabled(false);
                btCancelar_pi.setEnabled(false);
                btEditar_pi.setEnabled(true);
                btRemover_pi.setEnabled(true);
                */
            } else {
                JOptionPane.showMessageDialog(this, "Pieza no encontrada.");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "El ID de la pieza debe ser un número.");
        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Ocurrió un error al buscar la pieza.");
        }
    }//GEN-LAST:event_btBuscarIdPiezaActionPerformed

    private void btNuevo_piActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNuevo_piActionPerformed
        piezas = new Piezas();
        txPiezaId.setText("");
        txNombre_pi.setText("");
        txStock.setText("");
        int nuevoID = dbPiezas.aumentarID();
        piezas.setPiezaid(nuevoID);
        txPiezaId.setText(String.valueOf(nuevoID));
        /*
        btNuevo_pi.setEnabled(false);
        btSalvar_pi.setEnabled(true);
        btCancelar_pi.setEnabled(true);
        btEditar_pi.setEnabled(false);
        btRemover_pi.setEnabled(false);
        */
    }//GEN-LAST:event_btNuevo_piActionPerformed

    private void btSalvar_piActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvar_piActionPerformed
        piezas = new Piezas();
        piezas.setPiezaid(Integer.parseInt(txPiezaId.getText()));
        piezas.setNombre(txNombre_pi.getText());
        piezas.setStock(txStock.getText());
        try {
            dbPiezas.Salvar(piezas);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        txPiezaId.setText("");
        txNombre_pi.setText("");
        txStock.setText("");
        
        cbPieza_Id.removeAllItems();
        getNamesPiezas();
        txPiezaId.setText("");
        /*
        btNuevo_pi.setEnabled(true);
        btSalvar_pi.setEnabled(false);
        btCancelar_pi.setEnabled(false);
        btEditar_pi.setEnabled(false);
        btRemover_pi.setEnabled(false);
        */
    }//GEN-LAST:event_btSalvar_piActionPerformed

    private void btCancelar_piActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelar_piActionPerformed
        piezas = new Piezas();
        txPiezaId.setText("");
        txNombre_pi.setText("");
        txStock.setText("");
        /*
        btNuevo_pi.setEnabled(true);
        btSalvar_pi.setEnabled(false);
        btCancelar_pi.setEnabled(false);
        btEditar_pi.setEnabled(false);
        btRemover_pi.setEnabled(false);
        */
    }//GEN-LAST:event_btCancelar_piActionPerformed

    private void btEditar_piActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditar_piActionPerformed
        // Validar que los campos no estén vacíos
        if (txPiezaId.getText().isEmpty() || txNombre_pi.getText().isEmpty() || txStock.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        // Validar que el ID sea un número válido
        int piezaId;
        try {
            piezaId = Integer.parseInt(txPiezaId.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "El ID debe ser un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        // Validar que el stock contenga solo números
        if (!txStock.getText().matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "El campo Stock debe contener solo números.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        // Crear la instancia de la pieza y asignar los valores
        piezas = new Piezas();
        piezas.setPiezaid(piezaId);
        piezas.setNombre(txNombre_pi.getText());
        piezas.setStock(txStock.getText());
        // Llamar al método editar en DbPiezas
        dbPiezas.editar(piezas);
        // Deshabilitar edición y actualizar botones
        /*
        txPiezaId.setEnabled(false);
        txNombre_pi.setEnabled(false);
        txStock.setEnabled(false);
        btNuevo_pi.setEnabled(true);
        btSalvar_pi.setEnabled(false);
        btCancelar_pi.setEnabled(false);
        btEditar_pi.setEnabled(true);
        btRemover_pi.setEnabled(true);
        */
        JOptionPane.showMessageDialog(this, "Datos de la pieza editados correctamente.");
        
    }//GEN-LAST:event_btEditar_piActionPerformed

    private void btRemover_piActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemover_piActionPerformed
        try {
            piezas =new Piezas();
            txPiezaId.setEnabled(true);
            txNombre_pi.setEnabled(true);
            txStock.setEnabled(true);
            piezas.setPiezaid(Integer.parseInt(txPiezaId.getText()));
            piezas.setNombre(txNombre_pi.getText());
            piezas.setStock(txStock.getText());
            dbPiezas.remover(piezas);
            txPiezaId.setText("");
            txNombre_pi.setText("");
            txStock.setText("");
            /*
            btNuevo_pi.setEnabled(true);
            btSalvar_pi.setEnabled(false);
            btCancelar_pi.setEnabled(false);
            btEditar_pi.setEnabled(false);
            btRemover_pi.setEnabled(false);
            */
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btRemover_piActionPerformed

    private void txNombre_clActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txNombre_clActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txNombre_clActionPerformed

    private void cbId_usActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbId_usActionPerformed
        
    
         
    try {
        // Crear un nuevo objeto Cliente 
       String seleccionado = (String) cbId_us.getSelectedItem();
       if (seleccionado == null || seleccionado.equals("")) {
              txId_cl.setText("");
                txNombre_cl.setText("");
                txAp_cl.setText("");
                txAm_cl.setText("");
                txRfc_cl.setText("");  
            
        return;  
    }
        client = new Clientes();
        
        DbClientes dbClient=new DbClientes();
        
        // Establecer el ID de cliente basado en el valor seleccionado
        client.setNombre(seleccionado);  


        // Buscar el cliente en la base de datos
        client = dbClient.buscar(client);
        
        // Si se encuentra el cliente, mostrar la información en los campos de texto
        if (client != null) {
            txId_cl.setText(String.valueOf(client.getClienteid()));
            txNombre_cl.setText(client.getNombre());
            txAp_cl.setText(client.getaPaterno());
            txAm_cl.setText(client.getaMaterno());
            txRfc_cl.setText(client.getRfc());
        } else {
            JOptionPane.showMessageDialog(this, "Usuario no encontrado.");
        }
    } catch (IOException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Ocurrió un error al buscar el usuario.");
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "El ID seleccionado no es válido.");
    }
    //JOptionPane.showMessageDialog(this, "Seleccionaste: " + seleccionado);
    }//GEN-LAST:event_cbId_usActionPerformed

    private void txMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txMatriculaActionPerformed

    private void cbId_us2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbId_us2ActionPerformed
          try {
        // Crear un nuevo objeto Cliente 
       String seleccionado = (String) cbId_us2.getSelectedItem();
       if (seleccionado == null || seleccionado.equals("")) {
              txId_cl.setText("");
                txNombre_cl.setText("");
                txAp_cl.setText("");
                txAm_cl.setText("");
                txRfc_cl.setText("");  
            
        return;  
    }
        client = new Clientes();
        
        DbClientes dbClient=new DbClientes();
        
        // Establecer el ID de cliente basado en el valor seleccionado
        client.setNombre(seleccionado);  


        // Buscar el cliente en la base de datos
        client = dbClient.buscar(client);
        
        // Si se encuentra el cliente, mostrar la información en los campos de texto
        if (client != null) {
            txtid_usuario.setText(String.valueOf(client.getClienteid()));

        } else {
            JOptionPane.showMessageDialog(this, "Usuario no encontrado.");
        }
    } catch (IOException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Ocurrió un error al buscar el usuario.");
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "El ID seleccionado no es válido.");
    }
    }//GEN-LAST:event_cbId_us2ActionPerformed

    private void txId_clActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txId_clActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txId_clActionPerformed

    private void txCantidad_caActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txCantidad_caActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txCantidad_caActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed
        
    private void butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butonActionPerformed
        try {
    dbPiezas = new DbPiezas();
    dbtabla = new DbTabla();
    Tabla tabla = new Tabla();

    String valor = cbPieza_Id.getSelectedItem().toString();
    piezas = new Piezas();
    piezas.setNombre(valor);

    piezas = dbPiezas.buscarPiezaPorNombre(valor);
    modelo = (DefaultTableModel) table.getModel();

    if (Integer.parseInt(txCantidad_pi.getText()) <= Integer.parseInt(txCantidad_ca.getText())) {
          String nombrePieza = (String) cbPieza_Id.getSelectedItem();
            int cantidadUsada = Integer.parseInt(txCantidad_pi.getText());
            System.out.println(nombrePieza+cantidadUsada);
            Piezas piezaActualizada = dbPiezas.disminuirStock(nombrePieza, cantidadUsada);

            if (piezaActualizada != null) {
                System.out.println("Función: Stock actualizado: " + piezaActualizada.getStock());
                // Asegúrate de actualizar el valor de txCantidad_ca con el stock actualizado
                txCantidad_ca.setText(String.valueOf(piezaActualizada.getStock())); // Actualiza el campo de cantidad disponible
            }

        if (estatus) {
            modelo.setRowCount(0);

          
            // Agregar fila a la tabla con el stock actualizado
            modelo.addRow(new Object[]{
                contadorIndice,
                piezas.getPiezaid(),
                piezas.getNombre(),
                piezas.getStock()
            });

            tabla.setFolio(txFolio_re.getText());
            tabla.setIndice(contadorIndice);
            tabla.setidPieza(piezas.getPiezaid());
            tabla.setPieza(piezas.getNombre());
            tabla.setCantidad(Integer.parseInt(piezas.getStock()));
            list1.add(tabla);

            estatus = false;
            contadorIndice++;
        } else {
            modelo.addRow(new Object[]{
                contadorIndice,
                piezas.getPiezaid(),
                piezas.getNombre(),
                piezas.getStock()
            });

            tabla.setFolio(txFolio_re.getText());
            tabla.setIndice(contadorIndice);
            tabla.setidPieza(piezas.getPiezaid());
            tabla.setPieza(piezas.getNombre());
            tabla.setCantidad(Integer.parseInt(piezas.getStock()));
            list1.add(tabla);
            contadorIndice++;
        }
    } else {
        System.out.println("La cantidad a añadir no puede ser mayor que la cantidad disponible.");
    }

} catch (IOException e) {
    System.out.println(e);
}

    }//GEN-LAST:event_butonActionPerformed

    private void btRemover_reActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemover_reActionPerformed
        try {
            rep =new Reparaciones();
            txFolio_re.setEnabled(true);
            txNombre_pi.setEnabled(true);
            txStock.setEnabled(true);
            rep.setReparacionid(Integer.parseInt(txFolio_re.getText()));
            rep.setCantidad(Integer.parseInt(txCantidad_pi.getText()));
            rep.setFalla(txFalla_re.getText());
            rep.setFechaen(txFecha_en.getText());
            rep.setFechasa(txFecha_sa.getText());
            dbRep.remover(rep);
            txFolio_re.setText("");
            txCantidad_pi.setText("");
            txFalla_re.setText("");
            txFecha_en.setText("");
            txFecha_sa.setText("");
            btNuevo_re.setEnabled(true);
            btSalvar_re.setEnabled(false);
            btCancelar_re.setEnabled(false);
            btEditar_re.setEnabled(false);
            btRemover_re.setEnabled(false);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btRemover_reActionPerformed

    private void btEditar_reActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditar_reActionPerformed
        try {
            rep=new Reparaciones();
            rep.setReparacionid(Integer.parseInt(txFolio_re.getText()));
            rep.setCantidad(Integer.parseInt(txCantidad_pi.getText()));
            rep.setFalla(txFalla_re.getText());
            rep.setFechaen(txFecha_en.getText());
            rep.setFechasa(txFecha_sa.getText());
            txFolio_re.setEnabled(true);
            txCantidad_pi.setEnabled(true);
            txFalla_re.setEnabled(true);
            txFecha_en.setEnabled(true);
            txFecha_sa.setEnabled(true);
            btNuevo_re.setEnabled(false);
            btSalvar_re.setEnabled(true);
            btCancelar_re.setEnabled(true);
            btEditar_re.setEnabled(false);
            btRemover_re.setEnabled(false);
        } catch (NumberFormatException ex) {
        }
    }//GEN-LAST:event_btEditar_reActionPerformed

    private void btCancelar_reActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelar_reActionPerformed
        rep=new Reparaciones();
        txFolio_re.setText("");
        txCantidad_pi.setText("");
        txFalla_re.setText("");
        txFecha_en.setText("");
        txFecha_sa.setText("");
        btNuevo_re.setEnabled(true);
        btSalvar_re.setEnabled(false);
        btCancelar_re.setEnabled(false);
        btEditar_re.setEnabled(false);
        btRemover_re.setEnabled(false);
    }//GEN-LAST:event_btCancelar_reActionPerformed

    private void btSalvar_reActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvar_reActionPerformed
        rep = new Reparaciones();
        
    
        try {
            dbtabla.Salvar(list1);
            modelo.setRowCount(0); 
        } catch (IOException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        rep.setReparacionid(Integer.parseInt(txFolio_re.getText()));
        rep.setCantidad(Integer.parseInt(txCantidad_pi.getText()));
        rep.setFalla(txFalla_re.getText());
        rep.setFechaen(txFecha_en.getText());
        rep.setFechasa(txFecha_sa.getText());
      String nombrePieza = (String) cbPieza_Id.getSelectedItem();
         dbRep.Salvar(rep);
       
        txFolio_re.setText("");
        txCantidad_pi.setText("");
        txFalla_re.setText("");
        txFecha_en.setText("");
        txFecha_sa.setText("");
        btNuevo_re.setEnabled(true);
        btSalvar_re.setEnabled(false);
        btCancelar_re.setEnabled(false);
        btEditar_re.setEnabled(false);
        btRemover_re.setEnabled(false);
    }//GEN-LAST:event_btSalvar_reActionPerformed

    private void btNuevo_reActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNuevo_reActionPerformed
        rep=new Reparaciones();
        txFolio_re.setText("");
        txCantidad_pi.setText("");
        txFalla_re.setText("");
        txFecha_en.setText("");
        txFecha_sa.setText("");
        int nuevoID = dbRep.aumentarID();
        rep.setReparacionid(nuevoID);
        txFolio_re.setText(String.valueOf(nuevoID));
        btNuevo_re.setEnabled(false);
        btSalvar_re.setEnabled(true);
        btCancelar_re.setEnabled(true);
        btEditar_re.setEnabled(false);
        btRemover_re.setEnabled(false);
    }//GEN-LAST:event_btNuevo_reActionPerformed

    private void cbPieza_IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPieza_IdActionPerformed
        try {
        // Verificar si se ha seleccionado algo en el JComboBox
        if (cbPieza_Id.getSelectedItem() != null) {
            dbPiezas = new DbPiezas();

            String valor = cbPieza_Id.getSelectedItem().toString();
            piezas = new Piezas();
            piezas.setNombre(valor);

            System.out.println(valor);

            piezas = dbPiezas.buscarPiezaPorNombre(valor);

            // Asegurarse de que piezas no sea nulo antes de intentar acceder a sus propiedades
            if (piezas != null) {
                System.out.println(piezas.getStock());
                txCantidad_ca.setText(String.valueOf(piezas.getStock()));
            } else {
                System.out.println("No se encontró la pieza en la base de datos.");
            }
        } else {
            System.out.println("No se ha seleccionado ninguna pieza.");
        }

    } catch (IOException e) {
        System.out.println(e);
    }

    }//GEN-LAST:event_cbPieza_IdActionPerformed

    private void btBuscar_reActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscar_reActionPerformed
        try {
         
            rep = new Reparaciones();
            dbtabla=new DbTabla();
            int reparacionId = Integer.parseInt(txBuscarReparacionId.getText());
            rep.setReparacionid(reparacionId);
            rep = dbRep.buscar(rep);
            if (rep != null) {
                txFolio_re.setText(String.valueOf(rep.getReparacionid()));
                List<Tabla> l ;
                l = dbtabla.cargarDatosDesdeArchivo("tabla.txt");
                modelo = (DefaultTableModel) table.getModel();
                modelo.setRowCount(0);
                for (Tabla t : l) {
                modelo.addRow(new Object[]{
                    t.getIndice(),
                    t.getidPieza(),
                    t.getPieza(),
                    t.getCantidad()
                });
            }
      
                //txCantidad_pi.setText(rep.getCantidad());
                txFalla_re.setText(rep.getFalla());
                txFecha_en.setText(rep.getFechaen());
                txFecha_sa.setText(rep.getFechasa());
                txPiezaId.setEnabled(false);
                txMatricula_ve.setEnabled(false);
                txMarca_ve.setEnabled(false);
                btNuevo_re.setEnabled(false);
                btSalvar_re.setEnabled(false);
                btCancelar_re.setEnabled(false);
                btEditar_re.setEnabled(true);
                btRemover_re.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(this, "Pieza no encontrada.");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "El ID de la pieza debe ser un número.");
        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Ocurrió un error al buscar la pieza.");
        }
    }//GEN-LAST:event_btBuscar_reActionPerformed

    private void txBuscarReparacionIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txBuscarReparacionIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txBuscarReparacionIdActionPerformed

    private void comboMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMatriculaActionPerformed
       try{
            String nombreSeleccionado = (String) comboMatricula.getSelectedItem(); 
            vehiculo= new Vehiculos();
            vehiculo.setMatricula(nombreSeleccionado);
            
           vehiculo=dbVehiculo.buscar(vehiculo);
           if(vehiculo!=null){
         
               prueba.setText(vehiculo.getMatricula());
               
           }else{
               prueba.setText("");
           }
        
       }catch(IOException e){
           System.out.println(e);
           
       }
       
       
        
     
     
        
  
    }//GEN-LAST:event_comboMatriculaActionPerformed

    private void pruebaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pruebaActionPerformed

     
      

      

    }//GEN-LAST:event_pruebaActionPerformed

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAutentificar_lg;
    private javax.swing.JButton btBuscarIdPieza;
    private javax.swing.JButton btBuscarMatricula;
    private javax.swing.JButton btBuscar_cl;
    private javax.swing.JButton btBuscar_re;
    private javax.swing.JButton btBuscar_us;
    private javax.swing.JButton btCancelar_cl;
    private javax.swing.JButton btCancelar_pi;
    private javax.swing.JButton btCancelar_re;
    private javax.swing.JButton btCancelar_us;
    private javax.swing.JButton btCancelar_ve;
    private javax.swing.JButton btEditar_cl;
    private javax.swing.JButton btEditar_pi;
    private javax.swing.JButton btEditar_re;
    private javax.swing.JButton btEditar_us;
    private javax.swing.JButton btEditar_ve;
    private javax.swing.JButton btNuevo_cl;
    private javax.swing.JButton btNuevo_pi;
    private javax.swing.JButton btNuevo_re;
    private javax.swing.JButton btNuevo_us;
    private javax.swing.JButton btNuevo_ve;
    private javax.swing.JButton btRemover_cl;
    private javax.swing.JButton btRemover_pi;
    private javax.swing.JButton btRemover_re;
    private javax.swing.JButton btRemover_us;
    private javax.swing.JButton btRemover_ve;
    private javax.swing.JButton btSalvar_cl;
    private javax.swing.JButton btSalvar_pi;
    private javax.swing.JButton btSalvar_re;
    private javax.swing.JButton btSalvar_us;
    private javax.swing.JButton btSalvar_ve;
    private javax.swing.JButton buton;
    private javax.swing.JComboBox<String> cbId_us;
    private javax.swing.JComboBox<String> cbId_us2;
    private javax.swing.JComboBox<String> cbPerfil_us;
    private javax.swing.JComboBox<String> cbPieza_Id;
    private javax.swing.JComboBox<String> comboMatricula;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
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
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField prueba;
    private javax.swing.JTable table;
    private javax.swing.JTextField txAm_cl;
    private javax.swing.JTextField txAm_us;
    private javax.swing.JTextField txAp_cl;
    private javax.swing.JTextField txAp_us;
    private javax.swing.JTextField txBuscarPiezaId;
    private javax.swing.JTextField txBuscarReparacionId;
    private javax.swing.JLabel txCantidad;
    private javax.swing.JTextField txCantidad_ca;
    private javax.swing.JTextField txCantidad_pi;
    private javax.swing.JTextField txDireccion_us;
    private javax.swing.JTextField txFalla_re;
    private javax.swing.JTextField txFecha_en;
    private javax.swing.JTextField txFecha_sa;
    private javax.swing.JTextField txFecha_ve;
    private javax.swing.JTextField txFolio_re;
    private javax.swing.JTextField txId_cl;
    private javax.swing.JTextField txId_us;
    private javax.swing.JTextField txId_ve;
    private javax.swing.JTextField txMarca_ve;
    private javax.swing.JTextField txMatricula;
    private javax.swing.JTextField txMatricula_ve;
    private javax.swing.JTextField txNodelo_ve;
    private javax.swing.JTextField txNombre_cl;
    private javax.swing.JTextField txNombre_pi;
    private javax.swing.JTextField txNombre_us;
    private javax.swing.JPasswordField txPassword_lg;
    private javax.swing.JTextField txPassword_us;
    private javax.swing.JTextField txPiezaId;
    private javax.swing.JTextField txRfc_cl;
    private javax.swing.JTextField txStock;
    private javax.swing.JTextField txTelefono_us;
    private javax.swing.JTextField txUsername_lg;
    private javax.swing.JTextField txUsername_us;
    private javax.swing.JTextField txUsuarionombre_cl;
    private javax.swing.JTextField txUsuarionombre_us;
    private javax.swing.JTextField txtid_usuario;
    // End of variables declaration//GEN-END:variables
}
