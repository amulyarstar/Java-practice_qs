import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

// Servlet to read cookie value from browser
public class ReadCookieServlet extends HttpServlet {

    // Handles GET request
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Setting response type
        response.setContentType("text/html");

        // PrintWriter object to display output
        PrintWriter out = response.getWriter();

        // Fetch all cookies from browser
        Cookie[] cookies = request.getCookies();

        // Check if cookies exist
        if (cookies != null) {

            // Traverse cookies using for-each loop
            for (Cookie c : cookies) {

                // Check cookie name
                if (c.getName().equals("userRole")) {

                    // Display cookie value
                    out.println("<h3>Cookie Value: " + c.getValue() + "</h3>");
                }
            }

        } else {

            // If no cookies available
            out.println("<h3>No cookies found.</h3>");
        }

        // Close stream
        out.close();
    }
}
