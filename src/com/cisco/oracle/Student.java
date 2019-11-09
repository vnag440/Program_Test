package com.cisco.oracle;

import java.util.Comparator;


public class Student implements Comparable<Student> {
	
	String studentName;
	int rollNumber;
		
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public Student(){
		
	}
	public Student(String name,int rollnum){
		super();
		this.studentName=name;
		this.rollNumber=rollnum;
	}
	
	public int compareTo(Student student){
		int compareValue=student.getRollNumber();
		//System.out.println(this.getRollNumber() - compareValue);
		return this.rollNumber - compareValue;
	}
	
public static Comparator<Student> nameSorting=new Comparator<Student>() {
		@Override
		public int compare(Student s1,Student s2){
			String name1=s1.getStudentName();
			String name2=s2.getStudentName();
			return name1.toLowerCase().compareTo(name2.toLowerCase());
		}
	};
	
	

}
