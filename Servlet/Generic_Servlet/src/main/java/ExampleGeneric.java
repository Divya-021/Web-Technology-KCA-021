

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class ExampleGeneric
 */
@WebServlet("/ExampleGeneric")
public class ExampleGeneric extends GenericServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		   PrintWriter pwriter=response.getWriter();
		   pwriter.print("<html>");
		   pwriter.print("<body>");
		   pwriter.print("<h2>Generic Servlet Example</h2>");
		   pwriter.print("<p>Hello!</p>");
		   pwriter.print("</body>");
		   pwriter.print("</html>");
	}

}
