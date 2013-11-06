package com.simba.slog.test.controller;

import com.simba.slog.controller.HomeController;
import com.simba.slog.domain.Article;
import org.junit.Before;
import org.junit.Test;
import org.springframework.ui.ExtendedModelMap;

import java.util.ArrayList;
import java.util.Date;

import static junit.framework.Assert.assertTrue;

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
    public void shouldOrderLatestArticlesByCreationDate() throws Exception {
        homeController.loadHomePage(extendedModelMap);
        ArrayList<Article> orderedArticles = (ArrayList<Article>)extendedModelMap.get("articles");
        Date latestArticleDate = orderedArticles.get(0).createdDate();
        Date secondLatestArticleDate = orderedArticles.get(1).createdDate();
        assertTrue(latestArticleDate.compareTo(secondLatestArticleDate) > 0 );
    }

    @Test
    public void shouldRenderHomePage() throws Exception {
        String result = homeController.loadHomePage(extendedModelMap);
        assertEquals("home", result);
    }
}
