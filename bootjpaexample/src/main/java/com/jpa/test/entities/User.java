package com.jpa.test.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name="USERS2")
public class User {
	
@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE)
@Column(name="ID")
private Integer id;
@Column(name="NAME")
private String name;
@Column(name="STATUS")
private String status;
@Column(name="CITY")
private String city;




}
