
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adnan
 */
public class loginAdmin extends javax.swing.JFrame {

    /**
     * Creates new form loginAdmin
     */
    public loginAdmin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldUN = new javax.swing.JTextField();
        jPasswordFieldPass = new javax.swing.JPasswordField();
        jCheckBoxcheck = new javax.swing.JCheckBox();
        jButtonLogin = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldUN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUNActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldUN, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 260, -1));

        jPasswordFieldPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldPassActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordFieldPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 260, -1));

        jCheckBoxcheck.setText("Make Password Visible");
        jCheckBoxcheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxcheckActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxcheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 160, 30));

        jButtonLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/loginIcon.png"))); // NOI18N
        jButtonLogin.setText("Login");
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 150, 50));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/back-removebg-preview-removebg-preview.png"))); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 450, 150, 50));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 200, 30));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel2.setText("USERNAME");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 140, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/adminBG.gif"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldUNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUNActionPerformed

    private void jPasswordFieldPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldPassActionPerformed

    private void jCheckBoxcheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxcheckActionPerformed
        // TODO add your handling code here:
        if(jCheckBoxcheck.isSelected()){
            jPasswordFieldPass.setEchoChar((char)0);
        }
        else{
            jPasswordFieldPass.setEchoChar('*');
        } 
    }//GEN-LAST:event_jCheckBoxcheckActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new index().setVisible(true);
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed

    // TODO add your handling code here:
         try {
            String unFromFile;
            String passFromFile;
            try ( // TODO add your handling code here:
                    BufferedReader buffeedReader = new BufferedReader(new FileReader("info.txt"))) {
                    unFromFile = buffeedReader.readLine();
                    passFromFile = buffeedReader.readLine();
            }
            
            String un = jTextFieldUN.getText() ;
            String pass = jPasswordFieldPass.getText() ; 
            
            
            if(un.equals(unFromFile) && pass.equals(passFromFile) ){ /// the code to change windows
                adminHome  home = new adminHome();
                home.setVisible(true);
                this.setVisible(false); 
            }
             
            else {
                //jLabelErrorMessage.setText("Welcome " + un );
                JOptionPane.showMessageDialog(null, "Invalid");
                
                //Problem1 p1 = new Problem1() ; 
                //p1.setVisible(true);
                //this.setVisible(false);
                
            }
              
            
            
            
            
        } catch (IOException ex) {
            Logger.getLogger(loginAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButtonLoginActionPerformed

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
            java.util.logging.Logger.getLogger(loginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JCheckBox jCheckBoxcheck;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPasswordFieldPass;
    private javax.swing.JTextField jTextFieldUN;
    // End of variables declaration//GEN-END:variables
}
