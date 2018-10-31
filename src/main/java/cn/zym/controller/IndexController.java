package cn.zym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.ws.RequestWrapper;

/**
 * @author ZhangYimeng
 * @date 2018/10/31 0031 10:49
 **/
@Controller
@RequestMapping("index")
public class IndexController {

    /**
    * 主页
    *@Author ZhangYimeng
    *@Date 2018/10/31 0031 13:53
    **/
    @RequestMapping("main")
    public String main(){

        return "index";
    }

    @RequestMapping("about")
    public String about(){

        return "about";
    }
}
