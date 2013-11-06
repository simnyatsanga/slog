package com.simba.slog.service.impl;

import com.simba.slog.dao.ArticleDao;
import com.simba.slog.domain.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ArticleServiceImpl {

    @Autowired
    ArticleDao articleDao;

    @Transactional(readOnly = true)
    public Article get(Long id) {
        return articleDao.get(id);
    }

    @Transactional
    public void save(Article article) {
        articleDao.save(article);
    }
}
