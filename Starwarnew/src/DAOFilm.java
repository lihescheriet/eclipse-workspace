import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DAOFilm {
	/**
	 * contructeur qui doit charger le driver
	 */
	private Connection c;
	private Statement s;
	
	public DAOFilm() {
		try {
			String strClassName = "com.mysql.jdbc.Driver";
			String dbName= "toto"; 
			String login= "root"; 
			String motdepasse= ""; 
			String strUrl = "jdbc:mysql://localhost/" +  dbName;
			
			Class.forName(strClassName);
			Connection conn = DriverManager.getConnection(strUrl, login, motdepasse);
			Statement stblablou = conn.createStatement();
		}
		catch(Exception e) {  
			e.printStackTrace();
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
