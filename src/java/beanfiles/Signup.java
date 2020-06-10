/**
 * @author mrvis
 */

package beanfiles;

import DBConnection.DbConnection1;
import java.util.Vector;
import javax.swing.JOptionPane;

public class Signup {
 String f_name, l_name, u_name, pass, re_pass;

    public String getF_name() {        
        return f_name;
    }

    public void setF_name(String f_name) {
        this.f_name= f_name;
    }
  
    public String getL_name() {
        return l_name;
    }

    public void setL_name(String l_name) {
        this.l_name = l_name;
    }
    
    public String getU_name() {
        return u_name;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getRe_Pass() {
        return re_pass;
    }

    public void setTxtReenter(String re_pass) {
        this.re_pass= re_pass;
    }
 
    private void init(){
        try {
            if(con == null)
                con=new DbConnection1();
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Connection error..");
        }        
    }
    
    public int putData(int opt){
        init();
        return con.putData(generateQuery(opt)); 
    }
    
    public Vector getData(int opt){
        init();
        return con.getData(generateQuery(opt));
    }
    
    private String generateQuery(int opt){
        String qry;
        if(opt==1) {  
            qry="insert into user(f_name, l_name, u_name, password)"
                + "values('"+getF_name()+"', '"+getL_name()+"', '"+getU_name()+"', '"+getPass()+"')";
            System.out.println(qry);
            return qry;        
        }
        return "";
    }
    DbConnection1 con; 
}
