package com.simba.slog.controller;

import com.simba.slog.domain.Article;
import com.simba.slog.service.ArticleService;
import com.simba.slog.service.impl.ArticleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@Controller
public class ArticleController {
@Autowired
ArticleServiceImpl articleService;

    @RequestMapping(value = "/articles/new", method = RequestMethod.GET)
    public ModelAndView getNew(Model model){
        ModelAndView modelAndView = new ModelAndView("articles/new");
        modelAndView.addObject("article", new Article());
        return modelAndView;
    }

    @RequestMapping(value = "/articles/create", method = RequestMethod.POST)
    public String create(HttpServletRequest httpServletRequest){

        String title = httpServletRequest.getParameter("article_title");
        String summary = httpServletRequest.getParameter("article_summary");
        String body = httpServletRequest.getParameter("article_body");

        Article article = new Article(title, summary, body, new Date());
        article = articleService.save(article);

        return "redirect:/articles/show/" + article.getId();
    }

    @RequestMapping(value="/articles/show/{articleId}", method=RequestMethod.GET)
    public ModelAndView show(@PathVariable("articleId") Long articleId) {
        ModelAndView modelAndView = new  ModelAndView("articles/show");
        modelAndView.addObject("article", articleService.get(articleId));
        return modelAndView;
    }

    @RequestMapping(value = "/articles/edit/{articleId}", method = RequestMethod.GET )
    public ModelAndView edit(@PathVariable("articleId") Long articleId){
        ModelAndView modelAndView = new ModelAndView("articles/edit");
        modelAndView.addObject("article", articleService.get(articleId));
        return modelAndView;
    }

    @RequestMapping(value = "/articles/update/{articleId}", method = RequestMethod.PUT)
    public String update(HttpServletRequest httpServletRequest, @PathVariable("articleId") Long articleId){
        String title = httpServletRequest.getParameter("article_title");
        String summary = httpServletRequest.getParameter("article_summary");
        String body = httpServletRequest.getParameter("article_body");

        Article article = articleService.get(articleId);

        article.setTitle(title);
        article.setBody(body);
        article.setSummary(summary);
        article = articleService.save(article);

        return "redirect:/articles/show/" + article.getId();

    }



}
