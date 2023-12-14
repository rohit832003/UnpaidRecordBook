package database;





import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DBnewconn {
	public Connection coon = null;
	public Connection connect()
	{
		try {
			
		coon=DriverManager.getConnection("jdbc:mysql://localhost:3306/storemangement"," root","root");
		System.out.println("Connection Established");
		}
		catch(SQLException e){
			e.printStackTrace();
			}
		return coon;
	}
	public static void main(String[] args) {
		Dbconnection d = new Dbconnection();
		System.out.println("hiiii");
		d.connect();
		System.out.println("bye");
		
	}

}
