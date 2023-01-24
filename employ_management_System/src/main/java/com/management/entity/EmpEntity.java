package com.management.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Employ")
public class EmpEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String address;
	private String email;
	private String phone;
	private int selery;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getSelery() {
		return selery;
	}
	public void setSelery(int selery) {
		this.selery = selery;
	}
	@Override
	public String toString() {
		return "EmpEntity [id=" + id + ", name=" + name + ", address=" + address + ", email=" + email + ", phone="
				+ phone + ", selery=" + selery + "]";
	}
	public EmpEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
