/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import DAO.ConvenioDAO;
import java.sql.SQLException;
import javax.swing.JOptionPane;

//entidades e daos
import entidades.Paciente;
import entidades.Convenio;
import DAO.PacienteDAO;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author zEveerY
 */
public class SecCadastroPacientesModal extends java.awt.Dialog {
Paciente paciente = new Paciente();
PacienteDAO pacienteDAO = new PacienteDAO();
ConvenioDAO convenioDAO = new ConvenioDAO();
Convenio convenio = new Convenio();
List<Convenio> conveniose;
    /**
     * Creates new form SecCadastroPacientesModal
     */
    public SecCadastroPacientesModal(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        preencher_jcomboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jl_cadastrar1 = new javax.swing.JLabel();
        jl_nome1 = new javax.swing.JLabel();
        jl_cpf1 = new javax.swing.JLabel();
        jl_rg1 = new javax.swing.JLabel();
        jl_telefone1 = new javax.swing.JLabel();
        jtf_nome1 = new javax.swing.JTextField();
        jtf_cpf1 = new javax.swing.JTextField();
        jtf_rg1 = new javax.swing.JTextField();
        jtf_telefone1 = new javax.swing.JTextField();
        jcb_sexo1 = new javax.swing.JComboBox();
        jl_endereco3 = new javax.swing.JLabel();
        jl_endereco4 = new javax.swing.JLabel();
        jb_save = new javax.swing.JButton();
        jb_clear = new javax.swing.JButton();
        jb_quit = new javax.swing.JButton();
        jtf_endereco = new javax.swing.JTextField();
        jl_endereco = new javax.swing.JLabel();
        jcb_convenio = new javax.swing.JComboBox();

        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        jl_cadastrar1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jl_cadastrar1.setText("Cadastrar Pacientes");

        jl_nome1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jl_nome1.setText("Nome :");

        jl_cpf1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jl_cpf1.setText("C.P.F :");

        jl_rg1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jl_rg1.setText("R.G :");

        jl_telefone1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jl_telefone1.setText("Telefone : ");

        jcb_sexo1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Feminino", "Outros" }));

        jl_endereco3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jl_endereco3.setText("Sexo :");

        jl_endereco4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jl_endereco4.setText("Convênio :");

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

        jl_endereco.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jl_endereco.setText("Endereço :");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(218, Short.MAX_VALUE)
                .addComponent(jl_cadastrar1)
                .addGap(236, 236, 236)
                .addComponent(jb_quit)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jl_endereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jl_nome1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jl_cpf1)
                    .addComponent(jl_rg1)
                    .addComponent(jl_telefone1)
                    .addComponent(jl_endereco3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jl_endereco4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(49, 49, 49)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jcb_sexo1, 0, 200, Short.MAX_VALUE)
                    .addComponent(jtf_nome1)
                    .addComponent(jtf_cpf1)
                    .addComponent(jtf_rg1)
                    .addComponent(jtf_telefone1)
                    .addComponent(jtf_endereco)
                    .addComponent(jcb_convenio, 0, 200, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jb_save, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jb_quit)
                    .addComponent(jl_cadastrar1))
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_nome1)
                    .addComponent(jtf_nome1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jb_save))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtf_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_endereco))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_cpf1)
                    .addComponent(jtf_cpf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_rg1)
                    .addComponent(jtf_rg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_telefone1)
                    .addComponent(jtf_telefone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jcb_sexo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jl_endereco3))
                    .addComponent(jb_clear))
                .addGap(9, 9, 9)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_endereco4)
                    .addComponent(jcb_convenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-727)/2, (screenSize.height-470)/2, 727, 470);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Closes the dialog
     */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog

    private void jb_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_saveActionPerformed
        try {
            cadastrar();
        } catch (SQLException ex) {
            Logger.getLogger(AdminCadastrarSecretariasModal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jb_saveActionPerformed

    private void jb_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_clearActionPerformed
        // TODO add your handling code here:
        jtf_nome1.setText("");
        jtf_cpf1.setText("");
        jtf_rg1.setText("");
        jtf_telefone1.setText("");

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
                SecCadastroPacientesModal dialog = new SecCadastroPacientesModal(new java.awt.Frame(), true);
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton jb_clear;
    private javax.swing.JButton jb_quit;
    private javax.swing.JButton jb_save;
    private javax.swing.JComboBox jcb_convenio;
    private javax.swing.JComboBox jcb_sexo1;
    private javax.swing.JLabel jl_cadastrar1;
    private javax.swing.JLabel jl_cpf1;
    private javax.swing.JLabel jl_endereco;
    private javax.swing.JLabel jl_endereco3;
    private javax.swing.JLabel jl_endereco4;
    private javax.swing.JLabel jl_nome1;
    private javax.swing.JLabel jl_rg1;
    private javax.swing.JLabel jl_telefone1;
    private javax.swing.JTextField jtf_cpf1;
    private javax.swing.JTextField jtf_endereco;
    private javax.swing.JTextField jtf_nome1;
    private javax.swing.JTextField jtf_rg1;
    private javax.swing.JTextField jtf_telefone1;
    // End of variables declaration//GEN-END:variables

    private void cadastrar() throws SQLException {
        
        paciente.setNome(jtf_nome1.getText());
        paciente.setEndereco(jtf_endereco.getText());
        paciente.setCpf(jtf_cpf1.getText());
        paciente.setRg(jtf_rg1.getText());
        paciente.setTelefone(jtf_telefone1.getText());
        paciente.setSexo(jcb_sexo1.getSelectedItem().toString());
        paciente.setConvenio(jcb_convenio.getSelectedItem().toString());
        
        
        pacienteDAO.getConnection();
        pacienteDAO.addPaciente(paciente);
        
        JOptionPane.showMessageDialog(null, "Paciente Cadastrado com sucesso !");
        
    }
    
    
    public void preencher_jcomboBox() 
    {
        try {
            Vector<Convenio> jcb = new Vector<Convenio>(convenioDAO.getAllConvenios());
             DefaultComboBoxModel a = new DefaultComboBoxModel(jcb);
            jcb_convenio.setModel(a);
        } catch (SQLException ex) {
            Logger.getLogger(SecCadastroPacientesModal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
