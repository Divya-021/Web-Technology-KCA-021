

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Validation
 */
@WebServlet("/Validation")
public class Validation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");      
	       PrintWriter pwriter = response.getWriter();                
	       String name=request.getParameter("uname");      
	       String pass=request.getParameter("upass");                
	       if(name.equals("divya") && pass.equals("d@123"))
	       {         
//	    	  request.setAttribute("uname", name);
//	          RequestDispatcher dis=request.getRequestDispatcher("WelcomeUser");          
//	          dis.forward(request, response);      
	    	 response.sendRedirect("WelcomeUser?uname="+name);  //url rewriting
	       }     
	       else
	       {      
	          pwriter.print("User name or password is incorrect!");          
	          RequestDispatcher dis=request.getRequestDispatcher("index.html");          
	          dis.include(request, response);                                
	       }      
	}

}
