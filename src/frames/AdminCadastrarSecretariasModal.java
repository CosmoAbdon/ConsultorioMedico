/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import entidades.Secretaria;
import DAO.SecretariaDAO;

/**
 *
 * @author zEveerY
 */
public class AdminCadastrarSecretariasModal extends java.awt.Dialog {
    
Secretaria secretaria = new Secretaria();
SecretariaDAO secretariaDAO = new SecretariaDAO();
TelaAdministrador telaAdministrador = new TelaAdministrador();
    

    /**
     * Creates new form AdminCadastrarSecretariasModal
     */
    public AdminCadastrarSecretariasModal(java.awt.Frame parent, boolean modal) {
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
        jPanel2 = new javax.swing.JPanel();
        jl_cadastrar = new javax.swing.JLabel();
        jl_nome = new javax.swing.JLabel();
        jl_cpf = new javax.swing.JLabel();
        jl_rg = new javax.swing.JLabel();
        jl_telefone = new javax.swing.JLabel();
        jl_endereco = new javax.swing.JLabel();
        jtf_nome = new javax.swing.JTextField();
        jtf_cpf = new javax.swing.JTextField();
        jtf_rg = new javax.swing.JTextField();
        jtf_telefone = new javax.swing.JTextField();
        jtf_endereco = new javax.swing.JTextField();
        jcb_sexo = new javax.swing.JComboBox();
        jl_endereco1 = new javax.swing.JLabel();
        jpf_senha = new javax.swing.JPasswordField();
        jl_endereco2 = new javax.swing.JLabel();
        jb_save = new javax.swing.JButton();
        jb_clear = new javax.swing.JButton();
        jb_quit = new javax.swing.JButton();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jl_cadastrar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jl_cadastrar.setText("Cadastrar Secretárias");

        jl_nome.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jl_nome.setText("Nome Funcionário :");

        jl_cpf.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jl_cpf.setText("C.P.F :");

        jl_rg.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jl_rg.setText("R.G :");

        jl_telefone.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jl_telefone.setText("Telefone : ");

        jl_endereco.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jl_endereco.setText("Endereço :");

        jcb_sexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Feminino", "Outros" }));

        jl_endereco1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jl_endereco1.setText("Sexo :");

        jpf_senha.setText("jPasswordField1");
        jpf_senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpf_senhaActionPerformed(evt);
            }
        });

        jl_endereco2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jl_endereco2.setText("Senha de Acesso :");

        jb_save.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jb_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/save.png"))); // NOI18N
        jb_save.setToolTipText("Salvar Dados");
        jb_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_saveActionPerformed(evt);
            }
        });

        jb_clear.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jb_clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/clear.png"))); // NOI18N
        jb_clear.setToolTipText("Limpar Campos");
        jb_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_clearActionPerformed(evt);
            }
        });

        jb_quit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/stop.png"))); // NOI18N
        jb_quit.setToolTipText("Sair do Sistema");
        jb_quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_quitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(259, 259, 259)
                .addComponent(jl_cadastrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jb_quit)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jl_nome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jl_cpf)
                    .addComponent(jl_rg)
                    .addComponent(jl_telefone)
                    .addComponent(jl_endereco1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jl_endereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jl_endereco2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpf_senha)
                    .addComponent(jcb_sexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtf_nome)
                    .addComponent(jtf_cpf)
                    .addComponent(jtf_rg)
                    .addComponent(jtf_telefone)
                    .addComponent(jtf_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jb_save, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_cadastrar)
                    .addComponent(jb_quit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_nome)
                            .addComponent(jtf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_cpf)
                            .addComponent(jtf_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_rg)
                            .addComponent(jtf_rg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_telefone)
                            .addComponent(jtf_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_endereco)
                            .addComponent(jtf_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jb_save))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcb_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_endereco1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jpf_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_endereco2)))
                    .addComponent(jb_clear))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-667)/2, (screenSize.height-447)/2, 667, 447);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Closes the dialog
     */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog

    private void jpf_senhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpf_senhaActionPerformed
        // TODO add your handling code here:
        jpf_senha.setText("");
    }//GEN-LAST:event_jpf_senhaActionPerformed

    private void jb_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_saveActionPerformed
        try {
            cadastrar();
        } catch (SQLException ex) {
            Logger.getLogger(AdminCadastrarSecretariasModal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jb_saveActionPerformed

    private void jb_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_clearActionPerformed
        // TODO add your handling code here:
        jtf_nome.setText("");
        jtf_cpf.setText("");
        jtf_endereco.setText("");
        jtf_rg.setText("");
        jtf_telefone.setText("");

        JOptionPane.showMessageDialog(null, "Campos limpos com sucesso !");
    }//GEN-LAST:event_jb_clearActionPerformed

    private void jb_quitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_quitActionPerformed
        // TODO add your handling code here:
        //telaAdministrador.valida(false);
        this.dispose();

    }//GEN-LAST:event_jb_quitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AdminCadastrarSecretariasModal dialog = new AdminCadastrarSecretariasModal(new java.awt.Frame(), true);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jb_clear;
    private javax.swing.JButton jb_quit;
    private javax.swing.JButton jb_save;
    private javax.swing.JComboBox jcb_sexo;
    private javax.swing.JLabel jl_cadastrar;
    private javax.swing.JLabel jl_cpf;
    private javax.swing.JLabel jl_endereco;
    private javax.swing.JLabel jl_endereco1;
    private javax.swing.JLabel jl_endereco2;
    private javax.swing.JLabel jl_nome;
    private javax.swing.JLabel jl_rg;
    private javax.swing.JLabel jl_telefone;
    private javax.swing.JPasswordField jpf_senha;
    private javax.swing.JTextField jtf_cpf;
    private javax.swing.JTextField jtf_endereco;
    private javax.swing.JTextField jtf_nome;
    private javax.swing.JTextField jtf_rg;
    private javax.swing.JTextField jtf_telefone;
    // End of variables declaration//GEN-END:variables

     private void cadastrar() throws SQLException {
        secretaria.setNome_func(jtf_nome.getText());
        secretaria.setCpf(jtf_cpf.getText());
        secretaria.setRg(jtf_rg.getText());
        secretaria.setTelefone(jtf_telefone.getText());
        secretaria.setEndereco(jtf_endereco.getText());
        secretaria.setSexo(jcb_sexo.getSelectedItem().toString());
        secretaria.setSenha_acesso(jpf_senha.getText());
        
        secretariaDAO.getConnection();
        secretariaDAO.addSecretaria(secretaria);
        
        JOptionPane.showMessageDialog(null, "Secretária Cadastrada com sucesso !");
        
    }


}