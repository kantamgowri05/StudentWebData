package com.example.web.service;

import com.example.web.model.Student;
import com.example.web.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repo;

    public Student save(Student s) {
        return repo.save(s);
    }

    public List<Student> getAll() {
        return repo.findAll();
    }

    public List<Student> getByDept(String dept) {
        return repo.findByDepartment(dept);
    }

    public Page<Student> getPage(int page, int size) {
        return repo.findAll(PageRequest.of(page, size));
    }
}