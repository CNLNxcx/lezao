package User.controller;


import User.entity.User;
import User.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    UserService userService;

    @GetMapping("/ok")
    public String getok(){

        return "ok";
    }

    @PostMapping("/find/{id}")
    public  User getUserById(@PathVariable int id){

      return   userService.getUser(id);

    }

    @GetMapping("/all")
    public  List <User> getUsers(){

        return userService.getAll();

    }
    @DeleteMapping("/del/{id}")
    public void deleteUserById(@PathVariable int id){
        userService.remove(id);
    }

    @PostMapping("/update/{id}")
    public void updateUserById(@PathVariable int id ){
        userService.update(id);
    }
    @PostMapping("/insert")
    public void Insert(@RequestBody  User user){

        userService.insert(user);
    }



 }
