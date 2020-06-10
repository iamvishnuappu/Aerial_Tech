/**
 * @author admin
 */

package DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConnection {
    Connection con = null;
    Statement smt = null;
    ResultSet rst = null;

    public DBConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/aerial_tech", "root","");
            smt = con.createStatement();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void insert(String s) throws SQLException {
        smt.execute(s);
    }

    public ResultSet select(String s) throws SQLException {
        rst = smt.executeQuery(s);
        return rst;
    }    
}
