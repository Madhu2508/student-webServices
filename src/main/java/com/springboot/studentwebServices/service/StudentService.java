package com.springboot.studentwebServices.service;

import com.springboot.studentwebServices.model.Student;
import com.springboot.studentwebServices.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository repository;
    public List<Student> getAll() {
        return repository.getStudent();
    }

    public String add(Student student) {
        return repository.add(student);
    }

    public String delete(String id) {
       return repository.delete(id);
    }

    public Student getStudentById(String id) {
        return repository.getStudentById(id);
    }

    public Student updateStudent(Student student) {
        return repository.updateStudent(student);
    }
}
