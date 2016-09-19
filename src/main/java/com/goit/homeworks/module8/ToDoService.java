package com.goit.homeworks.module8;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SeVlad on 19.09.2016.
 */
public class ToDoService {
    private static List<ToDo> toDos = new ArrayList<>();
    static {
        toDos.add(new ToDo("1st Task", "Category1"));
        toDos.add(new ToDo("2nd Task", "Category2"));
        toDos.add(new ToDo("3rd Task", "Category3"));
    }

    public List<ToDo> getToDos() {
        return toDos;
    }
    public void addTask(ToDo task){
        toDos.add(task);
    }
    public void deleteTask(ToDo task){
        toDos.remove(task);
    }
}
