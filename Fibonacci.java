package ListMapPckg;

import java.util.List;
import java.util.ArrayList;

public class Fibonacci {
	public List<Integer> ListaSucesion = new ArrayList<Integer>();

	//constructor
	public Fibonacci()
	{
		int x;
		int y;
		
		ListaSucesion.add(0);
		ListaSucesion.add(1);
				
		for(int a=2; ListaSucesion.get(a-1)<1000000; a++)
		{
			x = ListaSucesion.get(a-2);
			y = ListaSucesion.get(a-1);
			
			ListaSucesion.add(x+y);
		}	
	}
	
	

}
