package com.practice.springbootreactapp.service;

import com.practice.springbootreactapp.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
