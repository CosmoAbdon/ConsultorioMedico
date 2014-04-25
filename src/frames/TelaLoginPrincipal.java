/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;
/**
 *
 * @author zEveerY
 */
public class TelaLoginPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaLoginPrincipal
     */
    public TelaLoginPrincipal() {
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

        jPanel1 = new javax.swing.JPanel();
        jb_admin = new javax.swing.JButton();
        jb_med = new javax.swing.JButton();
        jb_sec = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Redirecionamento de Login");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jb_admin.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jb_admin.setText("Administrador");
        jb_admin.setToolTipText("");
        jb_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_adminActionPerformed(evt);
            }
        });
        jPanel1.add(jb_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 670, 80));

        jb_med.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jb_med.setText("Médico");
        jb_med.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_medActionPerformed(evt);
            }
        });
        jPanel1.add(jb_med, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 670, 80));

        jb_sec.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jb_sec.setText("Secretária");
        jb_sec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_secActionPerformed(evt);
            }
        });
        jPanel1.add(jb_sec, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 670, 80));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Gerenciamento de Login");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(195, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(185, 185, 185))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 670, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-686)/2, (screenSize.height-389)/2, 686, 389);
    }// </editor-fold>//GEN-END:initComponents

    private void jb_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_adminActionPerformed
        // TODO add your handling code here:
        hide();
        new LoginActivityAdmin().show();
    }//GEN-LAST:event_jb_adminActionPerformed

    private void jb_medActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_medActionPerformed
        // TODO add your handling code here:
        hide();
        new LoginActivityMedico().show();
    }//GEN-LAST:event_jb_medActionPerformed

    private void jb_secActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_secActionPerformed
        // TODO add your handling code here:
        hide();
        new LoginActivitySecretaria().show();
        
    }//GEN-LAST:event_jb_secActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLoginPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLoginPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLoginPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLoginPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLoginPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jb_admin;
    private javax.swing.JButton jb_med;
    private javax.swing.JButton jb_sec;
    // End of variables declaration//GEN-END:variables
}
