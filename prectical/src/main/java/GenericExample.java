import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/GenericExample")
public class GenericExample extends GenericServlet {
    private static final long serialVersionUID = 1L;

    @Override
    public void service(ServletRequest request, ServletResponse response)
            throws ServletException, IOException {

        // Set content type
        response.setContentType("text/html");

        // Get PrintWriter
        PrintWriter out = response.getWriter();

        // Generate response
        out.println("<html><head><title>GenericServlet Example</title></head><body>");
        out.println("<h1>Hello from GenericServlet!</h1>");
        out.println("<p>This servlet is protocol-independent.</p>");
        out.println("</body></html>");
    }
}
