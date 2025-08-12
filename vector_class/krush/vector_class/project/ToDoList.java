package krush.vector_class.project;
import java.util.Scanner;
import java.util.Vector;
public class ToDoList {

	public static void main(String[] args)
	{
		
		    Vector<String> toDoList = new Vector<>();
		    
		      Scanner sc = new Scanner(System.in);
		    
		        int choice;
		        do {   
		        	
		        	       
		        	System.out.println("To Do List Menu : ");
		        	System.out.println("\t 1) Add Task ");
		        	System.out.println("\t 2) View Tasks ");
		        	System.out.println("\t 3) Mark Task as Completed ");
		        	System.out.println("\t 4) Exit ");
		            System.out.println();
		            System.out.print("Enter your choice : "); 
		        	choice = Integer.parseInt(sc.nextLine());
		        	 
		        	switch(choice) {
		        	
		        	case 1:   
		        		     System.out.print("Enter the Task Name : ");
		        		     String addTask= sc.nextLine();
		        		     toDoList.add(addTask);
		        		
		        	break;
		        	case 2: 
		        		     System.out.println("To Do List Is : ");
		        		           toDoList.forEach((task)->System.out.println(" * "+task));
		        	break;
		        	case 3: 
		        		 System.out.print("Enter the Completed Task Number : ");
		        		            int completedTask =Integer.parseInt( sc.nextLine());
		        		            
		        		            if(completedTask>0 && completedTask < toDoList.size()) 
		        		            {    
		        		            	
		        		            	System.out.println(" Succesfully Marked Completed Task : "+toDoList.get(completedTask-1));

		        		            	toDoList.remove(completedTask-1);
		        		            }else {
		        		            	System.err.println("Invalid Option Please Select Valid Option!");
		        		            }
		            break;
		        	case 4:
		        		     System.out.println("Exiting TO DO APPICATION. Good Bye..!");
		        	    break;
		        	 default:    System.out.println("Invalid choice. Please enter a valid Option. \n");
		        		          
		        		 
		        	}
		        	         
		        	         
		        	         
		        	         
		        	
		           }while(choice!=4);
		    
		    
		    
	}

}
