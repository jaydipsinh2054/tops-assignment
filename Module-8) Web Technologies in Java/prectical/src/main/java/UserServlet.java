import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Set response content type
        response.setContentType("text/html");

        // Get parameters from the form
        String name = request.getParameter("username");
        String email = request.getParameter("email");

        // Generate HTML response
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Servlet Response</title></head><body>");
        out.println("<h1>Hello, " + name + "!</h1>");
        out.println("<p>Your email is: " + email + "</p>");
        out.println("</body></html>");
    }
}
