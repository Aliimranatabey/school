package com.example.school.controller;

import java.util.List;
import com.example.school.entity.Student;
import com.example.school.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    List<Student> all() {
        return studentService.findAll();
    }

    @PostMapping("/students")
    void addStudent(@RequestBody Student student) {
        studentService.saveStudent(student);
    }

    @GetMapping("/students/{id}")
    Student readStudent(@PathVariable Long id) {
        return studentService.findById(id);
    }

    @DeleteMapping("/students")
    public void deleteStudent(@RequestParam("id") Long id) {
        studentService.delete(id);
    }

    @PutMapping("/students")
    public void updateStudent(@RequestBody Student student) {
        studentService.updateStudent(student);
    }
}
