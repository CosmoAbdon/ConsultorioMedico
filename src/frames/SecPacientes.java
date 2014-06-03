/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

/**
 *
 * @author zEveerY
 */
public class SecPacientes extends javax.swing.JFrame {

    /**
     * Creates new form SecPacientes
     */
    public SecPacientes() {
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

        jb_cadMedicos = new javax.swing.JButton();
        jb_altMedicos = new javax.swing.JButton();
        jb_searchMedicos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jb_cadMedicos.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jb_cadMedicos.setText("Cadastrar Pacientes");
        jb_cadMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_cadMedicosActionPerformed(evt);
            }
        });

        jb_altMedicos.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jb_altMedicos.setText("Alterar dados dos Pacientes");
        jb_altMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_altMedicosActionPerformed(evt);
            }
        });

        jb_searchMedicos.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jb_searchMedicos.setText("Buscar Pacientes");
        jb_searchMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_searchMedicosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jb_cadMedicos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jb_altMedicos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
                    .addComponent(jb_searchMedicos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jb_cadMedicos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(jb_altMedicos)
                .addGap(64, 64, 64)
                .addComponent(jb_searchMedicos)
                .addGap(72, 72, 72))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_cadMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_cadMedicosActionPerformed
        // TODO add your handling code here:
        new SecCadastroPacientesModal(this, rootPaneCheckingEnabled).show();
    }//GEN-LAST:event_jb_cadMedicosActionPerformed

    private void jb_altMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_altMedicosActionPerformed
        new SecAlterarPacientesModal(this, rootPaneCheckingEnabled).show();
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_altMedicosActionPerformed

    private void jb_searchMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_searchMedicosActionPerformed
        // TODO add your handling code here:
        new SecBuscaPacientes(this, rootPaneCheckingEnabled).show();
    }//GEN-LAST:event_jb_searchMedicosActionPerformed

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
            java.util.logging.Logger.getLogger(SecPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SecPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SecPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SecPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SecPacientes().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jb_altMedicos;
    private javax.swing.JButton jb_cadMedicos;
    private javax.swing.JButton jb_searchMedicos;
    // End of variables declaration//GEN-END:variables
}
