package com.bjpowernode.controller;

import com.bjpowernode.model.Student;
import com.bjpowernode.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @programName: StudentController
 * @description:
 * @author: V
 * @date: 2023年03月09日 0:20
 * @version: 1.0
 */
@Controller
public class StudentController {

    @Resource
    private StudentService studentService;

    @RequestMapping("/addStudent")
    @ResponseBody
    public String addStudent(){
        Student student = new Student();
        student.setId(1);
        student.setName("张三");
        student.setAge(18);
        int i = studentService.addStudent(student);
        return "添加学生"+i;
    }

}
