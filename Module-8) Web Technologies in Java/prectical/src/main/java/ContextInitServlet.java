

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ContextInitServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        ServletContext context = getServletContext();
        context.setAttribute("sharedMessage", "Hello from ContextInitServlet!");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h2>Data stored in ServletContext</h2>");
    }
}

