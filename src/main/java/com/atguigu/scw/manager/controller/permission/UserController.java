package com.atguigu.scw.manager.controller.permission;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;




@RequestMapping("/permission/user")
@Controller
public class UserController {
    
    private String manager = "manager/";
    /**
     * 
     * @Description (TODO这里用一句话描述这个方法的作用)
     * @return
     */
    @RequestMapping("/reg")
    public String reg(){
        System.out.println("用户注册...");
        //1、公司用户注册成功来到后台的控制面板
        return "manager/main";
    }

}
