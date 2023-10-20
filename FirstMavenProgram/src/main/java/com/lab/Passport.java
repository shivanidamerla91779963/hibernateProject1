package com.lab;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="passport")

public class Passport {
	
	@Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	 @Column(name="p_id")
     private int p_id;
	
	@Column(name="p_no")
	private int p_no;
	
	@OneToOne
	@JoinColumn(name="pid")
	private Person person;

	public int getP_id() {
		return p_id;
	}

	public void setP_id(int p_id) {
		this.p_id = p_id;
	}

	public int getP_no() {
		return p_no;
	}

	public void setP_no(int p_no) {
		this.p_no = p_no;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Passport(int p_id, int p_no, Person person) {
		super();
		this.p_id = p_id;
		this.p_no = p_no;
		this.person = person;
	}

	public Passport() {
		super();
		// TODO Auto-generated constructor stub
	}
	
		 
}

	


