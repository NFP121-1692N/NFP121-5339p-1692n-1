//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import javax.swing.JOptionPane;
//import java.sql.*;
//
///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//
///**
// *
// * @author Bachar
// */
//public class connection {
//    public static Connection ConnectDB() {
//        Connection conn = null;
//        Statement myStmt = null;
////		ResultSet myRs = null;
//        try {
//System.out.println("DEBUG MAIN : 5");
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            conn = DriverManager.getConnection("jdbc:mysql://localhost/iris", "root", "open");
//            System.out.println("Database Connected.");
//
////
////
////            myStmt = conn.createStatement();
////
////            // 3. Execute SQL query
////            myRs = myStmt.executeQuery("select * from contacts");
////
////            // 4. Process the result set
////            while (myRs.next()) {
////                    System.out.println(myRs.getString("Last_Name") + ", " + myRs.getString("First_Name"));
////            }
//
//
//
//        } catch (ClassNotFoundException | SQLException e) {
//            JOptionPane.showMessageDialog(null, "Database Connection Failed.");
//            System.out.println("Database.ConnectDB():" + e);
//        }
//
//        return conn;
//    }
//}
