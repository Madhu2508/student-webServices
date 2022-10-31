package com.springboot.studentwebServices.service;

import com.springboot.studentwebServices.model.Student;
import com.springboot.studentwebServices.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentService {
    @Autowired
     StudentRepository studentRepository;

    List<Student> studentList = new ArrayList<>();

    public List<Student> getAll() {
        return (List<Student>) studentRepository.findAll();
    }

    public Student add(Student student) {
        //return repository.add(student);
        return studentRepository.save(student);
    }

    public void delete(String id) {
        studentRepository.deleteById(id);
    }

    public Student getStudentById(String id) {
        return studentRepository.findById(id).get();
    }

    public Student updateStudent(Student student, String id) {
        Student studentNew = studentRepository.findById(id).get();
        if(studentNew.getId().equals(student.getId())) {
            studentNew.setId(student.getId());
            studentNew.setName(student.getName());
            studentNew.setAddress(student.getAddress());
            return studentRepository.save(studentNew);
        }
        return null;
    }
}
