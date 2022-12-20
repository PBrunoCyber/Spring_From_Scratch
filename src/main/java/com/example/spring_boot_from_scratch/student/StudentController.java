package com.example.spring_boot_from_scratch.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService student) {
        this.studentService = student;
    }

    @GetMapping
    public List<Student> getStudents() {
        return studentService.getStudents();
    }
}
