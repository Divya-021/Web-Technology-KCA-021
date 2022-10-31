

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ExampleHttpServlet
 */
@WebServlet("/ExampleHttpServlet")
public class ExampleHttpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String mymsg;
	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		 mymsg = "Http Servlet Demo";   
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	public void doGet(HttpServletRequest request, 
	        HttpServletResponse response) throws ServletException, 
	        IOException 
	    {            
	        // Setting up the content type of web page      
	        response.setContentType("text/html");
	        // Writing the message on the web page      
	        PrintWriter out = response.getWriter();      
	        out.println("<h1>" + mymsg + "</h1>");      
	        out.println("<p>" + "Hello Friends!" + "</p>");   
	    }

}
