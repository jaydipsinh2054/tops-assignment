import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HeaderServlet")
public class p7 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Set content type for the response
        response.setContentType("text/html");

        // Add custom response headers
        response.setHeader("X-Custom-Header", "MyCustomValue");
        response.setHeader("X-App-Version", "1.0");

        PrintWriter out = response.getWriter();
        out.println("<html><head><title>HTTP Headers Example</title></head><body>");
        out.println("<h2>HTTP Request Headers</h2>");
        out.println("<table border='1' cellpadding='5'><tr><th>Header Name</th><th>Header Value</th></tr>");

        // Get all request headers
        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String headerName = headerNames.nextElement();
            String headerValue = request.getHeader(headerName);
            out.println("<tr><td>" + headerName + "</td><td>" + headerValue + "</td></tr>");
        }

        out.println("</table>");
        out.println("<p>Custom response headers have been sent:</p>");
        out.println("<ul>");
        out.println("<li>X-Custom-Header: MyCustomValue</li>");
        out.println("<li>X-App-Version: 1.0</li>");
        out.println("</ul>");
        out.println("</body></html>");
    }

    // Optional: handle POST requests the same way
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
