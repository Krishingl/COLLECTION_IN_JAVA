package com.krush.arraylist_class;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

record Professor(String name, String specialization)
{

}

class Department {
	private String dptName;
	private List<Professor> professors;

	public Department(String dptName) 
	{
		this.dptName = dptName;

		professors = new ArrayList<Professor>();// Composition

	}

	public void addProffesor(Professor professor)
	{
		professors.add(professor);
	}

	public String getDeparetmentName() 
	{
		return this.dptName;
	}

	public List<Professor> getProfessors() {
		return professors;
	}
}

public class DepartmentTester {
	public static void main(String[] args) 
	{
                 Department dept = new Department("Computer Science");
                 dept.addProffesor(new Professor("Mr James", "Java"));
                 dept.addProffesor(new Professor("Mr Scott", "Python"));
                 dept.addProffesor(new Professor("Mr Magic", "AI"));
                 dept.addProffesor(new Professor("Mr  Allen", "JavaScript"));
                 
                 
                 System.out.println("The Professors which are in : "+dept.getDeparetmentName());
                 
                 dept.getProfessors().forEach(System.out::println);
                 
                 System.out.println("------------------------------------------");
                 
                 Department civil = new Department("Civil");
                 civil.addProffesor(new Professor("Mr James", "Engineering Drawing"));
                 civil.addProffesor(new Professor("Mr Martin", "UML"));
                 civil.addProffesor(new Professor("Mr Jems", "Drawing"));
                 civil.addProffesor(new Professor("Mr  Smith", "AutoCAD"));
                 
                 
                 System.out.println("The Professors which are in : "+civil.getDeparetmentName());
                 
                 civil.getProfessors().forEach(System.out::println);
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
	}
	
	
}
