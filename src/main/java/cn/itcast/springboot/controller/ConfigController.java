package cn.itcast.springboot.controller;

import cn.itcast.springboot.config.SchoolConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 利用配置类
 * 读取配置类
 *
 */
@RestController
public class ConfigController {

    @Autowired
    SchoolConfig schoolConfig;

    @GetMapping({"GradeFrom Config"})
    public String getSchool(){
        return "school的grade为："+schoolConfig.getGrade()+"school的class为："+schoolConfig.getClassNum();
    }
}
