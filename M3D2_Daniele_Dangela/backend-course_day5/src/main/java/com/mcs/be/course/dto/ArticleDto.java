package com.mcs.be.course.dto;


import java.io.Serializable;
import java.math.BigDecimal;

public class ArticleDto implements Serializable {

    private Long id;
    private String title;
    private String picture;
    private String plot;
    private String tag;
    private Boolean like;
    private BigDecimal price;


    public ArticleDto() {
    }

    public ArticleDto(Long id, String title, String picture, String plot, String tag, Boolean like, BigDecimal price) {
        this.id = id;
        this.title = title;
        this.picture = picture;
        this.plot = plot;
        this.tag = tag;
        this.like = like;
        this.price=price;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Boolean getLike() {
        return like;
    }

    public void setLike(Boolean like) {
        this.like = like;
    }


}
