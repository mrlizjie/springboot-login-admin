package com.li.controller;

import com.li.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * create by idea
 *
 * @author LiZJ
 * @date 2019/7/4 15:00
 */

@Controller
public class LoginController {

    @PostMapping("/login")
    @ResponseBody
    public String check(@RequestBody User user){

        if (user == null){
            return "false";
        }else {

            if (user.getUsername().equals("admin") && user.getPassword().equals("admin")){
                return "true";
            }else {
                return "false";
            }
        }
    }

    @ResponseBody
    @GetMapping("/test")
    public String test(){
        return "hello";
    }

}
