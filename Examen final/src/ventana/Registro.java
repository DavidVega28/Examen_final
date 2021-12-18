/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventana;

import clases.componentes;
import clases.enviar_Correo;
import clases.user;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import javax.swing.JOptionPane;


public class Registro extends javax.swing.JFrame {

    public static String nombre = "";
    public static String apellidos = "";
    public static String descrip = "";
    public static String fecha = "";
    public static String correo  = "";
    public Registro() throws IOException {
        initComponents();
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bt_inicio = new javax.swing.JButton();
        bt_inicio1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_correo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_apellidos = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_contraseña = new javax.swing.JTextField();
        bt_registrar = new javax.swing.JButton();
        bt_registrar1 = new javax.swing.JButton();
        bt_registrar2 = new javax.swing.JButton();

        bt_inicio.setBackground(new java.awt.Color(0, 204, 204));
        bt_inicio.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        bt_inicio.setForeground(new java.awt.Color(51, 51, 51));
        bt_inicio.setText("Iniciar Sesión");
        bt_inicio.setBorder(null);

        bt_inicio1.setBackground(new java.awt.Color(0, 204, 204));
        bt_inicio1.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        bt_inicio1.setForeground(new java.awt.Color(51, 51, 51));
        bt_inicio1.setText("Iniciar Sesión");
        bt_inicio1.setBorder(null);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ventana Registro");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Usuario:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 90, 30));

        jLabel2.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Registro");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 120, 30));

        txt_correo.setBackground(new java.awt.Color(204, 204, 204));
        txt_correo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        jPanel1.add(txt_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 250, 30));

        jLabel3.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Nombre:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 70, 30));

        txt_usuario.setBackground(new java.awt.Color(204, 204, 204));
        txt_usuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        jPanel1.add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 250, 30));

        jLabel4.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Correo electrónico:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 150, 30));

        txt_nombre.setBackground(new java.awt.Color(204, 204, 204));
        txt_nombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        jPanel1.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 250, 30));

        jLabel5.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Apellidos:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 90, 30));

        txt_apellidos.setBackground(new java.awt.Color(204, 204, 204));
        txt_apellidos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        jPanel1.add(txt_apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 250, 30));

        jLabel6.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Contraseña:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 90, 30));

        txt_contraseña.setBackground(new java.awt.Color(204, 204, 204));
        txt_contraseña.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        jPanel1.add(txt_contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 250, 30));

        bt_registrar.setBackground(new java.awt.Color(255, 0, 0));
        bt_registrar.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        bt_registrar.setForeground(new java.awt.Color(51, 51, 51));
        bt_registrar.setText("Registrarme");
        bt_registrar.setBorder(null);
        bt_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_registrarActionPerformed(evt);
            }
        });
        jPanel1.add(bt_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, 130, 40));

        bt_registrar1.setBackground(new java.awt.Color(255, 0, 0));
        bt_registrar1.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        bt_registrar1.setForeground(new java.awt.Color(51, 51, 51));
        bt_registrar1.setText("Volver al inicio de sesión");
        bt_registrar1.setBorder(null);
        bt_registrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_registrar1ActionPerformed(evt);
            }
        });
        jPanel1.add(bt_registrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 440, 200, 40));

        bt_registrar2.setBackground(new java.awt.Color(0, 204, 204));
        bt_registrar2.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        bt_registrar2.setForeground(new java.awt.Color(51, 51, 51));
        bt_registrar2.setText("Volver a Login");
        bt_registrar2.setBorder(null);
        bt_registrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_registrar2ActionPerformed(evt);
            }
        });
        jPanel1.add(bt_registrar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 440, 160, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_registrarActionPerformed

             
            user m = new user(txt_nombre.getText(), txt_apellidos.getText(), txt_usuario.getText(), txt_contraseña.getText(), txt_correo.getText());
            enviar_Correo m1 = new enviar_Correo(txt_correo.getText());
            correo = txt_correo.getText();
            nombre = txt_nombre.getText(); 
            apellidos = txt_apellidos.getText();
        try {
            m1.enviarcorreo();
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MessagingException ex) {
            Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
        }
            componentes.usuarios.add(m);
            JOptionPane.showMessageDialog(rootPane, "Usuario registrado con éxito.");
                       
        txt_nombre.setText("");
        txt_apellidos.setText("");
        txt_usuario.setText("");
        txt_contraseña.setText("");
        txt_correo.setText("");
    }//GEN-LAST:event_bt_registrarActionPerformed

    private void bt_registrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_registrar1ActionPerformed
        Login l = new Login();
        l.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bt_registrar1ActionPerformed

    private void bt_registrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_registrar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_registrar2ActionPerformed

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Registro().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_inicio;
    private javax.swing.JButton bt_inicio1;
    private javax.swing.JButton bt_registrar;
    private javax.swing.JButton bt_registrar1;
    private javax.swing.JButton bt_registrar2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_apellidos;
    private javax.swing.JTextField txt_contraseña;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
