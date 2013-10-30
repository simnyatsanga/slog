package com.simba.slog.test.controller;

import com.simba.slog.controller.HomeController;
import com.simba.slog.model.Article;
import org.junit.Before;
import org.junit.Test;
import org.springframework.ui.ExtendedModelMap;

import static org.junit.Assert.assertEquals;

public class HomeControllerTest {

    private HomeController homeController;
    private ExtendedModelMap extendedModelMap;
    @Before
    public void init(){
        homeController = new HomeController();
        extendedModelMap = new ExtendedModelMap();
    }


    @Test
    public void shouldAddAnArticleToAModel() throws Exception {
        Article article = new Article("malema on the road again","body");
        homeController.loadHomePage(extendedModelMap);
        assertEquals("malema on the road again", ((Article)extendedModelMap.get("article")).getTitle());
    }
}
