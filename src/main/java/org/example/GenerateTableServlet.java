package org.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/GenerateTableServlet")
public class GenerateTableServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String title = request.getParameter("title");
        int rows = Integer.parseInt(request.getParameter("rows"));
        int columns = Integer.parseInt(request.getParameter("columns"));
        String backgroundColor = request.getParameter("backgroundColor");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>" + title + "</title>");
        out.println("</head>");
        out.println("<body bgcolor='" + backgroundColor + "'>");
        out.println("<h1 align='center'>" + title + "</h1>");
        out.println("<table align='center'>");
        for (int i = 1; i <= rows; i++) {
            out.println("<tr>");
            for (int j = 1; j <= columns; j++) {
                out.println("<td>Row " + i + " Column " + j + "</td>");
            }
            out.println("</tr>");
        }
        out.println("</table>");
        out.println("</body>");
        out.println("</html>");
    }
}