package exercise.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// BEGIN
@WebServlet("/")
public class WelcomeServlet extends HttpServlet {
    final String response = "Hello, Hexlet!";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        PrintWriter pw = resp.getWriter();
        pw.write(this.response);
        pw.close();
    }
}
// END
