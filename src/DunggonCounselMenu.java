/**
 **@author: Verdida, Kenneth Mae
 **@date: February 19, 2020
 **/

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class DunggonCounselMenu extends javax.swing.JFrame {
    int account;
    public DunggonCounselMenu() {
        initComponents();
    }
    
    public DunggonCounselMenu(int account){
        initComponents();
        this.account = account;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblbLogout = new javax.swing.JLabel();
        Min = new javax.swing.JLabel();
        Ex = new javax.swing.JLabel();
        lblST = new javax.swing.JLabel();
        STA = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

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
        getContentPane().add(lblbLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, -1, -1));

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

        lblST.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblST.setText("Treatment Reservation");
        lblST.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSTMouseClicked(evt);
            }
        });
        getContentPane().add(lblST, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, -1, -1));

        STA.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        STA.setText(" Check Appointment");
        STA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                STAMouseClicked(evt);
            }
        });
        getContentPane().add(STA, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, 180, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/24DBM.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblSTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSTMouseClicked
        this.setVisible(false);
        new DunggonPatientForm().setVisible(true);
    }//GEN-LAST:event_lblSTMouseClicked

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
                                new DunggonCounselMenu().setVisible(true);
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

    private void lblbLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblbLogoutMouseClicked
        this.setVisible(false);
        new DunggonMenu().setVisible(true);
    }//GEN-LAST:event_lblbLogoutMouseClicked

    private void STAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_STAMouseClicked
        this.setVisible(false);
        new DunggonCheckAppointment().setVisible(true);
    }//GEN-LAST:event_STAMouseClicked

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
            java.util.logging.Logger.getLogger(DunggonCounselMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DunggonCounselMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DunggonCounselMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DunggonCounselMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DunggonCounselMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ex;
    private javax.swing.JLabel Min;
    private javax.swing.JLabel STA;
    private javax.swing.JLabel background;
    private javax.swing.JLabel lblST;
    private javax.swing.JLabel lblbLogout;
    // End of variables declaration//GEN-END:variables
}
