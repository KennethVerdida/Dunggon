/**
 **@author: Palma, Julieta
 **@date: March 7, 2020
 **/

import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class DunggonSignIn extends javax.swing.JFrame {
    
    public DunggonSignIn() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        showPass = new javax.swing.JCheckBox();
        Min = new javax.swing.JLabel();
        Ex = new javax.swing.JLabel();
        ebtnClickHere = new javax.swing.JLabel();
        pfPass = new javax.swing.JPasswordField();
        tfUname = new javax.swing.JTextField();
        lblPError = new javax.swing.JLabel();
        lblUError = new javax.swing.JLabel();
        lblbLogin = new javax.swing.JLabel();
        lblbBack = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        showPass.setBackground(new java.awt.Color(255, 255, 255));
        showPass.setSelected(true);
        showPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/0DSHOWEYES.png"))); // NOI18N
        showPass.setInheritsPopupMenu(true);
        showPass.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/0DEYES.jpg"))); // NOI18N
        showPass.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/0DSHOWEYES.png"))); // NOI18N
        showPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPassActionPerformed(evt);
            }
        });
        getContentPane().add(showPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, 25, 15));

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

        ebtnClickHere.setIcon(new javax.swing.ImageIcon(getClass().getResource("/0DSU.png"))); // NOI18N
        ebtnClickHere.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ebtnClickHereMouseClicked(evt);
            }
        });
        getContentPane().add(ebtnClickHere, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 450, -1, 40));

        pfPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pfPassKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pfPassKeyReleased(evt);
            }
        });
        getContentPane().add(pfPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 240, 30));

        tfUname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUnameActionPerformed(evt);
            }
        });
        tfUname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfUnameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfUnameKeyReleased(evt);
            }
        });
        getContentPane().add(tfUname, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 240, 30));

        lblPError.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblPError.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lblPError, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 310, 30, 30));

        lblUError.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblUError.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lblUError, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, 30, 30));

        lblbLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/0DLI.png"))); // NOI18N
        lblbLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblbLoginMouseClicked(evt);
            }
        });
        getContentPane().add(lblbLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, -1, -1));

        lblbBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/0ARROW.png"))); // NOI18N
        lblbBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblbBackMouseClicked(evt);
            }
        });
        getContentPane().add(lblbBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 40, 30));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/22DSUP.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setSize(new java.awt.Dimension(800, 628));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfUnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUnameActionPerformed
       
    }//GEN-LAST:event_tfUnameActionPerformed

    private void ebtnClickHereMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ebtnClickHereMouseClicked
        this.setVisible(false);
        new DunggonSignUp().setVisible(true);
    }//GEN-LAST:event_ebtnClickHereMouseClicked

    private void MinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_MinMouseClicked

    private void ExMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExMouseClicked
        System.exit(0);
    }//GEN-LAST:event_ExMouseClicked

    private void tfUnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfUnameKeyReleased
        lblUError.setText("");
    }//GEN-LAST:event_tfUnameKeyReleased

    private void pfPassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pfPassKeyReleased
        lblPError.setText("");
    }//GEN-LAST:event_pfPassKeyReleased

    private void lblbLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblbLoginMouseClicked
        UserClass user;
        String username = tfUname.getText();
        String pass = String.valueOf(pfPass.getPassword());
        
        user = new UserClass(username, pass);
        DBHelper db = new DBHelper();
        
        if(username.trim().isEmpty() && pass. trim().isEmpty()){
            lblUError.setText(" !");
            lblPError.setText(" !");
        }else if(username.trim().isEmpty()){
            lblUError.setText(" !");
        }else if(pass.trim().isEmpty()){
            lblPError.setText(" !");
        }else{                              
            switch(db.signin(user)){
                case 0: JOptionPane.showMessageDialog(null, "Incorrect Username Or Password", "Login Failed", 2);
                            break;
                case 1: this.setVisible(false);
                        new DunggonAdmin().setVisible(true);
                        break;
                case 2: this.setVisible(false);
                        new DunggonCounselMenu().setVisible(true);
                        break;
            }           
        }
        
    }//GEN-LAST:event_lblbLoginMouseClicked

    private void showPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPassActionPerformed
        if(showPass.isSelected()){
            pfPass.setEchoChar((char)0);
        }
        else{
            pfPass.setEchoChar('*'); 
        }
    }//GEN-LAST:event_showPassActionPerformed

    private void lblbBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblbBackMouseClicked
        this.setVisible(false);
        new DunggonMenu().setVisible(true);
    }//GEN-LAST:event_lblbBackMouseClicked

    private void tfUnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfUnameKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            UserClass user;
            String username = tfUname.getText();
            String pass = String.valueOf(pfPass.getPassword());

            user = new UserClass(username, pass);
            DBHelper db = new DBHelper();

            if(username.trim().isEmpty() && pass. trim().isEmpty()){
                lblUError.setText(" !");
                lblPError.setText(" !");
            }else if(username.trim().isEmpty()){
                lblUError.setText(" !");
            }else if(pass.trim().isEmpty()){
                lblPError.setText(" !");
            }else{                     
                switch(db.signin(user)){
                    case 0: JOptionPane.showMessageDialog(null, "Incorrect Username Or Password", "Login Failed", 2);
                            break;
                    case 1: this.setVisible(false);
                            new DunggonAdmin().setVisible(true);
                            break;
                    case 2: this.setVisible(false);
                            new DunggonCounselMenu().setVisible(true);
                            break;
                }
            }
        }
    }//GEN-LAST:event_tfUnameKeyPressed

    private void pfPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pfPassKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            UserClass user;
            String username = tfUname.getText();
            String pass = String.valueOf(pfPass.getPassword());

            user = new UserClass(username, pass);
            DBHelper db = new DBHelper();

            if(username.trim().isEmpty() && pass. trim().isEmpty()){
                lblUError.setText(" !");
                lblPError.setText(" !");
            }else if(username.trim().isEmpty()){
                lblUError.setText(" !");
            }else if(pass.trim().isEmpty()){
                lblPError.setText(" !");
            }else{                   
                switch(db.signin(user)){
                    case 0: JOptionPane.showMessageDialog(null, "Incorrect Username Or Password", "Login Failed", 2);
                            break;
                    case 1: this.setVisible(false);
                            new DunggonAdmin().setVisible(true);
                            break;
                    case 2: this.setVisible(false);
                            new DunggonCounselMenu().setVisible(true);
                            break;
                }         
            }
        }
    }//GEN-LAST:event_pfPassKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new DunggonSignIn().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ex;
    private javax.swing.JLabel Min;
    private javax.swing.JLabel background;
    private javax.swing.JLabel ebtnClickHere;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblPError;
    private javax.swing.JLabel lblUError;
    private javax.swing.JLabel lblbBack;
    private javax.swing.JLabel lblbLogin;
    private javax.swing.JPasswordField pfPass;
    private javax.swing.JCheckBox showPass;
    private javax.swing.JTextField tfUname;
    // End of variables declaration//GEN-END:variables
}
