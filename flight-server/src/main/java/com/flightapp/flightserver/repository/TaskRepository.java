package com.flightapp.flightserver.repository;

import com.flightapp.flightserver.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, String> {
    @Query(nativeQuery = true,value = "select * from task")
    List<Task> fetchTasks();
    Task findByName(String name);
}
