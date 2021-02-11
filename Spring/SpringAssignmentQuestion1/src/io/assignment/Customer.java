package io.assignment;
/**
 * 
 * @author Yash Raj
 *
 */

public class Customer {
	private int customerId;
	private String customerName;
	private String customerContact;
	private Address customerAddress;
	
	//Constructors
	/*
	 * public Customer(){
	 * 
	 * }
	 * 
	 * public Customer(int customerId){ this.customerId = customerId; }
	 * 
	 * public Customer(int customerId , String customerName){ this.customerId =
	 * customerId; this.customerName = customerName; }
	 * 
	 * public Customer(int customerId , String customerName , String
	 * customerContact){ this.customerId = customerId; this.customerName =
	 * customerName; this.customerContact = customerContact; }
	 * 
	 * public Customer(int customerId, String customerName, String customerContact,
	 * Address customerAddress) { //super(); this.customerId = customerId;
	 * this.customerName = customerName; this.customerContact = customerContact;
	 * this.customerAddress = customerAddress; }
	 */
	
	//Getters and Setters
	public int getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getCustomerContact() {
		return customerContact;
	}
	
	public void setCustomerContact(String customerContact) {
		this.customerContact = customerContact;
	}
	
	public Address getCustomerAddress() {
		return customerAddress;
	}
	
	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}
	
	//Display purspose function
	public String toString() {
		return "Customer Details:- \nCustomerId = " + customerId + "\nCustomerName = " + customerName + "\nCustomerContact = "
				+ customerContact + "\nCustomerAddress = " + customerAddress + "";
	}
	
}