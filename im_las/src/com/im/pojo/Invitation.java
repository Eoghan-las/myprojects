package com.im.pojo;

import java.sql.Timestamp;

import org.springframework.stereotype.Component;

/**
 * @author Eoghan
 * @category 帖子类
 */
@Component
public class Invitation {

	private int id;
	private String title;
	private String summary;
	private String author; 
	private Timestamp createdate;
	
	
	public Invitation() {
		super();
	}
	
	
	public Invitation(int id, String title, String summary, String author, Timestamp createdate) {
		super();
		this.id = id;
		this.title = title;
		this.summary = summary;
		this.author = author;
		this.createdate = createdate;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Timestamp getCreatedate() {
		return createdate;
	}
	public void setCreatedate(Timestamp createdate) {
		this.createdate = createdate;
	}
	
	
}
