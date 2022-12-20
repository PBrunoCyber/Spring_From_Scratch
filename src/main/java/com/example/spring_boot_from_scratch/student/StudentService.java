package com.example.spring_boot_from_scratch.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
    public List<Student> getStudents() {
        return List.of(new Student(
                1L,
                "Paulo Bruno",
                "paulo.bf111@gmail.com",
                LocalDate.of(2000, Month.JANUARY, 12),
                12));
    }
}
