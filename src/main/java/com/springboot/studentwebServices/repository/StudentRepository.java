package com.springboot.studentwebServices.repository;

import com.springboot.studentwebServices.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {

    List<Student> studentList = new ArrayList<Student>();


    public List<Student> getStudent(){
        return studentList;
    }

    public String add(Student student) {
        studentList.add(student);
        return "Student added Successfully";
    }

    public String delete(String id) {
        studentList.removeIf(student -> student.getId().equals(id));
        return "Removed Student Successfully";
    }

    public Student getStudentById(String id) {
        return studentList.stream().filter(student -> student.getId().equals(id)).findFirst().get();
    }

    public Student updateStudent(Student student) {
        Student student1 = new Student();
        int index;
        for(index = 0; index < studentList.size(); index++) {
            if (studentList.get(index).getId().equals(student.getId())) {
                student1.setId(student.getId());
                student1.setName(student.getName());
                student1.setAddress(student.getAddress());

            }
        }
            studentList.add(student1);
            return student1;
        }
}
