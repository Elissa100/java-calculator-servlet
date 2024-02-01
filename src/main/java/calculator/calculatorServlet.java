package calculator;

import java.io.IOException;
import jakarta.servlet.http.*;
import jakarta.servlet.*;

public class calculatorServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            double num1 = Double.parseDouble(request.getParameter("num1"));
            double num2 = Double.parseDouble(request.getParameter("num2"));
            String operation = request.getParameter("operation");

            double result = 0;
            switch (operation) {
                case "add":
                    result = num1 + num2;
                    break;
                case "subtract":
                    result = num1 - num2;
                    break;
                case "multiply":
                    result = num1 * num2;
                    break;
                case "divide":
                    if (num2 == 0) {
                        response.getWriter().println("Error: Division by zero is not allowed.");
                        return;
                    }
                    result = num1 / num2;
                    break;
                default:
                    response.getWriter().println("Error: Invalid operation.");
                    return;
            }

            response.setContentType("text/html");
            response.getWriter().println("<h2>Result: " + result + "</h2>");
        } catch (NumberFormatException e) {
            response.setContentType("text/html");
            response.getWriter().println("<h2>Error: Invalid number format.</h2>");
        }
    }
}