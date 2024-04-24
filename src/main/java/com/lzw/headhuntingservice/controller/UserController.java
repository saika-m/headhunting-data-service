package com.lzw.headhuntingservice.controller;

import com.lzw.headhuntingservice.bean.Applicant;
import com.lzw.headhuntingservice.bean.User;
import com.lzw.headhuntingservice.service.UserService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/user")
@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    //login
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(@RequestBody User user){
        return String.valueOf(userService.login(user));
    }

    //check
    @RequestMapping("/isExistUser")
    public String isExistUser(@RequestParam("username")String username){
        User user=new User();
        user.setUsername(username);
        return String.valueOf(userService.isExistUser(user));
    }

    //register
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public String register(@RequestBody User user){
        if(userService.isExistUser(user)){
            return String.valueOf(false);
        }else {
            return String.valueOf(userService.register(user));
        }
    }

    //check
    @RequestMapping(value="/improve_applicant",method = RequestMethod.POST)
    public String improveApplicant(@RequestBody Applicant applicant){
        return String.valueOf(userService.improveApplicant(applicant));
    }

    //check
    @RequestMapping("/select_applicant")
    public String selectApplicant(@RequestParam("id") Integer integer){
        JSONObject jsonObject=JSONObject.fromObject(userService.selectApplicant(integer));
        return jsonObject.toString();
    }

    //txt

}
