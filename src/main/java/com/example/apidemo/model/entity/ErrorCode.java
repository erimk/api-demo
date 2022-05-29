package com.example.apidemo.model.entity;

public enum ErrorCode {
	
	NOT_HONOR("Do​ ​ not​ ​ honor"),
	INVALID_TRANSACTION("Invalid​ ​ Transaction");
	
	private String value;
	
	ErrorCode(String string) {
		this.value = string;
		// TODO Auto-generated constructor stub
	}
	
	public String getValue() {
		return value;
	}
	
}


