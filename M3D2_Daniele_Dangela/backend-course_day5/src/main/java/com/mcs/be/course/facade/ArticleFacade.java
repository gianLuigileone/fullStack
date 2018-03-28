package com.mcs.be.course.facade;

import com.mcs.be.course.dto.ArticleDto;
import com.mcs.be.course.exception.ElementNotFound;

import java.util.List;

public interface ArticleFacade {

    List<ArticleDto> retrieveAllArticles();

    ArticleDto retrieveArticleById(Long id) throws ElementNotFound;

    ArticleDto saveOrUpdate(ArticleDto articleDto) throws ElementNotFound;

    ArticleDto addLikeToArticle(Long id) throws ElementNotFound;
}
