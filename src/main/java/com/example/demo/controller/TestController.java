package com.example.demo.controller;
import com.example.demo.domain.BookBean;
import com.example.demo.domain.LearnResouce;
import com.example.demo.service.LearnResouceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

@RestController
public class TestController {

    @RequestMapping("/index")
    public ModelAndView index(){
        return  new ModelAndView("/index");
    }

    @RequestMapping("/introduce")
    public ModelAndView introduce(){
        return  new ModelAndView("/introduce");
    }


    @RequestMapping("/login")
    public ModelAndView login(){
        return  new ModelAndView("/login");
    }


    @RequestMapping("/houseList")
    public ModelAndView houseList(){
        return  new ModelAndView("/houseList");
    }
}
