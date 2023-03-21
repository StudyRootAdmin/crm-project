package com.bjpowernode.service.impl;

import com.bjpowernode.dao.StudentMapper;
import com.bjpowernode.model.Student;
import com.bjpowernode.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @programName: StudentServiceImpl
 * @description:
 * @author: V
 * @date: 2023年03月09日 0:14
 * @version: 1.0
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentMapper studentMapper;

    /**
     *  @Transactional :表示给该方法开启事务支持
     *      默认配置 :
     *          使用库的隔离级别 ,
     *          REQUIRED 传播行为 ,
     *          超时时间 -1
     */
    @Transactional
    @Override
    public int addStudent(Student student) {
        System.out.println("业务方法addStudent");
        int rows = studentMapper.insert(student);
        System.out.println("执行sql语句");
        int i = 10/0;
        return rows;
    }
}
