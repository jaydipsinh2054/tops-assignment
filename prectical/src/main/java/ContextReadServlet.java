

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ContextReadServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ServletContext context = getServletContext();
        String message = (String) context.getAttribute("sharedMessage");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h2>Read from ServletContext: " + message + "</h2>");
    }
}

