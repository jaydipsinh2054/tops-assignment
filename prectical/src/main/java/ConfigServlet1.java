import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Not using @WebServlet annotation since it's configured via web.xml
@WebServlet(urlPatterns = "/config")
public class ConfigServlet1 extends HttpServlet {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config); // Always call super.init
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Set content type
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Get ServletConfig object
        ServletConfig config = getServletConfig();

        out.println("<html><body>");
        out.println("<h2>Initialization Parameters</h2>");

        // Get all init parameters
        Enumeration<String> paramNames = config.getInitParameterNames();
        while (paramNames.hasMoreElements()) {
            String paramName = paramNames.nextElement();
            String paramValue = config.getInitParameter(paramName);
            out.println("<p><b>" + paramName + "</b>: " + paramValue + "</p>");
        }

        out.println("</body></html>");
        out.close();
    }
}
