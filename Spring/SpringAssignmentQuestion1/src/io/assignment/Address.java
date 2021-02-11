package io.assignment;
/**
 * 
 * @author Yash Raj
 *
 */
public class Address {
	private String street;
	private String state;
	private int zip;
	private String country;
	
	//constructors
	public Address() {
		
	}
	
	public Address(String street) {
		this.street = street;
	}
	
	public Address(String street , String state) {
		this.street = street;
		this.state = state;
	}
	
	public Address(String street , String state , int zip) {
		this.street = street;
		this.state = state;
		this.zip = zip;
	}
	
	public Address(String street, String state, int zip, String country) {
		//super();
		this.street = street;
		this.state = state;
		this.zip = zip;
		this.country = country;
	}
	
	//Getters and Setters
	public String getStreet() {
		return street;
	}
	
	public void setStreet(String street) {
		this.street = street;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public int getZip() {
		return zip;
	}
	
	public void setZip(int zip) {
		this.zip = zip;
	}
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	//Display Purspose Function
	public String toString() {
		return "[Street = " + street + " , State = " + state + " , ZipCode = " + zip + " , Country = " + country + "]";
	}
	
	
}