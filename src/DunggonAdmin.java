/**
 **@author: Palma, Julieta
 **@date: March 7, 2020
 **/

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class DunggonAdmin extends javax.swing.JFrame {
    
    public DunggonAdmin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblbLogout = new javax.swing.JLabel();
        lblbCheckPatient = new javax.swing.JLabel();
        Min = new javax.swing.JLabel();
        Ex = new javax.swing.JLabel();
        baclground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblbLogout.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblbLogout.setForeground(new java.awt.Color(255, 255, 255));
        lblbLogout.setText(" Log Out ");
        lblbLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblbLogoutMouseClicked(evt);
            }
        });
        getContentPane().add(lblbLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(638, 10, 60, -1));

        lblbCheckPatient.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblbCheckPatient.setText("Check Patient");
        lblbCheckPatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblbCheckPatientMouseClicked(evt);
            }
        });
        getContentPane().add(lblbCheckPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 452, -1, 30));

        Min.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Min.setForeground(new java.awt.Color(255, 255, 255));
        Min.setText("  _  ");
        Min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinMouseClicked(evt);
            }
        });
        getContentPane().add(Min, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 0, -1, 30));

        Ex.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Ex.setForeground(new java.awt.Color(255, 255, 255));
        Ex.setText("  X");
        Ex.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExMouseClicked(evt);
            }
        });
        getContentPane().add(Ex, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 2, 30, 30));

        baclground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/31DAD.jpg"))); // NOI18N
        getContentPane().add(baclground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblbLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblbLogoutMouseClicked
        this.setVisible(false);
        new DunggonMenu().setVisible(true);
    }//GEN-LAST:event_lblbLogoutMouseClicked

    private void MinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_MinMouseClicked

    private void ExMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExMouseClicked
        int response =  JOptionPane.showConfirmDialog(null, "Are you sure you want exit?", "Leave?",
                        JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                        switch (response) {
                            case JOptionPane.NO_OPTION:
                                System.out.println("No button clicked");
                                this.setVisible(false);
                                new DunggonAdmin().setVisible(true);
                                break;
                            case JOptionPane.YES_OPTION:
                                System.out.println("Yes button clicked");
                                System.exit(0);
                                break;
                            case JOptionPane.CLOSED_OPTION:
                                System.out.println("JOptionPane closed");
                                break;
                            default:
                                break;
                        }
    }//GEN-LAST:event_ExMouseClicked

    private void lblbCheckPatientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblbCheckPatientMouseClicked
        this.setVisible(false);
        new DunggonAdminRecord().setVisible(true);
    }//GEN-LAST:event_lblbCheckPatientMouseClicked

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
            java.util.logging.Logger.getLogger(DunggonAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DunggonAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DunggonAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DunggonAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DunggonAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ex;
    private javax.swing.JLabel Min;
    private javax.swing.JLabel baclground;
    private javax.swing.JLabel lblbCheckPatient;
    private javax.swing.JLabel lblbLogout;
    // End of variables declaration//GEN-END:variables
}
