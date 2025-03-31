package com.example.SpringBootDemo.student;

import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private final StudentRepository studentRepository;
    
    @Autowired
    public StudentService(com.example.SpringBootDemo.student.StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    
    public List<Student> getStudents(){
        return studentRepository.findAll();
    }

    public void addStudent(Student student) {
        if(studentRepository.findStudentByEmail(student.getEmail()).isPresent()){
            throw new IllegalStateException("Email is taken");
        }
        studentRepository.save(student);
    }
    
    public void deleteStudent(Long studentId){
        if(!studentRepository.existsById(studentId)){
            throw new IllegalStateException("Student with id '" + studentId + "' does not exists.");
        }
        studentRepository.deleteById(studentId);
    }
    
    @Transactional
    public void updateStudent(Long studentId, String name, String email){
        Student student = studentRepository.findById(studentId)
                .orElseThrow(() -> new IllegalStateException(
                        "Student with id '" + studentId + "' does not exists."));
        
        student.setName(name);
        if(studentRepository.findStudentByEmail(email).isPresent()){
            throw new IllegalStateException(
                        "The email '" + email + "' is taken.");
        }
        student.setEmail(email);
        
    }
}
