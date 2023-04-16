
package Conn;

import java.sql.*;


public class Conn {
    
    public Connection c;
    public Statement s;
    
    public Conn(){
        // 5 steps
   
        try{
            // 1st Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //2nd Create Connection
            c = DriverManager.getConnection("jdbc:mysql:///hotel_management_system","root","");
            
            // 3rd Create Statement to execute Query
            s = c.createStatement();
        }
        catch(Exception ex) {
            ex.printStackTrace();
	}
        
    }
}


// 4th Executing mySQL queries