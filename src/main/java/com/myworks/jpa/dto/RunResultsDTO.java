package com.myworks.jpa.dto;

import com.myworks.jpa.model.InputVP;
import com.myworks.jpa.model.RunResults;

public class RunResultsDTO {
	private String accountId;
	private String inputVpId;
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getInputVpId() {
		return inputVpId;
	}
	public void setInputVpId(String inputVpId) {
		this.inputVpId = inputVpId;
	}
	public 	RunResultsDTO(){
		
	}
	public RunResultsDTO(RunResults rr){
		if(rr !=null){
			this.accountId = rr.getAccountId();
			if(rr.getInputVp() !=null){
				this.inputVpId = rr.getInputVp().getInputData();
			}
		}
	}
	public RunResults toEntity(){
		RunResults rr =new RunResults();
		rr.setAccountId(this.accountId);
		rr.setInputVp(new InputVP());
		rr.getInputVp().setInputData(this.inputVpId);
		return rr;
	}

}
