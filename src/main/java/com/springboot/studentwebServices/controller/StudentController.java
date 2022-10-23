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

    @GetMapping("/getStudentById/{id}")
    public Student getAllStudentById(@PathVariable("id") String id){
        return studentService.getStudentById(id);
    }

    @PostMapping("/addStudent")
    public String addStudent(@RequestBody Student student){
        return studentService.add(student);
    }

    @DeleteMapping("/deleteStudent/{id}")
    public String deleteStudent(@PathVariable("id") String id){
        return studentService.delete(id);
    }

    @PutMapping("/updateStudent")
    public Student updateStudent(@RequestBody Student student){
        return studentService.updateStudent(student);
    }
}
