/**
 **@author: Palma, Julieta
 **@date: March 13, 2020
 **/

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class DunggonSignUp extends javax.swing.JFrame {
    
    public DunggonSignUp() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEx = new javax.swing.JLabel();
        lblPError = new javax.swing.JLabel();
        lblPError1 = new javax.swing.JLabel();
        lblPError2 = new javax.swing.JLabel();
        lblPError3 = new javax.swing.JLabel();
        lblPError4 = new javax.swing.JLabel();
        Min = new javax.swing.JLabel();
        Ex = new javax.swing.JLabel();
        lblCheckPass = new javax.swing.JLabel();
        jpPass = new javax.swing.JPasswordField();
        tfUsername = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        tfLname = new javax.swing.JTextField();
        tfFname = new javax.swing.JTextField();
        btnClickHere = new javax.swing.JLabel();
        lblFname = new javax.swing.JLabel();
        lblLname = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblRegister = new javax.swing.JLabel();
        lblbBack = new javax.swing.JLabel();
        lblPError8 = new javax.swing.JLabel();
        lblPError9 = new javax.swing.JLabel();
        lblPError10 = new javax.swing.JLabel();
        lblPError11 = new javax.swing.JLabel();
        lblPError12 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        btnEx.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEx.setText(" X ");
        btnEx.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPError.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPError.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lblPError, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, 10, 20));

        lblPError1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPError1.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lblPError1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 290, 10, 20));

        lblPError2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPError2.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lblPError2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, 10, 20));

        lblPError3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPError3.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lblPError3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 390, 10, 20));

        lblPError4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPError4.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lblPError4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 440, 10, 20));

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

        lblCheckPass.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lblCheckPass.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lblCheckPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 460, 240, 30));

        jpPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpPassActionPerformed(evt);
            }
        });
        jpPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jpPassKeyPressed(evt);
            }
        });
        getContentPane().add(jpPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, 240, -1));

        tfUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfUsernameKeyPressed(evt);
            }
        });
        getContentPane().add(tfUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, 240, -1));

        tfEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEmailActionPerformed(evt);
            }
        });
        tfEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfEmailKeyPressed(evt);
            }
        });
        getContentPane().add(tfEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 240, -1));

        tfLname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfLnameKeyPressed(evt);
            }
        });
        getContentPane().add(tfLname, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 240, -1));

        tfFname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfFnameActionPerformed(evt);
            }
        });
        tfFname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfFnameKeyPressed(evt);
            }
        });
        getContentPane().add(tfFname, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 240, -1));

        btnClickHere.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnClickHere.setText("  SIGN IN HERE");
        btnClickHere.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClickHereMouseClicked(evt);
            }
        });
        getContentPane().add(btnClickHere, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 550, 110, 20));

        lblFname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblFname.setText("First Name");
        getContentPane().add(lblFname, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 80, 20));

        lblLname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblLname.setText("Last Name");
        getContentPane().add(lblLname, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 80, 20));

        lblEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblEmail.setText("Email");
        getContentPane().add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 40, 20));

        lblUsername.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUsername.setText("Username");
        getContentPane().add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, -1, 20));

        lblPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPassword.setText("Password");
        getContentPane().add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, -1, 20));

        lblRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/0REG.png"))); // NOI18N
        lblRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegisterMouseClicked(evt);
            }
        });
        getContentPane().add(lblRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 490, -1, -1));

        lblbBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/0ARROW.png"))); // NOI18N
        lblbBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblbBackMouseClicked(evt);
            }
        });
        getContentPane().add(lblbBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 40, 30));

        lblPError8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPError8.setForeground(new java.awt.Color(255, 0, 0));
        lblPError8.setText("  *");
        getContentPane().add(lblPError8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, 60, 20));

        lblPError9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPError9.setForeground(new java.awt.Color(255, 0, 0));
        lblPError9.setText("  *");
        getContentPane().add(lblPError9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 60, 20));

        lblPError10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPError10.setForeground(new java.awt.Color(255, 0, 0));
        lblPError10.setText("  *");
        getContentPane().add(lblPError10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 420, 60, 20));

        lblPError11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPError11.setForeground(new java.awt.Color(255, 0, 0));
        lblPError11.setText("  *");
        getContentPane().add(lblPError11, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 60, 20));

        lblPError12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPError12.setForeground(new java.awt.Color(255, 0, 0));
        lblPError12.setText("  *");
        getContentPane().add(lblPError12, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 60, 20));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/23DSIN.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEmailActionPerformed

    }//GEN-LAST:event_tfEmailActionPerformed

    private void btnClickHereMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClickHereMouseClicked
        this.setVisible(false);
        new DunggonSignIn().setVisible(true);
    }//GEN-LAST:event_btnClickHereMouseClicked

    private void jpPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpPassActionPerformed
           
    }//GEN-LAST:event_jpPassActionPerformed

    private void MinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_MinMouseClicked

    private void ExMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExMouseClicked
        int response =  JOptionPane.showConfirmDialog(null, "You haven't finished your registration yet. Do you want to leave without finishing?", "Confirm",
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

    private void lblRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegisterMouseClicked
        UserClass user;    
        String fname = tfFname.getText();
        String lname = tfLname.getText();
        String email = tfEmail.getText();
        String username = tfUsername.getText();
        String pass = String.valueOf(jpPass.getPassword());
       
        user = new UserClass(fname, lname, email, username, pass);
        DBHelper db = new DBHelper();
        
        if(db.checkEmail(user)){
            JOptionPane.showMessageDialog(null, "Email Already Exist");
        }else if(db.checkUsername(user)){
            JOptionPane.showMessageDialog(null, "Username Already Exist");
        }else if(fname.equals("") && fname.equals("") && email.equals("") && username.equals("")  && pass.equals("")){
            tfFname.setBorder(BorderFactory.createLineBorder(Color.RED)); 
            tfLname.setBorder(BorderFactory.createLineBorder(Color.RED)); 
            tfEmail.setBorder(BorderFactory.createLineBorder(Color.RED));
            tfUsername.setBorder(BorderFactory.createLineBorder(Color.RED)); 
            jpPass.setBorder(BorderFactory.createLineBorder(Color.RED)); 
        }else if(fname.equals("")){
            tfFname.setBorder(BorderFactory.createLineBorder(Color.RED)); 
        }else if(lname.equals("")){
            tfLname.setBorder(BorderFactory.createLineBorder(Color.RED));
        }else if(email.equals("")){
            tfEmail.setBorder(BorderFactory.createLineBorder(Color.RED));
        }else if(username.equals("")){
            tfUsername.setBorder(BorderFactory.createLineBorder(Color.RED)); 
        }else if(pass.equals("")){
            jpPass.setBorder(BorderFactory.createLineBorder(Color.RED)); 
        }else if(jpPass.getText().trim().length() <= 7 || jpPass.getText().trim().length() >= 16 ){
            lblCheckPass.setText(" Password must be 8-16 characters");
        }else{
            db.signup(user);
            this.setVisible(false);
            new DunggonSignIn().setVisible(true);
        }  
    }//GEN-LAST:event_lblRegisterMouseClicked

    private void tfFnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfFnameActionPerformed
        
    }//GEN-LAST:event_tfFnameActionPerformed

    private void lblbBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblbBackMouseClicked
        this.setVisible(false);
        new DunggonMenu().setVisible(true);
    }//GEN-LAST:event_lblbBackMouseClicked

    private void tfFnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfFnameKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            UserClass user;    
            String fname = tfFname.getText();
            String lname = tfLname.getText();
            String email = tfEmail.getText();
            String username = tfUsername.getText();
            String pass = String.valueOf(jpPass.getPassword());

            user = new UserClass(fname, lname, email, username, pass);
            DBHelper db = new DBHelper();

            if(db.checkEmail(user)){
                JOptionPane.showMessageDialog(null, "Email Already Exist");
            }else if(db.checkUsername(user)){
                JOptionPane.showMessageDialog(null, "Username Already Exist");
            }else if(fname.equals("") && fname.equals("") && email.equals("") && username.equals("")  && pass.equals("")){
                tfFname.setBorder(BorderFactory.createLineBorder(Color.RED)); 
                tfLname.setBorder(BorderFactory.createLineBorder(Color.RED)); 
                tfEmail.setBorder(BorderFactory.createLineBorder(Color.RED));
                tfUsername.setBorder(BorderFactory.createLineBorder(Color.RED)); 
                jpPass.setBorder(BorderFactory.createLineBorder(Color.RED)); 
            }else if(fname.equals("")){
                tfFname.setBorder(BorderFactory.createLineBorder(Color.RED)); 
            }else if(lname.equals("")){
                tfLname.setBorder(BorderFactory.createLineBorder(Color.RED));
            }else if(email.equals("")){
                tfEmail.setBorder(BorderFactory.createLineBorder(Color.RED));
            }else if(username.equals("")){
                tfUsername.setBorder(BorderFactory.createLineBorder(Color.RED)); 
            }else if(pass.equals("")){
                jpPass.setBorder(BorderFactory.createLineBorder(Color.RED)); 
            }else if(jpPass.getText().trim().length() <= 7 || jpPass.getText().trim().length() >= 16 ){
                lblCheckPass.setText(" Password must be 8-16 characters");
            }else{
                db.signup(user);
                this.setVisible(false);
                new DunggonSignIn().setVisible(true);
            }  
        }
    }//GEN-LAST:event_tfFnameKeyPressed

    private void tfLnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfLnameKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            UserClass user;    
            String fname = tfFname.getText();
            String lname = tfLname.getText();
            String email = tfEmail.getText();
            String username = tfUsername.getText();
            String pass = String.valueOf(jpPass.getPassword());

            user = new UserClass(fname, lname, email, username, pass);
            DBHelper db = new DBHelper();

            if(db.checkEmail(user)){
                JOptionPane.showMessageDialog(null, "Email Already Exist");
            }else if(db.checkUsername(user)){
                JOptionPane.showMessageDialog(null, "Username Already Exist");
            }else if(fname.equals("") && fname.equals("") && email.equals("") && username.equals("")  && pass.equals("")){
                tfFname.setBorder(BorderFactory.createLineBorder(Color.RED)); 
                tfLname.setBorder(BorderFactory.createLineBorder(Color.RED)); 
                tfEmail.setBorder(BorderFactory.createLineBorder(Color.RED));
                tfUsername.setBorder(BorderFactory.createLineBorder(Color.RED)); 
                jpPass.setBorder(BorderFactory.createLineBorder(Color.RED)); 
            }else if(fname.equals("")){
                tfFname.setBorder(BorderFactory.createLineBorder(Color.RED)); 
            }else if(lname.equals("")){
                tfLname.setBorder(BorderFactory.createLineBorder(Color.RED));
            }else if(email.equals("")){
                tfEmail.setBorder(BorderFactory.createLineBorder(Color.RED));
            }else if(username.equals("")){
                tfUsername.setBorder(BorderFactory.createLineBorder(Color.RED)); 
            }else if(pass.equals("")){
                jpPass.setBorder(BorderFactory.createLineBorder(Color.RED)); 
            }else if(jpPass.getText().trim().length() <= 7 || jpPass.getText().trim().length() >= 16 ){
                lblCheckPass.setText(" Password must be 8-16 characters");
            }else{
                db.signup(user);
                this.setVisible(false);
                new DunggonSignIn().setVisible(true);
            }  
        }
    }//GEN-LAST:event_tfLnameKeyPressed

    private void tfEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfEmailKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            UserClass user;    
            String fname = tfFname.getText();
            String lname = tfLname.getText();
            String email = tfEmail.getText();
            String username = tfUsername.getText();
            String pass = String.valueOf(jpPass.getPassword());

            user = new UserClass(fname, lname, email, username, pass);
            DBHelper db = new DBHelper();

            if(db.checkEmail(user)){
                JOptionPane.showMessageDialog(null, "Email Already Exist");
            }else if(db.checkUsername(user)){
                JOptionPane.showMessageDialog(null, "Username Already Exist");
            }else if(fname.equals("") && fname.equals("") && email.equals("") && username.equals("")  && pass.equals("")){
                tfFname.setBorder(BorderFactory.createLineBorder(Color.RED)); 
                tfLname.setBorder(BorderFactory.createLineBorder(Color.RED)); 
                tfEmail.setBorder(BorderFactory.createLineBorder(Color.RED));
                tfUsername.setBorder(BorderFactory.createLineBorder(Color.RED)); 
                jpPass.setBorder(BorderFactory.createLineBorder(Color.RED)); 
            }else if(fname.equals("")){
                tfFname.setBorder(BorderFactory.createLineBorder(Color.RED)); 
            }else if(lname.equals("")){
                tfLname.setBorder(BorderFactory.createLineBorder(Color.RED));
            }else if(email.equals("")){
                tfEmail.setBorder(BorderFactory.createLineBorder(Color.RED));
            }else if(username.equals("")){
                tfUsername.setBorder(BorderFactory.createLineBorder(Color.RED)); 
            }else if(pass.equals("")){
                jpPass.setBorder(BorderFactory.createLineBorder(Color.RED)); 
            }else if(jpPass.getText().trim().length() <= 7 || jpPass.getText().trim().length() >= 16 ){
                lblCheckPass.setText(" Password must be 8-16 characters");
            }else{
                db.signup(user);
                this.setVisible(false);
                new DunggonSignIn().setVisible(true);
            }  
        }
    }//GEN-LAST:event_tfEmailKeyPressed

    private void tfUsernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfUsernameKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            UserClass user;    
            String fname = tfFname.getText();
            String lname = tfLname.getText();
            String email = tfEmail.getText();
            String username = tfUsername.getText();
            String pass = String.valueOf(jpPass.getPassword());

            user = new UserClass(fname, lname, email, username, pass);
            DBHelper db = new DBHelper();

            if(db.checkEmail(user)){
                JOptionPane.showMessageDialog(null, "Email Already Exist");
            }else if(db.checkUsername(user)){
                JOptionPane.showMessageDialog(null, "Username Already Exist");
            }else if(fname.equals("") && fname.equals("") && email.equals("") && username.equals("")  && pass.equals("")){
                tfFname.setBorder(BorderFactory.createLineBorder(Color.RED)); 
                tfLname.setBorder(BorderFactory.createLineBorder(Color.RED)); 
                tfEmail.setBorder(BorderFactory.createLineBorder(Color.RED));
                tfUsername.setBorder(BorderFactory.createLineBorder(Color.RED)); 
                jpPass.setBorder(BorderFactory.createLineBorder(Color.RED)); 
            }else if(fname.equals("")){
                tfFname.setBorder(BorderFactory.createLineBorder(Color.RED)); 
            }else if(lname.equals("")){
                tfLname.setBorder(BorderFactory.createLineBorder(Color.RED));
            }else if(email.equals("")){
                tfEmail.setBorder(BorderFactory.createLineBorder(Color.RED));
            }else if(username.equals("")){
                tfUsername.setBorder(BorderFactory.createLineBorder(Color.RED)); 
            }else if(pass.equals("")){
                jpPass.setBorder(BorderFactory.createLineBorder(Color.RED)); 
            }else if(jpPass.getText().trim().length() <= 7 || jpPass.getText().trim().length() >= 16 ){
                lblCheckPass.setText(" Password must be 8-16 characters");
            }else{
                db.signup(user);
                this.setVisible(false);
                new DunggonSignIn().setVisible(true);
            }  
        }
    }//GEN-LAST:event_tfUsernameKeyPressed

    private void jpPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jpPassKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            UserClass user;    
            String fname = tfFname.getText();
            String lname = tfLname.getText();
            String email = tfEmail.getText();
            String username = tfUsername.getText();
            String pass = String.valueOf(jpPass.getPassword());

            user = new UserClass(fname, lname, email, username, pass);
            DBHelper db = new DBHelper();

            if(db.checkEmail(user)){
                JOptionPane.showMessageDialog(null, "Email Already Exist");
            }else if(db.checkUsername(user)){
                JOptionPane.showMessageDialog(null, "Username Already Exist");
            }else if(fname.equals("") && fname.equals("") && email.equals("") && username.equals("")  && pass.equals("")){
                tfFname.setBorder(BorderFactory.createLineBorder(Color.RED)); 
                tfLname.setBorder(BorderFactory.createLineBorder(Color.RED)); 
                tfEmail.setBorder(BorderFactory.createLineBorder(Color.RED));
                tfUsername.setBorder(BorderFactory.createLineBorder(Color.RED)); 
                jpPass.setBorder(BorderFactory.createLineBorder(Color.RED)); 
            }else if(fname.equals("")){
                tfFname.setBorder(BorderFactory.createLineBorder(Color.RED)); 
            }else if(lname.equals("")){
                tfLname.setBorder(BorderFactory.createLineBorder(Color.RED));
            }else if(email.equals("")){
                tfEmail.setBorder(BorderFactory.createLineBorder(Color.RED));
            }else if(username.equals("")){
                tfUsername.setBorder(BorderFactory.createLineBorder(Color.RED)); 
            }else if(pass.equals("")){
                jpPass.setBorder(BorderFactory.createLineBorder(Color.RED)); 
            }else if(jpPass.getText().trim().length() <= 7 || jpPass.getText().trim().length() >= 16 ){
                lblCheckPass.setText(" Password must be 8-16 characters");
            }else{
                db.signup(user);
                this.setVisible(false);
                new DunggonSignIn().setVisible(true);
            }  
        }
    }//GEN-LAST:event_jpPassKeyPressed

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
            java.util.logging.Logger.getLogger(DunggonSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DunggonSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DunggonSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DunggonSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DunggonSignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ex;
    private javax.swing.JLabel Min;
    private javax.swing.JLabel background;
    private javax.swing.JLabel btnClickHere;
    private javax.swing.JLabel btnEx;
    private javax.swing.JPasswordField jpPass;
    private javax.swing.JLabel lblCheckPass;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFname;
    private javax.swing.JLabel lblLname;
    private javax.swing.JLabel lblPError;
    private javax.swing.JLabel lblPError1;
    private javax.swing.JLabel lblPError10;
    private javax.swing.JLabel lblPError11;
    private javax.swing.JLabel lblPError12;
    private javax.swing.JLabel lblPError2;
    private javax.swing.JLabel lblPError3;
    private javax.swing.JLabel lblPError4;
    private javax.swing.JLabel lblPError8;
    private javax.swing.JLabel lblPError9;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblRegister;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblbBack;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfFname;
    private javax.swing.JTextField tfLname;
    private javax.swing.JTextField tfUsername;
    // End of variables declaration//GEN-END:variables
}
