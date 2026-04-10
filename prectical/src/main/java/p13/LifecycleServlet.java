package p13;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Map the servlet to a URL
@WebServlet("/LifecycleServlet")
public class LifecycleServlet extends HttpServlet {

	@Override
	public void init() throws ServletException {
		super.init();
		System.out.println("init() method called - Servlet initialized");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("service() method called - Processing request");
		super.service(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGet() method called - Handling GET request");

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<html><body>");
		out.println("<h2>Hello from LifecycleServlet</h2>");
		out.println("</body></html>");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doPost() method called - Handling POST request");

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<html><body>");
		out.println("<h2>POST request received</h2>");
		out.println("</body></html>");
	}

	@Override
	public void destroy() {
		super.destroy();
		System.out.println("destroy() method called - Servlet is being destroyed");
	}
}