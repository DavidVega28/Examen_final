
package ventana;

import clases.componentes;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {
    
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        bt_inicio = new javax.swing.JButton();
        bt_registrar = new javax.swing.JButton();
        txt_contra = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ventana Login");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Digite la contraseña:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Digite el usuario:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));

        txt_usuario.setBackground(new java.awt.Color(204, 204, 204));
        txt_usuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        jPanel1.add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 190, 30));

        bt_inicio.setBackground(new java.awt.Color(255, 0, 0));
        bt_inicio.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        bt_inicio.setForeground(new java.awt.Color(51, 51, 51));
        bt_inicio.setText("Iniciar sesión");
        bt_inicio.setBorder(null);
        bt_inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_inicioActionPerformed(evt);
            }
        });
        jPanel1.add(bt_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 130, 30));

        bt_registrar.setBackground(new java.awt.Color(255, 0, 0));
        bt_registrar.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        bt_registrar.setForeground(new java.awt.Color(51, 51, 51));
        bt_registrar.setText("Registrarme");
        bt_registrar.setBorder(null);
        bt_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_registrarActionPerformed(evt);
            }
        });
        jPanel1.add(bt_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 110, 30));

        txt_contra.setBackground(new java.awt.Color(204, 204, 204));
        txt_contra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        jPanel1.add(txt_contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 190, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_registrarActionPerformed
        Registro m = null;
        try {
            m = new Registro();
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bt_registrarActionPerformed

    private void bt_inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_inicioActionPerformed
        String usuario = txt_usuario.getText();
        String contra = txt_contra.getText();

        boolean e = true;

        for (int i = 0; i < componentes.usuarios.size(); i++) {
            if (componentes.usuarios.get(i).getUsuario().equals(usuario) && componentes.usuarios.get(i).getContra().equals(contra)) {
                e = true;
                break;
            } else {
                e = false;
            }
        }
        if (e) {
            JOptionPane.showMessageDialog(rootPane, "Usuario y contraseña correctos.");
            Tareas m1 = null;
            try {
                m1 = new Tareas();
            } catch (IOException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
            m1.setVisible(true);
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Usuario y/o contraseña incorrectos.");
        }
    }//GEN-LAST:event_bt_inicioActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_inicio;
    private javax.swing.JButton bt_registrar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txt_contra;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
