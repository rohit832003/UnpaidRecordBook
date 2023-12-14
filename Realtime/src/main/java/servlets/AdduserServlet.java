package servlets;
import java.io.IOException;


import java.io.PrintWriter;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import database.Addsql;
@WebServlet("/newuser")
public class AdduserServlet extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{


		Addsql add= new Addsql();
		String name=req.getParameter("name");
		String acc=req.getParameter("acno");
		int acno= Integer.parseInt(req.getParameter("acno"));
		//ADDusertable ad= new ADDusertable();
		PrintWriter out = res.getWriter();
		res.setContentType("text/html");
		if(name.isBlank() || acc.isBlank())
		{
			RequestDispatcher rd= req.getRequestDispatcher("newuser.jsp");
			out.println("Nmae cannot be null");
			rd.include(req, res);
			
		}
		
		if(add.add(acno,name))
		{
			
			RequestDispatcher rd= req.getRequestDispatcher("newuser.jsp");
			out.println("Customer added successfully");
			rd.include(req, res);
		}
		else {
			RequestDispatcher rd= req.getRequestDispatcher("newuser.jsp");
			out.println("Customer not added ..Try again with diff acc no");
			rd.include(req, res);
		}
		
	}




}
