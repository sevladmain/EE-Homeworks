package com.goit.homeworks.module8;

/**
 * Created by SeVlad on 19.09.2016.
 */
public class ToDo {
    private String name;
    private String category;

    public ToDo(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ToDo toDo = (ToDo) o;

        if (name != null ? !name.equals(toDo.name) : toDo.name != null) return false;
        return category != null ? category.equals(toDo.category) : toDo.category == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (category != null ? category.hashCode() : 0);
        return result;
    }
}
