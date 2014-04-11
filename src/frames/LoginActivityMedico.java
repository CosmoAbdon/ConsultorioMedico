/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import DAO.MedicosDAO;
import entidades.Medicos;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author zEveerY
 */
public class LoginActivityMedico extends javax.swing.JFrame {

Medicos medicos = new Medicos();
MedicosDAO medicosDAO = new MedicosDAO();

boolean a;
    
    /**
     * Creates new form LoginActivityMedico
     */
    public LoginActivityMedico() {
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

        jl_Login = new javax.swing.JLabel();
        jl_Senha = new javax.swing.JLabel();
        jtf_Login = new javax.swing.JTextField();
        jtf_Senha = new javax.swing.JTextField();
        jb_entrar = new javax.swing.JButton();
        jb_limpar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login de Médicos");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_Login.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jl_Login.setText("Login : ");
        getContentPane().add(jl_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jl_Senha.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jl_Senha.setText("Senha : ");
        getContentPane().add(jl_Senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jtf_Login.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jtf_Login.setForeground(new java.awt.Color(204, 204, 204));
        jtf_Login.setText("Digite o seu CRM");
        jtf_Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtf_LoginMouseClicked(evt);
            }
        });
        getContentPane().add(jtf_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 60, 130, -1));

        jtf_Senha.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jtf_Senha.setForeground(new java.awt.Color(204, 204, 204));
        jtf_Senha.setText("Digite a sua senha");
        jtf_Senha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtf_SenhaMouseClicked(evt);
            }
        });
        getContentPane().add(jtf_Senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, -1, -1));

        jb_entrar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jb_entrar.setText("Entrar no Sistema");
        jb_entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_entrarActionPerformed(evt);
            }
        });
        getContentPane().add(jb_entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 233, -1, -1));

        jb_limpar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jb_limpar.setText("Limpar Campos");
        jb_limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_limparActionPerformed(evt);
            }
        });
        getContentPane().add(jb_limpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 233, -1, -1));

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 30));

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-487)/2, (screenSize.height-339)/2, 487, 339);
    }// </editor-fold>//GEN-END:initComponents

    private void jtf_LoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtf_LoginMouseClicked
        // TODO add your handling code here:
        jtf_Login.setText("");
    }//GEN-LAST:event_jtf_LoginMouseClicked

    private void jtf_SenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtf_SenhaMouseClicked
        // TODO add your handling code here:
        jtf_Senha.setText("");
    }//GEN-LAST:event_jtf_SenhaMouseClicked

    private void jb_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_limparActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jb_limparActionPerformed

    private void jb_entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_entrarActionPerformed
        // TODO add your handling code here:
        
        medicosDAO.getConnection();
        try {
            if(medicosDAO.logarMedicos(jtf_Login.getText(), jtf_Senha.getText()) == true)
            {
                hide();
            new TelaMedico().show();
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginActivitySecretaria.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jb_entrarActionPerformed

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
            java.util.logging.Logger.getLogger(LoginActivityMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginActivityMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginActivityMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginActivityMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginActivityMedico().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jb_entrar;
    private javax.swing.JButton jb_limpar;
    private javax.swing.JLabel jl_Login;
    private javax.swing.JLabel jl_Senha;
    private javax.swing.JTextField jtf_Login;
    private javax.swing.JTextField jtf_Senha;
    // End of variables declaration//GEN-END:variables
}
