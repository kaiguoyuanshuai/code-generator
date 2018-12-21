package com.zcoco.code.codegenerator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * 描述:
 * @auth zhengkk19738
 * @time 2018/12/21
 */
@Controller
public class GeneratorController {

    @RequestMapping("page1")
    public String page (){
        return "page" ;
    }
}
