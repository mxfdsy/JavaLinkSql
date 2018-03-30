import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {
        String driverName  = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysq://locallhost:3306/mysql/xxx";
        String username = "root";
        String password = "cww963559210";
        Connection conn = null;
        try {
            Class.forName(driverName);
            conn = (Connection) DriverManager.getConnection(url,username,password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
