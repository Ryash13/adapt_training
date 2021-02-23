package io.assignment;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Student {
	
	private String studentName;
	private int studentId;
	private double studentCGPA;
	private String studentGender;
	
	
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public int getStudentId() {
		return studentId;
	}
	
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	public double getStudentCGPA() {
		return studentCGPA;
	}
	
	public void setStudentCGPA(double studentCGPA) {
		this.studentCGPA = studentCGPA;
	}
	
	public String getStudentGender() {
		return studentGender;
	}
	
	public void setStudentGender(String studentGender) {
		this.studentGender = studentGender;
	}
	
	public String display() {
		return "Student Details => StudentName = " + studentName + " , StudentId = " + studentId + " , SudentCGPA = " + studentCGPA + " , StudentGender = " + studentGender + "";
	}
	
	// myInitMethod
	@PostConstruct
	public void myInit() {
		System.out.println("calling myInit method");
	}
	
	//destroyMethod
	@PreDestroy
	public void destroy() {
		System.out.println("calling destroy method");
	}
	
}
