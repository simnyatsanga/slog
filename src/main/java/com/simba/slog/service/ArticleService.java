package com.simba.slog.service;

import com.simba.slog.domain.Article;

import java.util.List;

public interface ArticleService {
    Article get(Long id);
    Article save(Article article);
    List<Article> findAll();
}
