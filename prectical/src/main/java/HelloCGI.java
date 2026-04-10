import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FormServlet")
public class HelloCGI extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Set response content type
        response.setContentType("text/html");

        // Get form parameters
        String name = request.getParameter("name");
        String email = request.getParameter("email");

        // Generate HTML response
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Form Response</title></head><body>");
        out.println("<h1>Hello, " + name + "!</h1>");
        out.println("<p>Your email is: " + email + "</p>");
        out.println("</body></html>");
    }
}
