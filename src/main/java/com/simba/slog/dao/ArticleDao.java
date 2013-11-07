package com.simba.slog.dao;

import com.simba.slog.domain.Article;

import java.util.List;

public interface ArticleDao {
    Article save(Article article);
    Article get(Long id);
    List<Article> findAll();

    void delete(Long articleId);
}
