package servlets;
import java.io.IOException;

import java.io.PrintWriter;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import database.Delsql;

@WebServlet("/delete")
public class DeleteServlet extends HttpServlet{



	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{


		Delsql del= new Delsql();
		
	//	Addsql add= new Addsql();
		String name=req.getParameter("name");
		int acno= Integer.parseInt(req.getParameter("acno"));
		//ADDusertable ad= new ADDusertable();
		PrintWriter out = res.getWriter();
		res.setContentType("text/html");
		
		if(del.delete(acno,name))
		{
			
			RequestDispatcher rd= req.getRequestDispatcher("delete.jsp");
			out.println("Customer deleted...");
			rd.include(req, res);
		}
		else {
			RequestDispatcher rd= req.getRequestDispatcher("delete.jsp");
			out.println("Unable to delete the Customer...");
			rd.include(req, res);
		}
		
	}




}
