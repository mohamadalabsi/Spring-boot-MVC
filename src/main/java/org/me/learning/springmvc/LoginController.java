package org.me.learning.springmvc;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {


    @RequestMapping("/login")
    public String login(){
        return "you loged in successfully";
    }

}
