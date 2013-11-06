package com.simba.slog.dao;

import com.simba.slog.domain.Article;

public interface ArticleDao {
    void save(Article article);
    Article get(Long id);
}
