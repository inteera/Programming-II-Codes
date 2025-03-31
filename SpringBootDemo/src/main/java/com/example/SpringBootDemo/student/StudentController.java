package com.example.SpringBootDemo.student;

import java.time.LocalDate;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {
    
    @GetMapping
    public List<Student> hello(){
        return List.of(new Student(1, "Arda", "ardavecoskun@gmail.com", LocalDate.of(2006, 10, 4), 18));
    }
    
}
