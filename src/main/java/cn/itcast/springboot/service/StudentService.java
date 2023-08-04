package cn.itcast.springboot.service;

import cn.itcast.springboot.empty.Student;
import cn.itcast.springboot.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 定义StudentService
 */
@Service
public class StudentService {
    //注入mapper
    @Autowired
    StudentMapper studentMapper;

    public Student findStudent(Integer id){
        return studentMapper.findById(id);
    }

}
