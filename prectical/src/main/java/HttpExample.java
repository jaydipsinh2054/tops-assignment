import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HttpExample")
public class HttpExample extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Set content type
        response.setContentType("text/html");

        // Get PrintWriter
        PrintWriter out = response.getWriter();

        // Generate response
        out.println("<html><head><title>HttpServlet Example</title></head><body>");
        out.println("<h1>Hello from HttpServlet!</h1>");
        out.println("<p>This servlet is HTTP-specific and easier to use for web apps.</p>");
        out.println("</body></html>");
    }

    // Optional: handle POST requests
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
