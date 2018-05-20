package com.pele.action;

import com.pele.service.UserService;

/**
 * @author: pele
 * @time: 2018/5/20 13:20
 * @project: spring
 * @description:UserAction对象
 */
public class UserAction {
    /*
    * 依赖于UserService
    * */
    private UserService userService;

    public void setUserService(UserService userService){
        this.userService = userService;
    }

    public void login(){
        System.out.println("start login...");
        //调用userService的verify方法
        userService.verify();
    }
}
