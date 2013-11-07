package com.simba.slog.dao.impl;

import com.simba.slog.dao.ArticleDao;
import com.simba.slog.domain.Article;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class ArticleDaoImpl implements ArticleDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    public Article save(Article article) {
        Session session = sessionFactory.getCurrentSession();
        return (Article)session.merge(article);
    }

    @Transactional
    public Article get(Long id) {
        return (Article) sessionFactory.getCurrentSession().get(Article.class, id);
    }

    public List<Article> findAll()
    {
          return sessionFactory.getCurrentSession().createQuery(
                  "FROM Article ORDER BY id").list();
    }


}
