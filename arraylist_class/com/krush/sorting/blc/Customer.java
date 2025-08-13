package com.krush.sorting.blc;


public class Customer {

	

	private Integer customerNumber;
	private String customerName;
	private Double customerBill;
	
	public Customer(Integer customerNumber, String customerName, Double customerBill) {
		super();
		this.customerNumber = customerNumber;
		this.customerName = customerName;
		this.customerBill = customerBill;
		
	}
	@Override
	public String toString() {
		return "Customer [customerNumber=" + customerNumber + ", customerName=" + customerName + ", customerBill="
				+ customerBill + "]";
	}
	public Integer getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(Integer customerNumber) {
		this.customerNumber = customerNumber;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Double getCustomerBill() {
		return customerBill;
	}
	public void setCustomerBill(Double customerBill) {
		this.customerBill = customerBill;
	}
	
	    
	

}
