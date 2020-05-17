package com.apress.bgg;

import java.util.List;
import java.util.ArrayList;

public class Todo {
    private String name;
    private String note;

    public Todo() {
    }

    public Todo(String name, String note) {
        this.name = name;
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public static void main(String[] args) {
        List<Todo> todos = new ArrayList<Todo>();
        todos.add(new Todo("1", "one"));
        todos.add(new Todo("2", "two"));
        todos.add(new Todo("3", "three"));
        for (Todo todo : todos) {
            System.out.println(todo.getName() + " " + todo.getNote());
        }
    }
}
