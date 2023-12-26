

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	String uname= request.getParameter("uname");
	String pass= request.getParameter("pass");
	
	if(uname.equals("Divya") && pass.equals("d@123"))
	{
		HttpSession session= request.getSession();
		session.setAttribute("username", uname);
		
		response.sendRedirect("welcome.jsp");
	}
	else
	{
		response.sendRedirect("login.jsp");
	}
	}

}
