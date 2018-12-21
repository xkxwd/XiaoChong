package com.example.homework.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.homework.service.infoservice;

@Component
@RestController
public class infocontroller {
    @Autowired
    private infoservice sservice;

    @RequestMapping("/zkxladd")
    public String save()
    {
        int row = sservice.saveInfo();
        if(row==-1){
            return "新增失败";}
            else {
            return "success";
        }
    }

    @RequestMapping("/zkxlque")
    public String que()
    {
        String str=sservice.queryallinfo();

        return str;
    }

}
