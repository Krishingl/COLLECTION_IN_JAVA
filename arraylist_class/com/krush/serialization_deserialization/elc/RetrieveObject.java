package com.krush.serialization_deserialization.elc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import com.krush.serialization_deserialization.blc.Student;

public class RetrieveObject {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no how May Student you Want to Create : ");
        int numberofStudent = Integer.parseInt(sc.nextLine());

		ArrayList<Student> ListOfStudent = new ArrayList<>(numberofStudent);

		
		for (int i = 1; i <= numberofStudent; i++) {
			
			System.out.println("Enter the "+i+" Student Data ");
			ListOfStudent.add(Student.getStudentObject());
			
		}
		
		
		
		//Serialization
		String path = "D:\\JAVA_Programs_New_Folder\\Student";
		var fos = new FileOutputStream(path,true);

		var oos = new ObjectOutputStream(fos);

		try (fos; oos;sc) {
			oos.writeObject(ListOfStudent);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		//De-Serialization
		
		    var fis= new FileInputStream(path);
		    
		    var ois = new ObjectInputStream(fis);
		     
		    try(fis;ois)
		    {
		    	@SuppressWarnings("unchecked")
				ArrayList<Student> los = (ArrayList<Student>) ois.readObject(); 
		    	
		    	los.forEach((student)->System.out.println(student));
		    	
		    	
		    }
		
		
		

	}

}
