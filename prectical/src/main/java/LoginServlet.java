// LoginServlet.java
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Example credentials
        if ("admin".equals(username) && "admin123".equals(password)) {
            // Forward to success page
            RequestDispatcher rd = request.getRequestDispatcher("success.jsp");
            rd.forward(request, response);
        } else {
            // Include error page content with message
            request.setAttribute("errorMsg", "Invalid credentials. Try again.");
            RequestDispatcher rd = request.getRequestDispatcher("error.jsp");
            rd.include(request, response);
        }
    }
}
