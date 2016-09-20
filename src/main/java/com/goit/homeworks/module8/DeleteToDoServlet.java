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
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String[] toDelete = request.getParameterValues("deletedTasks");
        for (int i = toDelete.length - 1; i >= 0; i--) {
            service.getToDos().remove(Integer.parseInt(toDelete[i]));
        }
        response.sendRedirect("/list-todos.do");
    }
}
