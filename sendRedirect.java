import java.io.*;

import javax.servlet.*;

import javax.servlet.http.*;

public class RedirectDemo
        extends HttpServlet {

    public void doGet(
            HttpServletRequest req,
            HttpServletResponse res)
            throws IOException {

        res.setContentType(
                "text/html");

        PrintWriter out =
                res.getWriter();

        out.println(
                "Redirecting...");

        // Redirect to another page
        res.sendRedirect(
                "https://www.google.com");
    }
}
