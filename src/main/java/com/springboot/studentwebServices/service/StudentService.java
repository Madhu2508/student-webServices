package com.springboot.studentwebServices.service;

import com.springboot.studentwebServices.model.Student;
import com.springboot.studentwebServices.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository repository;

    List<Student> studentList = new ArrayList<>();

    public List<Student> getAll() {
        return (List<Student>) repository.findAll();
    }

    public Student add(Student student) {
        //return repository.add(student);
        return repository.save(student);
    }

    public void delete(String id) {
        repository.deleteById(id);
    }

    public Student getStudentById(String id) {
        return repository.findById(id).get();
    }

    public Student updateStudent(Student student) {
        for (int index = 0; index < studentList.size(); index++) {
            if (studentList.get(index).getId().equals(student.getId())) {
                studentList.get(index).setId(student.getId());
                studentList.get(index).setName(student.getName());
                studentList.get(index).setAddress(student.getAddress());
                return studentList.get(index);
            }
        }
        return repository.save(student);
    }
}
