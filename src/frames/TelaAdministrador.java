/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;
import DAO.SecretariaDAO;
import entidades.Secretaria;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import tools.Data;

/**
 *
 * @author zEveerY
 */
public class TelaAdministrador extends javax.swing.JFrame {
Secretaria secretaria = new Secretaria();
SecretariaDAO secretariaDAO = new SecretariaDAO();

public boolean xd = false;
    /**
     * Creates new form TelaAdministrador
     */
    public TelaAdministrador() {
        initComponents();
        
        Data mostra_data = new Data();
        mostra_data.le_data();
        jl_data.setText("Estamos no mês de "+mostra_data.mes+", dia : "+mostra_data.dia+" do ano de "+mostra_data.ano);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jb_cadInfoCli = new javax.swing.JButton();
        jb_cadSec = new javax.swing.JButton();
        jl_data = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel1.setText("Área do Administrador");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 11, -1, -1));

        jb_cadInfoCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/clinical_data.png"))); // NOI18N
        jb_cadInfoCli.setToolTipText("Cadastrar Dados Clínicos");
        jb_cadInfoCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_cadInfoCliActionPerformed(evt);
            }
        });
        jPanel1.add(jb_cadInfoCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 93, 141, -1));

        jb_cadSec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/secretary.png"))); // NOI18N
        jb_cadSec.setToolTipText("Cadastrar Secretária");
        jb_cadSec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_cadSecActionPerformed(evt);
            }
        });
        jPanel1.add(jb_cadSec, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 139, -1));

        jl_data.setText("data");
        jl_data.setAutoscrolls(true);
        jPanel1.add(jl_data, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 344, -1, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/stop.png"))); // NOI18N
        jButton3.setToolTipText("Sair do Sistema");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 80, 55));

        jButton1.setText("Informações Atuais");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 370, 42));

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 635, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-661)/2, (screenSize.height-430)/2, 661, 430);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jb_cadSecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_cadSecActionPerformed
        // TODO add your handling code here:
        //valida(xd);
        new AdminCadastrarSecretariasModal(this, true).show();
        
    }//GEN-LAST:event_jb_cadSecActionPerformed

    private void jb_cadInfoCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_cadInfoCliActionPerformed
        // TODO add your handling code here:
        new AdminCadastrarInfoCliModal(this, true).show();
    }//GEN-LAST:event_jb_cadInfoCliActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAdministrador().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jb_cadInfoCli;
    private javax.swing.JButton jb_cadSec;
    private javax.swing.JLabel jl_data;
    // End of variables declaration//GEN-END:variables

    public boolean valida(boolean valor) {
        
        if(xd == false)
        {
            new AdminCadastrarSecretariasModal(this, true).show();
            return xd = true;
        }else
        {
            JOptionPane.showMessageDialog(rootPane, "Uma instancia do processo já foi aberta");
        }
        
        return xd;
    }

}
