package com.springboot.studentwebServices.repository;

import com.springboot.studentwebServices.model.Student;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepository extends CrudRepository<Student, String> {

}
