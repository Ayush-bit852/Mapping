package com.example.Mapping.controller;


import com.example.Mapping.entity.Student;
import com.example.Mapping.exception.StudentNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private List<Student> students = new ArrayList<>();

    @GetMapping("/allStudents")
    public List<Student> getAllStudents() {
        return students;
    }

    @PostMapping("/create")
    public String createStudent(@RequestBody Student student) {
        students.add(student);
        return "Student created successfully!";
    }

    @GetMapping("/byId/{studentId}")
    public Student getStudentById(@PathVariable int studentId) {
        for (Student student : students) {
            if (student.getStudentId() == studentId) {
                return student;
            }
        }
        throw new StudentNotFoundException("Student not found with ID: " + studentId);
    }

    @DeleteMapping("/{studentId}")
    public String deleteStudent(@PathVariable int studentId) {
        return "Student deleted successfully!";
    }
}

