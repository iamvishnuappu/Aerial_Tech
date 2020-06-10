/**
 * @author mrvis
 */

package beanfiles;

import DBConnection.DbConnection1;
import java.util.Vector;
import javax.swing.JOptionPane;

public class Category   {
    String c_id, c_name,id;
    DbConnection1 con;

    public String getC_id() {
        return c_id;
    }

    public void setC_id(String c_id) {
        this.c_id = c_id;
    } 

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }  
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DbConnection1 getCon() {
        return con;
    }

    public void setCon(DbConnection1 con) {
        this.con = con;
    }

 
    //DbConnection1 con;
    
    private void init() {
        try {
            if (con == null)
                con = new DbConnection1();
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Connection error..");
        }        
    }
    
    public int putData(int opt) {
        init();
        return con.putData(generateQuery(opt)); 
    }
    
    public Vector getData(int opt) {
        init();
        return con.getData(generateQuery(opt));
    }
    
    private String generateQuery(int opt) {
        String str;
        switch (opt) {
            case 1:
                str="insert into category (c_id, c_name, u_name)"
                        + "values('"+getC_id()+"', '"+getC_name()+"', 'admin')";
                return str;
            case 2:
                str = "select * from category";
                return  str;
            case 3:
                str = "update category set c_id = '"+getC_id()+"', c_name='"+getC_name()+"' where c_id = '"+getId()+"'";
                System.out.println(str);
                return str;
            default:            
                break;
        }
        return "";
    }
}
