package krush.vector_class;

import java.util.Collections;
import java.util.Vector;

public class ConvertArrayToVectorObject {

	public static void main(String[] args)
	{
	     Vector<Integer> v= new Vector<>();
	     
		int x[]= {100,20,30,29,27,11};
		
		for(int i=0;i<x.length;i++)
		{
			v.add(x[i]);
			
		}
		
		//How to find minimum element in the collection
		 System.out.println(Collections.min(v));
		
		//How to find maximum element in the collection
		 System.out.println(Collections.max(v));
		
	Collections.reverse(v);
	System.out.println(v);
	
	
	        Integer[] x2= (Integer[]) v.toArray();
	        

	}

}
