/**
 **@author: Verdida, Kenneth Mae
 **@date: March 13, 2020
 **/ 

import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DunggonShortRecord extends javax.swing.JFrame {
    private String DunggonID; 
    PatientInfoClass patient;
    PatientShortTreatmentSched sched;
    private boolean flag = true;
    
    public DunggonShortRecord() {
        initComponents();
        DefaultTableModel table = (DefaultTableModel)jtShortRec.getModel();
        DBHelper db = new DBHelper("Short");
        db.showRecord(table);
        
        lblID1.setText(table.getValueAt(0,0).toString());
        tfFname.setText(table.getValueAt(0,1).toString());
        tfMname.setText(table.getValueAt(0,2).toString());
        tfLname.setText(table.getValueAt(0,3).toString());
        tfAge.setText(table.getValueAt(0,4).toString());
        tfBday.setText(table.getValueAt(0,5).toString());
        tfGen.setText(table.getValueAt(0,6).toString());
        tfStatus.setText(table.getValueAt(0,7).toString());
        tfOcc.setText(table.getValueAt(0,8).toString());
        tfContactNumber1.setText(table.getValueAt(0,9).toString());
        tfEmail1.setText(table.getValueAt(0,10).toString());
        tfAddress.setText(table.getValueAt(0,11).toString());
        tfMC.setText(table.getValueAt(0,12).toString());
        tfPrev.setText(table.getValueAt(0,13).toString());
        tfGuardian.setText(table.getValueAt(0,14).toString());
        tfContactNumber2.setText(table.getValueAt(0,15).toString());
        tfEmail.setText(table.getValueAt(0,16).toString());
        cbDay1.setSelectedItem(table.getValueAt(0,17).toString());
        cbTime.setSelectedItem(table.getValueAt(0,18).toString());
    }
    
    public DunggonShortRecord(boolean flag,String DunggonID) {
        initComponents();
        this.flag = flag;
        this.DunggonID = DunggonID;            
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jtShortRec = new javax.swing.JTable();
        lblID = new javax.swing.JLabel();
        lblPatientInformation = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();
        lblID1 = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        tfAge = new javax.swing.JTextField();
        lblBirthday = new javax.swing.JLabel();
        tfBday = new javax.swing.JTextField();
        lblGender = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        tfOcc = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        lblContactNumber1 = new javax.swing.JLabel();
        tfContactNumber1 = new javax.swing.JTextField();
        tfEmail1 = new javax.swing.JTextField();
        lblEmail1 = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        tfAddress = new javax.swing.JTextField();
        lblMC = new javax.swing.JLabel();
        tfMC = new javax.swing.JTextField();
        lblGuardian = new javax.swing.JLabel();
        tfGuardian = new javax.swing.JTextField();
        tfContactNumber2 = new javax.swing.JTextField();
        lblContactNumber2 = new javax.swing.JLabel();
        lblemail2 = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        lblEmergencyContact = new javax.swing.JLabel();
        lblFname = new javax.swing.JLabel();
        tfFname = new javax.swing.JTextField();
        lblMname = new javax.swing.JLabel();
        tfMname = new javax.swing.JTextField();
        lblLname = new javax.swing.JLabel();
        tfLname = new javax.swing.JTextField();
        tfGen = new javax.swing.JTextField();
        tfStatus = new javax.swing.JTextField();
        lblPrev = new javax.swing.JLabel();
        lblPrev1 = new javax.swing.JLabel();
        tfPrev = new javax.swing.JTextField();
        lblSched = new javax.swing.JLabel();
        cbDay1 = new javax.swing.JComboBox<>();
        lblDay = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        cbTime = new javax.swing.JComboBox<>();
        Min = new javax.swing.JLabel();
        Ex = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        jtShortRec.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "First Name", "Middle Name", "Last Name", "Age", "Birthday", "Gender", "Status", "Occupation", "Contact No.", "Email", "Address", "Metal condition", "Previous Hospital", "Guardian", "Contact No.", "Email", "Day", "Time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtShortRec.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jtShortRec);
        if (jtShortRec.getColumnModel().getColumnCount() > 0) {
            jtShortRec.getColumnModel().getColumn(0).setResizable(false);
            jtShortRec.getColumnModel().getColumn(0).setPreferredWidth(130);
            jtShortRec.getColumnModel().getColumn(1).setResizable(false);
            jtShortRec.getColumnModel().getColumn(1).setPreferredWidth(400);
            jtShortRec.getColumnModel().getColumn(2).setResizable(false);
            jtShortRec.getColumnModel().getColumn(3).setResizable(false);
            jtShortRec.getColumnModel().getColumn(4).setResizable(false);
            jtShortRec.getColumnModel().getColumn(4).setPreferredWidth(50);
            jtShortRec.getColumnModel().getColumn(5).setResizable(false);
            jtShortRec.getColumnModel().getColumn(5).setPreferredWidth(110);
            jtShortRec.getColumnModel().getColumn(6).setResizable(false);
            jtShortRec.getColumnModel().getColumn(6).setPreferredWidth(100);
            jtShortRec.getColumnModel().getColumn(7).setResizable(false);
            jtShortRec.getColumnModel().getColumn(7).setPreferredWidth(170);
            jtShortRec.getColumnModel().getColumn(8).setResizable(false);
            jtShortRec.getColumnModel().getColumn(9).setResizable(false);
            jtShortRec.getColumnModel().getColumn(10).setResizable(false);
            jtShortRec.getColumnModel().getColumn(11).setResizable(false);
            jtShortRec.getColumnModel().getColumn(12).setResizable(false);
            jtShortRec.getColumnModel().getColumn(13).setResizable(false);
            jtShortRec.getColumnModel().getColumn(14).setResizable(false);
            jtShortRec.getColumnModel().getColumn(15).setResizable(false);
            jtShortRec.getColumnModel().getColumn(16).setResizable(false);
            jtShortRec.getColumnModel().getColumn(17).setResizable(false);
            jtShortRec.getColumnModel().getColumn(18).setResizable(false);
        }

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblID.setText("ID :");
        getContentPane().add(lblID, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 110, 20));

        lblPatientInformation.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPatientInformation.setText("PATIENT INFORMATION                                                                            HISTORY");
        getContentPane().add(lblPatientInformation, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 590, -1));

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 560, 75, -1));

        btnEdit.setText("Update");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        getContentPane().add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 560, 75, -1));

        btnSubmit.setText("SUBMIT");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        getContentPane().add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 560, 80, -1));
        getContentPane().add(lblID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 420, 20));

        lblAge.setText("Age");
        getContentPane().add(lblAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 110, 20));

        tfAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfAgeKeyPressed(evt);
            }
        });
        getContentPane().add(tfAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 350, -1));

        lblBirthday.setText("Birthday");
        getContentPane().add(lblBirthday, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 110, 20));

        tfBday.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfBdayKeyPressed(evt);
            }
        });
        getContentPane().add(tfBday, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 350, -1));

        lblGender.setText("Gender");
        getContentPane().add(lblGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 110, 20));

        lblStatus.setText("Status");
        getContentPane().add(lblStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, 110, 20));

        tfOcc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfOccKeyPressed(evt);
            }
        });
        getContentPane().add(tfOcc, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 460, 350, -1));

        lblEmail.setText("Occupation");
        getContentPane().add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 460, 110, 20));

        lblContactNumber1.setText("Contact Number");
        getContentPane().add(lblContactNumber1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 490, 110, 22));

        tfContactNumber1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfContactNumber1KeyPressed(evt);
            }
        });
        getContentPane().add(tfContactNumber1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 490, 350, -1));

        tfEmail1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfEmail1KeyPressed(evt);
            }
        });
        getContentPane().add(tfEmail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 520, 350, -1));

        lblEmail1.setText("Email");
        getContentPane().add(lblEmail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 520, 110, 20));

        lblAddress.setText("Address");
        getContentPane().add(lblAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 550, 110, 20));

        tfAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfAddressKeyPressed(evt);
            }
        });
        getContentPane().add(tfAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 550, 350, -1));

        lblMC.setText("Mental Condition");
        getContentPane().add(lblMC, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 210, -1, 40));

        tfMC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfMCKeyPressed(evt);
            }
        });
        getContentPane().add(tfMC, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 220, 350, -1));

        lblGuardian.setText("Guardian");
        getContentPane().add(lblGuardian, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 330, -1, 20));

        tfGuardian.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfGuardianKeyPressed(evt);
            }
        });
        getContentPane().add(tfGuardian, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 330, 350, -1));

        tfContactNumber2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfContactNumber2KeyPressed(evt);
            }
        });
        getContentPane().add(tfContactNumber2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 360, 350, -1));

        lblContactNumber2.setText("Contact Number");
        getContentPane().add(lblContactNumber2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 360, -1, 20));

        lblemail2.setText("Email");
        getContentPane().add(lblemail2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 390, -1, 20));

        tfEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfEmailKeyPressed(evt);
            }
        });
        getContentPane().add(tfEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 390, 350, -1));

        lblEmergencyContact.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblEmergencyContact.setText("EMERGENCY CONTACT");
        getContentPane().add(lblEmergencyContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 290, -1, 40));

        lblFname.setText("First Name");
        getContentPane().add(lblFname, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 110, 20));

        tfFname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfFnameKeyPressed(evt);
            }
        });
        getContentPane().add(tfFname, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 350, -1));

        lblMname.setText("Middle Name");
        getContentPane().add(lblMname, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 110, 20));

        tfMname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfMnameKeyPressed(evt);
            }
        });
        getContentPane().add(tfMname, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 350, -1));

        lblLname.setText("Last Name");
        getContentPane().add(lblLname, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 110, 20));

        tfLname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfLnameKeyPressed(evt);
            }
        });
        getContentPane().add(tfLname, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 350, -1));

        tfGen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfGenKeyPressed(evt);
            }
        });
        getContentPane().add(tfGen, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, 350, -1));

        tfStatus.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfStatusKeyPressed(evt);
            }
        });
        getContentPane().add(tfStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, 350, -1));

        lblPrev.setText("Previous Hospital ");
        getContentPane().add(lblPrev, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 250, 110, 20));

        lblPrev1.setText("Confinement");
        getContentPane().add(lblPrev1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 270, -1, 20));

        tfPrev.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfPrevKeyPressed(evt);
            }
        });
        getContentPane().add(tfPrev, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 250, 350, -1));

        lblSched.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSched.setText("SCHEDULE");
        getContentPane().add(lblSched, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 410, 130, 40));

        cbDay1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", " " }));
        getContentPane().add(cbDay1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 450, 100, -1));

        lblDay.setText("Day");
        getContentPane().add(lblDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 450, -1, 20));

        lblTime.setText("Time");
        getContentPane().add(lblTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 450, -1, 20));

        cbTime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8:00-9:00", "9:00-10:00", "10:00-11:00", "1:00-2:00", "2:00-3:00", "3:00-4:00" }));
        getContentPane().add(cbTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 450, 120, -1));

        Min.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Min.setForeground(new java.awt.Color(255, 255, 255));
        Min.setText("  _  ");
        Min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinMouseClicked(evt);
            }
        });
        getContentPane().add(Min, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 0, -1, 30));

        Ex.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Ex.setForeground(new java.awt.Color(255, 255, 255));
        Ex.setText("  X");
        Ex.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExMouseClicked(evt);
            }
        });
        getContentPane().add(Ex, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 0, 30, 30));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/42DPRC.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
  
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int response =  JOptionPane.showConfirmDialog(null, "Are you sure you want delete this session?", "Confirm Deletion",
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                        switch (response) {
                            case JOptionPane.NO_OPTION:
                                System.out.println("No button clicked");
                                this.setVisible(false);
                                new DunggonShortRecord().setVisible(true);
                                break;
                            case JOptionPane.YES_OPTION:
                                System.out.println("Yes button clicked");
                                DefaultTableModel table = (DefaultTableModel)jtShortRec.getModel();
                                DunggonID = table.getValueAt(0,0).toString();
                                DBHelper db = new DBHelper("Short");
                                db.deleteRecord(DunggonID);
                                this.setVisible(false);
                                new DunggonPatientForm().setVisible(true);
                                break;
                            case JOptionPane.CLOSED_OPTION:
                                System.out.println("JOptionPane closed");
                                break;
                            default:
                                break;
                        }       
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        DefaultTableModel table = (DefaultTableModel)jtShortRec.getModel();
        DunggonID = table.getValueAt(0,0).toString();
        boolean flag = false;
        String fname = tfFname.getText();
        String mname = tfMname.getText();
        String lname = tfLname.getText();
        String age = tfAge.getText();        
        String bday = tfBday.getText();
        String gender = tfGen.getText();
        String occupation = tfOcc.getText();
        String status = tfStatus.getText();
        String add = tfAddress.getText();
        String contactNum1 = tfContactNumber1.getText();
        String email1 = tfEmail1.getText();
        String medicalCon = tfMC.getText();
        String hospital = tfPrev.getText();
        String guardian = tfGuardian.getText();
        String contactNum2 = tfContactNumber2.getText();
        String email2 = tfEmail.getText();
        String day = cbDay1.getSelectedItem().toString();
        String time = cbTime.getSelectedItem().toString();
        
        patient = new PatientInfoClass(fname, mname, lname, age, bday, gender, occupation, status, add, contactNum1, email1, medicalCon, hospital, guardian, contactNum2, email2);
        sched = new PatientShortTreatmentSched(day, time);
        DBHelper db = new DBHelper(sched,"Short");
        if(flag){
            if(db.insertSession(patient)){
                this.setVisible(false);
                new DunggonShortRecord().setVisible(true);
            }
        }else{
            db.editRecord(patient,DunggonID);
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        int response = JOptionPane.showConfirmDialog(null, "Confirm reservation?", "Confirmation",
                       JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                        switch (response) {
                            case JOptionPane.NO_OPTION:
                                System.out.println("No button clicked");   
                                DefaultTableModel table = (DefaultTableModel)jtShortRec.getModel();
                                DunggonID = table.getValueAt(0,0).toString();
                                DBHelper db = new DBHelper("Short");
                                db.deleteRecord(DunggonID);
                                this.setVisible(false);
                                new DunggonCounselMenu().setVisible(true);
                                break;
                            case JOptionPane.YES_OPTION:
                                System.out.println("Yes button clicked");
                                this.setVisible(false);
                                new DunggonCounselMenu().setVisible(true);
                                break;
                            case JOptionPane.CLOSED_OPTION:
                                System.out.println("JOptionPane closed");
                                break;
                            default:
                                break;
                        }          
    }//GEN-LAST:event_btnSubmitActionPerformed

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
                                new DunggonShortRecord().setVisible(true);
                                break;
                            case JOptionPane.YES_OPTION:
                                System.out.println("Yes button clicked");
                                DefaultTableModel table = (DefaultTableModel)jtShortRec.getModel();
                                DunggonID = table.getValueAt(0,0).toString();
                                DBHelper db = new DBHelper("Short");
                                db.deleteRecord(DunggonID);
                                this.setVisible(false);
                                System.exit(0);
                                break;
                            case JOptionPane.CLOSED_OPTION:
                                System.out.println("JOptionPane closed");
                                break;
                            default:
                                break;
                        }      
    }//GEN-LAST:event_ExMouseClicked

    private void tfFnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfFnameKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            DefaultTableModel table = (DefaultTableModel)jtShortRec.getModel();
            DunggonID = table.getValueAt(0,0).toString();
            boolean flag = false;
            String fname = tfFname.getText();
            String mname = tfMname.getText();
            String lname = tfLname.getText();
            String age = tfAge.getText();        
            String bday = tfBday.getText();
            String gender = tfGen.getText();
            String occupation = tfOcc.getText();
            String status = tfStatus.getText();
            String add = tfAddress.getText();
            String contactNum1 = tfContactNumber1.getText();
            String email1 = tfEmail1.getText();
            String medicalCon = tfMC.getText();
            String hospital = tfPrev.getText();
            String guardian = tfGuardian.getText();
            String contactNum2 = tfContactNumber2.getText();
            String email2 = tfEmail.getText();
            String day = cbDay1.getSelectedItem().toString();
            String time = cbTime.getSelectedItem().toString();

            patient = new PatientInfoClass(fname, mname, lname, age, bday, gender, occupation, status, add, contactNum1, email1, medicalCon, hospital, guardian, contactNum2, email2);
            sched = new PatientShortTreatmentSched(day, time);
            DBHelper db = new DBHelper(sched,"Short");
            if(flag){
                if(db.insertSession(patient)){
                    this.setVisible(false);
                    new DunggonShortRecord().setVisible(true);
                }
            }else{
                db.editRecord(patient,DunggonID);
            }
        }
    }//GEN-LAST:event_tfFnameKeyPressed

    private void tfMnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfMnameKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            DefaultTableModel table = (DefaultTableModel)jtShortRec.getModel();
            DunggonID = table.getValueAt(0,0).toString();
            boolean flag = false;
            String fname = tfFname.getText();
            String mname = tfMname.getText();
            String lname = tfLname.getText();
            String age = tfAge.getText();        
            String bday = tfBday.getText();
            String gender = tfGen.getText();
            String occupation = tfOcc.getText();
            String status = tfStatus.getText();
            String add = tfAddress.getText();
            String contactNum1 = tfContactNumber1.getText();
            String email1 = tfEmail1.getText();
            String medicalCon = tfMC.getText();
            String hospital = tfPrev.getText();
            String guardian = tfGuardian.getText();
            String contactNum2 = tfContactNumber2.getText();
            String email2 = tfEmail.getText();
            String day = cbDay1.getSelectedItem().toString();
            String time = cbTime.getSelectedItem().toString();

            patient = new PatientInfoClass(fname, mname, lname, age, bday, gender, occupation, status, add, contactNum1, email1, medicalCon, hospital, guardian, contactNum2, email2);
            sched = new PatientShortTreatmentSched(day, time);
            DBHelper db = new DBHelper(sched,"Short");
            if(flag){
                if(db.insertSession(patient)){
                    this.setVisible(false);
                    new DunggonShortRecord().setVisible(true);
                }
            }else{
                db.editRecord(patient,DunggonID);
            }
        }
    }//GEN-LAST:event_tfMnameKeyPressed

    private void tfLnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfLnameKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            DefaultTableModel table = (DefaultTableModel)jtShortRec.getModel();
            DunggonID = table.getValueAt(0,0).toString();
            boolean flag = false;
            String fname = tfFname.getText();
            String mname = tfMname.getText();
            String lname = tfLname.getText();
            String age = tfAge.getText();        
            String bday = tfBday.getText();
            String gender = tfGen.getText();
            String occupation = tfOcc.getText();
            String status = tfStatus.getText();
            String add = tfAddress.getText();
            String contactNum1 = tfContactNumber1.getText();
            String email1 = tfEmail1.getText();
            String medicalCon = tfMC.getText();
            String hospital = tfPrev.getText();
            String guardian = tfGuardian.getText();
            String contactNum2 = tfContactNumber2.getText();
            String email2 = tfEmail.getText();
            String day = cbDay1.getSelectedItem().toString();
            String time = cbTime.getSelectedItem().toString();

            patient = new PatientInfoClass(fname, mname, lname, age, bday, gender, occupation, status, add, contactNum1, email1, medicalCon, hospital, guardian, contactNum2, email2);
            sched = new PatientShortTreatmentSched(day, time);
            DBHelper db = new DBHelper(sched,"Short");
            if(flag){
                if(db.insertSession(patient)){
                    this.setVisible(false);
                    new DunggonShortRecord().setVisible(true);
                }
            }else{
                db.editRecord(patient,DunggonID);
            }
        }
    }//GEN-LAST:event_tfLnameKeyPressed

    private void tfAgeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfAgeKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            DefaultTableModel table = (DefaultTableModel)jtShortRec.getModel();
            DunggonID = table.getValueAt(0,0).toString();
            boolean flag = false;
            String fname = tfFname.getText();
            String mname = tfMname.getText();
            String lname = tfLname.getText();
            String age = tfAge.getText();        
            String bday = tfBday.getText();
            String gender = tfGen.getText();
            String occupation = tfOcc.getText();
            String status = tfStatus.getText();
            String add = tfAddress.getText();
            String contactNum1 = tfContactNumber1.getText();
            String email1 = tfEmail1.getText();
            String medicalCon = tfMC.getText();
            String hospital = tfPrev.getText();
            String guardian = tfGuardian.getText();
            String contactNum2 = tfContactNumber2.getText();
            String email2 = tfEmail.getText();
            String day = cbDay1.getSelectedItem().toString();
            String time = cbTime.getSelectedItem().toString();

            patient = new PatientInfoClass(fname, mname, lname, age, bday, gender, occupation, status, add, contactNum1, email1, medicalCon, hospital, guardian, contactNum2, email2);
            sched = new PatientShortTreatmentSched(day, time);
            DBHelper db = new DBHelper(sched,"Short");
            if(flag){
                if(db.insertSession(patient)){
                    this.setVisible(false);
                    new DunggonShortRecord().setVisible(true);
                }
            }else{
                db.editRecord(patient,DunggonID);
            }
        }
    }//GEN-LAST:event_tfAgeKeyPressed

    private void tfBdayKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfBdayKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            DefaultTableModel table = (DefaultTableModel)jtShortRec.getModel();
            DunggonID = table.getValueAt(0,0).toString();
            boolean flag = false;
            String fname = tfFname.getText();
            String mname = tfMname.getText();
            String lname = tfLname.getText();
            String age = tfAge.getText();        
            String bday = tfBday.getText();
            String gender = tfGen.getText();
            String occupation = tfOcc.getText();
            String status = tfStatus.getText();
            String add = tfAddress.getText();
            String contactNum1 = tfContactNumber1.getText();
            String email1 = tfEmail1.getText();
            String medicalCon = tfMC.getText();
            String hospital = tfPrev.getText();
            String guardian = tfGuardian.getText();
            String contactNum2 = tfContactNumber2.getText();
            String email2 = tfEmail.getText();
            String day = cbDay1.getSelectedItem().toString();
            String time = cbTime.getSelectedItem().toString();

            patient = new PatientInfoClass(fname, mname, lname, age, bday, gender, occupation, status, add, contactNum1, email1, medicalCon, hospital, guardian, contactNum2, email2);
            sched = new PatientShortTreatmentSched(day, time);
            DBHelper db = new DBHelper(sched,"Short");
            if(flag){
                if(db.insertSession(patient)){
                    this.setVisible(false);
                    new DunggonShortRecord().setVisible(true);
                }
            }else{
                db.editRecord(patient,DunggonID);
            }
        }
    }//GEN-LAST:event_tfBdayKeyPressed

    private void tfGenKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfGenKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            DefaultTableModel table = (DefaultTableModel)jtShortRec.getModel();
            DunggonID = table.getValueAt(0,0).toString();
            boolean flag = false;
            String fname = tfFname.getText();
            String mname = tfMname.getText();
            String lname = tfLname.getText();
            String age = tfAge.getText();        
            String bday = tfBday.getText();
            String gender = tfGen.getText();
            String occupation = tfOcc.getText();
            String status = tfStatus.getText();
            String add = tfAddress.getText();
            String contactNum1 = tfContactNumber1.getText();
            String email1 = tfEmail1.getText();
            String medicalCon = tfMC.getText();
            String hospital = tfPrev.getText();
            String guardian = tfGuardian.getText();
            String contactNum2 = tfContactNumber2.getText();
            String email2 = tfEmail.getText();
            String day = cbDay1.getSelectedItem().toString();
            String time = cbTime.getSelectedItem().toString();

            patient = new PatientInfoClass(fname, mname, lname, age, bday, gender, occupation, status, add, contactNum1, email1, medicalCon, hospital, guardian, contactNum2, email2);
            sched = new PatientShortTreatmentSched(day, time);
            DBHelper db = new DBHelper(sched,"Short");
            if(flag){
                if(db.insertSession(patient)){
                    this.setVisible(false);
                    new DunggonShortRecord().setVisible(true);
                }
            }else{
                db.editRecord(patient,DunggonID);
            }
        }
    }//GEN-LAST:event_tfGenKeyPressed

    private void tfStatusKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfStatusKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            DefaultTableModel table = (DefaultTableModel)jtShortRec.getModel();
            DunggonID = table.getValueAt(0,0).toString();
            boolean flag = false;
            String fname = tfFname.getText();
            String mname = tfMname.getText();
            String lname = tfLname.getText();
            String age = tfAge.getText();        
            String bday = tfBday.getText();
            String gender = tfGen.getText();
            String occupation = tfOcc.getText();
            String status = tfStatus.getText();
            String add = tfAddress.getText();
            String contactNum1 = tfContactNumber1.getText();
            String email1 = tfEmail1.getText();
            String medicalCon = tfMC.getText();
            String hospital = tfPrev.getText();
            String guardian = tfGuardian.getText();
            String contactNum2 = tfContactNumber2.getText();
            String email2 = tfEmail.getText();
            String day = cbDay1.getSelectedItem().toString();
            String time = cbTime.getSelectedItem().toString();

            patient = new PatientInfoClass(fname, mname, lname, age, bday, gender, occupation, status, add, contactNum1, email1, medicalCon, hospital, guardian, contactNum2, email2);
            sched = new PatientShortTreatmentSched(day, time);
            DBHelper db = new DBHelper(sched,"Short");
            if(flag){
                if(db.insertSession(patient)){
                    this.setVisible(false);
                    new DunggonShortRecord().setVisible(true);
                }
            }else{
                db.editRecord(patient,DunggonID);
            }
        }
    }//GEN-LAST:event_tfStatusKeyPressed

    private void tfOccKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfOccKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            DefaultTableModel table = (DefaultTableModel)jtShortRec.getModel();
            DunggonID = table.getValueAt(0,0).toString();
            boolean flag = false;
            String fname = tfFname.getText();
            String mname = tfMname.getText();
            String lname = tfLname.getText();
            String age = tfAge.getText();        
            String bday = tfBday.getText();
            String gender = tfGen.getText();
            String occupation = tfOcc.getText();
            String status = tfStatus.getText();
            String add = tfAddress.getText();
            String contactNum1 = tfContactNumber1.getText();
            String email1 = tfEmail1.getText();
            String medicalCon = tfMC.getText();
            String hospital = tfPrev.getText();
            String guardian = tfGuardian.getText();
            String contactNum2 = tfContactNumber2.getText();
            String email2 = tfEmail.getText();
            String day = cbDay1.getSelectedItem().toString();
            String time = cbTime.getSelectedItem().toString();

            patient = new PatientInfoClass(fname, mname, lname, age, bday, gender, occupation, status, add, contactNum1, email1, medicalCon, hospital, guardian, contactNum2, email2);
            sched = new PatientShortTreatmentSched(day, time);
            DBHelper db = new DBHelper(sched,"Short");
            if(flag){
                if(db.insertSession(patient)){
                    this.setVisible(false);
                    new DunggonShortRecord().setVisible(true);
                }
            }else{
                db.editRecord(patient,DunggonID);
            }
        }
    }//GEN-LAST:event_tfOccKeyPressed

    private void tfContactNumber1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfContactNumber1KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            DefaultTableModel table = (DefaultTableModel)jtShortRec.getModel();
            DunggonID = table.getValueAt(0,0).toString();
            boolean flag = false;
            String fname = tfFname.getText();
            String mname = tfMname.getText();
            String lname = tfLname.getText();
            String age = tfAge.getText();        
            String bday = tfBday.getText();
            String gender = tfGen.getText();
            String occupation = tfOcc.getText();
            String status = tfStatus.getText();
            String add = tfAddress.getText();
            String contactNum1 = tfContactNumber1.getText();
            String email1 = tfEmail1.getText();
            String medicalCon = tfMC.getText();
            String hospital = tfPrev.getText();
            String guardian = tfGuardian.getText();
            String contactNum2 = tfContactNumber2.getText();
            String email2 = tfEmail.getText();
            String day = cbDay1.getSelectedItem().toString();
            String time = cbTime.getSelectedItem().toString();

            patient = new PatientInfoClass(fname, mname, lname, age, bday, gender, occupation, status, add, contactNum1, email1, medicalCon, hospital, guardian, contactNum2, email2);
            sched = new PatientShortTreatmentSched(day, time);
            DBHelper db = new DBHelper(sched,"Short");
            if(flag){
                if(db.insertSession(patient)){
                    this.setVisible(false);
                    new DunggonShortRecord().setVisible(true);
                }
            }else{
                db.editRecord(patient,DunggonID);
            }
        }
    }//GEN-LAST:event_tfContactNumber1KeyPressed

    private void tfEmail1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfEmail1KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            DefaultTableModel table = (DefaultTableModel)jtShortRec.getModel();
            DunggonID = table.getValueAt(0,0).toString();
            boolean flag = false;
            String fname = tfFname.getText();
            String mname = tfMname.getText();
            String lname = tfLname.getText();
            String age = tfAge.getText();        
            String bday = tfBday.getText();
            String gender = tfGen.getText();
            String occupation = tfOcc.getText();
            String status = tfStatus.getText();
            String add = tfAddress.getText();
            String contactNum1 = tfContactNumber1.getText();
            String email1 = tfEmail1.getText();
            String medicalCon = tfMC.getText();
            String hospital = tfPrev.getText();
            String guardian = tfGuardian.getText();
            String contactNum2 = tfContactNumber2.getText();
            String email2 = tfEmail.getText();
            String day = cbDay1.getSelectedItem().toString();
            String time = cbTime.getSelectedItem().toString();

            patient = new PatientInfoClass(fname, mname, lname, age, bday, gender, occupation, status, add, contactNum1, email1, medicalCon, hospital, guardian, contactNum2, email2);
            sched = new PatientShortTreatmentSched(day, time);
            DBHelper db = new DBHelper(sched,"Short");
            if(flag){
                if(db.insertSession(patient)){
                    this.setVisible(false);
                    new DunggonShortRecord().setVisible(true);
                }
            }else{
                db.editRecord(patient,DunggonID);
            }
        }
    }//GEN-LAST:event_tfEmail1KeyPressed

    private void tfAddressKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfAddressKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            DefaultTableModel table = (DefaultTableModel)jtShortRec.getModel();
            DunggonID = table.getValueAt(0,0).toString();
            boolean flag = false;
            String fname = tfFname.getText();
            String mname = tfMname.getText();
            String lname = tfLname.getText();
            String age = tfAge.getText();        
            String bday = tfBday.getText();
            String gender = tfGen.getText();
            String occupation = tfOcc.getText();
            String status = tfStatus.getText();
            String add = tfAddress.getText();
            String contactNum1 = tfContactNumber1.getText();
            String email1 = tfEmail1.getText();
            String medicalCon = tfMC.getText();
            String hospital = tfPrev.getText();
            String guardian = tfGuardian.getText();
            String contactNum2 = tfContactNumber2.getText();
            String email2 = tfEmail.getText();
            String day = cbDay1.getSelectedItem().toString();
            String time = cbTime.getSelectedItem().toString();

            patient = new PatientInfoClass(fname, mname, lname, age, bday, gender, occupation, status, add, contactNum1, email1, medicalCon, hospital, guardian, contactNum2, email2);
            sched = new PatientShortTreatmentSched(day, time);
            DBHelper db = new DBHelper(sched,"Short");
            if(flag){
                if(db.insertSession(patient)){
                    this.setVisible(false);
                    new DunggonShortRecord().setVisible(true);
                }
            }else{
                db.editRecord(patient,DunggonID);
            }
        }
    }//GEN-LAST:event_tfAddressKeyPressed

    private void tfMCKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfMCKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            DefaultTableModel table = (DefaultTableModel)jtShortRec.getModel();
            DunggonID = table.getValueAt(0,0).toString();
            boolean flag = false;
            String fname = tfFname.getText();
            String mname = tfMname.getText();
            String lname = tfLname.getText();
            String age = tfAge.getText();        
            String bday = tfBday.getText();
            String gender = tfGen.getText();
            String occupation = tfOcc.getText();
            String status = tfStatus.getText();
            String add = tfAddress.getText();
            String contactNum1 = tfContactNumber1.getText();
            String email1 = tfEmail1.getText();
            String medicalCon = tfMC.getText();
            String hospital = tfPrev.getText();
            String guardian = tfGuardian.getText();
            String contactNum2 = tfContactNumber2.getText();
            String email2 = tfEmail.getText();
            String day = cbDay1.getSelectedItem().toString();
            String time = cbTime.getSelectedItem().toString();

            patient = new PatientInfoClass(fname, mname, lname, age, bday, gender, occupation, status, add, contactNum1, email1, medicalCon, hospital, guardian, contactNum2, email2);
            sched = new PatientShortTreatmentSched(day, time);
            DBHelper db = new DBHelper(sched,"Short");
            if(flag){
                if(db.insertSession(patient)){
                    this.setVisible(false);
                    new DunggonShortRecord().setVisible(true);
                }
            }else{
                db.editRecord(patient,DunggonID);
            }
        }
    }//GEN-LAST:event_tfMCKeyPressed

    private void tfPrevKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPrevKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            DefaultTableModel table = (DefaultTableModel)jtShortRec.getModel();
            DunggonID = table.getValueAt(0,0).toString();
            boolean flag = false;
            String fname = tfFname.getText();
            String mname = tfMname.getText();
            String lname = tfLname.getText();
            String age = tfAge.getText();        
            String bday = tfBday.getText();
            String gender = tfGen.getText();
            String occupation = tfOcc.getText();
            String status = tfStatus.getText();
            String add = tfAddress.getText();
            String contactNum1 = tfContactNumber1.getText();
            String email1 = tfEmail1.getText();
            String medicalCon = tfMC.getText();
            String hospital = tfPrev.getText();
            String guardian = tfGuardian.getText();
            String contactNum2 = tfContactNumber2.getText();
            String email2 = tfEmail.getText();
            String day = cbDay1.getSelectedItem().toString();
            String time = cbTime.getSelectedItem().toString();

            patient = new PatientInfoClass(fname, mname, lname, age, bday, gender, occupation, status, add, contactNum1, email1, medicalCon, hospital, guardian, contactNum2, email2);
            sched = new PatientShortTreatmentSched(day, time);
            DBHelper db = new DBHelper(sched,"Short");
            if(flag){
                if(db.insertSession(patient)){
                    this.setVisible(false);
                    new DunggonShortRecord().setVisible(true);
                }
            }else{
                db.editRecord(patient,DunggonID);
            }
        }
    }//GEN-LAST:event_tfPrevKeyPressed

    private void tfGuardianKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfGuardianKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            DefaultTableModel table = (DefaultTableModel)jtShortRec.getModel();
            DunggonID = table.getValueAt(0,0).toString();
            boolean flag = false;
            String fname = tfFname.getText();
            String mname = tfMname.getText();
            String lname = tfLname.getText();
            String age = tfAge.getText();
            String bday = tfBday.getText();
            String gender = tfGen.getText();
            String occupation = tfOcc.getText();
            String status = tfStatus.getText();
            String add = tfAddress.getText();
            String contactNum1 = tfContactNumber1.getText();
            String email1 = tfEmail1.getText();
            String medicalCon = tfMC.getText();
            String hospital = tfPrev.getText();
            String guardian = tfGuardian.getText();
            String contactNum2 = tfContactNumber2.getText();
            String email2 = tfEmail.getText();
            String day = cbDay1.getSelectedItem().toString();
            String time = cbTime.getSelectedItem().toString();

            patient = new PatientInfoClass(fname, mname, lname, age, bday, gender, occupation, status, add, contactNum1, email1, medicalCon, hospital, guardian, contactNum2, email2);
            sched = new PatientShortTreatmentSched(day, time);
            DBHelper db = new DBHelper(sched,"Short");
            if(flag){
                if(db.insertSession(patient)){
                    this.setVisible(false);
                    new DunggonShortRecord().setVisible(true);
                }
            }else{
                db.editRecord(patient,DunggonID);
            }
        }
    }//GEN-LAST:event_tfGuardianKeyPressed

    private void tfContactNumber2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfContactNumber2KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            DefaultTableModel table = (DefaultTableModel)jtShortRec.getModel();
            DunggonID = table.getValueAt(0,0).toString();
            boolean flag = false;
            String fname = tfFname.getText();
            String mname = tfMname.getText();
            String lname = tfLname.getText();
            String age = tfAge.getText();
            String bday = tfBday.getText();
            String gender = tfGen.getText();
            String occupation = tfOcc.getText();
            String status = tfStatus.getText();
            String add = tfAddress.getText();
            String contactNum1 = tfContactNumber1.getText();
            String email1 = tfEmail1.getText();
            String medicalCon = tfMC.getText();
            String hospital = tfPrev.getText();
            String guardian = tfGuardian.getText();
            String contactNum2 = tfContactNumber2.getText();
            String email2 = tfEmail.getText();
            String day = cbDay1.getSelectedItem().toString();
            String time = cbTime.getSelectedItem().toString();

            patient = new PatientInfoClass(fname, mname, lname, age, bday, gender, occupation, status, add, contactNum1, email1, medicalCon, hospital, guardian, contactNum2, email2);
            sched = new PatientShortTreatmentSched(day, time);
            DBHelper db = new DBHelper(sched,"Short");
            if(flag){
                if(db.insertSession(patient)){
                    this.setVisible(false);
                    new DunggonShortRecord().setVisible(true);
                }
            }else{
                db.editRecord(patient,DunggonID);
            }
        }
    }//GEN-LAST:event_tfContactNumber2KeyPressed

    private void tfEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfEmailKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            DefaultTableModel table = (DefaultTableModel)jtShortRec.getModel();        
            DunggonID = table.getValueAt(0,0).toString();
            boolean flag = false;
            String fname = tfFname.getText();
            String mname = tfMname.getText();
            String lname = tfLname.getText();
            String age = tfAge.getText();
            String bday = tfBday.getText();
            String gender = tfGen.getText();
            String occupation = tfOcc.getText();
            String status = tfStatus.getText();
            String add = tfAddress.getText();
            String contactNum1 = tfContactNumber1.getText();
            String email1 = tfEmail1.getText();
            String medicalCon = tfMC.getText();
            String hospital = tfPrev.getText();
            String guardian = tfGuardian.getText();
            String contactNum2 = tfContactNumber2.getText();
            String email2 = tfEmail.getText();
            String day = cbDay1.getSelectedItem().toString();
            String time = cbTime.getSelectedItem().toString();

            patient = new PatientInfoClass(fname, mname, lname, age, bday, gender, occupation, status, add, contactNum1, email1, medicalCon, hospital, guardian, contactNum2, email2);
            sched = new PatientShortTreatmentSched(day, time);
            DBHelper db = new DBHelper(sched,"Short");
            if(flag){
                if(db.insertSession(patient)){
                    this.setVisible(false);
                    new DunggonShortRecord().setVisible(true);
                }
            }else{
                db.editRecord(patient,DunggonID);
            }
        }
    }//GEN-LAST:event_tfEmailKeyPressed

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
            java.util.logging.Logger.getLogger(DunggonShortRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DunggonShortRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DunggonShortRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DunggonShortRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DunggonShortRecord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ex;
    private javax.swing.JLabel Min;
    private javax.swing.JLabel background;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox<String> cbDay1;
    private javax.swing.JComboBox<String> cbTime;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtShortRec;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblBirthday;
    private javax.swing.JLabel lblContactNumber1;
    private javax.swing.JLabel lblContactNumber2;
    private javax.swing.JLabel lblDay;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEmail1;
    private javax.swing.JLabel lblEmergencyContact;
    private javax.swing.JLabel lblFname;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblGuardian;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblID1;
    private javax.swing.JLabel lblLname;
    private javax.swing.JLabel lblMC;
    private javax.swing.JLabel lblMname;
    private javax.swing.JLabel lblPatientInformation;
    private javax.swing.JLabel lblPrev;
    private javax.swing.JLabel lblPrev1;
    private javax.swing.JLabel lblSched;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblemail2;
    private javax.swing.JTextField tfAddress;
    private javax.swing.JTextField tfAge;
    private javax.swing.JTextField tfBday;
    private javax.swing.JTextField tfContactNumber1;
    private javax.swing.JTextField tfContactNumber2;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfEmail1;
    private javax.swing.JTextField tfFname;
    private javax.swing.JTextField tfGen;
    private javax.swing.JTextField tfGuardian;
    private javax.swing.JTextField tfLname;
    private javax.swing.JTextField tfMC;
    private javax.swing.JTextField tfMname;
    private javax.swing.JTextField tfOcc;
    private javax.swing.JTextField tfPrev;
    private javax.swing.JTextField tfStatus;
    // End of variables declaration//GEN-END:variables
}
