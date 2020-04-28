package com.demo.peoplemanagement.app.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "person")
@DynamicUpdate // In update method all the values are set please check sql in console.
				// To allow only specific query to be updated use DynamicUpdate, it will allow
				// only one value to be set
@NamedQueries(value={
	@NamedQuery(name = "Person.findByLastName", query ="SELECT p FROM Person p WHERE p.lastName=?1"),	//JPAQL Query
	@NamedQuery(name = "Person.findByFirstNameAndEmail", query ="SELECT p FROM Person p WHERE p.firstName=?1 AND p.email=?2")
	//We can define our own name but make sure same is updated in dao interface
})
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "persionId")
	private int id;

	@Column(name = "fname", length = 60, nullable = false)
	private String firstName;

	@Column(name = "lname", length = 60, nullable = false)
	private String lastName;

	@Column(name = "email", unique = true)
	private String email;

	@Column(name = "crtnDt")
	private Date creationDate;

	public Person() {
		super();
	}

	public Person(String firstName, String lastName, String email, Date creationDate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.creationDate = creationDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", creationDate=" + creationDate + "]";
	}

}
