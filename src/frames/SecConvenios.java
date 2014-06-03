/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

/**
 *
 * @author zEveerY
 */
public class SecConvenios extends javax.swing.JFrame {

    /**
     * Creates new form SecConvenios
     */
    public SecConvenios() {
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

        jb_cadConvenios = new javax.swing.JButton();
        jb_altConvenios = new javax.swing.JButton();
        jb_searchConvenios = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(511, 536));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jb_cadConvenios.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jb_cadConvenios.setText("Cadastrar Convênios");
        jb_cadConvenios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_cadConveniosActionPerformed(evt);
            }
        });
        getContentPane().add(jb_cadConvenios, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 71, 426, -1));

        jb_altConvenios.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jb_altConvenios.setText("Altera dados do Convênio");
        jb_altConvenios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_altConveniosActionPerformed(evt);
            }
        });
        getContentPane().add(jb_altConvenios, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 149, 426, -1));

        jb_searchConvenios.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jb_searchConvenios.setText("Buscar Convênios");
        jb_searchConvenios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_searchConveniosActionPerformed(evt);
            }
        });
        getContentPane().add(jb_searchConvenios, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 231, 426, -1));

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-511)/2, (screenSize.height-369)/2, 511, 369);
    }// </editor-fold>//GEN-END:initComponents

    private void jb_cadConveniosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_cadConveniosActionPerformed
        // TODO add your handling code here:
        new SecCadastroConveniosModal(this, rootPaneCheckingEnabled).show();
    }//GEN-LAST:event_jb_cadConveniosActionPerformed

    private void jb_searchConveniosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_searchConveniosActionPerformed
        // TODO add your handling code here:
        new SecBuscaConvenios().show();
    }//GEN-LAST:event_jb_searchConveniosActionPerformed

    private void jb_altConveniosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_altConveniosActionPerformed
        // TODO add your handling code here:
        new SecAlteraConveniosModal(this, rootPaneCheckingEnabled).show();
    }//GEN-LAST:event_jb_altConveniosActionPerformed

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
            java.util.logging.Logger.getLogger(SecConvenios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SecConvenios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SecConvenios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SecConvenios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SecConvenios().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jb_altConvenios;
    private javax.swing.JButton jb_cadConvenios;
    private javax.swing.JButton jb_searchConvenios;
    // End of variables declaration//GEN-END:variables
}