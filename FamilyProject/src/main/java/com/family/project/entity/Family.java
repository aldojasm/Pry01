package com.family.project.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Families")
public class Family implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	//Variable Column
	@Id
	@Column(name="family_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private byte famili_id;
	
	//@ManyToOne
	@Column(name="head_of_parent_id")
	private byte head_of_parent_id;
	
	@Column(name="family_name")
	private String family_name;
	
	
	//Method Getter and Setter
	public byte getFamili_id() {
		return famili_id;
	}

	public void setFamili_id(byte famili_id) {
		this.famili_id = famili_id;
	}

	public byte getHead_of_parent_id() {
		return head_of_parent_id;
	}

	public void setHead_of_parent_id(byte head_of_parent_id) {
		this.head_of_parent_id = head_of_parent_id;
	}

	public String getFamily_name() {
		return family_name;
	}

	public void setFamily_name(String family_name) {
		this.family_name = family_name;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
