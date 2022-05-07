package com.subhajit.hibernate.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="COURSE")
public class Course {
@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE)
@Column(name="ID")
private int id;
@Column(name="TITLE")
private String title;
@ManyToOne(cascade= {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
@JoinColumn(name="INSTRUCTOR_ID")
private Instructor instrctr;


public Course(String title) {
	this.title = title;
}

public Course() {

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
public Instructor getInstrctr() {
	return instrctr;
}
public void setInstrctr(Instructor instrctr) {
	this.instrctr = instrctr;
}

@Override
public String toString() {
	return "Course [id=" + id + ", title=" + title + "]";
}


}
