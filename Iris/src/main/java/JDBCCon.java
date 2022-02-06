/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.*;
//import java.beans.Statement;

/**
 *
 * @author charbel
 */
public class JDBCCon {
    public JDBCCon (){
        super();
    }

    public static Connection getCon(){
        Connection conn = null;
        Statement stmt = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/iris", "root", "open");
        } catch (Exception e) {
            System.out.println("exception in DB connection : "+ e);
        }
        return conn;
    }
}
