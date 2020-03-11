package packingms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 * @author Ajuna Michael
 */
public class connect {
Connection con;
Statement stmt;
ResultSet rs;
String username1, password1, path,query;
 int role ;
connect(){
    
        con = null;
        stmt =null;
        rs = null;
        username1 ="root";
        password1 ="";
        path="jdbc:mysql://localhost/mustparkingms";

}
/*Take in the username ans Password*/
public int login(String username, String password){
    try{
        Class.forName("com.mysql.jdbc.Driver");
        con= DriverManager.getConnection(path, username1, password1);
        stmt = con.createStatement();
        query= "SELECT * FROM login WHERE username ='"+username+"' AND passwrod = '"+password+"'";
        rs=stmt.executeQuery(query);
        if(rs.isBeforeFirst()){
            rs.next();
            role = Integer.parseInt(rs.getString("positionID"));
        }
        else{
            role =0;
        }
    }
    catch(ClassNotFoundException | SQLException ex){
        showMessageDialog(null, ex.getMessage());
    }
    
    return role;
}
}
