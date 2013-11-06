package com.simba.slog.service;

import com.simba.slog.domain.Article;

public interface ArticleService {
    Article get(Long id);
    void save(Article article);
}
