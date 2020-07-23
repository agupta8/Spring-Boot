package com.example.ToDo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ToDo.model.ToDo;

public interface ToDoRepository extends JpaRepository<ToDo, Long>
{
    List<ToDo> findByUserName(String user);
}
