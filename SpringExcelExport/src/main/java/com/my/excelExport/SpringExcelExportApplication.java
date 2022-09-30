package com.my.excelExport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.my.excelExport.model.Student;
import com.my.excelExport.repository.StudentRepository;

@SpringBootApplication
public class SpringExcelExportApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringExcelExportApplication.class, args);
	}
	
	@Autowired
	private StudentRepository studentRepo;

	@Override
	public void run(String... args) throws Exception {
		
		Student student = new Student(1, "Raja", "My Address Line 1", "jaipur", "360001");
		Student student1 = new Student(2, "Rani", "My Address Line 1", "Hiderabad", "360002");
		
		studentRepo.save(student);
		studentRepo.save(student1);
		
		
	}

}
