package com.cisco.oracle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Solution {

	public static void main(String a[]){
		Scanner sc1=null;
		try{
			int option=0;
			sc1=new Scanner(System.in);
			List<Student> studentList = new ArrayList<>();
			HashMap<Integer,List<Student>> hashmap=new HashMap<Integer,List<Student>>();
			option = selectOption(sc1);
			if(option==1)
				do{
					//sc1=new Scanner(System.in);
					System.out.print("Enter Student Name: ");
					String studentName=sc1.next();
					System.out.print("Enter Student Roll Number: ");
					int rollNum=sc1.nextInt();
					if(!hashmap.containsKey(rollNum)){
						studentList.add(new Student(studentName,rollNum));
						hashmap.put(rollNum,studentList);
						System.out.println("Student with roll number "+rollNum+" and name "+studentName+" is created successfully");
						option = selectOption(sc1);
					}else{
						System.out.println("Student with roll number "+rollNum+" and name "+studentName+" is already created ");
					}

				}while(option==1);
			if(option == 2){
				Collections.sort(studentList, Student.nameSorting);
				sortedValues(studentList);
			}else if(option == 3){
				Collections.sort(studentList);
				sortedValues(studentList);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				sc1.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	public static int selectOption(Scanner sc){
		int option=0;
		System.out.println("Select your option:\n 1 for Enter Student information \n 2 for Print students list sorted by name \n 3 For Print students list sorted by roll number");
		try{
			option=sc.nextInt();
			if(option ==0 || option > 3){
				System.out.println("invalid input");
				System.exit(0);
			}
		}catch(Exception e){
			System.out.println("invalid input");
		}
		return option;
	}
	public static void sortedValues(List<Student> al){
		for(Student student: al){
			System.out.println("Name:"+student.getStudentName()+", RollNumber:"+student.getRollNumber());
		}
	}


}
