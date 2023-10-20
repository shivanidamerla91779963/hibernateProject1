package com.example1.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="empid")
	private int id;
	@Column(name="empname")
	private String name;
	@Column(name="empsal")
	private int salary;
	
	@OneToOne(mappedBy="employee",cascade=CascadeType.ALL)
	private Address address1;

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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Address getAddress1() {
		return address1;
	}

	public void setAddress1(Address address1) {
		this.address1 = address1;
	}

	public Employee(int id, String name, int salary, Address address1) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address1 = address1;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
