package cn.itcast.springboot.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("hello")
public class HelloController {

    //"?"请求传参
    @GetMapping({"/para/good"})
    public String getName(@RequestParam  Integer num){
        return "para from request"+num;
    }

    //“path”路径传参
    @GetMapping({"/para/{num}"})
    public String getMovie(@PathVariable Integer num){
        return "para from path"+num;
    }

    //多个指定路径
    @GetMapping({"/limit1", "/limit2"})
    public String getMany(@RequestParam Integer num){
        return "para from request many"+num;
    }

    //无参数，默认传递
    @GetMapping({"test"})
    public String hello(){
        return "hello Spring Boot !";
    }

    //设置默认参数
    @GetMapping({"/required"})
    public String required(@RequestParam(required=false,defaultValue = "100") Integer num){
        return "required+"+num;
    }
}
