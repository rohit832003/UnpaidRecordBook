package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/Login")
public class LoginServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest req,HttpServletResponse resp) throws IOException, ServletException
	{
		String username= (String)req.getParameter("name");
		String password= (String) req.getParameter("pass");
		
		if(username.equals("user") && password.equals("user"))
		{
			resp.sendRedirect("home.jsp");
		}
		else {
			PrintWriter out= resp.getWriter();
			resp.setContentType("text/html");
			out.println("Username and Password is incoreect:");
			//resp.sendRedirect("login.html");
			RequestDispatcher rd= req.getRequestDispatcher("login.html");
			rd.include(req, resp);
			
		}
		
	}

}
