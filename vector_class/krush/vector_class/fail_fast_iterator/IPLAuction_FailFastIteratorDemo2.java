package krush.vector_class.fail_fast_iterator;

import java.util.Iterator;
import java.util.Vector;

record Player(Integer id,String name,Double basePrice)
{
	
}

class IPLAuction
{
	private String iplTeam;
	 private Vector<Player> listOfplayers;
	 
	public IPLAuction(String iplTeam){
		 this.iplTeam=iplTeam;
		 listOfplayers= new Vector<>(11,5);
		 
	 }
	public void addPlayer(Player player)
	{
		listOfplayers.add(player);
	}
	
	
	public void displayAllPlayer() 
	{
	 System.out.println("All the players "+iplTeam);
	// players.forEach(player->System.out.println(player));
		listOfplayers.forEach(System.out::println);//Extension of Lambda expression MR
		
	}
	
	
	public void retainOrRemove()
	{
		
		for(Player player : listOfplayers)
		{
			if(player.basePrice()>100000)
			{
				listOfplayers.remove(player);
				break;
			}
		}
		
		
//		Iterator<Player> iterator = listOfplayers.iterator();
		 
		
//		while(iterator.hasNext())
//		{
//			
//		}
		
		
	
	}
}

    


public class IPLAuction_FailFastIteratorDemo2 
{
     public static void main(String[] args) 
     
     {  
    	    IPLAuction ipl = new IPLAuction("SRH");
              
		     ipl.addPlayer(new Player(111, "Abhishek", 190000D));
		     ipl.addPlayer(new Player(222, "Head", 980000D));
		     ipl.addPlayer(new Player(333, "Klassen", 920000D));
		     ipl.addPlayer(new Player(222, "Nitish", 1890000D));
		     
		     
		     ipl.retainOrRemove();
		     ipl.displayAllPlayer();
	 }
	
	
	
	
}
