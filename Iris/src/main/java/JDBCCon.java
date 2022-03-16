import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCCon {

    public JDBCCon() {
        super();
    }

    private static Connection conn = null;
    private static JDBCCon instance;

    static {
        String url = "jdbc:mysql://localhost/iris";
        String user = "root";
        String pass = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, pass);
            System.out.println("Database Connected.");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Exception in DB connection: " + e);
        }
    }

    public static Connection getCon() {
        
        return conn;
    }
    
    public static JDBCCon getInstance() throws SQLException {
        if (instance == null) {
            synchronized (JDBCCon.class){
                if (instance == null) {
                    instance = new JDBCCon();
                } else if (instance.getCon().isClosed()) {
                    instance = new JDBCCon();
                }
            }
        }

        return instance;
    }
}