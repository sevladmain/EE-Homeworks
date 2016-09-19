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
@WebServlet(urlPatterns = "/delete-todo.do")
public class DeleteToDoServlet extends HttpServlet {
    private ToDoService service = new ToDoService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        service.deleteTask(new ToDo(request.getParameter("todo"), request.getParameter("category")));
        response.sendRedirect("/list-todos.do");
    }
}
