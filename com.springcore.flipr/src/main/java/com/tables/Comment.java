package com.tables;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Comment {
	@Id
	private int id;
	private String post;
	private String user;
	private String content;
	@Temporal(TemporalType.TIME)
	private Date created_at;
	@Temporal(TemporalType.TIME)
	private Date updated_at;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	public Date getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}
	public Comment(int id, String post, String user, String content, Date created_at, Date updated_at) {
		super();
		this.id = id;
		this.post = post;
		this.user = user;
		this.content = content;
		
		this.created_at = created_at;
	
		this.updated_at = updated_at;
	}
	public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Comment [id=" + id + ", post=" + post + ", user=" + user + ", content=" + content + ", created_at="
				+ created_at + ", updated_at=" + updated_at + ", getId()=" + getId() + ", getPost()=" + getPost()
				+ ", getUser()=" + getUser() + ", getContent()=" + getContent() + ", getCreated_at()=" + getCreated_at()
				+ ", getUpdated_at()=" + getUpdated_at() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
}
