/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import DAO.MedicosDAO;
import entidades.Medicos;
import DAO.ConsultasDAO;
import entidades.Consultas;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author zEveerY
 */
public class SecBuscaConsultas extends javax.swing.JFrame {
MedicosDAO medicosDAO = new MedicosDAO();
Medicos medicos = new Medicos();
List<Medicos> medicose;
ConsultasDAO consultasDAO = new ConsultasDAO();
Consultas consultas = new Consultas();
List<Consultas> consultase;
    /**
     * Creates new form SecBuscaConsultas
     */
    public SecBuscaConsultas() {
        initComponents();
        preencher_jtable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jtf_crm = new javax.swing.JTextField();
        jl_nome = new javax.swing.JLabel();
        jl_crm = new javax.swing.JLabel();
        jtf_cpf = new javax.swing.JTextField();
        jb_exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(175, 200, 251));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Médico", "Paciente", "Data", "Hora", "Ficha Médica"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jtf_crm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtf_crmKeyPressed(evt);
            }
        });

        jl_nome.setText("C.R.M");

        jl_crm.setText("C.P.F");

        jtf_cpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtf_cpfKeyPressed(evt);
            }
        });

        jb_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/stop.png"))); // NOI18N
        jb_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 997, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jl_nome)
                        .addGap(18, 18, 18)
                        .addComponent(jtf_crm, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jl_crm)
                        .addGap(18, 18, 18)
                        .addComponent(jtf_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jb_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jb_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_crm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_nome)
                    .addComponent(jl_crm)
                    .addComponent(jtf_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtf_crmKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_crmKeyPressed
        // TODO add your handling code here:
      //  pesquisar_jtableNome(jtf_crm.getText());
        // preencher_jtable();
    }//GEN-LAST:event_jtf_crmKeyPressed

    private void jtf_cpfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_cpfKeyPressed
      //  pesquisar_jtableCpf(jtf_cpf.getText());
    }//GEN-LAST:event_jtf_cpfKeyPressed

    private void jb_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_exitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jb_exitActionPerformed

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
            java.util.logging.Logger.getLogger(SecBuscaConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SecBuscaConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SecBuscaConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SecBuscaConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SecBuscaConsultas().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jb_exit;
    private javax.swing.JLabel jl_crm;
    private javax.swing.JLabel jl_nome;
    private javax.swing.JTextField jtf_cpf;
    private javax.swing.JTextField jtf_crm;
    // End of variables declaration//GEN-END:variables

public void preencher_jtable() 
    {
        try {
            consultase = consultasDAO.getAllConsultas();
        } catch (SQLException ex) 
        {
            Logger.getLogger(SecBuscaConvenios.class.getName()).log(Level.SEVERE, null, ex);
        }
        MyTableModel m = new MyTableModel(Consultas.class, consultase, jTable1);
        jTable1.setModel(m);
    }
    
   /* public void pesquisar_jtableCrm(String nome) 
    {
        try 
        {
            medicose = medicosDAO.getAllMedicosPorCrm(crm);
        } catch (SQLException ex) 
        {
            Logger.getLogger(SecBuscaConvenios.class.getName()).log(Level.SEVERE, null, ex);
        }
        MyTableModel m = new MyTableModel(Co.class, conveniose, jTable1);
        jTable1.setModel(m);
    }
    */

     /*
    public void pesquisar_jtableCpf(String cnpj) 
    {
        try 
        {
            conveniose = convenioDAO.getAllConvenioPorCnpj(cnpj);
        } catch (SQLException ex) 
        {
            Logger.getLogger(SecBuscaConvenios.class.getName()).log(Level.SEVERE, null, ex);
        }
        MyTableModel m = new MyTableModel(Convenio.class, conveniose, jTable1);
        jTable1.setModel(m);
    }
*/

}
