package com.springboot.studentwebServices.repository;

import com.springboot.studentwebServices.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {

    List<Student> studentList = new ArrayList<Student>();
    Student stud1 = new Student("1","Madhu","Pune");
    Student stud2= new Student("2","Suraj","Krakow");


    public List<Student> getStudent(){
        studentList.add(stud1);
        studentList.add(stud2);
        System.out.println(studentList);
        return studentList;
    }

    public String add(Student student) {
        studentList.add(student);
        return "Student added Successfully";
    }
}
