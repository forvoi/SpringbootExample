package cn.itcast.springboot.controller;

import cn.itcast.springboot.empty.Student;
import cn.itcast.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 定义Student控制类
 */
@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping({"/student"})
    public String student(@RequestParam Integer num){
        Student student = studentService.findStudent(num);
        return student.toString();
    }
}
