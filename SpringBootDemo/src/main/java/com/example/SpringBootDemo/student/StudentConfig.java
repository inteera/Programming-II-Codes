/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.SpringBootDemo.student;

import java.time.LocalDate;
import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
    
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student arda = new Student("Arda", "ardavecoskun@gmail.com", LocalDate.of(2006, 10, 4));
            Student ozgur = new Student("Ozgur", "ozgurvecoskun@gmail.com", LocalDate.of(2003, 3, 1));
            
            repository.saveAll(List.of(arda, ozgur));
        };
    }
}
