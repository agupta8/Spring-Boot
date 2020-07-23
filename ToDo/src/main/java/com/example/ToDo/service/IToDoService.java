package com.example.ToDo.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.example.ToDo.model.ToDo;

public interface IToDoService
{
    void updateTodo(ToDo todo);

    void addTodo(String name, String desc, Date targetDate, boolean isDone);

    void deleteTodo(long id);

    void saveTodo(ToDo todo);

    List<ToDo> getTodosByUser(String user);

    Optional<ToDo> getTodoById(long id);
}
