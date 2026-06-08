package com.example.student_management.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.student_management.entity.Student;
import com.example.student_management.repository.StudentRepository;

@Service
public class StudentService {

    private final StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public Student save(Student student) {
        return repository.save(student);
    }

    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    public Student updateStudent(Long id, Student student) {
    Student existing = repository.findById(id).orElseThrow();

    existing.setName(student.getName());
    existing.setCourse(student.getCourse());

    return repository.save(existing);
}


    public void deleteStudent(Long id) {
    repository.deleteById(id);
}
}