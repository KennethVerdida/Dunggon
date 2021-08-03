/**
 **@author: Verdida, Kenneth Mae
 **@date: March 6, 2020
 **/

import javax.swing.JFrame;

public class DunggonShortTreatmentSchedule extends javax.swing.JFrame {
    PatientInfoClass patient;
    PatientShortTreatmentSched sched;
    private boolean flag = true;
    private String DunggonID;
    
    public DunggonShortTreatmentSchedule() {
        initComponents();
    }
    
    public DunggonShortTreatmentSchedule(PatientInfoClass patient) {
        initComponents();
        this.patient = patient;
    }
    
    public DunggonShortTreatmentSchedule(PatientInfoClass patient, boolean flag, String DunggonID) {
        initComponents();
        this.patient = patient;
        this.DunggonID = DunggonID;
        this.flag = flag;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDay = new javax.swing.JLabel();
        cbDay = new javax.swing.JComboBox<>();
        lblTime = new javax.swing.JLabel();
        cbTime = new javax.swing.JComboBox<>();
        btnProceed = new javax.swing.JButton();
        Min = new javax.swing.JLabel();
        Ex = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDay.setText("Day");
        getContentPane().add(lblDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, 20));

        cbDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", " " }));
        getContentPane().add(cbDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 100, -1));

        lblTime.setText("Time");
        getContentPane().add(lblTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, 20));

        cbTime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8:00-9:00", "9:00-10:00", "10:00-11:00", "1:00-2:00", "2:00-3:00", "3:00-4:00" }));
        getContentPane().add(cbTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 120, -1));

        btnProceed.setText("Proceed");
        btnProceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProceedActionPerformed(evt);
            }
        });
        getContentPane().add(btnProceed, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, -1, -1));

        Min.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Min.setText("  _  ");
        Min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinMouseClicked(evt);
            }
        });
        getContentPane().add(Min, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 2, -1, 30));

        Ex.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Ex.setText("  X");
        Ex.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExMouseClicked(evt);
            }
        });
        getContentPane().add(Ex, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 30, 40));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/26ST.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnProceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProceedActionPerformed
        String day = cbDay.getSelectedItem().toString();
        String time = cbTime.getSelectedItem().toString();
        sched = new PatientShortTreatmentSched(day, time);
        DBHelper db = new DBHelper(sched,"Short");
        if(flag){
            if(db.insertSession(patient)){
                this.setVisible(false);
                new DunggonShortRecord().setVisible(true);
            }
        }else{
           if(db.editRecord(patient,DunggonID)){
                this.setVisible(false);
                new DunggonShortRecord().setVisible(true);                                                            
            }                           
        }
                    
    }//GEN-LAST:event_btnProceedActionPerformed

    private void MinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_MinMouseClicked

    private void ExMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExMouseClicked
        this.setVisible(false);
        new DunggonPatientForm().setVisible(true);       
    }//GEN-LAST:event_ExMouseClicked

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
            java.util.logging.Logger.getLogger(DunggonShortTreatmentSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DunggonShortTreatmentSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DunggonShortTreatmentSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DunggonShortTreatmentSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DunggonShortTreatmentSchedule().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ex;
    private javax.swing.JLabel Min;
    private javax.swing.JLabel background;
    private javax.swing.JButton btnProceed;
    private javax.swing.JComboBox<String> cbDay;
    private javax.swing.JComboBox<String> cbTime;
    private javax.swing.JLabel lblDay;
    private javax.swing.JLabel lblTime;
    // End of variables declaration//GEN-END:variables
}
