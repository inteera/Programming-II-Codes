package com.todo.todoapp.task;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/tasks")
public class TaskController {
    private final TaskService taskService;
    
    @Autowired
    public TaskController(TaskService taskService){
        this.taskService = taskService;
    }
    
    @GetMapping
    public List<Task> getTasks(){
        return taskService.getTasks();
    }
    
    @GetMapping(path = "/done")
    public List<Task> getDoneTasks(){
        return taskService.getDoneTasks();
    }
    
    @PostMapping
    public void addTask(@RequestBody Task task){
        taskService.addTask(task);
    }
    
    @PutMapping(path = "/{taskId}")
    public void markTask(@PathVariable("taskId") Long taskId,
            @RequestParam("isDone") Boolean isDone){
        taskService.markTask(taskId, isDone);
    }
    
    @DeleteMapping(path = "/{taskId}")
    public void deleteTask(@PathVariable("taskId") Long taskId){
        taskService.deleteTask(taskId);
    }
}
