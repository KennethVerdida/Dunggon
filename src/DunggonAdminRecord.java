/**
 **@author: Palma, Julieta
 **@date: March 12, 2020
 **/

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DunggonAdminRecord extends javax.swing.JFrame {
    private boolean flag = true;
    private int SessionID;
    private String DunggonID;
    PatientInfoClass patient;
    
    public DunggonAdminRecord() {
        initComponents();
    }
    
    public DunggonAdminRecord(boolean flag,String DunggonID) {
        initComponents();
        this.flag = flag;
        this.DunggonID = DunggonID;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Min = new javax.swing.JLabel();
        Ex = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPatientRecords = new javax.swing.JTable();
        cbViewRec = new javax.swing.JComboBox<>();
        btnBack = new javax.swing.JButton();
        lblSearch = new javax.swing.JLabel();
        tfSearch = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        lblMC = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblCN1 = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblTP = new javax.swing.JLabel();
        tfTP = new javax.swing.JTextField();
        lblPatientInformation = new javax.swing.JLabel();
        lblEmergencyContact = new javax.swing.JLabel();
        lblGuardian = new javax.swing.JLabel();
        tfCN2 = new javax.swing.JTextField();
        lblCN2 = new javax.swing.JLabel();
        tfGuardian = new javax.swing.JTextField();
        lblPrev = new javax.swing.JLabel();
        tfID = new javax.swing.JTextField();
        lblPrev1 = new javax.swing.JLabel();
        tfPrev = new javax.swing.JTextField();
        tfMC = new javax.swing.JTextField();
        tfCN = new javax.swing.JTextField();
        tfGender = new javax.swing.JTextField();
        tfAge = new javax.swing.JTextField();
        tfName = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Min.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Min.setForeground(new java.awt.Color(255, 255, 255));
        Min.setText("  _  ");
        Min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinMouseClicked(evt);
            }
        });
        getContentPane().add(Min, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 0, -1, 30));

        Ex.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Ex.setForeground(new java.awt.Color(255, 255, 255));
        Ex.setText("  X");
        Ex.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExMouseClicked(evt);
            }
        });
        getContentPane().add(Ex, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 0, 30, 30));

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 560, -1, -1));

        jtPatientRecords.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Age", "Gender", "Contact  No.", "Mental Condition", "Previous Hospital ", "Treatment Period", "Guardian", "Contact  No"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtPatientRecords.getTableHeader().setReorderingAllowed(false);
        jtPatientRecords.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtPatientRecordsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtPatientRecords);
        if (jtPatientRecords.getColumnModel().getColumnCount() > 0) {
            jtPatientRecords.getColumnModel().getColumn(0).setResizable(false);
            jtPatientRecords.getColumnModel().getColumn(0).setPreferredWidth(150);
            jtPatientRecords.getColumnModel().getColumn(1).setResizable(false);
            jtPatientRecords.getColumnModel().getColumn(1).setPreferredWidth(300);
            jtPatientRecords.getColumnModel().getColumn(2).setResizable(false);
            jtPatientRecords.getColumnModel().getColumn(2).setPreferredWidth(0);
            jtPatientRecords.getColumnModel().getColumn(3).setResizable(false);
            jtPatientRecords.getColumnModel().getColumn(3).setPreferredWidth(0);
            jtPatientRecords.getColumnModel().getColumn(4).setResizable(false);
            jtPatientRecords.getColumnModel().getColumn(4).setPreferredWidth(0);
            jtPatientRecords.getColumnModel().getColumn(5).setResizable(false);
            jtPatientRecords.getColumnModel().getColumn(5).setPreferredWidth(10);
            jtPatientRecords.getColumnModel().getColumn(6).setResizable(false);
            jtPatientRecords.getColumnModel().getColumn(6).setPreferredWidth(0);
            jtPatientRecords.getColumnModel().getColumn(7).setResizable(false);
            jtPatientRecords.getColumnModel().getColumn(7).setPreferredWidth(0);
            jtPatientRecords.getColumnModel().getColumn(8).setResizable(false);
            jtPatientRecords.getColumnModel().getColumn(8).setPreferredWidth(0);
            jtPatientRecords.getColumnModel().getColumn(9).setResizable(false);
            jtPatientRecords.getColumnModel().getColumn(9).setPreferredWidth(0);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 630, 330));

        cbViewRec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "View Records", "Short-Treatment Session", "Long-Treatment Session" }));
        cbViewRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbViewRecActionPerformed(evt);
            }
        });
        getContentPane().add(cbViewRec, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 180, -1));

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 570, 80, -1));

        lblSearch.setText("Search Full Name");
        getContentPane().add(lblSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 110, 40));

        tfSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSearchActionPerformed(evt);
            }
        });
        getContentPane().add(tfSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, 240, -1));

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 560, 70, -1));

        lblName.setText("Name");
        getContentPane().add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 240, 110, 20));

        lblID.setText("ID :");
        getContentPane().add(lblID, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 210, 110, 20));

        lblMC.setText("Mental Condition");
        getContentPane().add(lblMC, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 360, 110, 20));

        lblAge.setText("Age");
        getContentPane().add(lblAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 270, 110, 20));

        lblCN1.setText("Contact No.");
        getContentPane().add(lblCN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 330, 110, 20));

        lblGender.setText("Gender");
        getContentPane().add(lblGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 300, 110, 20));

        lblTP.setText("Treatment Period");
        getContentPane().add(lblTP, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 440, 110, 20));
        getContentPane().add(tfTP, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 440, 300, -1));

        lblPatientInformation.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPatientInformation.setText("PATIENT INFORMATION");
        getContentPane().add(lblPatientInformation, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 180, -1, -1));

        lblEmergencyContact.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblEmergencyContact.setText("EMERGENCY CONTACT");
        getContentPane().add(lblEmergencyContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 460, -1, 40));

        lblGuardian.setText("Guardian");
        getContentPane().add(lblGuardian, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 500, 110, 20));
        getContentPane().add(tfCN2, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 530, 300, -1));

        lblCN2.setText("Contact No.");
        getContentPane().add(lblCN2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 530, 110, 20));
        getContentPane().add(tfGuardian, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 500, 300, -1));

        lblPrev.setText("Previous Hospital ");
        getContentPane().add(lblPrev, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 390, 110, 20));
        getContentPane().add(tfID, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 210, 300, -1));

        lblPrev1.setText("Confinement");
        getContentPane().add(lblPrev1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 410, -1, 20));
        getContentPane().add(tfPrev, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 390, 300, -1));
        getContentPane().add(tfMC, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 360, 300, -1));
        getContentPane().add(tfCN, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 330, 300, -1));
        getContentPane().add(tfGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 300, 300, -1));
        getContentPane().add(tfAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 270, 300, -1));
        getContentPane().add(tfName, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 240, 300, -1));

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 560, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/37DPRC.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_MinMouseClicked

    private void ExMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExMouseClicked
        int response =  JOptionPane.showConfirmDialog(null, "Are you sure you want exit?", "Confirm",
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                        switch (response) {
                            case JOptionPane.NO_OPTION:
                                System.out.println("No button clicked");
                                this.setVisible(false);
                                new DunggonAdminRecord().setVisible(true);
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

    private void cbViewRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbViewRecActionPerformed
        DefaultTableModel table = (DefaultTableModel)jtPatientRecords.getModel();
        String appointment = cbViewRec.getSelectedItem().toString();
        if(appointment.equals("Short-Treatment Session")){
            DBHelper db = new DBHelper("Short");
            db.showPatientRecords(table);
        }else if(appointment.equals("Long-Treatment Session")){
            DBHelper db = new DBHelper("Long");
            db.showPatientRecords(table);
        }else{
            DBHelper db = new DBHelper();
             db.showPatientRecords(table);
        }
    }//GEN-LAST:event_cbViewRecActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.setVisible(false);
        new DunggonAdmin().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void tfSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSearchActionPerformed
        DBHelper db = new DBHelper();
        String name = tfSearch.getText();
        String appointment = cbViewRec.getSelectedItem().toString();
        if(!db.searchPatient(name,appointment)){
            JOptionPane.showMessageDialog(null, "Patient not found.");
        }
    }//GEN-LAST:event_tfSearchActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        DefaultTableModel table = (DefaultTableModel)jtPatientRecords.getModel(); 
        String appointment = cbViewRec.getSelectedItem().toString();
        
        try{
            int row = jtPatientRecords.getSelectedRow();
            int column = 0;
//            JOptionPane.showMessageDialog(null,row);
            DunggonID = table.getValueAt(row,column).toString();
            if(appointment.equals("Short-Treatment Session")){
                DBHelper db = new DBHelper("Short");
                db.showPatientRecords(table);
                 int response = JOptionPane.showConfirmDialog(null, "Are you sure you want delete this patient?", "Confirm Deletion",
                                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                            switch (response) {
                                case JOptionPane.NO_OPTION:
                                System.out.println("No button clicked");
//                                this.setVisible(false);
//                                new DunggonAdminRecord().setVisible(true);
                                break;
                                case JOptionPane.YES_OPTION:
                                System.out.println("Yes button clicked");
                                db.deleteRecord(DunggonID);
                                db.showPatientRecords(table);
//                                this.setVisible(false);
//                                new DunggonAdminRecord().setVisible(true);
                                break;
                                case JOptionPane.CLOSED_OPTION:
                                System.out.println("JOptionPane closed");
                                break;
                                default:
                                break;
                            }
            }else{
                DBHelper db = new DBHelper("Long");
                db.showPatientRecords(table);
                int response = JOptionPane.showConfirmDialog(null, "Are you sure you want delete this patient?", "Confirm Deletion",
                                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                            switch (response) {
                                case JOptionPane.NO_OPTION:
                                System.out.println("No button clicked");
//                                this.setVisible(false);
//                                new DunggonAdminRecord().setVisible(true);
                                break;
                                case JOptionPane.YES_OPTION:
                                System.out.println("Yes button clicked");
                               DunggonID = table.getValueAt(row,column).toString();
                                db.deleteRecord(DunggonID);
                                db.showPatientRecords(table);
//                                this.setVisible(false);
//                                new DunggonAdminRecord().setVisible(true);
                                break;
                                case JOptionPane.CLOSED_OPTION:
                                System.out.println("JOptionPane closed");
                                break;
                                default:
                                break;
                            }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Select a patient you want to delete.");
        }   
    }//GEN-LAST:event_btnDeleteActionPerformed
  
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        DefaultTableModel table = (DefaultTableModel)jtPatientRecords.getModel();
        String appointment = cbViewRec.getSelectedItem().toString();
        if(appointment.equals("Short-Treatment Session")){
            int response =  JOptionPane.showConfirmDialog(null, "Do you want to add a new patient?", "Confirmation",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            switch (response) {
                case JOptionPane.NO_OPTION:
                System.out.println("No button clicked");
//                this.setVisible(false);
//                new DunggonAdminRecord().setVisible(true);
                break;
                case JOptionPane.YES_OPTION:
                System.out.println("Yes button clicked");
                this.setVisible(false);
                new DunggonAdminPatientForm().setVisible(true);
                break;
                case JOptionPane.CLOSED_OPTION:
                System.out.println("JOptionPane closed");
                break;
                default:
                break;
            }
        }else{
            int response =  JOptionPane.showConfirmDialog(null, "Do you want to add a new patient?", "Confirmation",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            switch (response) {
                case JOptionPane.NO_OPTION:
                System.out.println("No button clicked");
//                this.setVisible(false);
//                new DunggonAdminRecord().setVisible(true);
                break;
                case JOptionPane.YES_OPTION:
                System.out.println("Yes button clicked");
                this.setVisible(false);
                new DunggonAdminPatientForm().setVisible(true);
                break;
                case JOptionPane.CLOSED_OPTION:
                System.out.println("JOptionPane closed");
                break;
                default:
                break;
            }
        }      
    }//GEN-LAST:event_btnAddActionPerformed

    private void jtPatientRecordsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtPatientRecordsMouseClicked
        DefaultTableModel table = (DefaultTableModel)jtPatientRecords.getModel();
        int row = jtPatientRecords.getSelectedRow();    
        tfID.setEditable(false);
        tfName.setEditable(false);
        tfGender.setEditable(false);
        tfCN.setEditable(false);
        tfPrev.setEditable(false);
        tfTP.setEditable(false);

        
        tfID.setText(table.getValueAt(row,0).toString()); 
        tfName.setText(table.getValueAt(row,1).toString());  
        tfAge.setText(table.getValueAt(row,2).toString());
        tfGender.setText(table.getValueAt(row,3).toString());
        tfCN.setText(table.getValueAt(row,4).toString());        
        tfMC.setText(table.getValueAt(row,5).toString());
        tfPrev.setText(table.getValueAt(row,6).toString());
        tfTP.setText(table.getValueAt(row,7).toString());
        tfGuardian.setText(table.getValueAt(row,8).toString());
        tfCN2.setText(table.getValueAt(row,9).toString());
    }//GEN-LAST:event_jtPatientRecordsMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        DefaultTableModel table = (DefaultTableModel)jtPatientRecords.getModel();
        String appointment = cbViewRec.getSelectedItem().toString();
        boolean flag = false;
        try{
            int row = jtPatientRecords.getSelectedRow();  
            int column = 0;
            DunggonID = table.getValueAt(row,column).toString();
            
            if(appointment.equals("Short-Treatment Session")){
                DBHelper db = new DBHelper("Short");    
                String age = tfAge.getText();
                String medicalCon = tfMC.getText();
                String guardian = tfGuardian.getText();
                String contactNum2 = tfCN2.getText();   
                patient = new PatientInfoClass( age,  medicalCon, guardian,  contactNum2);

                db.editPatientRecord(patient,DunggonID);
                JOptionPane.showMessageDialog(null, "Update Successful");
                db.showPatientRecords(table);
//              this.setVisible(false);
//              new DunggonAdminRecord(flag,DunggonID).setVisible(true);
            }else if(appointment.equals("Long-Treatment Session")){
                DBHelper db = new DBHelper("Long");    
                String age = tfAge.getText();
                String medicalCon = tfMC.getText();
                String guardian = tfGuardian.getText();
                String contactNum2 = tfCN2.getText();   
                patient = new PatientInfoClass( age,  medicalCon, guardian,  contactNum2);

                db.editPatientRecord(patient,DunggonID);
                JOptionPane.showMessageDialog(null, "Update Successful");
                db.showPatientRecords(table);
//                this.setVisible(false);
//                new DunggonAdminRecord(flag,DunggonID).setVisible(true);     
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Select a patient you want to edit.");
        }
       
      
       
       
        
       
        
    }//GEN-LAST:event_btnUpdateActionPerformed

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
            java.util.logging.Logger.getLogger(DunggonAdminRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DunggonAdminRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DunggonAdminRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DunggonAdminRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DunggonAdminRecord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ex;
    private javax.swing.JLabel Min;
    private javax.swing.JLabel background;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbViewRec;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtPatientRecords;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblCN1;
    private javax.swing.JLabel lblCN2;
    private javax.swing.JLabel lblEmergencyContact;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblGuardian;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblMC;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPatientInformation;
    private javax.swing.JLabel lblPrev;
    private javax.swing.JLabel lblPrev1;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JLabel lblTP;
    private javax.swing.JTextField tfAge;
    private javax.swing.JTextField tfCN;
    private javax.swing.JTextField tfCN2;
    private javax.swing.JTextField tfGender;
    private javax.swing.JTextField tfGuardian;
    private javax.swing.JTextField tfID;
    private javax.swing.JTextField tfMC;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfPrev;
    private javax.swing.JTextField tfSearch;
    private javax.swing.JTextField tfTP;
    // End of variables declaration//GEN-END:variables
}
