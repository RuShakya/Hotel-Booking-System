
package RegisterNow;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import RegisterNow.RegisterTest;

public class RegisterJDBC {
	public boolean save(RegisterTest test) {
		//connect and insert
		boolean result = false;
		String sql = "INSERT INTO users VALUES(?,?,?,?,?,?,?)";
		try {
			//Class.forName("com.mysql.cj.jdbc.Driver");//load database driver
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/java_assignment2", "root", "");
                        
			PreparedStatement pstat=conn.prepareStatement(sql);
			pstat.setInt(1, test.getID());
			pstat.setString(2, test.getName());
			pstat.setString(3, test.getAddress());
			pstat.setString(4, test.getGender());
			pstat.setString(5, test.getPhone());
			pstat.setString(6, test.getEmail());
			pstat.setString(7, test.getUsername());
                        pstat.setString(8, test.getPassword());
                        pstat.setString(9, test.getRole());
                        pstat.setString(9, test.getCreditCardInfo());
			pstat.executeUpdate();      //Save
			pstat.close();
			conn.close();
			result=true;
		}
		catch(Exception ex) {
			System.out.println("Erro : "+ex.getMessage());
		}
		return result;
	}
}
