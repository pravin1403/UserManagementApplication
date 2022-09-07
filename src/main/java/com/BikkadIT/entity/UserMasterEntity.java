package com.BikkadIT.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Entity
@Table(name="USER_ACCOUNT")
@Data
public class UserMasterEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="USER_ID")
	private Integer userId;
	
	@Column(name="FIRST_NAME")
	private String fName;
	
	@Column(name="LAST_NAME")
	private String lName;
	
	@Column(name="USER_EMAIL")
	private String email;
	
	@Column(name="USER_PASSWORD")
	private String password;
	
	@Column(name="MOBILE_NUMBER")
	private Long phno;
	
	@Column(name="DOB")
	private LocalDate dob;
	
	@Column(name="GENDER")
	private String gender;
	
	@Column(name="CITY_ID")
	private Integer cityId;
	@Column(name="STATE_ID")
	private Integer stateId;
	@Column(name="COUNTRY_ID")
	private Integer countryId;
	@Column(name="ACC_STATUS")
	private String accountStatus;
	
	@CreationTimestamp
	@Column(name="CREATED_DATE", updatable = false)
	private LocalDate createdDate;
	
	
	@UpdateTimestamp
	@Column(name="UPDATED_DATE", insertable = false)
	private LocalDate updatedDate;
	
	
	
	
	
	
}
