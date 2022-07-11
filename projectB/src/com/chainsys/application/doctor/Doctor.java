package com.chainsys.application.doctor;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Doctor {
	@Id
	private int doctor_id;
	private String name;
	private Date dob;
	private String speciality;
	private String city;
	private long phone_number;
	private float standard_fees;
	
	public int getDoctor_id() {
		return doctor_id;
	}

	public void setDoctor_id(int doctor_id) {
		this.doctor_id = doctor_id;
	}

	public String getDoc_name() {
		return name;
	}

	public void setDoc_name(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(long phone_number) {
		this.phone_number = phone_number;
	}

	public float getStandard_fees() {
		return standard_fees;
	}

	public void setStandard_fees(float standard_fees) {
		this.standard_fees = standard_fees;
	}

	public String toString() {
		return String.format("%d, %s, %s, %s, %d", doctor_id, name, dob, city, phone_number);
	}

	

}
