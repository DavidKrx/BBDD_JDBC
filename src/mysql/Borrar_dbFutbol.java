package mysql;
import java.sql.*;

public class Borrar_dbFutbol {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
	Class.forName("com.mysql.jdbc.Driver");
		try {
			Connection miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_futbol?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
			
			Statement miStatement=miConexion.createStatement();
			
			ResultSet miResultset=miStatement.executeQuery("DELETE * FROM EQUIPOS");
			System.out.println("codEqui | NomEqui");
			while(miResultset.next()) {
				System.out.println(miResultset.getString("CodEquipo")+"  "+miResultset.getString("nomEquipo"));
			}
				
			
			
		}catch(Exception e) {
		System.out.println("No conecta");
		e.printStackTrace();
		}
		
	}
}
