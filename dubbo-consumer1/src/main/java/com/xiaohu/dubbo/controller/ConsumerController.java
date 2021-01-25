package com.xiaohu.dubbo.controller;

import com.xiaohu.dubbo.service.PortService;
import com.xiaohu.dubbo.service.User;
import com.xiaohu.dubbo.service.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.*;

/**
 * @Author ChenHu
 * @Date 2021/1/25 - 22:28
 * @Describe
 **/
@RequestMapping("/dubbo")
@RestController
public class ConsumerController {

    @DubboReference
    UserService userService;

    @DubboReference
    PortService portService;

    @PostMapping("/save")
    public Object save(@RequestBody User user){
        return userService.save(user);
    }

    @PostMapping("/findAll")
    public Object findAll(){
        return userService.findAll();
    }

    @GetMapping("/getPort")
    public String getPort(){
        return portService.getPort();
    }

}
