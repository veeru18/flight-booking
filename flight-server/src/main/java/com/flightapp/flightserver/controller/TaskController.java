package com.flightapp.flightserver.controller;

import com.flightapp.flightserver.model.Task;
import com.flightapp.flightserver.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TaskController {
    @Autowired
    TaskService taskService;
    @GetMapping("/")
    public String helloWorld() {
        return "Hello from Spring Boot";
    }
    @PostMapping("/add-task")
    public String addTask(@RequestBody String taskName ) {
        //TaskService taskService =  new TaskService();
        return taskService.addTask(taskName);
    }
    @GetMapping("/fetch-tasks")
    public List<Task> fetchTasks() {
        return taskService.fetchTasks();
    }

    @DeleteMapping("/delete-task")
    public void deleteTask(@RequestBody String taskName) {
        taskService.deleteTask(taskName);
    }
}