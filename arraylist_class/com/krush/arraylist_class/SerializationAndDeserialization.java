package com.krush.arraylist_class;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerializationAndDeserialization {

	public static void main(String[] args) throws IOException 
	{
	       ArrayList<String> listOfIceCream= new ArrayList<>();
	       listOfIceCream.add("Vanila");
	       listOfIceCream.add("Strwbarry");
	       listOfIceCream.add("Butter Scatch");
	       
	       
	       //Serialization
	       
	       
	       String filePath = "D:\\JAVA_Programs_New_Folder\\new\\IceCream";
	       
			var fos = new FileOutputStream(filePath);
			
			var oos = new ObjectOutputStream(fos);
	try(fos;oos){
			
		oos.writeObject(listOfIceCream);
		System.out.println("Data Stored Successfully");
		
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	      
	 //De-Serialization
	       
	       var fin = new FileInputStream(filePath);
	       var ois= new ObjectInputStream(fin);
	       try(fin;ois){
	    	   @SuppressWarnings("unchecked")
			ArrayList<String> list = (ArrayList<String>) ois.readObject();//java.lang.ClassNotFoundException
	       System.out.println("Data Retrieve Succesfully..!!");
	       System.out.println(list);
	       
	       
	       }catch(ClassNotFoundException e) {
	    	   e.printStackTrace();
	       }
	       

	}   

}
