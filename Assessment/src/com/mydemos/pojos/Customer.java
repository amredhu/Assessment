package com.mydemos.pojos;

public class Customer {
	
	String custFName;
	String custLName;
	String custID;
	String custAddress;
	public String getCustFName() {
		return custFName;
	}
	public void setCustFName(String custFName) {
		this.custFName = custFName;
	}
	public String getCustLName() {
		return custLName;
	}
	public void setCustLName(String custLName) {
		this.custLName = custLName;
	}
	public String getCustID() {
		return custID;
	}
	public void setCustID(String custID) {
		this.custID = custID;
	}
	public String getCustAddress() {
		return custAddress;
	}
	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}
	
	
	
	@Override
	public String toString() {
		return getCustFName()+" "+getCustLName()+" "+getCustID()+" "+getCustAddress();
	}
	public Customer() {
		
	}
	
	public Customer(String custFName, String custLName, String custAddress) {
		super();
		this.custFName = custFName;
		this.custLName = custLName;
		this.custAddress = custAddress;
	}

}
