package com.wmusial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller  // aby string nam wyswietlil
public class MainController {

    @RequestMapping(value = "/", method = RequestMethod.GET)    //aby string wyswietlil
    public  String showHomePage(){

        return "home";
    }

}
