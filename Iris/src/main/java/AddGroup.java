import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class AddGroup extends javax.swing.JFrame {
    ImageIcon icon;

    public AddGroup() {
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
        btnCancel = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add Group");
        setBackground(new java.awt.Color(255, 250, 250));
        setResizable(false);

        addPanel.setBackground(new java.awt.Color(255, 250, 250));
        addPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 156, 255), 2), "Group Information", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("sansserif", 3, 12), new java.awt.Color(0, 156, 255))); // NOI18N
        addPanel.setForeground(new java.awt.Color(0, 156, 255));
        addPanel.setFont(new java.awt.Font("sansserif", 3, 14)); // NOI18N
        addPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFName.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lblFName.setForeground(new java.awt.Color(0, 156, 255));
        lblFName.setText("Name:");
        addPanel.add(lblFName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        tfFName.setBackground(new java.awt.Color(248, 248, 255));
        tfFName.setForeground(new java.awt.Color(51, 51, 51));
        addPanel.add(tfFName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 230, -1));

        lblLName.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lblLName.setForeground(new java.awt.Color(0, 156, 255));
        lblLName.setText("Description: (optional)");
        addPanel.add(lblLName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        tfLName.setBackground(new java.awt.Color(248, 248, 255));
        tfLName.setForeground(new java.awt.Color(51, 51, 51));
        addPanel.add(tfLName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 230, -1));

        lblMobile.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lblMobile.setForeground(new java.awt.Color(0, 156, 255));
        lblMobile.setText("Members:");
        addPanel.add(lblMobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

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
        addPanel.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 480, -1, -1));

        btnAdd.setBackground(new java.awt.Color(40, 155, 15));
        btnAdd.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 250, 250));
        btnAdd.setText("Add");
        btnAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        addPanel.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, -1, -1));

        jScrollPane1.setBackground(new java.awt.Color(248, 248, 255));
        jScrollPane1.setForeground(new java.awt.Color(248, 248, 255));

        jList1.setBackground(new java.awt.Color(248, 248, 255));
        jList1.setForeground(new java.awt.Color(69, 73, 74));
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 5", "Item 5", "Item 5", "Item 5", "Item 5", "Item 5", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.setSelectionBackground(new java.awt.Color(0, 156, 255));
        jList1.setSelectionForeground(new java.awt.Color(255, 250, 250));
        jScrollPane1.setViewportView(jList1);

        addPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 230, 190));

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

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        addGroup();
        dispose();
    }//GEN-LAST:event_btnAddActionPerformed

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

    private void addGroup() {
        String name = tfFName.getText();
        String description = tfLName.getText();

        try {
            Connection conn = null;
            Statement stmt = null;
            conn = JDBCCon.getCon();
            stmt = (Statement) conn.createStatement();
            ResultSet myRs;
            myRs = stmt.executeQuery("SELECT * FROM `groups` WHERE Name = '" + name + "' ;");
            if (myRs.next() == false) {
                stmt.executeUpdate("INSERT INTO `groups`(`Name`, `Description`) VALUES ('" + name + "' , '" + description + "')");
            } else {
                JOptionPane.showMessageDialog(null, "group already exists", "Error message", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {
            System.out.println("Error in addGroup function : " + e);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addPanel;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFName;
    private javax.swing.JLabel lblLName;
    private javax.swing.JLabel lblMobile;
    private javax.swing.JTextField tfFName;
    private javax.swing.JTextField tfLName;
    // End of variables declaration//GEN-END:variables
}
