/**
 **@author: Verdida, Kenneth Mae
 **@date: March 13, 2020
 **/

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DunggonPatientForm extends javax.swing.JFrame {
    private boolean flag = true;
    private DefaultTableModel table;
    private int row;
    private String DunggonID;
    
    public DunggonPatientForm() {
        initComponents();
        ButtonGroup btng = new ButtonGroup();
        btng.add(rdMale);
        btng.add(rdFemale);
        rdMale.setSelected(true);
       
    }
       
    public DunggonPatientForm(boolean flag,String DunggonID){
        initComponents();
        ButtonGroup btng = new ButtonGroup();
        btng.add(rdMale);
        btng.add(rdFemale);
        rdMale.setSelected(true);
        this.flag = flag;
        this.DunggonID = DunggonID;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.ButtonGroup();
        bg1 = new javax.swing.ButtonGroup();
        rdMale = new javax.swing.JRadioButton();
        rdFemale = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        lblEmergencyContact = new javax.swing.JLabel();
        lblGuardian = new javax.swing.JLabel();
        lblContactNumber2 = new javax.swing.JLabel();
        lblemail2 = new javax.swing.JLabel();
        lblPHC = new javax.swing.JLabel();
        lblMC = new javax.swing.JLabel();
        tfMC = new javax.swing.JTextField();
        tfPHC = new javax.swing.JTextField();
        lblHistory = new javax.swing.JLabel();
        lblEmail1 = new javax.swing.JLabel();
        lblContactNumber1 = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        tfAge = new javax.swing.JTextField();
        lblBirthday = new javax.swing.JLabel();
        tfAddress = new javax.swing.JTextField();
        btnCancel = new javax.swing.JButton();
        lblPatientInformation = new javax.swing.JLabel();
        tfOcc = new javax.swing.JTextField();
        tfContactNumber1 = new javax.swing.JTextField();
        tfEmail1 = new javax.swing.JTextField();
        lblGender = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        cbStatus = new javax.swing.JComboBox<>();
        tfLname = new javax.swing.JTextField();
        lblLname = new javax.swing.JLabel();
        tfMname = new javax.swing.JTextField();
        lblMname = new javax.swing.JLabel();
        tfFname = new javax.swing.JTextField();
        lblFname = new javax.swing.JLabel();
        Min = new javax.swing.JLabel();
        Ex = new javax.swing.JLabel();
        tfEmail2 = new javax.swing.JTextField();
        tfGuardian = new javax.swing.JTextField();
        tfContactNumber2 = new javax.swing.JTextField();
        tfBday = new javax.swing.JTextField();
        lblPError = new javax.swing.JLabel();
        btnShortSched = new javax.swing.JButton();
        btnLongSched = new javax.swing.JButton();
        lblPError8 = new javax.swing.JLabel();
        lblPError1 = new javax.swing.JLabel();
        lblPError2 = new javax.swing.JLabel();
        lblPError3 = new javax.swing.JLabel();
        lblPError4 = new javax.swing.JLabel();
        lblPError6 = new javax.swing.JLabel();
        lblPError7 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.add(rdMale);
        rdMale.setText("Male");
        getContentPane().add(rdMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 280, -1, -1));

        bg.add(rdFemale);
        rdFemale.setText("Female");
        getContentPane().add(rdFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 280, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("      SET A SCHEDULE");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 530, 170, 30));

        lblEmergencyContact.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblEmergencyContact.setText("EMERGENCY CONTACT");
        getContentPane().add(lblEmergencyContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 530, -1, 30));

        lblGuardian.setText("Guardian");
        getContentPane().add(lblGuardian, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 570, -1, 20));

        lblContactNumber2.setText("Contact Number");
        getContentPane().add(lblContactNumber2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 600, -1, 20));

        lblemail2.setText("Email");
        getContentPane().add(lblemail2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 630, -1, 20));

        lblPHC.setText("Previous Hospital Confinement ");
        getContentPane().add(lblPHC, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 500, -1, 20));

        lblMC.setText("Mental Condition");
        getContentPane().add(lblMC, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 460, -1, 40));
        getContentPane().add(tfMC, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 470, 370, -1));
        getContentPane().add(tfPHC, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 500, 370, -1));

        lblHistory.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblHistory.setText("HISTORY");
        getContentPane().add(lblHistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, -1, 30));

        lblEmail1.setText("Email");
        getContentPane().add(lblEmail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, 120, 20));

        lblContactNumber1.setText("Contact Number");
        getContentPane().add(lblContactNumber1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 110, 22));

        lblEmail.setText("Occupation");
        getContentPane().add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 110, 20));

        lblAddress.setText("Address");
        getContentPane().add(lblAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, 120, 20));

        lblAge.setText("Age");
        getContentPane().add(lblAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 280, 30, 20));

        tfAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfAgeKeyTyped(evt);
            }
        });
        getContentPane().add(tfAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 34, -1));

        lblBirthday.setText("Birthday");
        getContentPane().add(lblBirthday, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, -1, 20));
        getContentPane().add(tfAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, 490, -1));

        btnCancel.setText("Back");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 700, 79, -1));

        lblPatientInformation.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPatientInformation.setText("PATIENT INFORMATION");
        getContentPane().add(lblPatientInformation, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 187, -1, 30));
        getContentPane().add(tfOcc, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 257, -1));
        getContentPane().add(tfContactNumber1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 257, -1));
        getContentPane().add(tfEmail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 257, -1));

        lblGender.setText("Gender");
        getContentPane().add(lblGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, 50, 20));

        lblStatus.setText("Status");
        getContentPane().add(lblStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 320, -1, 20));

        cbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Married", "Widowed", "Divorced", "Separated" }));
        getContentPane().add(cbStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 320, -1, -1));
        getContentPane().add(tfLname, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, 190, -1));

        lblLname.setText("Last Name");
        getContentPane().add(lblLname, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 220, -1, -1));
        getContentPane().add(tfMname, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 190, -1));

        lblMname.setText("Middle Name");
        getContentPane().add(lblMname, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, -1, -1));
        getContentPane().add(tfFname, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 190, -1));

        lblFname.setText("First Name");
        getContentPane().add(lblFname, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, -1, -1));

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
        getContentPane().add(tfEmail2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 630, 260, -1));
        getContentPane().add(tfGuardian, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 570, 260, -1));
        getContentPane().add(tfContactNumber2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 600, 260, -1));

        tfBday.setText("mm/dd/yyyy");
        tfBday.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfBdayFocusGained(evt);
            }
        });
        getContentPane().add(tfBday, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 190, -1));

        lblPError.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPError.setForeground(new java.awt.Color(255, 0, 0));
        lblPError.setText(" *");
        getContentPane().add(lblPError, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 210, 50, 30));

        btnShortSched.setIcon(new javax.swing.ImageIcon(getClass().getResource("/0BTNS.png"))); // NOI18N
        btnShortSched.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShortSchedActionPerformed(evt);
            }
        });
        getContentPane().add(btnShortSched, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 570, 170, -1));

        btnLongSched.setIcon(new javax.swing.ImageIcon(getClass().getResource("/0BTNL.jpg"))); // NOI18N
        btnLongSched.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLongSchedActionPerformed(evt);
            }
        });
        getContentPane().add(btnLongSched, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 610, 170, -1));

        lblPError8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPError8.setForeground(new java.awt.Color(255, 0, 0));
        lblPError8.setText(" *");
        getContentPane().add(lblPError8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 50, 30));

        lblPError1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPError1.setForeground(new java.awt.Color(255, 0, 0));
        lblPError1.setText("  *");
        getContentPane().add(lblPError1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 600, 60, 20));

        lblPError2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPError2.setForeground(new java.awt.Color(255, 0, 0));
        lblPError2.setText(" *");
        getContentPane().add(lblPError2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, 50, 30));

        lblPError3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPError3.setForeground(new java.awt.Color(255, 0, 0));
        lblPError3.setText("  *");
        getContentPane().add(lblPError3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 50, 20));

        lblPError4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPError4.setForeground(new java.awt.Color(255, 0, 0));
        lblPError4.setText("  *");
        getContentPane().add(lblPError4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 60, 20));

        lblPError6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPError6.setForeground(new java.awt.Color(255, 0, 0));
        lblPError6.setText("  *");
        getContentPane().add(lblPError6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 570, 60, 20));

        lblPError7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPError7.setForeground(new java.awt.Color(255, 0, 0));
        lblPError7.setText("  *");
        getContentPane().add(lblPError7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 470, 60, 20));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/25DPF.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        if(flag){
            this.setVisible(false);
            new DunggonCounselMenu().setVisible(true);
        }else{
            this.setVisible(false);
            new DunggonShortRecord().setVisible(true);
        }         
    }//GEN-LAST:event_btnCancelActionPerformed

    private void MinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_MinMouseClicked

    private void ExMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExMouseClicked
       int response =  JOptionPane.showConfirmDialog(null, "You haven't finished your booking yet. Do you want to leave without finishing?", "Leave?",
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                        switch (response) {
                            case JOptionPane.NO_OPTION:
                                System.out.println("No button clicked");
                                this.setVisible(false);
                                new DunggonPatientForm().setVisible(true);
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

    private void tfBdayFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfBdayFocusGained
        if(tfBday.getText().equals("mm/dd/yyyy")){
            tfBday.setText("");
        }
    }//GEN-LAST:event_tfBdayFocusGained

    private void btnShortSchedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShortSchedActionPerformed
        PatientInfoClass patient;
        String fname = tfFname.getText();
        String mname = tfMname.getText();
        String lname = tfLname.getText();
        String age = tfAge.getText();       
        String bday = tfBday.getText();
        String gender = "Male";
        if(rdFemale.isSelected()){
            gender = "Female";
        }
        String occupation = tfOcc.getText();
        String status = cbStatus.getSelectedItem().toString();
        String add = tfAddress.getText();
        String contactNum1 = tfContactNumber1.getText();
        String email1 = tfEmail1.getText();
        String medicalCon = tfMC.getText();
        String hospital = tfPHC.getText();
        String guardian = tfGuardian.getText();
        String contactNum2 = tfContactNumber2.getText();
        String email2 = tfEmail2.getText();
       
        patient = new PatientInfoClass(fname, mname, lname, age, bday, gender, occupation, status, add, contactNum1, email1, medicalCon, hospital, guardian, contactNum2, email2);
        if(patient.getFname().trim().isEmpty() && patient.getMname().trim().isEmpty() && patient.getLname().trim().isEmpty() && patient.getContactNum1().trim().isEmpty()
            && patient.getAge().trim().isEmpty() && patient.getMedicalCon().trim().isEmpty()&& patient.getGuardian().trim().isEmpty()
                && patient.getContactNum2().trim().isEmpty()){
            tfFname.setBorder(BorderFactory.createLineBorder(Color.RED)); 
            tfMname.setBorder(BorderFactory.createLineBorder(Color.RED));   
            tfLname.setBorder(BorderFactory.createLineBorder(Color.RED));
            tfAge.setBorder(BorderFactory.createLineBorder(Color.RED));
            tfContactNumber1.setBorder(BorderFactory.createLineBorder(Color.RED));
            tfMC.setBorder(BorderFactory.createLineBorder(Color.RED)); 
            tfGuardian.setBorder(BorderFactory.createLineBorder(Color.RED)); 
            tfContactNumber2.setBorder(BorderFactory.createLineBorder(Color.RED)); 
        }else if(patient.getFname().trim().isEmpty()){
            tfFname.setBorder(BorderFactory.createLineBorder(Color.RED));
        }else if(patient.getMname().trim().isEmpty()){
            tfMname.setBorder(BorderFactory.createLineBorder(Color.RED));   
        }else if(patient.getLname().trim().isEmpty()){
            tfLname.setBorder(BorderFactory.createLineBorder(Color.RED));
        }else if(patient.getAge().trim().isEmpty()){
             tfAge.setBorder(BorderFactory.createLineBorder(Color.RED));
        }else if(patient.getBday().equals("mm/dd/yyyy")){
            tfBday.setText("");
        }else if(patient.getContactNum1().trim().isEmpty()){
            tfContactNumber1.setBorder(BorderFactory.createLineBorder(Color.RED));
        }else if(patient.getMedicalCon().trim().isEmpty()){
            tfMC.setBorder(BorderFactory.createLineBorder(Color.RED)); 
        }else if(patient.getGuardian().trim().isEmpty()){
            tfGuardian.setBorder(BorderFactory.createLineBorder(Color.RED)); 
        }else if(patient.getContactNum2().trim().isEmpty()){
            tfContactNumber2.setBorder(BorderFactory.createLineBorder(Color.RED)); 
        }else{
            this.setVisible(false);
            if(flag){  
                new DunggonShortTreatmentSchedule(patient).setVisible(true);
            }else{
                new DunggonShortTreatmentSchedule(patient,flag,DunggonID).setVisible(true);      
            }
        }     
    }//GEN-LAST:event_btnShortSchedActionPerformed

    private void btnLongSchedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLongSchedActionPerformed
        PatientInfoClass patient;
        String fname = tfFname.getText();
        String mname = tfMname.getText();
        String lname = tfLname.getText();
        String age = tfAge.getText();       
        String bday = tfBday.getText();
        String gender = "Male";
        if(rdFemale.isSelected()){
            gender = "Female";
        }
        String occupation = tfOcc.getText();
        String status = cbStatus.getSelectedItem().toString();
        String add = tfAddress.getText();
        String contactNum1 = tfContactNumber1.getText();
        String email1 = tfEmail1.getText();
        String medicalCon = tfMC.getText();
        String hospital = tfPHC.getText();
        String guardian = tfGuardian.getText();
        String contactNum2 = tfContactNumber2.getText();
        String email2 = tfEmail2.getText();
       
        patient = new PatientInfoClass(fname, mname, lname, age, bday, gender, occupation, status, add, contactNum1, email1, medicalCon, hospital, guardian, contactNum2, email2);
        if(patient.getFname().trim().isEmpty() && patient.getMname().trim().isEmpty() && patient.getLname().trim().isEmpty() && patient.getContactNum1().trim().isEmpty()
            && patient.getAge().trim().isEmpty() && patient.getMedicalCon().trim().isEmpty()&& patient.getGuardian().trim().isEmpty()
                && patient.getContactNum2().trim().isEmpty()){
            tfFname.setBorder(BorderFactory.createLineBorder(Color.RED)); 
            tfMname.setBorder(BorderFactory.createLineBorder(Color.RED));   
            tfLname.setBorder(BorderFactory.createLineBorder(Color.RED));
            tfAge.setBorder(BorderFactory.createLineBorder(Color.RED));
            tfContactNumber1.setBorder(BorderFactory.createLineBorder(Color.RED));
            tfMC.setBorder(BorderFactory.createLineBorder(Color.RED)); 
            tfGuardian.setBorder(BorderFactory.createLineBorder(Color.RED)); 
            tfContactNumber2.setBorder(BorderFactory.createLineBorder(Color.RED)); 
        }else if(patient.getFname().trim().isEmpty()){
            tfFname.setBorder(BorderFactory.createLineBorder(Color.RED));
        }else if(patient.getMname().trim().isEmpty()){
            tfMname.setBorder(BorderFactory.createLineBorder(Color.RED));   
        }else if(patient.getLname().trim().isEmpty()){
            tfLname.setBorder(BorderFactory.createLineBorder(Color.RED));
        }else if(patient.getAge().trim().isEmpty()){
             tfAge.setBorder(BorderFactory.createLineBorder(Color.RED));
        }else if(patient.getBday().equals("mm/dd/yyyy")){
            tfBday.setText("");
        }else if(patient.getContactNum1().trim().isEmpty()){
            tfContactNumber1.setBorder(BorderFactory.createLineBorder(Color.RED));
        }else if(patient.getMedicalCon().trim().isEmpty()){
            tfMC.setBorder(BorderFactory.createLineBorder(Color.RED)); 
        }else if(patient.getGuardian().trim().isEmpty()){
            tfGuardian.setBorder(BorderFactory.createLineBorder(Color.RED)); 
        }else if(patient.getContactNum2().trim().isEmpty()){
            tfContactNumber2.setBorder(BorderFactory.createLineBorder(Color.RED)); 
        }else{
            this.setVisible(false);
            if(flag){
                new DunggonLongTreatmentSchedule(patient).setVisible(true);   
            }else{
                new DunggonLongTreatmentSchedule(patient,flag,DunggonID).setVisible(true);   
            }
        }
    }//GEN-LAST:event_btnLongSchedActionPerformed

    private void tfAgeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfAgeKeyTyped
       char age = evt.getKeyChar();
       if(!(Character.isDigit(age) || (age == KeyEvent.VK_BACK_SPACE) || age == KeyEvent.VK_DELETE)){
            getToolkit().beep();
           evt.consume(); 
        }
    }//GEN-LAST:event_tfAgeKeyTyped

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
            java.util.logging.Logger.getLogger(DunggonPatientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DunggonPatientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DunggonPatientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DunggonPatientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DunggonPatientForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ex;
    private javax.swing.JLabel Min;
    private javax.swing.JLabel background;
    private javax.swing.ButtonGroup bg;
    private javax.swing.ButtonGroup bg1;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnLongSched;
    private javax.swing.JButton btnShortSched;
    private javax.swing.JComboBox<String> cbStatus;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblBirthday;
    private javax.swing.JLabel lblContactNumber1;
    private javax.swing.JLabel lblContactNumber2;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEmail1;
    private javax.swing.JLabel lblEmergencyContact;
    private javax.swing.JLabel lblFname;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblGuardian;
    private javax.swing.JLabel lblHistory;
    private javax.swing.JLabel lblLname;
    private javax.swing.JLabel lblMC;
    private javax.swing.JLabel lblMname;
    private javax.swing.JLabel lblPError;
    private javax.swing.JLabel lblPError1;
    private javax.swing.JLabel lblPError2;
    private javax.swing.JLabel lblPError3;
    private javax.swing.JLabel lblPError4;
    private javax.swing.JLabel lblPError6;
    private javax.swing.JLabel lblPError7;
    private javax.swing.JLabel lblPError8;
    private javax.swing.JLabel lblPHC;
    private javax.swing.JLabel lblPatientInformation;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblemail2;
    private javax.swing.JRadioButton rdFemale;
    private javax.swing.JRadioButton rdMale;
    private javax.swing.JTextField tfAddress;
    private javax.swing.JTextField tfAge;
    private javax.swing.JTextField tfBday;
    private javax.swing.JTextField tfContactNumber1;
    private javax.swing.JTextField tfContactNumber2;
    private javax.swing.JTextField tfEmail1;
    private javax.swing.JTextField tfEmail2;
    private javax.swing.JTextField tfFname;
    private javax.swing.JTextField tfGuardian;
    private javax.swing.JTextField tfLname;
    private javax.swing.JTextField tfMC;
    private javax.swing.JTextField tfMname;
    private javax.swing.JTextField tfOcc;
    private javax.swing.JTextField tfPHC;
    // End of variables declaration//GEN-END:variables
}
