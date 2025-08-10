package krush.vector_class;

import java.util.Vector;

public class SetIntialCapacityAndCapacityIncrement {
	
	
	public static void main(String[] args) {
		   
		
		   Vector<Integer> v = new  Vector<>(100,10);
		   
		   
		     System.out.println("Intial Capacity  is : "+v.capacity());
		     
		     
		     for(int i=0 ; i<100 ;i++) {
		    	 
		    	 
		    	 v.add(i);
		    	 
		     }
		     
		     System.out.println("After adding 100 elements in  Vector Collection Capacity : "+v.capacity());
		     
		       v.add(101);
		       System.out.println("After adding 101 elements in  Vector Collection Capacity : "+v.capacity());
		       
		       //How to retrieve  the Not even index present elements
		       for(int i=0;i<=v.size();i++) {
		    	   
		    	   
		    	   if(i%2==0) {
		    		   System.out.println(v.get(i));
		    	   }
		    	   else {
		    		   continue;
		    	   }
		       }
			     
	}

}
