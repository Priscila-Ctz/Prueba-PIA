package ventana;

public class Actualizar_Usuarios_Frutas extends javax.swing.JFrame {

    /**
     * Creates new form Actualizar_Piratas
     */
    public Actualizar_Usuarios_Frutas() {
        initComponents();
        this.setLocationRelativeTo(null); //mantiene la pantalla en el centro
    }

/**
     * Este método se llama desde el constructor para inicializar el formulario.
     * ADVERTENCIA: NO modifique este código. El contenido de este método es siempre
     * regenerado por el Editor de formularios.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();
        ActualizarPiratas = new javax.swing.JLabel();
        jLabelClave = new javax.swing.JLabel();
        jLabel1NombreP = new javax.swing.JLabel();
        jLabelEstado = new javax.swing.JLabel();
        jLabelUltimo = new javax.swing.JLabel();
        jLabelCapitan = new javax.swing.JLabel();
        jLabelProtegido = new javax.swing.JLabel();
        jLabelRecompensa = new javax.swing.JLabel();
        jLabelFec = new javax.swing.JLabel();
        jLabelEmperador = new javax.swing.JLabel();
        Boton1 = new javax.swing.JLabel();
        Boton2 = new javax.swing.JLabel();
        Boton3 = new javax.swing.JLabel();
        Boton4 = new javax.swing.JLabel();
        Boton5 = new javax.swing.JLabel();
        Boton6 = new javax.swing.JLabel();
        Boton7 = new javax.swing.JLabel();
        Boton8 = new javax.swing.JLabel();
        Boton9 = new javax.swing.JLabel();
        BotonBuscar = new javax.swing.JButton();
        BotonRegresar = new javax.swing.JButton();
        Nombre = new javax.swing.JTextField();
        Clave = new javax.swing.JTextField();
        Estado = new javax.swing.JTextField();
        Ultimo = new javax.swing.JTextField();
        Capitan = new javax.swing.JTextField();
        Protegido = new javax.swing.JTextField();
        Recompensa = new javax.swing.JTextField();
        Fec = new javax.swing.JTextField();
        Emperador = new javax.swing.JTextField();
        jLabelCapitan1 = new javax.swing.JLabel();
        jLabelEmperador1 = new javax.swing.JLabel();
        Boton10 = new javax.swing.JLabel();
        Boton11 = new javax.swing.JLabel();
        Ultimo1 = new javax.swing.JTextField();
        Fec1 = new javax.swing.JTextField();
        jLabelCapitan2 = new javax.swing.JLabel();
        Boton12 = new javax.swing.JLabel();
        jLabelEmperador2 = new javax.swing.JLabel();
        Boton13 = new javax.swing.JLabel();
        Fec2 = new javax.swing.JTextField();
        Ultimo2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes4/fondoA.PiratasTriulacion.png"))); // NOI18N

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes4/fondoA.usuario.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ActualizarPiratas.setFont(new java.awt.Font("ONE PIECE", 0, 78)); // NOI18N
        ActualizarPiratas.setForeground(new java.awt.Color(0, 51, 51));
        ActualizarPiratas.setText("Actualizar Usuarios de Fruta");
        getContentPane().add(ActualizarPiratas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabelClave.setFont(new java.awt.Font("ONE PIECE", 0, 48)); // NOI18N
        jLabelClave.setText("Clave del pirata");
        getContentPane().add(jLabelClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel1NombreP.setFont(new java.awt.Font("ONE PIECE", 0, 24)); // NOI18N
        jLabel1NombreP.setText("Nombre del pirata");
        getContentPane().add(jLabel1NombreP, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        jLabelEstado.setFont(new java.awt.Font("ONE PIECE", 0, 24)); // NOI18N
        jLabelEstado.setText("Estado");
        getContentPane().add(jLabelEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        jLabelUltimo.setFont(new java.awt.Font("ONE PIECE", 0, 24)); // NOI18N
        jLabelUltimo.setText("Ultimo status");
        getContentPane().add(jLabelUltimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, -1));

        jLabelCapitan.setFont(new java.awt.Font("ONE PIECE", 0, 24)); // NOI18N
        jLabelCapitan.setText("Capitan");
        getContentPane().add(jLabelCapitan, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, -1));

        jLabelProtegido.setFont(new java.awt.Font("ONE PIECE", 0, 24)); // NOI18N
        jLabelProtegido.setText("Protegido");
        getContentPane().add(jLabelProtegido, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, -1, -1));

        jLabelRecompensa.setFont(new java.awt.Font("ONE PIECE", 0, 24)); // NOI18N
        jLabelRecompensa.setText("Recompensa");
        getContentPane().add(jLabelRecompensa, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, -1, -1));

        jLabelFec.setFont(new java.awt.Font("ONE PIECE", 0, 24)); // NOI18N
        jLabelFec.setText("Fec. de nacimiento");
        getContentPane().add(jLabelFec, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 340, -1, -1));

        jLabelEmperador.setFont(new java.awt.Font("ONE PIECE", 0, 24)); // NOI18N
        jLabelEmperador.setText("Emperador");
        getContentPane().add(jLabelEmperador, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 390, -1, -1));

        Boton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ActualizarPiratasBotong.png"))); // NOI18N
        getContentPane().add(Boton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 130, -1, -1));

        Boton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ActualizarPiratasBotonch.png"))); // NOI18N
        getContentPane().add(Boton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        Boton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ActualizarPiratasBotonch.png"))); // NOI18N
        getContentPane().add(Boton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        Boton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ActualizarPiratasBotonch.png"))); // NOI18N
        getContentPane().add(Boton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        Boton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ActualizarPiratasBotonch.png"))); // NOI18N
        getContentPane().add(Boton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        Boton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ActualizarPiratasBotonch.png"))); // NOI18N
        getContentPane().add(Boton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, -1, -1));

        Boton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ActualizarPiratasBotonch.png"))); // NOI18N
        getContentPane().add(Boton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, -1, -1));

        Boton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ActualizarPiratasBotonch.png"))); // NOI18N
        getContentPane().add(Boton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, -1, -1));

        Boton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ActualizarPiratasBotonch.png"))); // NOI18N
        getContentPane().add(Boton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, -1, -1));

        BotonBuscar.setBackground(new java.awt.Color(246, 191, 119));
        BotonBuscar.setFont(new java.awt.Font("ONE PIECE", 0, 24)); // NOI18N
        BotonBuscar.setText("Buscar");
        BotonBuscar.setBorderPainted(false);
        getContentPane().add(BotonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 140, 110, -1));

        BotonRegresar.setBackground(new java.awt.Color(246, 191, 119));
        BotonRegresar.setFont(new java.awt.Font("ONE PIECE", 0, 24)); // NOI18N
        BotonRegresar.setText("Regresar");
        BotonRegresar.setBorderPainted(false);
        getContentPane().add(BotonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 140, 110, -1));
        getContentPane().add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 210, 30));

        Clave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClaveActionPerformed(evt);
            }
        });
        getContentPane().add(Clave, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 330, 50));
        getContentPane().add(Estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 210, 30));
        getContentPane().add(Ultimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, 210, 30));
        getContentPane().add(Capitan, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 240, 210, 30));
        getContentPane().add(Protegido, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 290, 210, 30));
        getContentPane().add(Recompensa, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 340, 210, 30));
        getContentPane().add(Fec, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 390, 210, 30));
        getContentPane().add(Emperador, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 210, 30));

        jLabelCapitan1.setFont(new java.awt.Font("ONE PIECE", 0, 24)); // NOI18N
        jLabelCapitan1.setText("Nombre de la fruta");
        getContentPane().add(jLabelCapitan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, -1, -1));

        jLabelEmperador1.setFont(new java.awt.Font("ONE PIECE", 0, 24)); // NOI18N
        jLabelEmperador1.setText("Significado");
        getContentPane().add(jLabelEmperador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 440, -1, -1));

        Boton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ActualizarPiratasBotonch.png"))); // NOI18N
        getContentPane().add(Boton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, -1, -1));

        Boton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ActualizarPiratasBotonch.png"))); // NOI18N
        getContentPane().add(Boton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 430, -1, -1));
        getContentPane().add(Ultimo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, 210, 30));
        getContentPane().add(Fec1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 440, 210, 30));

        jLabelCapitan2.setFont(new java.awt.Font("ONE PIECE", 0, 24)); // NOI18N
        jLabelCapitan2.setText("Tipo Fruta");
        getContentPane().add(jLabelCapitan2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, -1, -1));

        Boton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ActualizarPiratasBotonch.png"))); // NOI18N
        getContentPane().add(Boton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 473, -1, 50));

        jLabelEmperador2.setFont(new java.awt.Font("ONE PIECE", 0, 24)); // NOI18N
        jLabelEmperador2.setText("Descripcion");
        getContentPane().add(jLabelEmperador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 480, -1, -1));

        Boton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ActualizarPiratasBotonch.png"))); // NOI18N
        getContentPane().add(Boton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 473, -1, 50));
        getContentPane().add(Fec2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 480, 210, 30));
        getContentPane().add(Ultimo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 480, 210, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes4/fondoA.usuario.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClaveActionPerformed

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
            java.util.logging.Logger.getLogger(Actualizar_Usuarios_Frutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Actualizar_Usuarios_Frutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Actualizar_Usuarios_Frutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Actualizar_Usuarios_Frutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Crea y muestra el formulario */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Actualizar_Usuarios_Frutas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ActualizarPiratas;
    private javax.swing.JLabel Boton1;
    private javax.swing.JLabel Boton10;
    private javax.swing.JLabel Boton11;
    private javax.swing.JLabel Boton12;
    private javax.swing.JLabel Boton13;
    private javax.swing.JLabel Boton2;
    private javax.swing.JLabel Boton3;
    private javax.swing.JLabel Boton4;
    private javax.swing.JLabel Boton5;
    private javax.swing.JLabel Boton6;
    private javax.swing.JLabel Boton7;
    private javax.swing.JLabel Boton8;
    private javax.swing.JLabel Boton9;
    private javax.swing.JButton BotonBuscar;
    private javax.swing.JButton BotonRegresar;
    private javax.swing.JTextField Capitan;
    private javax.swing.JTextField Clave;
    private javax.swing.JTextField Emperador;
    private javax.swing.JTextField Estado;
    private javax.swing.JTextField Fec;
    private javax.swing.JTextField Fec1;
    private javax.swing.JTextField Fec2;
    private javax.swing.JLabel Fondo;
    private javax.swing.JTextField Nombre;
    private javax.swing.JTextField Protegido;
    private javax.swing.JTextField Recompensa;
    private javax.swing.JTextField Ultimo;
    private javax.swing.JTextField Ultimo1;
    private javax.swing.JTextField Ultimo2;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1NombreP;
    private javax.swing.JLabel jLabelCapitan;
    private javax.swing.JLabel jLabelCapitan1;
    private javax.swing.JLabel jLabelCapitan2;
    private javax.swing.JLabel jLabelClave;
    private javax.swing.JLabel jLabelEmperador;
    private javax.swing.JLabel jLabelEmperador1;
    private javax.swing.JLabel jLabelEmperador2;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelFec;
    private javax.swing.JLabel jLabelProtegido;
    private javax.swing.JLabel jLabelRecompensa;
    private javax.swing.JLabel jLabelUltimo;
    // End of variables declaration//GEN-END:variables
}
