package com.example.web.controller;

import com.example.web.model.Student;
import com.example.web.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {

    @Autowired
    private StudentService service;

    // Home Page
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("students", service.getAll());
        return "index";
    }

    // Show Add Form
    @GetMapping("/add")
    public String addForm(Model model) {
        model.addAttribute("student", new Student());
        return "add";
    }

    // Save Student
    @PostMapping("/save")
    public String save(@ModelAttribute Student student) {
        service.save(student);
        return "redirect:/";
    }

    // Filter by department
    @GetMapping("/filter")
    public String filter(@RequestParam String dept, Model model) {
        model.addAttribute("students", service.getByDept(dept));
        return "index";
    }

    // Pagination
    @GetMapping("/page")
    public String page(@RequestParam int page, Model model) {
        model.addAttribute("students", service.getPage(page, 2).getContent());
        return "index";
    }
}