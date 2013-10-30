package com.simba.slog.controller;

import com.simba.slog.model.Article;
import org.springframework.ui.Model;

public class HomeController {
    public String loadHomePage(Model model) {
        model.addAttribute("article", new Article("malema on the road again", "b"));
        return "";
    }
}
