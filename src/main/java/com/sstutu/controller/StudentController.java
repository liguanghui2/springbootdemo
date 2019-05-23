package com.sstutu.controller;

import com.sstutu.bean.Student;
import com.sstutu.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/get")
    public Student getStudentById(Long id) {
        return studentService.findStudentById(id);
    }
}
