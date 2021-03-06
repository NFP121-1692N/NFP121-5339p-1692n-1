import java.sql.Connection;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Home extends javax.swing.JFrame {
    ImageIcon icon;

    public Home() {
        initComponents();
        icon = new ImageIcon("images/logo.png");
        setIconImage(icon.getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        upPanel = new javax.swing.JPanel();
        lblHome = new javax.swing.JLabel();
        midPanel = new javax.swing.JPanel();
        sPane = new javax.swing.JScrollPane();
        dataTbl = new javax.swing.JTable();
        tfSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnAddCon = new javax.swing.JButton();
        btnEditCon = new javax.swing.JButton();
        btnDelCon = new javax.swing.JButton();
        lblContacts = new javax.swing.JLabel();
        btnGroups = new javax.swing.JButton();
        botPanel = new javax.swing.JPanel();
        credTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Iris");
        setBackground(new java.awt.Color(255, 250, 250));
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 600));

        upPanel.setBackground(new java.awt.Color(0, 156, 255));
        upPanel.setForeground(new java.awt.Color(255, 250, 250));
        upPanel.setPreferredSize(new java.awt.Dimension(1319, 100));
        getContacts();

        lblHome.setBackground(new java.awt.Color(0, 156, 255));
        lblHome.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        lblHome.setForeground(new java.awt.Color(255, 250, 250));
        lblHome.setText("Contacts");

        javax.swing.GroupLayout upPanelLayout = new javax.swing.GroupLayout(upPanel);
        upPanel.setLayout(upPanelLayout);
        upPanelLayout.setHorizontalGroup(
            upPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(upPanelLayout.createSequentialGroup()
                .addGap(570, 570, 570)
                .addComponent(lblHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(632, 632, 632))
        );
        upPanelLayout.setVerticalGroup(
            upPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(upPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(60, 60, 60))
        );

        getContentPane().add(upPanel, java.awt.BorderLayout.PAGE_START);

        midPanel.setBackground(new java.awt.Color(255, 250, 250));

        sPane.setBackground(new java.awt.Color(255, 250, 250));
        sPane.setName(""); // NOI18N

        dataTbl.setAutoCreateRowSorter(true);
        dataTbl.setBackground(new java.awt.Color(248, 248, 255));
        dataTbl.setForeground(new java.awt.Color(0, 156, 255));
        dataTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        getContacts();
        sPane.setViewportView(dataTbl);

        tfSearch.setBackground(new java.awt.Color(248, 248, 255));
        tfSearch.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        tfSearch.setForeground(new java.awt.Color(51, 51, 51));
        tfSearch.setToolTipText("Search by contact info ");
        tfSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tfSearch.setSelectionColor(new java.awt.Color(0, 156, 255));
        tfSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSearchActionPerformed(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(0, 156, 255));
        btnSearch.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 250, 250));
        btnSearch.setText("Search");
        btnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnRefresh.setBackground(new java.awt.Color(218, 165, 32));
        btnRefresh.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btnRefresh.setForeground(new java.awt.Color(255, 250, 250));
        btnRefresh.setText("Refresh");
        btnRefresh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnAddCon.setBackground(new java.awt.Color(40, 155, 15));
        btnAddCon.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnAddCon.setForeground(new java.awt.Color(255, 250, 250));
        btnAddCon.setText("Add");
        btnAddCon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddConActionPerformed(evt);
            }
        });

        btnEditCon.setBackground(new java.awt.Color(0, 156, 255));
        btnEditCon.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnEditCon.setForeground(new java.awt.Color(255, 250, 250));
        btnEditCon.setText("Edit");
        btnEditCon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditConActionPerformed(evt);
            }
        });

        btnDelCon.setBackground(new java.awt.Color(195, 5, 5));
        btnDelCon.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnDelCon.setForeground(new java.awt.Color(255, 250, 250));
        btnDelCon.setText("Delete");
        btnDelCon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelCon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDelConMouseClicked(evt);
            }
        });

        lblContacts.setBackground(new java.awt.Color(255, 250, 250));
        lblContacts.setFont(new java.awt.Font("sansserif", 3, 14)); // NOI18N
        lblContacts.setForeground(new java.awt.Color(0, 156, 255));
        lblContacts.setText("Contacts:");

        btnGroups.setBackground(new java.awt.Color(0, 156, 255));
        btnGroups.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btnGroups.setForeground(new java.awt.Color(255, 250, 250));
        btnGroups.setText("Groups");
        btnGroups.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGroups.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGroupsMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout midPanelLayout = new javax.swing.GroupLayout(midPanel);
        midPanel.setLayout(midPanelLayout);
        midPanelLayout.setHorizontalGroup(
            midPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(midPanelLayout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRefresh)
                .addGap(55, 55, 55)
                .addComponent(btnGroups)
                .addGap(85, 85, 85))
            .addComponent(sPane, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(midPanelLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(midPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(midPanelLayout.createSequentialGroup()
                        .addComponent(btnAddCon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditCon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelCon))
                    .addComponent(lblContacts))
                .addGap(90, 1125, Short.MAX_VALUE))
        );
        midPanelLayout.setVerticalGroup(
            midPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, midPanelLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(midPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch)
                    .addComponent(btnRefresh)
                    .addComponent(btnGroups))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(sPane, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblContacts)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(midPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelCon)
                    .addComponent(btnEditCon)
                    .addComponent(btnAddCon))
                .addGap(12, 12, 12))
        );

        sPane.getAccessibleContext().setAccessibleName("");

        getContentPane().add(midPanel, java.awt.BorderLayout.CENTER);

        botPanel.setBackground(new java.awt.Color(0, 156, 255));
        botPanel.setForeground(new java.awt.Color(255, 250, 250));
        botPanel.setToolTipText("");
        botPanel.setPreferredSize(new java.awt.Dimension(1319, 60));

        credTxt.setEditable(false);
        credTxt.setBackground(new java.awt.Color(0, 156, 255));
        credTxt.setFont(new java.awt.Font("sansserif", 3, 12)); // NOI18N
        credTxt.setForeground(new java.awt.Color(255, 250, 250));
        credTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        credTxt.setText("Iris - Developed by Bachar Sabra and Charbel El-Khoury.");
        credTxt.setBorder(null);

        javax.swing.GroupLayout botPanelLayout = new javax.swing.GroupLayout(botPanel);
        botPanel.setLayout(botPanelLayout);
        botPanelLayout.setHorizontalGroup(
            botPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botPanelLayout.createSequentialGroup()
                .addGap(402, 402, 402)
                .addComponent(credTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE)
                .addGap(428, 428, 428))
        );
        botPanelLayout.setVerticalGroup(
            botPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(credTxt)
                .addGap(30, 30, 30))
        );

        getContentPane().add(botPanel, java.awt.BorderLayout.PAGE_END);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSearchActionPerformed

        searchContacts();
    }//GEN-LAST:event_tfSearchActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed

        searchContacts();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnAddConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddConActionPerformed
        AddContact addContact = new AddContact();

        addContact.setVisible(true);
        addContact.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnAddConActionPerformed

    private void btnEditConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditConActionPerformed
        String selectedCellValue = (String) dataTbl.getValueAt(dataTbl.getSelectedRow(), 0);
        int value = Integer.parseInt(selectedCellValue);
        EditContact editContact = new EditContact(value);

        editContact.setVisible(true);
        editContact.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnEditConActionPerformed

    private void btnGroupsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGroupsActionPerformed
        Groups groups = new Groups();

        groups.setVisible(true);
        groups.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        dispose();
    }//GEN-LAST:event_btnGroupsActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed

        getContacts();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnDelConMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDelConMouseClicked

        String selectedCellValue = (String) dataTbl.getValueAt(dataTbl.getSelectedRow(), 0);
        int value = Integer.parseInt(selectedCellValue);

        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(null, "Are You Sure You Want to delete user with Id: " + value + " ?", "User Deletion", dialogButton);
        if (dialogResult == 0) {
            deleteContact(value);
            getContacts();
        } else {
            System.out.println("No Option");
        }
    }//GEN-LAST:event_btnDelConMouseClicked

    private void btnGroupsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGroupsMouseClicked

        Groups groups = new Groups();

        groups.setVisible(true);
        groups.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        dispose();
    }//GEN-LAST:event_btnGroupsMouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    private void getContacts() {
        try {
            Connection conn = null;
            Statement stmt = null;
            conn = JDBCCon.getCon();
            stmt = (Statement) conn.createStatement();
            ResultSet myRs;
            myRs = stmt.executeQuery("SELECT COUNT(*) AS recordCount FROM `contacts` ;");
            int count = 1;
            if (myRs.next()) {
                count = myRs.getInt("recordCount");
            }
            myRs = stmt.executeQuery("SELECT *  FROM `contacts` ;");
            String columns[] = {"ID", "First_Name", "Last_Name", "Mobile_No", "Landline_No", "E_Mail", "Address"};
            String data[][] = new String[count][7];
            int i = 0;
            while (myRs.next()) {
                int ID = myRs.getInt("ID");
                String First_Name = myRs.getString("First_Name");
                String Last_Name = myRs.getString("Last_Name");
                String Mobile_No = myRs.getString("Mobile_No");
                String Landline_No = myRs.getString("Landline_No");
                String E_Mail = myRs.getString("E_Mail");
                String Address = myRs.getString("Address");
                data[i][0] = ID + "";
                data[i][1] = First_Name;
                data[i][2] = Last_Name;
                data[i][3] = Mobile_No;
                data[i][4] = Landline_No;
                data[i][5] = E_Mail;
                data[i][6] = Address;
                i++;
            }
            DefaultTableModel model = new DefaultTableModel(data, columns);
            dataTbl.setModel(model);

        } catch (Exception e) {
            System.out.println("Error in getContacts function : " + e);
        }
    }

    private void searchContacts() {
        String search = tfSearch.getText();
        try {
            Connection conn = null;
            Statement stmt = null;
            conn = JDBCCon.getCon();
            stmt = (Statement) conn.createStatement();
            ResultSet myRs;
            int count = 1;
            myRs = stmt.executeQuery("SELECT COUNT(*) AS recordCount FROM `contacts`  WHERE First_Name = '" + search + "' OR Last_Name = '" + search + "' ;");

            if (myRs.next()) {
                count = myRs.getInt("recordCount");
            }
            myRs = stmt.executeQuery("SELECT * FROM `contacts` WHERE First_Name = '" + search + "' OR Last_Name = '" + search + "' ;");

            String columns[] = {"ID", "First_Name", "Last_Name", "Mobile_No", "Landline_No", "E_Mail", "Address"};
            String data[][] = new String[count][7];
            int i = 0;
            while (myRs.next()) {
                int ID = myRs.getInt("ID");
                String First_Name = myRs.getString("First_Name");
                String Last_Name = myRs.getString("Last_Name");
                String Mobile_No = myRs.getString("Mobile_No");
                String Landline_No = myRs.getString("Landline_No");
                String E_Mail = myRs.getString("E_Mail");
                String Address = myRs.getString("Address");
                data[i][0] = ID + "";
                data[i][1] = First_Name;
                data[i][2] = Last_Name;
                data[i][3] = Mobile_No;
                data[i][4] = Landline_No;
                data[i][5] = E_Mail;
                data[i][6] = Address;
                i++;
            }
            DefaultTableModel model = new DefaultTableModel(data, columns);
            dataTbl.setModel(model);

        } catch (Exception e) {
            System.out.println("Error in getContacts function : " + e);
        }
    }

    private void deleteContact(int contactId) {
        try {
            Connection conn = null;
            Statement stmt = null;
            conn = JDBCCon.getCon();
            stmt = (Statement) conn.createStatement();
            stmt.executeUpdate("DELETE FROM `contacts` WHERE ID = '" + contactId + "';");
        } catch (Exception e) {
            System.out.println("Error in getContacts function : " + e);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel botPanel;
    private javax.swing.JButton btnAddCon;
    private javax.swing.JButton btnDelCon;
    private javax.swing.JButton btnEditCon;
    private javax.swing.JButton btnGroups;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSearch;
    private javax.swing.JTextField credTxt;
    private javax.swing.JTable dataTbl;
    private javax.swing.JLabel lblContacts;
    private javax.swing.JLabel lblHome;
    private javax.swing.JPanel midPanel;
    private javax.swing.JScrollPane sPane;
    private javax.swing.JTextField tfSearch;
    private javax.swing.JPanel upPanel;
    // End of variables declaration//GEN-END:variables

}
