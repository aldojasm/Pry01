package com.family.project.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Parents")
public class Parent implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	//Variable Column
	@Id
	@Column(name="parent_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private byte parent_id;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="first_name")
	private String first_name;
	
	@Column(name="middle_name")
	private String middle_name;
	
	@Column(name="last_name")
	private String last_name;
	
	@Column(name="other_parent_details")
	private String other_parent_details;

	
	//Method Getter and Setter
	public byte getParent_id() {
		return parent_id;
	}

	public void setParent_id(byte parent_id) {
		this.parent_id = parent_id;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getMiddle_name() {
		return middle_name;
	}

	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getOther_parent_details() {
		return other_parent_details;
	}

	public void setOther_parent_details(String other_parent_details) {
		this.other_parent_details = other_parent_details;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
