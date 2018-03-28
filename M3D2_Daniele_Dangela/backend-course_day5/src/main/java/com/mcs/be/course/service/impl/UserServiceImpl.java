package com.mcs.be.course.service.impl;

import com.mcs.be.course.dao.ArticleDao;
import com.mcs.be.course.exception.ElementNotFound;
import com.mcs.be.course.model.Article;
import com.mcs.be.course.service.ArticleService;
import com.mcs.be.course.service.User;
import com.mcs.be.course.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Objects;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<Article> retrieveAllUsers() {
        return userDao.findAll();
    }

    @Override
    public Article retrieveArticleById(final Long id) throws ElementNotFound {

        Article article = articleDao.findOne(id);

        if (article == null) {
            throw new ElementNotFound("Article with id " + id + " not exist");
        }
        

        return article;

    }
 

    @Override
    public Article addLikeToArticle(Long id) throws ElementNotFound {

        Article entity = this.retrieveArticleById(id);

        entity.setApprove(entity.getApprove() ? Boolean.FALSE : Boolean.TRUE);
        entity = articleDao.save(entity);

        return entity;
    }

	@Override
	public User register(User user) {
		 Objects.requireNonNull(user.getId(), "id cannot be null");
	        Objects.requireNonNull(user.getFirstName(), "First name cannot be null");
	        Objects.requireNonNull(user.getLastName(), "Last name cannot be null");
	        Objects.requireNonNull(user.getPassword(), "Password cannot be null");
	        Objects.requireNonNull(user.getCartId(), "Cart cannot be null");

	        return userDao.save(user);
	}

	@Override
	public User login(String id, String password) {
		for(User user:  retrieveAllUsers())
		{
			if(user.getId().equals(id)&& user.getPassword().equals(password))
			{
				return user;
			}
		}
		return null;
	}

	@Override
	public User register(User user) {
		for(User userall:  retrieveAllUsers())
		{
			if(userall.getId().equals(user.getId()))
			{
				return user;
			}
		}
		return null;
	}
}
