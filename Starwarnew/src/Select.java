import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Select {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String strClassName = "com.mysql.jdbc.Driver";
			String dbName= "toto"; 
			String login= "root"; 
			String motdepasse= ""; 
			String strUrl = "jdbc:mysql://localhost/" +  dbName;

			Class.forName(strClassName);
			Connection conn = DriverManager.getConnection(strUrl, login, motdepasse);
			Statement stselect = conn.createStatement();  
			//stselect.executeUpdate("SELECT * FROM film;");
			
			String stQuery = "SELECT * FROM film;";
			ResultSet rsSelect = stselect.executeQuery(stQuery);
			while(rsSelect.next()) {
				System.out.print("Titre : " + rsSelect.getString("Titre") +" La date de Sortie est : " + rsSelect.getString("sortie") + " Il s'agit de L'épisode : " + rsSelect.getString("numero") + " Il a couter :" + rsSelect.getInt("cout") + " Avec une recette de " +rsSelect.getInt("recette"));
			}

			conn.close();
		}
		catch(Exception e) {  
			e.printStackTrace();
			
		}
		
	}

}
