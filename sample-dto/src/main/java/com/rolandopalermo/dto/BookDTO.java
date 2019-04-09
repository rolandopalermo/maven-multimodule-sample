package com.rolandopalermo.dto;

import java.io.Serializable;

public class BookDTO implements Serializable {

	private static final long serialVersionUID = 5452994863067848844L;

	private Integer id;
	private String title;
	private String description;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "BookDTO [id=" + id + ", title=" + title + ", description=" + description + "]";
	}

}