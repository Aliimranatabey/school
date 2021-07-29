package com.example.school.service;

import java.util.List;
import java.util.Optional;
import com.example.school.entity.Student;
import com.example.school.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student findById(long id) {
        Optional<Student> result = studentRepository.findById(id);
        return result.get();
    }

    public String saveStudent(Student student) {
        studentRepository.save(student);
        return "Added";
    }

    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    public void delete(long id) {
        studentRepository.deleteById(id);
    }

    public String updateStudent(Student student) {
        studentRepository.saveAndFlush(student);
        return "Updated";
    }
}
