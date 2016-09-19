package com.goit.homeworks.module8;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by SeVlad on 19.09.2016.
 */
@WebServlet(urlPatterns = "/list-todos.do")
public class ListToDoServlet extends HttpServlet {
    private ToDoService service = new ToDoService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("todos", service.getToDos());
        request.getRequestDispatcher("list-todos.jsp").forward(request, response);
    }
}
