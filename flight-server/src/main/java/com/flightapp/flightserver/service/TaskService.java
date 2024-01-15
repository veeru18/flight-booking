package com.flightapp.flightserver.service;

import com.flightapp.flightserver.model.Task;
import com.flightapp.flightserver.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {
    @Autowired
    TaskRepository taskRepository;
    private final List<Task> tasks =  new ArrayList<>();

    public String addTask(String taskName) {
        Task task =  new Task();
        task.setName(taskName);
        taskRepository.save(task);
        //tasks.add(task);
        return "Task added Successfully";
    }
    public List<Task> fetchTasks() {
        return taskRepository.fetchTasks();
        //return tasks;
    }

    public void deleteTask(String taskName) {
        Task task =  new Task();
        task.setName(taskName);
        taskRepository.delete(task);
       /* for(Task task :tasks) {
            if(taskName.equals(task.getName())) {
                tasks.remove(task);
            }
        }

        */
    }
}
