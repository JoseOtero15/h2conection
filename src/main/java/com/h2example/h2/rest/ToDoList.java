package com.h2example.h2.rest;

import com.h2example.h2.models.Task;
import com.h2example.h2.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping (value="todolist")
public class ToDoList {

    @Autowired
    private TaskService taskService;

    @GetMapping(value="tasks")
    public List<Task> getTasks() {
        return taskService.getTask();
    }



}

