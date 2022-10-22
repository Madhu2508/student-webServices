package com.springboot.studentwebServices.controller;

import com.springboot.studentwebServices.model.Student;
import com.springboot.studentwebServices.repository.StudentRepository;
import com.springboot.studentwebServices.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("/getStudents")
    public List<Student> getAllStudent(){
        return studentService.getAll();
    }

    @PostMapping("/addStudent")
    public String addStudent(@RequestBody Student student){
        return studentService.add(student);
    }
}
