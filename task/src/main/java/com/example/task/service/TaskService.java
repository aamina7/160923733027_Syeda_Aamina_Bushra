package com.example.task.service;

import com.example.task.model.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {
    private List<Task> tasks = new ArrayList<>();
    private Long nextId = 1L;

    public Task createTask(Task task) {
        task.setId(nextId++);
        tasks.add(task);
        return task;
    }

    public Task getTaskById(Long id) {
        return tasks.stream()
                .filter(t -> t.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public List<Task> getAllTasks() {
        return tasks;
    }

    public Task updateTask(Long id, Task updatedTask) {
        Task existing = getTaskById(id);
        if (existing != null) {
            existing.setTitle(updatedTask.getTitle());
            existing.setDescription(updatedTask.getDescription());
            existing.setStatus(updatedTask.getStatus());
            return existing;
        }
        return null;
    }

    public boolean deleteTask(Long id) {
        return tasks.removeIf(t -> t.getId().equals(id));
    }
}
