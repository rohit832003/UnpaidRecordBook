package database;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;



public class Addsql extends Dbconnection{
	
	public Connection Con;
	int status =0;
	public boolean add(int num,String name)
	{
		try {
		Con=connect();
		PreparedStatement ps= Con.prepareStatement("insert into user(acno,name) values(?,?);");
		ps.setInt(1,num);
		ps.setString(2, name);


		ps.executeUpdate();
        ps.close();
//		Con.close();
		System.out.println("recorded suucesfully");
		status=1;
	
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		if(status==0)
		{
			return false;
		}
		else {
			return true;
		}
		
		
		
	}

} 
