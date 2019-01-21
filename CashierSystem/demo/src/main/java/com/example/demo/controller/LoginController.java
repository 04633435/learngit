package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class LoginController {
    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/index")
    public String login(){

        return "index";
    }
//登陆验证
    @RequestMapping("/loginsuccess")
    public String loginValidate(HttpServletRequest request, HttpServletResponse response){
        boolean loginSuccess=false;
        try {
               String uname = request.getParameter("uname");
               String password = request.getParameter("password");

                User user = userRepository.getUserByLoginAndPassword(uname, password);
                if (user!=null) {
                  System.out.println("登陆成功");
                          loginSuccess=true;
                } else {
                    System.out.println("没有查询到账户");
                }
           }catch (Exception e){
               System.out.println("异常-登录名或密码不正确");
           }
           finally {
               return loginSuccess ? "redirect:success":"index";
           }


    }
    //登陆成功后进入主页面
    @RequestMapping("/success")
    public String loginSuccess(){
        return "main";

    }
}
