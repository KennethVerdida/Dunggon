/**
 **@author: Verdida, Kenneth Mae
 **@date: March 1, 2020
 **/

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DunggonCheckAppointment extends javax.swing.JFrame {
   
    public DunggonCheckAppointment() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtAppointment = new javax.swing.JTable();
        lblSearch = new javax.swing.JLabel();
        tfSearch = new javax.swing.JTextField();
        Min = new javax.swing.JLabel();
        Ex = new javax.swing.JLabel();
        cbApp = new javax.swing.JComboBox<>();
        btnBack = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtAppointment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Age", "Birthday", "Gender", "Schedule"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtAppointment.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtAppointment);
        if (jtAppointment.getColumnModel().getColumnCount() > 0) {
            jtAppointment.getColumnModel().getColumn(0).setResizable(false);
            jtAppointment.getColumnModel().getColumn(0).setPreferredWidth(130);
            jtAppointment.getColumnModel().getColumn(1).setResizable(false);
            jtAppointment.getColumnModel().getColumn(1).setPreferredWidth(400);
            jtAppointment.getColumnModel().getColumn(2).setResizable(false);
            jtAppointment.getColumnModel().getColumn(2).setPreferredWidth(50);
            jtAppointment.getColumnModel().getColumn(3).setResizable(false);
            jtAppointment.getColumnModel().getColumn(3).setPreferredWidth(110);
            jtAppointment.getColumnModel().getColumn(4).setResizable(false);
            jtAppointment.getColumnModel().getColumn(4).setPreferredWidth(100);
            jtAppointment.getColumnModel().getColumn(5).setResizable(false);
            jtAppointment.getColumnModel().getColumn(5).setPreferredWidth(170);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 900, 320));

        lblSearch.setText("Search Full Name");
        getContentPane().add(lblSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(616, 170, 110, 40));

        tfSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfSearchMouseClicked(evt);
            }
        });
        tfSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSearchActionPerformed(evt);
            }
        });
        tfSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfSearchKeyReleased(evt);
            }
        });
        getContentPane().add(tfSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 180, 240, -1));

        Min.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Min.setForeground(new java.awt.Color(255, 255, 255));
        Min.setText("  _  ");
        Min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinMouseClicked(evt);
            }
        });
        getContentPane().add(Min, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 0, -1, 30));

        Ex.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Ex.setForeground(new java.awt.Color(255, 255, 255));
        Ex.setText("  X");
        Ex.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExMouseClicked(evt);
            }
        });
        getContentPane().add(Ex, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 0, 30, 30));

        cbApp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Appointment ", "Short-Treatment Session", "Long-Treatment Session" }));
        cbApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAppActionPerformed(evt);
            }
        });
        getContentPane().add(cbApp, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 190, -1));

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 560, 80, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/33DCKA.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void tfSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSearchKeyReleased
       
    }//GEN-LAST:event_tfSearchKeyReleased

    private void tfSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfSearchMouseClicked
        
    }//GEN-LAST:event_tfSearchMouseClicked

    private void MinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_MinMouseClicked

    private void ExMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExMouseClicked
        int response =  JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Leave?",
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                        switch (response) {
                            case JOptionPane.NO_OPTION:
                                System.out.println("No button clicked");
                                this.setVisible(false);
                                new DunggonCheckAppointment().setVisible(true);
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

    private void cbAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAppActionPerformed
        DefaultTableModel table = (DefaultTableModel)jtAppointment.getModel();
        String appointment = cbApp.getSelectedItem().toString();
        if(appointment.equals("Short-Treatment Session")){
            DBHelper db = new DBHelper("Short");
            db.showRecords(table);
        }else if(appointment.equals("Long-Treatment Session")){
            DBHelper db = new DBHelper("Long");
            db.showRecords(table);
        }else{
            DBHelper db = new DBHelper();
            db.showRecords(table);
        }
    }//GEN-LAST:event_cbAppActionPerformed

    private void tfSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSearchActionPerformed
       DBHelper db = new DBHelper();
       String name = tfSearch.getText();
       String appointment = cbApp.getSelectedItem().toString();
       if(!db.search(name,appointment)){
            JOptionPane.showMessageDialog(null, "Patient not found.");
       }
    }//GEN-LAST:event_tfSearchActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.setVisible(false);
        new DunggonCounselMenu().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(DunggonCheckAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DunggonCheckAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DunggonCheckAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DunggonCheckAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DunggonCheckAppointment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ex;
    private javax.swing.JLabel Min;
    private javax.swing.JLabel background;
    private javax.swing.JButton btnBack;
    private javax.swing.JComboBox<String> cbApp;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtAppointment;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JTextField tfSearch;
    // End of variables declaration//GEN-END:variables
}
