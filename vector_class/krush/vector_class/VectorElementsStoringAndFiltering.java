package krush.vector_class;

import java.util.Collections;
import java.util.Vector;

//Store Some manager Object in Vector And ,Sort the Object Based on the Id ,And Filter all manager Object whose salary is more than ( > ) 50000.

record Manager(Integer id ,String mName ,Double salary)
{
	
}

public class VectorElementsStoringAndFiltering 
{

	public static void main(String[] args)
	{
	   
		Vector<Manager> listOfManager = new Vector<>();
		
		listOfManager.add(new Manager(222, "Scott", 72000D));
		listOfManager.add(new Manager(333, "Alen", 65000D));
		listOfManager.add(new Manager(111, "Martin", 44000D));
		listOfManager.add(new Manager(666, "Jhon", 50000D));
		listOfManager.add(new Manager(444, "Jeams", 52000D));
		listOfManager.add(new Manager(555, "Smith", 65000D));
	
		
		System.out.println("Sorted Manager Data Based On the Id : ");
              
		
		Collections.sort(listOfManager,(m1,m2)->m1.id().compareTo(m2.id()));
		
		listOfManager.forEach(System.out::println);

		System.out.println("\n--------------------------------------------------------\n");
		
		System.out.println("Filtered The Manager Data Based On the Condition Salary is Greater than 50000: ");
        
		for( Manager manager : listOfManager)
		{
			if(manager.salary()>50000) {
				System.out.println(manager);
			}
		}
		

	}

}
