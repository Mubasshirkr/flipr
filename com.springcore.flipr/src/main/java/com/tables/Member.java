package com.tables;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Member {
	@Id
	private  int id;
	private String community;
	private String user;
	private String role;
	
	@Temporal(TemporalType.TIME)
	private Date created_at;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCommunity() {
		return community;
	}
	public void setCommunity(String community) {
		this.community = community;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	public Member(int id, String community, String user, String role, Date created_at) {
		super();
		this.id = id;
		this.community = community;
		this.user = user;
		this.role = role;
		this.created_at = created_at;
	}
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", community=" + community + ", user=" + user + ", role=" + role + ", created_at="
				+ created_at + ", getId()=" + getId() + ", getCommunity()=" + getCommunity() + ", getUser()="
				+ getUser() + ", getRole()=" + getRole() + ", getCreated_at()=" + getCreated_at() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
