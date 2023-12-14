package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delsql extends Dbconnection{
	public Connection Con;
	int status =0;
	public boolean delete(int num,String name)
	{
		try {
		Con=connect();
		PreparedStatement ps= Con.prepareStatement("delete from user where acno=? ;");
		ps.setInt(1,num);




		ps.executeUpdate();
        ps.close();
//		Con.close();
		System.out.println("recorded  deleted suucesfully");
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
