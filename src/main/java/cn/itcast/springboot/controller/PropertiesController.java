package cn.itcast.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 进行自定义配置
 * 演示读取配置的Controller
 *
 */
@RestController
public class PropertiesController {
    //配置value注解绑定自定义配置
    @Value("${school.grade}")
    Integer grade;

    @Value("${school.classNum}")
    Integer classNum;
    @GetMapping({"/grade"})
    public String gradeClass(){
        return "年级："+grade+"班级："+classNum;
    }
}
