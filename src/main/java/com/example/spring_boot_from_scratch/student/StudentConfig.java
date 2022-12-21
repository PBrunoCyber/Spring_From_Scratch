package com.example.spring_boot_from_scratch.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
    
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student mario = new Student("Mario Vergara", "marioVer@gmail.com", LocalDate.of(1978, Month.JANUARY, 11));
            Student fernanda = new Student("Fernanda Vasconcelos", "fer@gmail.com", LocalDate.of(1995, Month.JANUARY, 12));
            Student jose = new Student("Jose Maria", "joseMaria@gmail.com", LocalDate.of(1990, Month.JANUARY, 4));
            repository.saveAll(List.of(mario, fernanda, jose));
        };
    };
}
