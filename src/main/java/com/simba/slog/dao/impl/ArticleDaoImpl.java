package com.simba.slog.dao.impl;

import com.simba.slog.dao.ArticleDao;
import com.simba.slog.domain.Article;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ArticleDaoImpl implements ArticleDao {

    @Autowired
    private SessionFactory sessionFactory;

    public void save(Article article) {
        Session session = sessionFactory.getCurrentSession();
        session.merge(article);
    }

    public Article get(Long id) {
        return (Article) sessionFactory.getCurrentSession().get(Article.class, id);
    }

}
