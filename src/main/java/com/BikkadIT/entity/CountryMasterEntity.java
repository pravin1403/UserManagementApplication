package com.BikkadIT.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="COUNTRY_ID")
@Data
public class CountryMasterEntity {

	@Id
	@Column(name="COUNTRY_ID")
	private Integer countryId;
	@Column(name="COUNTRY_NAME")
	private String CountryName;
	@Column(name="COUNTRY_CODE")
	private Integer CountryCode;
	
	
	
}
