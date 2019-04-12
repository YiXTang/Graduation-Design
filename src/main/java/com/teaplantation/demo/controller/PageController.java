package com.teaplantation.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PageController {
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String index() {
        return "index";
    }
    @RequestMapping("/{page}")
    public String showpage(@PathVariable String page) {
        return page;
    }
}