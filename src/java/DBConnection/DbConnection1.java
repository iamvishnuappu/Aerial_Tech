/**
 * @author Administrator
 */

package DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class DbConnection1 {    
    private ResultSetMetaData rsm = null; 
    private Connection con = null;
    private Vector rowData = null;
    private Statement st = null;
    private ResultSet rs = null;        
    
    public DbConnection1() {
        try {
            if(con == null)
            {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection ("jdbc:mysql://localhost:3306/aerial_tech","root","");
                st = con.createStatement();
            }                    
        }        
        catch(ClassNotFoundException | SQLException er)
        {
            System.out.println("Access failed.." + er);
        }
    }
   
    public int putData(String qry) {
       try  {
           return st.executeUpdate(qry);
       }
       catch(SQLException e) {
           System.out.println("Access failed.." + e);
       }
       return 0;
    }
    
    public Vector getData(String qry){
        try {
            rowData = new Vector();
            rs = st.executeQuery(qry);
            rsm = rs.getMetaData();
            int colCount = rsm.getColumnCount();
            while(rs.next()) {
                Vector colVector = new Vector();
                for(int i=0; i<colCount; i++) {
                    colVector.add(rs.getString((i+1)));
                }
                rowData.add(colVector);
            }          
        }
        catch(SQLException e)  {
            System.out.println("Access failed..");
        }
        return rowData;
    }
}
