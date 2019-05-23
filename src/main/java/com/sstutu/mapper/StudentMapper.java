package com.sstutu.mapper;

import com.sstutu.bean.Student;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

@Mapper
public interface StudentMapper {

    /**
     * 根据主键查询学生信息
     *
     * @param id
     * @return
     */
    Student findStudentById(Long id);

    /**
     * 根据姓名模糊查询学生信息
     *
     * @param name
     * @return
     */
    List<Student> findStudentByName(String name);
}
