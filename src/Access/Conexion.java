package Access;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {

Connection con=null;
Statement st=null;
	
	public Conexion() {
		try {
			String rutafile="C:\\Curso\\DBaccess.accdb";
			String Url="jdbc:ucanaccess://"+rutafile;
			con=DriverManager.getConnection(Url);
		}catch(SQLException e){
			
			System.out.println("Conexion erronea"+e);
		}
	}
	}
