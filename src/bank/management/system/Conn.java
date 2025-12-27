
package bank.management.system;
import java.sql.*;

public class Conn {
    Connection c;
    Statement s;

    public Conn() {   // <-- Constructor, no return type
        try {
            // Register driver (optional for new versions)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create connection
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagementsystem", "root", "9118722202");

            // Create statement
            s = c.createStatement();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}


