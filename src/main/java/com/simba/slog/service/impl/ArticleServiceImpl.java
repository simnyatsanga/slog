package com.simba.slog.service.impl;

import com.simba.slog.dao.ArticleDao;
import com.simba.slog.dao.impl.ArticleDaoImpl;
import com.simba.slog.domain.Article;
import com.sun.jmx.remote.internal.ArrayQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ArticleServiceImpl {

    @Autowired
    ArticleDao articleDao;

    public ArticleServiceImpl() {
    }

    @Transactional(readOnly = true)
    public Article get(Long id) {
        return articleDao.get(id);
    }

    @Transactional
    public Article save(Article article) {
        return articleDao.save(article);
    }

    @Transactional(readOnly = true)
    public List<Article> findAll()
    {
        return articleDao.findAll();
    }

    public void delete(Long articleId) {
        articleDao.delete(articleId);
    }
}
