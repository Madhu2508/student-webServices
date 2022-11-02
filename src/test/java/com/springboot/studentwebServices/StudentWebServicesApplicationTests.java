package com.springboot.studentwebServices;

import com.springboot.studentwebServices.model.Student;
import com.springboot.studentwebServices.repository.StudentRepository;
import com.springboot.studentwebServices.service.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@SpringBootTest
class StudentWebServicesApplicationTests {

	@Autowired
	StudentService service;

	@MockBean
	StudentRepository repository;

	@Test
	void getStudentTest() {
		when(repository.findAll()).thenReturn(Stream.of(new Student("1","M", "P"),
				new Student("2","s", "P")).collect(Collectors.toList()));
		assertEquals(2, service.getAll().size());
	}

	@Test
	void saveStudentTest(){
		Student student = new Student("1","Madhu","Pune");
		when(repository.save(student)).thenReturn(student);
		assertEquals(student, service.add(student));
	}
	/*@Test
	void getByIdTest(){
		String id = "1";
		when(repository.findById(id)).thenReturn(Stream.of(new Student("1","M","P")).collect(Collectors.toList()));
		assertEquals(1, service.getStudentById(id));
	}*/

	@Test
	void deleteStudentTest(){
		String id = "1";
		service.delete(id);
		verify(repository, times(1)).deleteById(id);
	}

	@Test
	void updateStudentTest(){
		String id = "1";
		Student student = new Student("1","P","s");

	}



}
