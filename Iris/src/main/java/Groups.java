import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Groups extends javax.swing.JFrame {
    ImageIcon icon;

    public Groups() {
        initComponents();
        initComponents();
        icon = new ImageIcon("images/logo.png");
        setIconImage(icon.getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        upPanel = new javax.swing.JPanel();
        lblGroup = new javax.swing.JLabel();
        midPanel = new javax.swing.JPanel();
        sPane = new javax.swing.JScrollPane();
        dataTbl = new javax.swing.JTable();
        tfSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnContacts = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnAddGrp = new javax.swing.JButton();
        btnEditGrp = new javax.swing.JButton();
        btnDelGrp = new javax.swing.JButton();
        lblContacts = new javax.swing.JLabel();
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

        lblGroup.setBackground(new java.awt.Color(0, 156, 255));
        lblGroup.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        lblGroup.setForeground(new java.awt.Color(255, 250, 250));
        lblGroup.setText("Groups");

        javax.swing.GroupLayout upPanelLayout = new javax.swing.GroupLayout(upPanel);
        upPanel.setLayout(upPanelLayout);
        upPanelLayout.setHorizontalGroup(
            upPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(upPanelLayout.createSequentialGroup()
                .addGap(570, 570, 570)
                .addComponent(lblGroup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(632, 632, 632))
        );
        upPanelLayout.setVerticalGroup(
            upPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(upPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblGroup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(60, 60, 60))
        );

        getContentPane().add(upPanel, java.awt.BorderLayout.PAGE_START);

        midPanel.setBackground(new java.awt.Color(255, 250, 250));

        sPane.setBackground(new java.awt.Color(255, 250, 250));

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
        getGroups();
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

        btnContacts.setBackground(new java.awt.Color(0, 156, 255));
        btnContacts.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btnContacts.setForeground(new java.awt.Color(255, 250, 250));
        btnContacts.setText("Contacts");
        btnContacts.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnContacts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContactsActionPerformed(evt);
            }
        });

        btnRefresh.setBackground(new java.awt.Color(218, 165, 32));
        btnRefresh.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btnRefresh.setForeground(new java.awt.Color(255, 250, 250));
        btnRefresh.setText("Refresh");
        btnRefresh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRefresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRefreshMouseClicked(evt);
            }
        });

        btnAddGrp.setBackground(new java.awt.Color(40, 155, 15));
        btnAddGrp.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnAddGrp.setForeground(new java.awt.Color(255, 250, 250));
        btnAddGrp.setText("Add");
        btnAddGrp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddGrp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddGrpActionPerformed(evt);
            }
        });

        btnEditGrp.setBackground(new java.awt.Color(0, 156, 255));
        btnEditGrp.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnEditGrp.setForeground(new java.awt.Color(255, 250, 250));
        btnEditGrp.setText("Edit");
        btnEditGrp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditGrp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditGrpActionPerformed(evt);
            }
        });

        btnDelGrp.setBackground(new java.awt.Color(195, 5, 5));
        btnDelGrp.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnDelGrp.setForeground(new java.awt.Color(255, 250, 250));
        btnDelGrp.setText("Delete");
        btnDelGrp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelGrp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelGrpActionPerformed(evt);
            }
        });

        lblContacts.setBackground(new java.awt.Color(255, 250, 250));
        lblContacts.setFont(new java.awt.Font("sansserif", 3, 14)); // NOI18N
        lblContacts.setForeground(new java.awt.Color(0, 156, 255));
        lblContacts.setText("Groups:");

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
                .addGap(53, 53, 53)
                .addComponent(btnContacts)
                .addGap(74, 74, 74))
            .addComponent(sPane, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(midPanelLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(midPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(midPanelLayout.createSequentialGroup()
                        .addComponent(btnAddGrp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditGrp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelGrp))
                    .addComponent(lblContacts))
                .addGap(90, 1058, Short.MAX_VALUE))
        );
        midPanelLayout.setVerticalGroup(
            midPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, midPanelLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(midPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch)
                    .addComponent(btnRefresh)
                    .addComponent(btnContacts))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(sPane, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblContacts)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(midPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelGrp)
                    .addComponent(btnEditGrp)
                    .addComponent(btnAddGrp))
                .addGap(12, 12, 12))
        );

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
                .addComponent(credTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
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
        searchGroups();
    }//GEN-LAST:event_tfSearchActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        searchGroups();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnContactsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContactsActionPerformed
        Home contacts = new Home();

        contacts.setVisible(true);
        contacts.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        dispose();
    }//GEN-LAST:event_btnContactsActionPerformed

    private void btnAddGrpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddGrpActionPerformed
        AddGroup addGroup = new AddGroup();

        addGroup.setVisible(true);
        addGroup.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnAddGrpActionPerformed

    private void btnEditGrpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditGrpActionPerformed
        EditGroup editGroup = new EditGroup();

        editGroup.setVisible(true);
        editGroup.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnEditGrpActionPerformed

    private void btnRefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRefreshMouseClicked
        getGroups();
    }//GEN-LAST:event_btnRefreshMouseClicked

    private void btnDelGrpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelGrpActionPerformed
        String selectedCellValue = (String) dataTbl.getValueAt(dataTbl.getSelectedRow(), 0);
        int value = Integer.parseInt(selectedCellValue);
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(null, "Are You Sure You Want to delete the group with Id: " + value + " ?", "User Deletion", dialogButton);
        if (dialogResult == 0) {
            deleteGroup(value);
            getGroups();
        } else {
            System.out.println("No Option");
        }
    }//GEN-LAST:event_btnDelGrpActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Groups.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Groups.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Groups.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Groups.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Groups().setVisible(true);
            }
        });
    }

    private void getGroups() {
        try {
            Connection conn = null;
            Statement stmt = null;
            conn = JDBCCon.getCon();
            stmt = (Statement) conn.createStatement();
            ResultSet myRs;
            myRs = stmt.executeQuery("SELECT COUNT(*) AS recordCount FROM `groups` ;");
            int count = 1;
            if (myRs.next()) {
                count = myRs.getInt("recordCount");
            }
            myRs = stmt.executeQuery("SELECT *  FROM `groups` ;");
            String columns[] = {"ID", "Name", "Description"};
            String data[][] = new String[count][3];
            int i = 0;
            while (myRs.next()) {
                int ID = myRs.getInt("ID");
                String Name = myRs.getString("Name");
                String Description = myRs.getString("Description");
                data[i][0] = ID + "";
                data[i][1] = Name;
                data[i][2] = Description;
                i++;
            }
            DefaultTableModel model = new DefaultTableModel(data, columns);
            dataTbl.setModel(model);

        } catch (Exception e) {
            System.out.println("Error in getGroups function : " + e);
        }
    }

    private void searchGroups() {
        String seach = tfSearch.getText();
        try {
            Connection conn = null;
            Statement stmt = null;
            conn = JDBCCon.getCon();
            stmt = (Statement) conn.createStatement();
            ResultSet myRs;
            myRs = stmt.executeQuery("SELECT COUNT(*) AS recordCount FROM `groups`WHERE Name = '" + seach + "' OR Description = '" + seach + "' ;");
            int count = 1;
            if (myRs.next()) {
                count = myRs.getInt("recordCount");
            }
            myRs = stmt.executeQuery("SELECT * FROM `groups` WHERE Name = '" + seach + "' OR Description = '" + seach + "' ;");
            String columns[] = {"ID", "Name", "Description"};
            String data[][] = new String[count][3];
            int i = 0;
            while (myRs.next()) {
                int ID = myRs.getInt("ID");
                String Name = myRs.getString("Name");
                String Description = myRs.getString("Description");
                data[i][0] = ID + "";
                data[i][1] = Name;
                data[i][2] = Description;
                i++;
            }
            DefaultTableModel model = new DefaultTableModel(data, columns);
            dataTbl.setModel(model);
        } catch (Exception e) {
            System.out.println("Error in searchGroups function : " + e);
        }

    }

    private void deleteGroup(int groupId) {
        try {
            Connection conn = null;
            Statement stmt = null;
            conn = JDBCCon.getCon();
            stmt = (Statement) conn.createStatement();
            stmt.executeUpdate("DELETE FROM `groups` WHERE ID = '" + groupId + "';");
        } catch (Exception e) {
            System.out.println("Error in getContacts function : " + e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel botPanel;
    private javax.swing.JButton btnAddGrp;
    private javax.swing.JButton btnContacts;
    private javax.swing.JButton btnDelGrp;
    private javax.swing.JButton btnEditGrp;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSearch;
    private javax.swing.JTextField credTxt;
    private javax.swing.JTable dataTbl;
    private javax.swing.JLabel lblContacts;
    private javax.swing.JLabel lblGroup;
    private javax.swing.JPanel midPanel;
    private javax.swing.JScrollPane sPane;
    private javax.swing.JTextField tfSearch;
    private javax.swing.JPanel upPanel;
    // End of variables declaration//GEN-END:variables
}
