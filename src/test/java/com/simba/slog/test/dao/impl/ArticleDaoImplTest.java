package com.simba.slog.test.dao.impl;

import com.simba.slog.dao.impl.ArticleDaoImpl;
import com.simba.slog.domain.Article;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

import static junit.framework.Assert.assertEquals;

@Transactional
public class ArticleDaoImplTest extends DaoTest {
    @Autowired
    ArticleDaoImpl articleDaoImpl;

    @Test
    public void all_fields_are_persisted() {
        Article article = new Article("ZOMG Article", "Body", new Date());
        articleDaoImpl.save(article);
        Article articles = articleDaoImpl.get(1L);

        assertEquals("ZOMG Article", articles.getTitle());
    }
}
