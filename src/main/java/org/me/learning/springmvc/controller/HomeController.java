package org.me.learning.springmvc.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller but with  ResponseBody it will work like RestController it will return the data , but without ResponseBody it will return the page name
@RestController
public class HomeController {

    @RequestMapping("/")
//    @ResponseBody this just with controller
    public  String  home(){
        return "Hello World";
    }
    @RequestMapping("/about")
    public  String  about(){
        return "about page";
    }

}
