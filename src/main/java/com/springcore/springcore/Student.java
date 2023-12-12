package com.springcore.springcore;

public class Student {
	private int studentId;
	private String studentName;
	private String studentAddress;
	
	//create constructor,getter and setter 
	public int getStudentId() {
		return studentId;
	}
	
	//yaha chal raha hai setter injection...
	public void setStudentId(int studentId) {
		System.out.println("Setting id...");
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		System.out.println("Setting name...");
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		System.out.println("Setting address...");
		this.studentAddress = studentAddress;
	}
	
	
	//Constructor using feilds
	public Student(int studentId, String studentName, String studentAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}
	
	//Constructor using super
	public Student() {
		super();
	
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ "]";
	}
	
	

	
	
		
}
