package io.assignment;

public class SICalculator {
	
	private double principle;
	private double rate;
	private double time;
	
	public double getPrinciple() {
		return principle;
	}
	
	public void setPrinciple(double principle) {
		this.principle = principle;
	}
	
	public double getRate() {
		return rate;
	}
	
	public void setRate(double rate) {
		this.rate = rate;
	}
	
	public double getTime() {
		return time;
	}
	
	public void setTime(double time) {
		this.time = time;
	}
	
	public double calc() {
		return (principle * rate * time)/100;
	}
	
}
