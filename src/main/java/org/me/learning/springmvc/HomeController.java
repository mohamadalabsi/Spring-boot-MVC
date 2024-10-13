package org.me.learning.springmvc;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller but with  ResponseBody
@RestController
public class HomeController {

    @RequestMapping("/")
//    @ResponseBody this just with controller
    public  String  greet(){
        return "Hello World";
    }
    @RequestMapping("/about")
    public  String  about(){
        return "about page";
    }

}
