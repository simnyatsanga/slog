package com.simba.slog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 * User: simba
 * Date: 2013/10/30
 * Time: 12:13 PM
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class SampleController {

    @RequestMapping("home")
    public String loadHomePage(Model m){
        m.addAttribute("name","CodeTutr");
        return "home";

    }
}
