package com.ibm.rest.webServices.restfulwebServices.User;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
@Entity
public class User {
@Id	
@GeneratedValue
private Integer id;

@Size(min = 2)
private String name;

@Past
private Date birthdate;
@OneToMany(mappedBy = "user")
private List<Post> posts;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Date getBirthdate() {
	return birthdate;
}
public void setBirthdate(Date birthdate) {
	this.birthdate = birthdate;
}




public List<Post> getPosts() {
	return posts;
}
public void setPosts(List<Post> posts) {
	this.posts = posts;
}
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public User(Integer id, String name, Date birthdate) {
	super();
	this.id = id;
	this.name = name;
	this.birthdate = birthdate;
}
@Override
public String toString() {
	return "User [id=" + id + ", name=" + name + ", birthdate=" + birthdate + "]";
}
	
}
