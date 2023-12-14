package database;

import java.sql.Connection;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;





public class Searchsql extends Dbconnection{
	
	public Connection Con;
	static ResultSet res;
	static Statement ps;
	int status =0;
	public  String nnn;
	public int iii;
	public boolean search(String num)
	{
		try {
		int nom =Integer.parseInt(num);
		String query="select * from user;";
		Con=connect();
		ps= Con.createStatement();
		res = ps.executeQuery(query);
        
		while(res.next())
		{
			int acno= res.getInt("acno");
		    String name= res.getString("name");
		    System.out.println(acno+"   "+ name);
		    if(acno==nom)
		    {
		    	nnn=name;
		    	iii=acno;
		    	
		    	
		    	System.out.println("Id is  :"+acno +"name is :"+ name);
		    }
		}
		
		status=1;
       System.out.println("recorded searched suucesfully");
		
	
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		 System.out.println("recorded searched suucesfully");
		if(status==0)
		{
			return false;
		}
		else {
			return true;
		}
		
		
		
	}
//public static void main(String[] args) {
//	Searchsql sl= new Searchsql();
//	sl.search("45");
//}
} 
   
