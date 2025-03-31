package com.todo.todoapp.task;

import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
    
    private final TaskRepository taskRepository;
    
    @Autowired
    public TaskService(TaskRepository taskRepository){
        this.taskRepository = taskRepository;
    }
    
    public List<Task> getTasks(){
        return taskRepository.findAll();
    }
    
    public List<Task> getDoneTasks(){
        return taskRepository.findTaskByStatusTrue();
    }
    
    public void addTask(Task task){
        if(taskRepository.findTaskByTitle(task.getTitle()).isPresent()){
            throw new IllegalStateException("The task with name '" + task.getTitle() + "' is already present.");
        }
        taskRepository.save(task);
    }
    
    @Transactional
    public void markTask(Long taskId, Boolean isDone){
        Task task = taskRepository.findById(taskId).orElseThrow(() -> new IllegalStateException("The task with id '" + taskId + "' is NOT present."));
        task.setIsDone(isDone);
    }
    
    public void deleteTask(Long taskId){
        taskRepository.deleteById(taskId);
    }
}
