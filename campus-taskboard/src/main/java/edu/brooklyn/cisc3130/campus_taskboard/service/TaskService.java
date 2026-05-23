package edu.brooklyn.cisc3130.campus_taskboard.service;

import edu.brooklyn.cisc3130.campus_taskboard.model.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class TaskService {
    
    private final List<Task> tasks = new ArrayList<>();
    private final AtomicInteger idGenerator = new AtomicInteger(1);
    
    public List<Task> getAllTasks() {
        return new ArrayList<>(tasks);
    }
    
    public Optional<Task> getTaskById(Integer id) {
        return tasks.stream()
                .filter(task -> task.getId().equals(id))
                .findFirst();
    }
    
    public Task createTask(Task task) {
        task.setId(idGenerator.getAndIncrement());
        if (task.getCompleted() == null) {
            task.setCompleted(false);
        }
        if (task.getPriority() == null || task.getPriority().isEmpty()) {
            task.setPriority("MEDIUM");
        }
        tasks.add(task);
        return task;
    }
    
    public Optional<Task> updateTask(Integer id, Task updatedTask) {
        return getTaskById(id).map(task -> {
            task.setTitle(updatedTask.getTitle());
            task.setDescription(updatedTask.getDescription());
            task.setCompleted(updatedTask.getCompleted());
            task.setPriority(updatedTask.getPriority());
            return task;
        });
    }
    
    public boolean deleteTask(Integer id) {
        return tasks.removeIf(task -> task.getId().equals(id));
    }
}