import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ConfigServlet extends HttpServlet {

    private String adminEmail;
    private String supportContact;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);

        // Fetch initialization parameters from web.xml
        adminEmail = config.getInitParameter("adminEmail");
        supportContact = config.getInitParameter("supportContact");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h2>ServletConfig Example</h2>");
        out.println("<p>Admin Email: " + adminEmail + "</p>");
        out.println("<p>Support Contact: " + supportContact + "</p>");
        out.println("</body></html>");
    }
}
