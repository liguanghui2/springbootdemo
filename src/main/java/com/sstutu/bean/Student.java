package com.sstutu.bean;

import lombok.Data;
import lombok.ToString;


@Data
@ToString
public class Student {

    /**
     * 主键ID
     */
    private Long id;
    /**
     * 学号
     */
    private String studentNumber;
    /**
     * 姓名
     */
    private String name;

    /**
     * 性别 1:男 2:女
     */
    private Integer sex;

    /**
     * 年龄
     */
    private Integer age;
}
