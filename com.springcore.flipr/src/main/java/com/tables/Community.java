package com.tables;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Community {
	@Id
	private int id;

	private String name;

	@Column(unique=true)
	private String slug;
	private String owner;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSlug() {
		return slug;
	}
	public void setSlug(String slug) {
		this.slug = slug;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
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
	public Community(int id, String name, String slug, String owner, Date created_at, Date updated_at) {
		super();
		this.id = id;
		this.name = name;
		this.slug = slug;
		this.owner = owner;
		this.created_at = created_at;
		this.updated_at = updated_at;
	}
	public Community() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Community [id=" + id + ", name=" + name + ", slug=" + slug + ", owner=" + owner + ", created_at="
				+ created_at + ", updated_at=" + updated_at + ", getId()=" + getId() + ", getName()=" + getName()
				+ ", getSlug()=" + getSlug() + ", getOwner()=" + getOwner() + ", getCreated_at()=" + getCreated_at()
				+ ", getUpdated_at()=" + getUpdated_at() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
		
	
}