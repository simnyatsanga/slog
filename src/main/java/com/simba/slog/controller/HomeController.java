package com.simba.slog.controller;

import com.simba.slog.domain.Article;
import com.simba.slog.service.ArticleService;
import com.simba.slog.service.impl.ArticleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    ArticleServiceImpl articleService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView loadHomePage(Model model) {
        List<Article> articles = articleService.findAll();

        ModelAndView modelAndView = new ModelAndView("home");

        modelAndView.addObject("articles", articles);
        return modelAndView;
    }
}
