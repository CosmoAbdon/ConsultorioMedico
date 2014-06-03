/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package frames;

import DAO.ConvenioDAO;
import entidades.Convenio;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author zEveerY
 */
public class SecCadastroConveniosModal extends java.awt.Dialog {

Convenio convenio = new Convenio();    
ConvenioDAO convenioDAO = new ConvenioDAO();
    
    /**
     * Creates new form SecCadastroConveniosModal
     */
    public SecCadastroConveniosModal(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtf_nome = new javax.swing.JTextField();
        jtf_telefone = new javax.swing.JTextField();
        jtf_endereco = new javax.swing.JTextField();
        jtf_cnpj = new javax.swing.JTextField();
        jbt_cadastrar = new javax.swing.JButton();
        jbt_limpar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel1.setText("Cadastros de Convenios");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jLabel2.setText("Nome : ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 65, -1));

        jLabel3.setText("Telefone : ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 157, 65, -1));

        jLabel4.setText("Endereço : ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 205, 65, -1));

        jLabel5.setText("C.N.P.J :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 257, 65, -1));
        jPanel1.add(jtf_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 160, -1));
        jPanel1.add(jtf_telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 154, 160, -1));
        jPanel1.add(jtf_endereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 202, 160, -1));
        jPanel1.add(jtf_cnpj, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 257, 160, -1));

        jbt_cadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/save.png"))); // NOI18N
        jbt_cadastrar.setToolTipText("Gravar");
        jbt_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_cadastrarActionPerformed(evt);
            }
        });
        jPanel1.add(jbt_cadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 87, 95, -1));

        jbt_limpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/clear.png"))); // NOI18N
        jbt_limpar.setToolTipText("Limpar Campos");
        jbt_limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_limparActionPerformed(evt);
            }
        });
        jPanel1.add(jbt_limpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 228, 95, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/stop.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-540)/2, (screenSize.height-350)/2, 540, 350);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Closes the dialog
     */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog

    private void jbt_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_cadastrarActionPerformed
        try {
            // TODO add your handling code here:
            cadastrar();
        } catch (SQLException ex) {
            Logger.getLogger(SecCadastroConveniosModal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbt_cadastrarActionPerformed

    private void jbt_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_limparActionPerformed
        // TODO add your handling code here:
        limpar();
    }//GEN-LAST:event_jbt_limparActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SecCadastroConveniosModal dialog = new SecCadastroConveniosModal(new java.awt.Frame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbt_cadastrar;
    private javax.swing.JButton jbt_limpar;
    private javax.swing.JTextField jtf_cnpj;
    private javax.swing.JTextField jtf_endereco;
    private javax.swing.JTextField jtf_nome;
    private javax.swing.JTextField jtf_telefone;
    // End of variables declaration//GEN-END:variables

    private void cadastrar() throws SQLException {
        convenio.setNome(jtf_nome.getText());
        convenio.setTelefone(jtf_telefone.getText());
        convenio.setEndereco(jtf_endereco.getText());
        convenio.setCnpj(jtf_cnpj.getText());
        
        convenioDAO.addConvenio(convenio);
        
        JOptionPane.showMessageDialog(null, "Convênio Cadastrado com sucesso !");
        limpar();
        
    }

    private void limpar() {
        jtf_nome.setText("");
        jtf_endereco.setText("");
        jtf_telefone.setText("");
        jtf_cnpj.setText("");
    }
}