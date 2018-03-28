package com.mcs.be.course.service;

import com.mcs.be.course.exception.ElementNotFound;
import com.mcs.be.course.model.Article;

import java.util.List;

public interface ArticleService {
    List<Article> retrieveAllArticles();

    Article retrieveArticleById(final Long id) throws ElementNotFound;

    Article saveArticle(Article article);

    Article updateArticle(Article article) throws ElementNotFound;

    Article addLikeToArticle(Long id) throws ElementNotFound;
}
