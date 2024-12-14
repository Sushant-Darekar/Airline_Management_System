package airlinemanagementsystem;

import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;
    
    public Conn() {
        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establish the connection
            c = DriverManager.getConnection("jdbc:mysql:///airlinemanagementsystem", "root", "root");
            
            // Create a statement object to execute queries
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    // Getter methods to access the connection and statement
    public Connection getConnection() {
        return c;
    }

    public Statement getStatement() {
        return s;
    }

    // Method to close resources (called when the work is finished)
    public void close() {
        try {
            if (s != null) s.close();
            if (c != null) c.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


