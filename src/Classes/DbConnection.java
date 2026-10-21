package Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
public class DbConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/tvet?useSSL=false";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public Connection dbConn() {
        
        Connection con = null;
        try {
            //Load driver(modern)
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Create connection
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            
            JOptionPane.showMessageDialog(null, "Database Connected Succsusfully");

        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        return con;

    }
}
