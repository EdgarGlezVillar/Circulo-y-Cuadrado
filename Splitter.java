package ListMapPckg;

import java.util.ArrayList;
import java.util.List;

public class Splitter 
{
	public Fibonacci SucesionToSplit;
	public List<Integer> ListaPar = new ArrayList<Integer>();
	public List<Integer> ListaImpar = new ArrayList<Integer>();
	
	public Splitter()
	{
		SucesionToSplit = new Fibonacci();
	}
	
	public void SplitterPar()
	{
		int size = SucesionToSplit.ListaSucesion.size();
		int x;
		double residuoX;
		
		for(int a = 0; a < size; a++) 
		{
			x = SucesionToSplit.ListaSucesion.get(a);
			residuoX = x%2;
			if(residuoX == 0) 
			{
				ListaPar.add(x);
			}
			
		}
	}

	public void SplitterImpar()
	{
		int size = SucesionToSplit.ListaSucesion.size();
		int x;
		double residuoX;
		
		for(int a = 0; a < size; a++) 
		{
			x = SucesionToSplit.ListaSucesion.get(a);
			residuoX = x%2;
			if(residuoX != 0) 
			{
				ListaImpar.add(x);
			}
			
		}
	}

}