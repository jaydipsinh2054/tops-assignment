import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MyHttpServlet")
public class MyHttpServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // Handle GET request
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Set content type
        response.setContentType("text/html");

        // Get parameters from query string
        String name = request.getParameter("username");
        String email = request.getParameter("email");

        // Generate response
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>GET Response</title></head><body>");
        out.println("<h1>GET Request Received</h1>");
        out.println("<p>Name: " + (name != null ? name : "Not provided") + "</p>");
        out.println("<p>Email: " + (email != null ? email : "Not provided") + "</p>");
        out.println("</body></html>");
    }

    // Handle POST request
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Set content type
        response.setContentType("text/html");

        // Get parameters from POST body
        String name = request.getParameter("username");
        String email = request.getParameter("email");

        // Generate response
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>POST Response</title></head><body>");
        out.println("<h1>POST Request Received</h1>");
        out.println("<p>Name: " + name + "</p>");
        out.println("<p>Email: " + email + "</p>");
        out.println("</body></html>");
    }
}
