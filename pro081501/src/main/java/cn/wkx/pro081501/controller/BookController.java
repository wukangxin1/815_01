package cn.wkx.pro081501.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BookController {
    @GetMapping("/id")//查询一般使用
    @ResponseBody
    public String getById(){
        System.out.println("测试81501");
        return "测试81501id";
    }
    @GetMapping("/name")
    @ResponseBody
    public String getByName(){
        System.out.println("测试81501");
        return "测试81501name";
    }

    @PostMapping("/id")//新增提交
    @ResponseBody
    public String postById(){
        System.out.println("测试81501");
        return "测试81501postid";
    }
    @PostMapping("/name")//新增提交
    @ResponseBody
    public String potByName(){
        System.out.println("测试81501");
        return "测试81501postname";
    }
    @DeleteMapping("/name/{id}")//新增提交
    @ResponseBody
    public String deleteByName(@PathVariable Integer id){
        System.out.println("测试81501");
        return "测试81501delete";
    }

}
