package com.h2example.h2.service;

import com.h2example.h2.repositories.InterfaceTaskDao;
import org.springframework.beans.factory.annotation.*;
import com.h2example.h2.models.Task;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService{

    @Autowired
    private InterfaceTaskDao taskDao;

    public List<Task> getTask() {
        return (List<Task>) taskDao.findAll();
    }
}
