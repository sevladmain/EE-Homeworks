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
@WebServlet(urlPatterns = "/add-todo.do")
public class AddToDoServlet extends HttpServlet {
    private ToDoService service = new ToDoService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("list-todos.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String newToDo = request.getParameter("new-todo");
        String category = request.getParameter("new-category");
        service.addTask(new ToDo(newToDo, category));
        response.sendRedirect("/list-todos.do");
    }
}
