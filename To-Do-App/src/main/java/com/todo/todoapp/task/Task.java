package com.todo.todoapp.task;
import jakarta.persistence.*;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private boolean status;
    
    public Task() {}
    
    public Task(String title, String description) {
        this.title = title;
        this.description = description;
    }
    
    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getIsDone() {
        return status;
    }

    public void setIsDone(Boolean isDone) {
        if(isDone == this.status) return;
        this.status = isDone;
    }
    
}
