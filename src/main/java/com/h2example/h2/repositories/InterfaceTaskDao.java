package com.h2example.h2.repositories;

import com.h2example.h2.models.Task;
import org.springframework.data.repository.CrudRepository;

public interface InterfaceTaskDao extends CrudRepository<Task, Long> {
}