import javax.servlet.*;

public class AppListener implements ServletContextListener {
    
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("✅ Application Started: " + sce.getServletContext().getContextPath());
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("🛑 Application Stopped: " + sce.getServletContext().getContextPath());
    }
}
