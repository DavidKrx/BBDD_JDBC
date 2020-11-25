package mysql;
import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.Statement;

public class Modifica_dbFutbol {
	public static void main(String[] args) throws ClassNotFoundException {

		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		try {
			Connection miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_futbol?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
			
			Statement miStatement=miConexion.createStatement();
			
			String modSql="INSERT INTO EQUIPOS (nomEquipo, codLiga, localidad, internacional)VALUES('fly', 'PDN', 'Picachu', 1)";
			
			miStatement.executeUpdate(modSql);

			System.out.println("Realizado");
			
			
		}catch(Exception e) {
		System.out.println("No conecta");
		e.printStackTrace();
		}
		
	}

}

