package br.com.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customers")
public class Customer {

	private long id;
	private String firstName;
	private String creditLimit;
	private String creditRisk;
	
	public Customer() {
		
	}
	
	public Customer(String firstName, String creditLimit, String creditRisk) {
		this.firstName = firstName;
		this.creditLimit = creditLimit;
		this.creditRisk = creditRisk;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@Column(name = "first_name", nullable = false)
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	@Column(name = "credit_limit", nullable = false)
	public String getCreditLimit() {
		return creditLimit;
	}
	public void setCreditLimit(String creditLimit) {
		this.creditLimit = creditLimit;
	}
	
	@Column(name = "email_address", nullable = false)
	public String getCreditRisk() {
		return creditRisk;
	}
	public void setCreditRisk(String creditRisk) {
		this.creditRisk = creditRisk;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", creditLimit=" + creditLimit + ", creditRisk=" + creditRisk
				+ "]";
	}
	
}
