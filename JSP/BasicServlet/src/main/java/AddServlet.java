import java.io.IOException;
import java.io.PrintWriter;


import jakarta.servlet.http.HttpServletRequestWrapper;
import jakarta.servlet.http.HttpServletResponseWrapper;

/**
 * Servlet implementation class AddServlet
 */
@jakarta.servlet.annotation.WebServlet("/AddServlet")
public class AddServlet extends jakarta.servlet.http.HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequestWrapper request, HttpServletResponseWrapper response) throws jakarta.servlet.ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		int a= Integer.parseInt(request.getParameter("num1"));
		int b= Integer.parseInt(request.getParameter("num2"));
		int sum=a+b;
		PrintWriter out=response.getWriter();
		out.print("sum is: "+sum);
		//System.out.println("sum is: "+sum);
	}

}
