package com.example.demo.controller;

import com.example.demo.entity.Parameter;
import com.example.demo.repository.ParameterRepository;
import com.sun.deploy.net.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.constraints.Max;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class ParameterController {
    @Autowired
    private ParameterRepository parameterRepository;

    @RequestMapping("/para_ls")
    public String Parameter(HttpRequest request, HttpResponse response) {
        boolean submitSuccess = false;
        try {




            List<Parameter> allParameterById = parameterRepository.getAllParameterById();
            System.out.println(allParameterById.get(0));
        }
        catch (Exception e){
            System.out.println("错误");
        }

        return submitSuccess ? "redirect:priceSummary" : "index";
    }

    @RequestMapping("/priceSummary")
    public String loginSuccess() {
        return "/priceSummary";
    }


}
