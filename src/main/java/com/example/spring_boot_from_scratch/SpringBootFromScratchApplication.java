package com.example.spring_boot_from_scratch;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring_boot_from_scratch.student.Student;

@SpringBootApplication
@RestController
public class SpringBootFromScratchApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootFromScratchApplication.class, args);
	}

	@GetMapping("/")
	public List<Student> hello() {
		return List.of(new Student(
				1L,
				"Paulo Bruno",
				"paulo.bf111@gmail.com",
				LocalDate.of(2000, Month.JANUARY, 12),
				12));
	}

}
