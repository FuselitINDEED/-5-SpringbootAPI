package edu.brooklyn.cisc3130.campus_taskboard.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Task {
    
    private Integer id;
    
    @NotBlank(message = "Title is required")
    @Size(min = 3, max = 100, message = "Title must be between 3 and 100 characters")
    private String title;
    
    @Size(max = 500, message = "Description cannot exceed 500 characters")
    private String description;
    
    private Boolean completed;
    
    private String priority; // "LOW", "MEDIUM", "HIGH"
    
    // Constructor for creating tasks without ID (ID will be auto-generated)
    public Task(String title, String description, Boolean completed, String priority) {
        this.title = title;
        this.description = description;
        this.completed = completed != null ? completed : false;
        this.priority = priority != null ? priority : "MEDIUM";
    }
}