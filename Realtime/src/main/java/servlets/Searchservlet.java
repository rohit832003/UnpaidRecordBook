package servlets;
import java.io.IOException;


import java.io.PrintWriter;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import database.Searchsql;
@WebServlet("/search")
public class Searchservlet extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{


		Searchsql sea= new Searchsql();
	    String num=req.getParameter("acno");
		//int acno= Integer.parseInt(req.getParameter("acno"));
		//ADDusertable ad= new ADDusertable();
		PrintWriter out = res.getWriter();
		res.setContentType("text/html");
		
		if(sea.search(num))
		{
			
			RequestDispatcher rd= req.getRequestDispatcher("Search.jsp");
			out.println("Customer's ID no is : "+sea.iii+" "+" and Name is :"+ sea.nnn);
			rd.include(req, res);
		}
		else {
			RequestDispatcher rd= req.getRequestDispatcher("Search.jsp");
			out.println("Customer NOt Found");
			rd.include(req, res);
		}
		
	}




}
