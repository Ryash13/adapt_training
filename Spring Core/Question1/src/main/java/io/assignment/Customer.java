package io.assignment;

public class Customer {
	
	private int customerId;
	private String customerName;
	private String customerContact;
	private Address customerAddress;
	
//	public Customer(){
//		
//	}
//	public Customer(int customerId, String customerName, String customerContact, Address customerAddress) {
//		super();
//		this.customerId = customerId;
//		this.customerName = customerName;
//		this.customerContact = customerContact;
//		this.customerAddress = customerAddress;
//	}
	
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
	
	public String toString() {
		return "Customer Details => CustomerId = " + customerId + " , CustomerName = " + customerName + " , CustomerContact = "
				+ customerContact + " , CustomerAddress = " + customerAddress + "";
	}
	
}