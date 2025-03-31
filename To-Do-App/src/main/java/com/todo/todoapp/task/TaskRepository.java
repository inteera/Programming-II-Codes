package com.todo.todoapp.task;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long>{
    
    Optional<Task> findTaskByTitle(String title);
    List<Task> findTaskByStatusTrue();
}
