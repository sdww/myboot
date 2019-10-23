package com.action;

import java.util.*;
import com.entity.*;
import com.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @Autowired
    private  IDemoService ds;

    @RequestMapping("/test")
    public ModelAndView test(ModelAndView mvo){
        System.out.println("------------test");


        mvo.setViewName("success");
        return mvo;
    }



}
