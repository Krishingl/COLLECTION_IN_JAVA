package com.krush.identityhashmap;

public class SystemHashCode {
	
	
	public static void main(String[] args) {
		
		
		String str1 = new String("Java");
		String str2 = new String("Java");
		
		System.out.println("Overriden HashCode method of String Class.");
		System.out.println("Str1 : "+str1.hashCode()+" , Str2 : "+str2.hashCode());
		
		
		
		System.out.println();
		
		System.out.println("System hashcode valve form Object class.");
		System.out.println("Str1 : "+System.identityHashCode(str1));
		System.out.println("Str2 : "+System.identityHashCode(str2));
		
		
	}

}
