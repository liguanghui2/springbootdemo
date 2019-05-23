package com.sstutu.service.impl;

import com.sstutu.bean.Student;
import com.sstutu.mapper.StudentMapper;
import com.sstutu.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student findStudentById(Long id) {
        return studentMapper.findStudentById(id);
    }
}
