import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class delete {
	
	public delete(int id) {
		try {
		String strClassName = "com.mysql.jdbc.Driver";
		String dbName= "toto"; 
		String login= "root"; 
		String motdepasse= ""; 
		String strUrl = "jdbc:mysql://localhost/" +  dbName;
		
		Class.forName(strClassName);
		Connection conn = DriverManager.getConnection(strUrl, login, motdepasse);
		Statement stselect = conn.createStatement();  
		stselect.executeUpdate("DELETE from film WHERE id = "+ id +";");
		conn.close();
		}
		catch(Exception e) {  
			e.printStackTrace();
			
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		delete suppr = new delete(1);

	}

}
