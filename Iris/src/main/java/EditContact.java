import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;

public class EditContact extends javax.swing.JFrame {
    ImageIcon icon;
    private int selectedUserId = 0;

    public EditContact(int selectedCellValue) {
        this.selectedUserId = selectedCellValue;
        initComponents();
        icon = new ImageIcon("images/logo.png");
        setIconImage(icon.getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addPanel = new javax.swing.JPanel();
        lblFName = new javax.swing.JLabel();
        tfFName = new javax.swing.JTextField();
        lblLName = new javax.swing.JLabel();
        tfLName = new javax.swing.JTextField();
        lblMobile = new javax.swing.JLabel();
        tfMobile = new javax.swing.JTextField();
        lblLandline = new javax.swing.JLabel();
        tfLandline = new javax.swing.JTextField();
        lblEMail = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tfAddress = new javax.swing.JTextArea();
        btnCancel = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Edit Contact");
        setBackground(new java.awt.Color(255, 250, 250));
        setResizable(false);

        addPanel.setBackground(new java.awt.Color(255, 250, 250));
        addPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 156, 255), 2), "Contact Information", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("sansserif", 3, 12), new java.awt.Color(0, 156, 255))); // NOI18N
        addPanel.setForeground(new java.awt.Color(0, 156, 255));
        addPanel.setFont(new java.awt.Font("sansserif", 3, 14)); // NOI18N
        getContactInfo(this.selectedUserId);
        addPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFName.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lblFName.setForeground(new java.awt.Color(0, 156, 255));
        lblFName.setText("First Name:");
        addPanel.add(lblFName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        tfFName.setBackground(new java.awt.Color(248, 248, 255));
        tfFName.setForeground(new java.awt.Color(51, 51, 51));
        addPanel.add(tfFName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 230, -1));

        lblLName.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lblLName.setForeground(new java.awt.Color(0, 156, 255));
        lblLName.setText("Last Name:");
        addPanel.add(lblLName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        tfLName.setBackground(new java.awt.Color(248, 248, 255));
        tfLName.setForeground(new java.awt.Color(51, 51, 51));
        addPanel.add(tfLName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 230, -1));

        lblMobile.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lblMobile.setForeground(new java.awt.Color(0, 156, 255));
        lblMobile.setText("Mobile Number:");
        addPanel.add(lblMobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        tfMobile.setBackground(new java.awt.Color(248, 248, 255));
        tfMobile.setForeground(new java.awt.Color(51, 51, 51));
        addPanel.add(tfMobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 230, -1));

        lblLandline.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lblLandline.setForeground(new java.awt.Color(0, 156, 255));
        lblLandline.setText("Landline Number:");
        addPanel.add(lblLandline, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        tfLandline.setBackground(new java.awt.Color(248, 248, 255));
        tfLandline.setForeground(new java.awt.Color(51, 51, 51));
        addPanel.add(tfLandline, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 230, -1));

        lblEMail.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lblEMail.setForeground(new java.awt.Color(0, 156, 255));
        lblEMail.setText("E-Mail:");
        addPanel.add(lblEMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        tfEmail.setBackground(new java.awt.Color(248, 248, 255));
        tfEmail.setForeground(new java.awt.Color(51, 51, 51));
        addPanel.add(tfEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 230, -1));

        lblAddress.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lblAddress.setForeground(new java.awt.Color(0, 156, 255));
        lblAddress.setText("Address:");
        addPanel.add(lblAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        tfAddress.setBackground(new java.awt.Color(248, 248, 255));
        tfAddress.setColumns(20);
        tfAddress.setForeground(new java.awt.Color(51, 51, 51));
        tfAddress.setRows(5);
        jScrollPane1.setViewportView(tfAddress);

        addPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, -1));

        btnCancel.setBackground(new java.awt.Color(195, 5, 5));
        btnCancel.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 250, 250));
        btnCancel.setText("Cancel");
        btnCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        addPanel.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 520, -1, -1));

        btnEdit.setBackground(new java.awt.Color(0, 156, 255));
        btnEdit.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 250, 250));
        btnEdit.setText("Edit");
        btnEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        addPanel.add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(addPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(addPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        updateContact();
        dispose();
    }//GEN-LAST:event_btnEditActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddContact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddContact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddContact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddContact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddContact().setVisible(true);
            }
        });
    }

    private void getContactInfo(int userId) {
        try {
            Connection conn = null;
            Statement stmt = null;
            conn = JDBCCon.getCon();
            stmt = (Statement) conn.createStatement();
            ResultSet myRs;
            myRs = stmt.executeQuery("SELECT *  FROM `contacts` WHERE ID = '" + userId + "';");
            int i = 0;
            while (myRs.next()) {
                tfAddress.setText(myRs.getString("Address"));
                tfEmail.setText(myRs.getString("E_Mail"));
                tfFName.setText(myRs.getString("First_Name"));
                tfLName.setText(myRs.getString("Last_Name"));
                tfLandline.setText(myRs.getString("Landline_No"));
                tfMobile.setText(myRs.getString("Mobile_No"));
            }
        } catch (Exception e) {
            System.out.println("Error in getContactInfo function in edit: " + e);
        }
    }

    private void updateContact() {
        String address = tfAddress.getText();
        String email = tfEmail.getText();
        String fname = tfFName.getText();
        String lname = tfLName.getText();
        String landline = tfLandline.getText();
        String mobile = tfMobile.getText();

        try {
            Connection conn = null;
            Statement stmt = null;
            conn = JDBCCon.getCon();
            stmt = (Statement) conn.createStatement();
            ResultSet myRs;
            stmt.executeUpdate("UPDATE `contacts` SET `First_Name`= '"+fname+"',`Last_Name`= '"+lname+"',`Mobile_No`= '"+mobile+"',`Landline_No`= '"+landline+"',`E_Mail`= '"+email+"',`Address`= '"+address+"' WHERE ID = '"+this.selectedUserId+"'");

        } catch (Exception e) {
            System.out.println("Error in editContact function : " + e);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addPanel;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnEdit;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblEMail;
    private javax.swing.JLabel lblFName;
    private javax.swing.JLabel lblLName;
    private javax.swing.JLabel lblLandline;
    private javax.swing.JLabel lblMobile;
    private javax.swing.JTextArea tfAddress;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfFName;
    private javax.swing.JTextField tfLName;
    private javax.swing.JTextField tfLandline;
    private javax.swing.JTextField tfMobile;
    // End of variables declaration//GEN-END:variables
}
