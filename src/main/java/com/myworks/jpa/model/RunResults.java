package com.myworks.jpa.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class RunResults {

	@Id
	@GeneratedValue
	private Long id;
	private String accountId;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="inputVpId")
	private InputVP inputVp;
	
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public InputVP getInputVp() {
		return inputVp;
	}
	public void setInputVp(InputVP inputVp) {
		this.inputVp = inputVp;
	}
	
	
}
