package krush.vector_class;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Vector;
public class SortAndRemove
{
	public static void main(String[] args)
	{
	       Vector<String>  listOfCity = new  Vector<>();//10 Capacity array created internally.
	       
	       listOfCity.add("Hyderabad");
	       listOfCity.add("Pune");
	       listOfCity.add("Mumbai");
	       listOfCity.add("Kolkata");
	       listOfCity.add("Chanai");
	       listOfCity.add("Baglore");
	       
	       
	       
	       System.out.println("Sorting the city Name in Accending Order : ");
	/*       
	       
//------------------------------------------------------	       
//	       Collections.sort(listOfCity);   //[internally its used Arrays.sort(); [Old technique]
//	       System.out.println(listOfCity);   
	    //internal working  Collections.sort(); method
	     //-->
	       Object [] arrs = listOfCity.toArray();
	          Arrays.sort(arrs);
	          for(Object ar:arrs) {
	        	  System.out.print(" "+ar);
	          }
//	       /------------------------------------------------------
	  */    
	        
	       
	       
	       listOfCity.sort((s1,s2)-> s1.compareTo(s2));   //[New Technique]
	      
	       /*
	          @SuppressWarnings("unchecked")
    @Override
    public synchronized void sort(Comparator<? super E> c) {
        final int expectedModCount = modCount;
        Arrays.sort((E[]) elementData, 0, elementCount, c);
        if (modCount != expectedModCount)
            throw new ConcurrentModificationException();
        modCount++;
    }
	        */
	       System.out.println(listOfCity);
	       
	       
	       
	       System.out.println("Sorting the city Name in Dcending Order : ");
	       
	       
	       listOfCity.sort((s1,s2)-> s2.compareTo(s1));
	       System.out.println(listOfCity);
	       

	       System.out.println("ReMove the element using index : ");
	       
	       
	       listOfCity.remove(0);
	       
	       System.out.println(listOfCity);
	       
	       System.out.println("ReMove the element using object : ");
      listOfCity.remove("Kolkata");
	       
	       System.out.println(listOfCity);
	       
	       
	       }
	
	
	

}
