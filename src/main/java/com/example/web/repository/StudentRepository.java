package com.example.web.repository;

import com.example.web.model.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> findByDepartment(String department);

    Page<Student> findByDepartment(String department, Pageable pageable);
}