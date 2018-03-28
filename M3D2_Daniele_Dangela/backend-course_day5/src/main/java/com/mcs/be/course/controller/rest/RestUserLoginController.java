package com.mcs.be.course.controller.rest;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mcs.be.course.dto.ArticleDto;
import com.mcs.be.course.exception.ElementNotFound;
import com.mcs.be.course.facade.ArticleFacade;

@RestController
@RequestMapping(value = "/user")
public class RestUserLoginController {

    private static final Logger LOGGER = LogManager.getLogger(RestArticleController.class);

    //TODO inject facade
    //@Autowired
    //private UserFacade userFacade;

}
