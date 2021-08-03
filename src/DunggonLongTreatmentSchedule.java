/**
 **@author: Verdida, Kenneth Mae
 **@date: March 6, 2020
 **/

import javax.swing.JFrame;

public class DunggonLongTreatmentSchedule extends javax.swing.JFrame {
    PatientInfoClass patient;
    PatientLongTreatmentSched sched;
    private boolean flag = true;
    private String DunggonID;

    public DunggonLongTreatmentSchedule() {
        initComponents();
    }
    
    public DunggonLongTreatmentSchedule(PatientInfoClass patient) {
        initComponents();
        this.patient = patient;
    }
    
    public DunggonLongTreatmentSchedule(PatientInfoClass patient, boolean flag, String DunggonID) {
        initComponents();
        this.patient = patient;
        this.DunggonID = DunggonID;
        this.flag = flag;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblStart = new javax.swing.JLabel();
        lblEnd = new javax.swing.JLabel();
        tfStart = new javax.swing.JTextField();
        tfEnd = new javax.swing.JTextField();
        btnProceed = new javax.swing.JButton();
        Ex = new javax.swing.JLabel();
        Min = new javax.swing.JLabel();
        lblPError = new javax.swing.JLabel();
        lblUError = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblStart.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblStart.setText("Start Session");
        getContentPane().add(lblStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        lblEnd.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblEnd.setText("End Session");
        getContentPane().add(lblEnd, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        tfStart.setText("mm/dd/yyyy");
        tfStart.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfStartFocusGained(evt);
            }
        });
        getContentPane().add(tfStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 207, -1));

        tfEnd.setText("mm/dd/yyyy");
        tfEnd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfEndFocusGained(evt);
            }
        });
        getContentPane().add(tfEnd, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 207, -1));

        btnProceed.setText("Proceed");
        btnProceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProceedActionPerformed(evt);
            }
        });
        getContentPane().add(btnProceed, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, -1, -1));

        Ex.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Ex.setText("  X");
        Ex.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExMouseClicked(evt);
            }
        });
        getContentPane().add(Ex, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 30, 40));

        Min.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Min.setText("  _  ");
        Min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinMouseClicked(evt);
            }
        });
        getContentPane().add(Min, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, -1, 30));

        lblPError.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblPError.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lblPError, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 30, 20));

        lblUError.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblUError.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lblUError, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 30, 20));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/27LT.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfStartFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfStartFocusGained
        if(tfStart.getText().equals("mm/dd/yyyy")){
            tfStart.setText(" ");
        }
    }//GEN-LAST:event_tfStartFocusGained

    private void tfEndFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfEndFocusGained
        if(tfEnd.getText().equals("mm/dd/yyyy")){
            tfEnd.setText(" ");
        }
    }//GEN-LAST:event_tfEndFocusGained

    private void btnProceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProceedActionPerformed
        PatientLongTreatmentSched pat;
        String start = tfStart.getText();
        String end = tfEnd.getText();
        
        pat = new PatientLongTreatmentSched(start, end);
        
        if(start.trim().isEmpty() && end. trim().isEmpty()){
            lblUError.setText(" *");
            lblPError.setText(" *");
        }else if(start.trim().isEmpty()){
            lblUError.setText(" *");
        }else if(end.equals("mm/dd/yyyy")){
            lblPError.setText(" *");
        }else if(end.trim().isEmpty()){
            lblPError.setText(" *");
        }else{        
            sched = new PatientLongTreatmentSched(start, end);
            DBHelper db = new DBHelper(sched,"Long");
            if(flag){
                if(db.insertSession(patient)){
                    this.setVisible(false);
                    new DunggonLongRecord().setVisible(true);
                }
            }else{
               if(db.editRecord(patient,DunggonID)){
                    this.setVisible(false);
                    new DunggonLongRecord().setVisible(true);                                                               
                }
            } 
        }   
        
    }//GEN-LAST:event_btnProceedActionPerformed

    private void ExMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExMouseClicked
        this.setVisible(false);
        new DunggonPatientForm().setVisible(true);  
    }//GEN-LAST:event_ExMouseClicked

    private void MinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_MinMouseClicked

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
            java.util.logging.Logger.getLogger(DunggonLongTreatmentSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DunggonLongTreatmentSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DunggonLongTreatmentSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DunggonLongTreatmentSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DunggonLongTreatmentSchedule().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ex;
    private javax.swing.JLabel Min;
    private javax.swing.JLabel background;
    private javax.swing.JButton btnProceed;
    private javax.swing.JLabel lblEnd;
    private javax.swing.JLabel lblPError;
    private javax.swing.JLabel lblStart;
    private javax.swing.JLabel lblUError;
    private javax.swing.JTextField tfEnd;
    private javax.swing.JTextField tfStart;
    // End of variables declaration//GEN-END:variables
}
