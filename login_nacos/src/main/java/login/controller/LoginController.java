package login.controller;

import login.entity.UserBean;
import login.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.extern.slf4j.Slf4j;
import javax.annotation.Resource;

public class LoginController {
    @Resource
    UserService userService;

    //实现登录
    @RequestMapping("/login")
    public String show(){
        return "login";
    }
    @RequestMapping(value = "/loginIn",method = RequestMethod.POST)
    public String login(String username,String password){
        UserBean userBean = userService.LoginIn(username, password);

        if(userBean!=null){
            return "redirect:/index.html";
        }else {
            return "error";
        }
    }
    @RequestMapping("/index.html")
    public String mainPage(){
        return "index";
    }
    @RequestMapping("/signup")
    public String disp(){
        return "signup";
    }

    //实现注册功能
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public String signUp(String username,String password){
        userService.Insert(username, password);
        return "success";
    }
}

