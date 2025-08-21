package com.krush.serialization_deserialization.blc;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Scanner;

public class Student implements Serializable {
	
	
	private Integer studentId;
	private String studentName;
	private Double studentFee;
    private LocalDate dateOFaddmision;
	public Student(Integer studentId, String studentName, Double studentFee, LocalDate dateOFaddmision) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentFee = studentFee;
		this.dateOFaddmision = dateOFaddmision;
	}
    
	public static Student getStudentObject()
	{ 
		    Scanner sc = new Scanner(System.in);
		    
		    System.out.print("Enter the Student Name: "); String name= sc.nextLine();
		    System.out.print("Enter the Student Id: "); int id= Integer.parseInt(sc.nextLine());
		    System.out.print("Enter the Student Fee: "); double fee= Double.parseDouble(sc.nextLine());

		
		return new Student(id, name, fee,LocalDate.now());
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentFee=" + studentFee
				+ ", dateOFaddmision=" + dateOFaddmision + "]";
	}
    

}
