import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException;

public class toto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try { 

	         String strClassName = "com.mysql.jdbc.Driver";

	         String dbName= "toto"; 

	         String login= "root"; 

	         String motdepasse= ""; 

	         String strUrl = "jdbc:mysql://localhost/" + dbName;



	         Class.forName(strClassName);

	         Connection conn = DriverManager.getConnection(strUrl, login, motdepasse);

	         // . . .
	         

	         conn.close();

	         }

	         catch(ClassNotFoundException e) { 

	            System.err.println("Driver non charg? !"); e.printStackTrace();

	         } catch(SQLException e) {

	            System.err.println("Autre erreur !"); e.printStackTrace();

	         }
	}

}
