package com.simba.slog.controller;

import com.simba.slog.domain.Article;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;

@Controller
public class HomeController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String loadHomePage(Model model) {
        ArrayList<Article> articles = new ArrayList<Article>();
        Calendar latestDate = Calendar.getInstance();
        latestDate.add(Calendar.MONTH, +2);
        articles.add(new Article("Latest Article", "The body 1", latestDate.getTime()));
        articles.add(new Article("Second Latest Article", "The body 2", Calendar.getInstance().getTime()));
        Collections.sort(articles);
        model.addAttribute("articles", articles);
        return "home";
    }
}
