

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class MyServlet2
 */
@WebServlet("/MyServlet2")
public class MyServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		try{
		      response.setContentType("text/html");
		      PrintWriter pwriter = response.getWriter();
		      HttpSession session=request.getSession(false);
		      String myName=(String)session.getAttribute("uname");
		      String myPass=(String)session.getAttribute("upass");
		      pwriter.print("Name: "+myName+" Pass: "+myPass);
		      pwriter.close();
		  }catch(Exception exp){
		      System.out.println(exp);
		   }
	}

}
