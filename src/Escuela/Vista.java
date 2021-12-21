package Escuela;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/** @author Jose Ignacio Berastegui Florez GM1A*/

public class Vista extends javax.swing.JFrame {

     
    Matricula estudiantes = new Matricula(5);
    Materia materia = new Materia();
    
     int numest=0;
    DefaultListModel list = new DefaultListModel();
    
    public Vista() {
        initComponents();
        this.setLocationRelativeTo(null);
        btnRegistrar.setBackground(new java.awt.Color(255, 255, 255)); 
        Listabuscar.setModel(list);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlfondo = new javax.swing.JPanel();
        pnlbarra = new javax.swing.JPanel();
        btnRegistrar = new javax.swing.JLabel();
        btnSalir = new javax.swing.JLabel();
        btnMatricular = new javax.swing.JLabel();
        btnEstudiantes = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JLabel();
        pnlprincipal = new javax.swing.JPanel();
        pnlRegistrar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtid = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txtcorreo = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtmunicipio = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        txtcarrera = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        btnGuardar = new javax.swing.JButton();
        pnlMatricular = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtidbuscar = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        txtnombrebuscar = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        btnguardarMatricula = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        txtmateria1 = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        txtmateria2 = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        txtmateria3 = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtnota3 = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        txtnota2 = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel24 = new javax.swing.JLabel();
        txtnota1 = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        jLabel25 = new javax.swing.JLabel();
        btnBuscarParaMatricular = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        txtperiodo = new javax.swing.JTextField();
        jSeparator15 = new javax.swing.JSeparator();
        pnlBuscar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtidBuscarEstudiante = new javax.swing.JTextField();
        jSeparator14 = new javax.swing.JSeparator();
        btnBuscarEst = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtbuscarnombre = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        txtbuscarcarrera = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txtbuscarcorreo = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txtbuscarmunicipio = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtbuscarmateria1 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        txtbuscarnota1 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        txtbuscarmateria2 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        txtbuscarmateria3 = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        txtbuscarnota3 = new javax.swing.JTextField();
        txtbuscarnota2 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        txtbuscarperiodo = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        btnNotaMayor = new javax.swing.JButton();
        pnlEstudiantes = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Listabuscar = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        pnlfondo.setBackground(new java.awt.Color(255, 255, 255));
        pnlfondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlbarra.setBackground(new java.awt.Color(60, 141, 188));

        btnRegistrar.setBackground(new java.awt.Color(60, 141, 188));
        btnRegistrar.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(0, 0, 0));
        btnRegistrar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icono guardar.png"))); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrar.setOpaque(true);
        btnRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseClicked(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(60, 141, 188));
        btnSalir.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(0, 0, 0));
        btnSalir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icono guardar.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.setOpaque(true);
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });

        btnMatricular.setBackground(new java.awt.Color(60, 141, 188));
        btnMatricular.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        btnMatricular.setForeground(new java.awt.Color(0, 0, 0));
        btnMatricular.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMatricular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icono registrar.png"))); // NOI18N
        btnMatricular.setText("Matricular");
        btnMatricular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMatricular.setOpaque(true);
        btnMatricular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMatricularMouseClicked(evt);
            }
        });

        btnEstudiantes.setBackground(new java.awt.Color(60, 141, 188));
        btnEstudiantes.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        btnEstudiantes.setForeground(new java.awt.Color(0, 0, 0));
        btnEstudiantes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEstudiantes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icono Estudiantes.png"))); // NOI18N
        btnEstudiantes.setText("Estudiantes");
        btnEstudiantes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEstudiantes.setOpaque(true);
        btnEstudiantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEstudiantesMouseClicked(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(60, 141, 188));
        btnBuscar.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(0, 0, 0));
        btnBuscar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icono buscar.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.setOpaque(true);
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlbarraLayout = new javax.swing.GroupLayout(pnlbarra);
        pnlbarra.setLayout(pnlbarraLayout);
        pnlbarraLayout.setHorizontalGroup(
            pnlbarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlbarraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMatricular, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 176, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115))
        );
        pnlbarraLayout.setVerticalGroup(
            pnlbarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlbarraLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(pnlbarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMatricular, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pnlfondo.add(pnlbarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 30));

        pnlprincipal.setBackground(new java.awt.Color(255, 255, 255));
        pnlprincipal.setLayout(new java.awt.CardLayout());

        pnlRegistrar.setBackground(new java.awt.Color(255, 255, 255));
        pnlRegistrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRAR ESTUDIANTE");
        pnlRegistrar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 287, 43));

        jLabel13.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("CODIGO:");
        pnlRegistrar.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));
        pnlRegistrar.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 160, 10));

        txtid.setBackground(new java.awt.Color(236, 239, 244));
        txtid.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtid.setBorder(null);
        txtid.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        pnlRegistrar.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 150, -1));

        jLabel14.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("CORREO:");
        pnlRegistrar.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        txtnombre.setBackground(new java.awt.Color(236, 239, 244));
        txtnombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtnombre.setBorder(null);
        txtnombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        pnlRegistrar.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 150, -1));
        pnlRegistrar.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 160, 10));

        txtcorreo.setBackground(new java.awt.Color(236, 239, 244));
        txtcorreo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtcorreo.setBorder(null);
        txtcorreo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        pnlRegistrar.add(txtcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 150, -1));
        pnlRegistrar.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 160, 10));

        jLabel15.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("NOMBRE:");
        pnlRegistrar.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, -1, -1));

        jLabel16.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("MUNICIPIO:");
        pnlRegistrar.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, -1, -1));

        txtmunicipio.setBackground(new java.awt.Color(236, 239, 244));
        txtmunicipio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtmunicipio.setBorder(null);
        txtmunicipio.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        pnlRegistrar.add(txtmunicipio, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, 150, -1));
        pnlRegistrar.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 160, 10));

        jLabel17.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("CARRERA:");
        pnlRegistrar.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, -1, -1));

        txtcarrera.setBackground(new java.awt.Color(236, 239, 244));
        txtcarrera.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtcarrera.setBorder(null);
        txtcarrera.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        pnlRegistrar.add(txtcarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 150, -1));
        pnlRegistrar.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 160, 10));

        btnGuardar.setBackground(new java.awt.Color(60, 141, 188));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(0, 0, 0));
        btnGuardar.setText("GUARDAR");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        pnlRegistrar.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, -1, -1));

        pnlprincipal.add(pnlRegistrar, "card2");

        pnlMatricular.setBackground(new java.awt.Color(255, 255, 255));
        pnlMatricular.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("MATRICULAR MATERIAS");
        pnlMatricular.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 287, 43));

        jLabel18.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("CODIGO:");
        pnlMatricular.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        txtidbuscar.setBackground(new java.awt.Color(236, 239, 244));
        txtidbuscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtidbuscar.setBorder(null);
        txtidbuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        pnlMatricular.add(txtidbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 150, -1));
        pnlMatricular.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 160, 10));

        jLabel19.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("NOMBRE:");
        pnlMatricular.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, -1, -1));

        txtnombrebuscar.setEditable(false);
        txtnombrebuscar.setBackground(new java.awt.Color(236, 239, 244));
        txtnombrebuscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtnombrebuscar.setBorder(null);
        txtnombrebuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlMatricular.add(txtnombrebuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 150, -1));
        pnlMatricular.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 160, 10));

        btnguardarMatricula.setBackground(new java.awt.Color(60, 141, 188));
        btnguardarMatricula.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnguardarMatricula.setForeground(new java.awt.Color(255, 255, 255));
        btnguardarMatricula.setText("GUARDAR");
        btnguardarMatricula.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnguardarMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarMatriculaActionPerformed(evt);
            }
        });
        pnlMatricular.add(btnguardarMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, -1, -1));

        jLabel20.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("MATERIA:");
        pnlMatricular.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        txtmateria1.setBackground(new java.awt.Color(236, 239, 244));
        txtmateria1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtmateria1.setBorder(null);
        txtmateria1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        pnlMatricular.add(txtmateria1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 150, -1));
        pnlMatricular.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 160, 10));

        txtmateria2.setBackground(new java.awt.Color(236, 239, 244));
        txtmateria2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtmateria2.setBorder(null);
        txtmateria2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        pnlMatricular.add(txtmateria2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 150, -1));
        pnlMatricular.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 160, 10));

        txtmateria3.setBackground(new java.awt.Color(236, 239, 244));
        txtmateria3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtmateria3.setBorder(null);
        txtmateria3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        pnlMatricular.add(txtmateria3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 150, -1));
        pnlMatricular.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 160, 10));

        jLabel21.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("MATERIA:");
        pnlMatricular.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        jLabel22.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("MATERIA:");
        pnlMatricular.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        jLabel23.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("NOTA:");
        pnlMatricular.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, -1, -1));

        txtnota3.setBackground(new java.awt.Color(236, 239, 244));
        txtnota3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtnota3.setBorder(null);
        txtnota3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        pnlMatricular.add(txtnota3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 150, -1));
        pnlMatricular.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 160, 10));

        txtnota2.setBackground(new java.awt.Color(236, 239, 244));
        txtnota2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtnota2.setBorder(null);
        txtnota2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        pnlMatricular.add(txtnota2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, 150, -1));
        pnlMatricular.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 160, 10));

        jLabel24.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("NOTA:");
        pnlMatricular.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, -1, -1));

        txtnota1.setBackground(new java.awt.Color(236, 239, 244));
        txtnota1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtnota1.setBorder(null);
        txtnota1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        pnlMatricular.add(txtnota1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 150, -1));
        pnlMatricular.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 160, 10));

        jLabel25.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("NOTA:");
        pnlMatricular.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, -1, -1));

        btnBuscarParaMatricular.setBackground(new java.awt.Color(60, 141, 188));
        btnBuscarParaMatricular.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBuscarParaMatricular.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarParaMatricular.setText("BUSCAR");
        btnBuscarParaMatricular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarParaMatricular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarParaMatricularActionPerformed(evt);
            }
        });
        pnlMatricular.add(btnBuscarParaMatricular, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 90, 30));

        jLabel26.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("PERIODO:");
        pnlMatricular.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, -1, -1));

        txtperiodo.setBackground(new java.awt.Color(236, 239, 244));
        txtperiodo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtperiodo.setBorder(null);
        txtperiodo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        pnlMatricular.add(txtperiodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 90, -1));
        pnlMatricular.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 100, 10));

        pnlprincipal.add(pnlMatricular, "card3");

        pnlBuscar.setBackground(new java.awt.Color(255, 255, 255));
        pnlBuscar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("BUSCAR ESTUDIANTE");
        pnlBuscar.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 287, 43));

        txtidBuscarEstudiante.setBackground(new java.awt.Color(236, 239, 244));
        txtidBuscarEstudiante.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtidBuscarEstudiante.setBorder(null);
        txtidBuscarEstudiante.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        pnlBuscar.add(txtidBuscarEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 150, -1));
        pnlBuscar.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 160, 10));

        btnBuscarEst.setBackground(new java.awt.Color(60, 141, 188));
        btnBuscarEst.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBuscarEst.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarEst.setText("BUSCAR");
        btnBuscarEst.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarEstActionPerformed(evt);
            }
        });
        pnlBuscar.add(btnBuscarEst, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 140, 30));

        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        txtbuscarnombre.setEditable(false);
        txtbuscarnombre.setBackground(new java.awt.Color(236, 239, 244));
        txtbuscarnombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtbuscarnombre.setBorder(null);
        txtbuscarnombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel28.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 0));
        jLabel28.setText("NOMBRE:");

        jLabel29.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 0));
        jLabel29.setText("CARRERA:");

        txtbuscarcarrera.setEditable(false);
        txtbuscarcarrera.setBackground(new java.awt.Color(236, 239, 244));
        txtbuscarcarrera.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtbuscarcarrera.setBorder(null);
        txtbuscarcarrera.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel30.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 0, 0));
        jLabel30.setText("CORREO:");

        txtbuscarcorreo.setEditable(false);
        txtbuscarcorreo.setBackground(new java.awt.Color(236, 239, 244));
        txtbuscarcorreo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtbuscarcorreo.setBorder(null);
        txtbuscarcorreo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel31.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 0, 0));
        jLabel31.setText("MUNICIPIO:");

        txtbuscarmunicipio.setEditable(false);
        txtbuscarmunicipio.setBackground(new java.awt.Color(236, 239, 244));
        txtbuscarmunicipio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtbuscarmunicipio.setBorder(null);
        txtbuscarmunicipio.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbuscarnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbuscarcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbuscarmunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtbuscarcarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(txtbuscarnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29)
                    .addComponent(txtbuscarcarrera))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel31)
                        .addComponent(txtbuscarmunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel30)
                        .addComponent(txtbuscarcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39))
        );

        pnlBuscar.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 600, 90));

        jLabel32.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 0, 0));
        jLabel32.setText("DATOS DEL ESTUDIANTE:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel32)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnlBuscar.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 230, 30));

        jLabel27.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setText("CODIGO:");
        pnlBuscar.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        jPanel3.setForeground(new java.awt.Color(0, 0, 0));

        txtbuscarmateria1.setEditable(false);
        txtbuscarmateria1.setBackground(new java.awt.Color(236, 239, 244));
        txtbuscarmateria1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtbuscarmateria1.setBorder(null);
        txtbuscarmateria1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel33.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 0, 0));
        jLabel33.setText("MATERIA:");

        jLabel34.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(0, 0, 0));
        jLabel34.setText("NOTA:");

        txtbuscarnota1.setEditable(false);
        txtbuscarnota1.setBackground(new java.awt.Color(236, 239, 244));
        txtbuscarnota1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtbuscarnota1.setBorder(null);
        txtbuscarnota1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel38.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(0, 0, 0));
        jLabel38.setText("MATERIA:");

        txtbuscarmateria2.setEditable(false);
        txtbuscarmateria2.setBackground(new java.awt.Color(236, 239, 244));
        txtbuscarmateria2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtbuscarmateria2.setBorder(null);
        txtbuscarmateria2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel39.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(0, 0, 0));
        jLabel39.setText("NOTA:");

        jLabel40.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(0, 0, 0));
        jLabel40.setText("MATERIA:");

        txtbuscarmateria3.setEditable(false);
        txtbuscarmateria3.setBackground(new java.awt.Color(236, 239, 244));
        txtbuscarmateria3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtbuscarmateria3.setBorder(null);
        txtbuscarmateria3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel41.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(0, 0, 0));
        jLabel41.setText("NOTA:");

        txtbuscarnota3.setEditable(false);
        txtbuscarnota3.setBackground(new java.awt.Color(236, 239, 244));
        txtbuscarnota3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtbuscarnota3.setBorder(null);
        txtbuscarnota3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        txtbuscarnota2.setEditable(false);
        txtbuscarnota2.setBackground(new java.awt.Color(236, 239, 244));
        txtbuscarnota2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtbuscarnota2.setBorder(null);
        txtbuscarnota2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbuscarmateria3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel41)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbuscarnota3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbuscarmateria2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbuscarnota2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbuscarmateria1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbuscarnota1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(141, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(txtbuscarmateria1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34)
                    .addComponent(txtbuscarnota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(txtbuscarmateria2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39)
                    .addComponent(txtbuscarnota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(txtbuscarmateria3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41)
                    .addComponent(txtbuscarnota3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnlBuscar.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, 140));

        jLabel37.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(0, 0, 0));
        jLabel37.setText("INFORMACION ACADEMICA:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel37)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(jLabel37)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pnlBuscar.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 230, -1));

        txtbuscarperiodo.setEditable(false);
        txtbuscarperiodo.setBackground(new java.awt.Color(255, 255, 255));
        txtbuscarperiodo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtbuscarperiodo.setBorder(null);
        txtbuscarperiodo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        pnlBuscar.add(txtbuscarperiodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, 150, -1));

        jLabel42.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(0, 0, 0));
        jLabel42.setText("PERIODO:");
        pnlBuscar.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, -1, -1));

        btnNotaMayor.setBackground(new java.awt.Color(60, 141, 188));
        btnNotaMayor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnNotaMayor.setForeground(new java.awt.Color(255, 255, 255));
        btnNotaMayor.setText("NOTA MAYOR");
        btnNotaMayor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNotaMayor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNotaMayorActionPerformed(evt);
            }
        });
        pnlBuscar.add(btnNotaMayor, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, 160, 30));

        pnlprincipal.add(pnlBuscar, "card4");

        pnlEstudiantes.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane2.setViewportView(Listabuscar);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("REGISTRO DE ESTUDIANTES");

        javax.swing.GroupLayout pnlEstudiantesLayout = new javax.swing.GroupLayout(pnlEstudiantes);
        pnlEstudiantes.setLayout(pnlEstudiantesLayout);
        pnlEstudiantesLayout.setHorizontalGroup(
            pnlEstudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEstudiantesLayout.createSequentialGroup()
                .addContainerGap(224, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(219, 219, 219))
            .addGroup(pnlEstudiantesLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlEstudiantesLayout.setVerticalGroup(
            pnlEstudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEstudiantesLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pnlprincipal.add(pnlEstudiantes, "card5");

        pnlfondo.add(pnlprincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 730, 420));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlfondo, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlfondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void LimpiarTextosGuardar(){
        txtid.setText("");
        txtnombre.setText("");
        txtcorreo.setText("");
        txtmunicipio.setText("");
        txtcarrera.setText("");      
    }
    
    public void LimpiarTextosMatricular(){
        txtidbuscar.setText("");
        txtnombrebuscar.setText("");
        txtmateria1.setText("");
        txtmateria2.setText("");
        txtmateria3.setText("");
        txtnota1.setText("");
        txtnota2.setText("");
        txtnota3.setText("");
        txtperiodo.setText("");
    }
    
    public void LimpiarListas(){
    list.clear();
    }
    
    private void btnRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseClicked
        btnRegistrar.setBackground(new java.awt.Color(255, 255, 255));
        btnMatricular.setBackground(new java.awt.Color(60, 141, 188));
        btnEstudiantes.setBackground(new java.awt.Color(60, 141, 188));
        btnBuscar.setBackground(new java.awt.Color(60, 141, 188));

        pnlBuscar.setVisible(false);
        pnlRegistrar.setVisible(true);
        pnlMatricular.setVisible(false);
        pnlEstudiantes.setVisible(false);
    }//GEN-LAST:event_btnRegistrarMouseClicked

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnMatricularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMatricularMouseClicked
        btnRegistrar.setBackground(new java.awt.Color(60, 141, 188));
        btnMatricular.setBackground(new java.awt.Color(255, 255, 255));
        btnEstudiantes.setBackground(new java.awt.Color(60, 141, 188));
        btnBuscar.setBackground(new java.awt.Color(60, 141, 188));

        pnlBuscar.setVisible(false);
        pnlRegistrar.setVisible(false);
        pnlMatricular.setVisible(true);
        pnlEstudiantes.setVisible(false);
        
    }//GEN-LAST:event_btnMatricularMouseClicked

    private void btnEstudiantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEstudiantesMouseClicked
        btnRegistrar.setBackground(new java.awt.Color(60, 141, 188));
        btnMatricular.setBackground(new java.awt.Color(60, 141, 188));
        btnEstudiantes.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscar.setBackground(new java.awt.Color(60, 141, 188));

        pnlBuscar.setVisible(false);
        pnlEstudiantes.setVisible(true);
        pnlRegistrar.setVisible(false);
        pnlMatricular.setVisible(false);
    }//GEN-LAST:event_btnEstudiantesMouseClicked

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (numest < estudiantes.getTam()) {

            try {
                int cod = Integer.parseInt(txtid.getText());
                String nom = txtnombre.getText();
                String corr = txtcorreo.getText();
                String mun = txtmunicipio.getText();
                String carr = txtcarrera.getText();

                if (estudiantes.validarEstudiante(cod, numest) == false) {

                    if (nom.isEmpty() || corr.isEmpty() || mun.isEmpty() || carr.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "LLENE TODOS LOS CAMPOS.");
                    } else {
                        estudiantes.setEstudiante(cod, nom, carr, mun, corr, numest);

                        LimpiarTextosGuardar();
                        LimpiarListas();

                        numest++;
                        for (int i = 0; i < numest; i++) {
                            list.add(i, " ");
                            list.add(i, "Correo:      " + estudiantes.getEstudiante(i).getCorreo());
                            list.add(i, "Municipio: " + estudiantes.getEstudiante(i).getMunicipio());
                            list.add(i, "Carrera:     " + estudiantes.getEstudiante(i).getCarrera());
                            list.add(i, "Nombre:     " + estudiantes.getEstudiante(i).getNombre());
                            list.add(i, "Codigo:      " + estudiantes.getEstudiante(i).getCodigo());
                            list.add(i, null);
                        }
                        JOptionPane.showMessageDialog(null, "DATOS GUARDADOS CON EXITO");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "EL CODIGO DIGITADO YA SE ENCUENTRA VINCULADO A OTRO ESTUDIANTE !!.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Hubo un error.\nPor favor revise la información ingresada.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "LIMITE DE ESTUDIANTES ALCANZADO.");

        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        btnRegistrar.setBackground(new java.awt.Color(60, 141, 188));
        btnMatricular.setBackground(new java.awt.Color(60, 141, 188));
        btnEstudiantes.setBackground(new java.awt.Color(60, 141, 188));
        btnBuscar.setBackground(new java.awt.Color(255, 255, 255));

        pnlBuscar.setVisible(true);
        pnlEstudiantes.setVisible(false);
        pnlRegistrar.setVisible(false);
        pnlMatricular.setVisible(false);
    }//GEN-LAST:event_btnBuscarMouseClicked

    private void btnBuscarParaMatricularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarParaMatricularActionPerformed
        try {
            if (txtidbuscar.getText().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "DIGITE UN CODIGO");
            } else {
                int cod = Integer.parseInt(txtidbuscar.getText());
                int pos = estudiantes.buscarEstudiante(cod, numest);
                if (pos != -1) {
                    txtnombrebuscar.setText(estudiantes.getEstudiante(pos).getNombre());
                } else {
                    JOptionPane.showMessageDialog(null, "NO SE ENCUENTRA NADIE REGISTRADO CON EL CODIGO " + cod);
                }
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "EL VALOR INGRESADO EN EL CODIGO ES INVALIDO.");
        }
    }//GEN-LAST:event_btnBuscarParaMatricularActionPerformed

    private void btnBuscarEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarEstActionPerformed
        try {
            if (txtidBuscarEstudiante.getText().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Digite un codigo");
            } else {
                int cod = Integer.parseInt(txtidBuscarEstudiante.getText());
                int pos = estudiantes.buscarEstudiante(cod, numest);

                if (pos != -1) {

                    String nom = estudiantes.getEstudiante(pos).getNombre();
                    txtbuscarnombre.setText(nom);
                    String corr = estudiantes.getEstudiante(pos).getCorreo();
                    txtbuscarcorreo.setText(corr);
                    String munp = estudiantes.getEstudiante(pos).getMunicipio();
                    txtbuscarmunicipio.setText(munp);
                    String carr = estudiantes.getEstudiante(pos).getCarrera();
                    txtbuscarcarrera.setText(carr);
                    int periodo = estudiantes.getMateria(pos).getPeriodo();
                    txtbuscarperiodo.setText(String.valueOf(periodo));
                    String materia1 = estudiantes.getMateria(pos).getNombreMateria1();
                    txtbuscarmateria1.setText(materia1);
                    String materia2 = estudiantes.getMateria(pos).getNombreMateria2();
                    txtbuscarmateria2.setText(materia2);
                    String materia3 = estudiantes.getMateria(pos).getNombreMateria3();
                    txtbuscarmateria3.setText(materia3);
                    float nota1 = estudiantes.getMateria(pos).getNotafinal1();
                    txtbuscarnota1.setText(String.valueOf(nota1));
                    float nota2 = estudiantes.getMateria(pos).getNotafinal2();
                    txtbuscarnota2.setText(String.valueOf(nota2));
                    float nota3 = estudiantes.getMateria(pos).getNotafinal3();
                    txtbuscarnota3.setText(String.valueOf(nota3));
                } else {
                    JOptionPane.showMessageDialog(null, "NO SE ENCUENTRA NADIE REGISTRADO CON EL CODIGO " + cod);
                }
            }

        } catch (Exception e) {
            txtbuscarnombre.setText("");
            txtbuscarcorreo.setText("");
            txtbuscarmunicipio.setText("");
            txtbuscarcarrera.setText("");
            txtidBuscarEstudiante.setText("");
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error ");

        }
    }//GEN-LAST:event_btnBuscarEstActionPerformed

        
    private void btnguardarMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarMatriculaActionPerformed
        int cod = Integer.parseInt(txtidbuscar.getText());
        try {
            int pos = estudiantes.buscarEstudiante(cod, numest);

            int per = Integer.parseInt(txtperiodo.getText());
            String nommat1 = txtmateria1.getText();
            float notfinal1 = Float.parseFloat(txtnota1.getText());
            String nommat2 = txtmateria2.getText();
            float notfinal2 = Float.parseFloat(txtnota2.getText());
            String nommate3 = txtmateria3.getText();
            float notfinal3 = Float.parseFloat(txtnota3.getText());

            if (notfinal1 < 0 || notfinal1 > 5 || notfinal2 < 0 || notfinal2 > 5 || notfinal3 < 0 || notfinal3 > 5) {
                JOptionPane.showMessageDialog(null, "LAS NOTAS DEBEN ESTAR ENTRE 0 Y 5");
            } else {
                estudiantes.setMatriculas(nommat1, notfinal1, nommat2, notfinal2, nommate3, notfinal3, per, pos);

                LimpiarTextosMatricular();

                JOptionPane.showMessageDialog(null, "DATOS GUARDADOS CON EXITO");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Hubo un error.\nPor favor revise la información ingresada.");
        }

    }//GEN-LAST:event_btnguardarMatriculaActionPerformed

    private void btnNotaMayorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNotaMayorActionPerformed
        try {
            if (numest < 5) {
                JOptionPane.showMessageDialog(rootPane, "INGRESE MINIMO 5 ESTUDIANTES");
            } else {
                float notamayor = 0;
                String materia = "";
                int pos = estudiantes.BuscaNotaMayor();
                if (estudiantes.getMateria(pos).getNotafinal1() > estudiantes.getMateria(pos).getNotafinal2()
                        && estudiantes.getMateria(pos).getNotafinal1() > estudiantes.getMateria(pos).getNotafinal3()) {
                    notamayor = estudiantes.getMateria(pos).getNotafinal1();
                    materia += estudiantes.getMateria(pos).getNombreMateria1();

                } else if (estudiantes.getMateria(pos).getNotafinal2() > estudiantes.getMateria(pos).getNotafinal1()
                        && estudiantes.getMateria(pos).getNotafinal2() > estudiantes.getMateria(pos).getNotafinal3()) {
                    notamayor = estudiantes.getMateria(pos).getNotafinal2();
                    materia += estudiantes.getMateria(pos).getNombreMateria2();

                } else if (estudiantes.getMateria(pos).getNotafinal3() > estudiantes.getMateria(pos).getNotafinal2()
                        && estudiantes.getMateria(pos).getNotafinal3() > estudiantes.getMateria(pos).getNotafinal1()) {
                    notamayor = estudiantes.getMateria(pos).getNotafinal3();
                    materia += estudiantes.getMateria(pos).getNombreMateria3();
                }
                txtbuscarnombre.setText(estudiantes.getEstudiante(pos).getNombre());
                txtidBuscarEstudiante.setText(String.valueOf(estudiantes.getEstudiante(pos).getCodigo()));
                txtbuscarcorreo.setText(estudiantes.getEstudiante(pos).getCorreo());
                txtbuscarmunicipio.setText(estudiantes.getEstudiante(pos).getMunicipio());
                txtbuscarcarrera.setText(estudiantes.getEstudiante(pos).getCarrera());
                txtbuscarperiodo.setText(String.valueOf(estudiantes.getMateria(pos).getPeriodo()));
                txtbuscarmateria1.setText(materia);
                txtbuscarnota1.setText(String.valueOf(notamayor));
                txtbuscarmateria2.setText("");
                txtbuscarnota3.setText("");
                txtbuscarmateria3.setText("");
                txtbuscarnota3.setText("");

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ALGUNOS ESTUDIANTES NO HAN SIDO MATRICULADOS");
        }
    }//GEN-LAST:event_btnNotaMayorActionPerformed

    
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
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> Listabuscar;
    private javax.swing.JLabel btnBuscar;
    private javax.swing.JButton btnBuscarEst;
    private javax.swing.JButton btnBuscarParaMatricular;
    private javax.swing.JLabel btnEstudiantes;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel btnMatricular;
    private javax.swing.JButton btnNotaMayor;
    private javax.swing.JLabel btnRegistrar;
    private javax.swing.JLabel btnSalir;
    private javax.swing.JButton btnguardarMatricula;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JPanel pnlBuscar;
    private javax.swing.JPanel pnlEstudiantes;
    private javax.swing.JPanel pnlMatricular;
    private javax.swing.JPanel pnlRegistrar;
    private javax.swing.JPanel pnlbarra;
    private javax.swing.JPanel pnlfondo;
    private javax.swing.JPanel pnlprincipal;
    private javax.swing.JTextField txtbuscarcarrera;
    private javax.swing.JTextField txtbuscarcorreo;
    private javax.swing.JTextField txtbuscarmateria1;
    private javax.swing.JTextField txtbuscarmateria2;
    private javax.swing.JTextField txtbuscarmateria3;
    private javax.swing.JTextField txtbuscarmunicipio;
    private javax.swing.JTextField txtbuscarnombre;
    private javax.swing.JTextField txtbuscarnota1;
    private javax.swing.JTextField txtbuscarnota2;
    private javax.swing.JTextField txtbuscarnota3;
    private javax.swing.JTextField txtbuscarperiodo;
    private javax.swing.JTextField txtcarrera;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtidBuscarEstudiante;
    private javax.swing.JTextField txtidbuscar;
    private javax.swing.JTextField txtmateria1;
    private javax.swing.JTextField txtmateria2;
    private javax.swing.JTextField txtmateria3;
    private javax.swing.JTextField txtmunicipio;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtnombrebuscar;
    private javax.swing.JTextField txtnota1;
    private javax.swing.JTextField txtnota2;
    private javax.swing.JTextField txtnota3;
    private javax.swing.JTextField txtperiodo;
    // End of variables declaration//GEN-END:variables
}
