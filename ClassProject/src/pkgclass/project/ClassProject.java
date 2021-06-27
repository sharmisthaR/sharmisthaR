/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgclass.project;

/**
 *
 * @author sharmistha
 */
public class ClassProject {
    private javax.swing.JButton Register;
    private javax.swing.JButton Login;
    /**
     * @param args the command line arguments
     */
    
    private void RegisterActionPerformed(java.awt.event.ActionEvent evt){
        RegistrationForm rf = new RegistrationForm();
        rf.setVisible(true);
    }
    
    private void LoginActionPerformed(java.awt.event.ActionEvent evt){
        LoginForm lf = new LoginForm();
        lf.setVisible(true);
    }
    public static void main(String[] args) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClassProject().setVisible(true);
            }
            
        }
    }
    
}