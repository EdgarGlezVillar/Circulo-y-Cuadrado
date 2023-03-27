package ListMapPckg;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class Manager 
{
    private FileWriter fileWtr;
    private FileWriter fileWtr1;
    private PrintWriter printWtr;
    private PrintWriter printWtr1;
    private File fibonacci;
    private File fibonacciParImpar;
    
    public Manager()
    {
		Fibonacci Sucesion1 = new Fibonacci();
		System.out.println(Sucesion1.ListaSucesion);
		
		Splitter Sucesion2 = new Splitter();
		Sucesion2.SplitterPar();
		System.out.println(Sucesion2.ListaPar);
		Sucesion2.SplitterImpar();
		System.out.println(Sucesion2.ListaImpar);
		
		fibonacci = new File("C:\\Users\\Dell\\eclipse-workspace\\ListasYMapas\\src\\ListMapPckg\\Fibonacci.txt");
		fibonacciParImpar = new File("C:\\Users\\Dell\\eclipse-workspace\\ListasYMapas\\src\\ListMapPckg\\FibonacciParImpar.txt");
		
		if (fibonacci.exists() && fibonacciParImpar.exists())
		{
			System.out.println("ya existen esos archivos");
		}
		else
		{
			System.out.println("Se están creando los archivos");
			try 
			{
				fibonacci.createNewFile();
				fibonacciParImpar.createNewFile();
				fileWtr = new FileWriter(fibonacci);
				fileWtr1 = new FileWriter(fibonacciParImpar);
				printWtr = new PrintWriter(fileWtr);
				printWtr1 = new PrintWriter(fileWtr1);
				
				printWtr.println(Sucesion1.ListaSucesion);
				printWtr1.println(Sucesion2.ListaPar);
				printWtr1.println(Sucesion2.ListaImpar);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
			finally
			{
				//close resources
				try 
				{
				fileWtr.close();
				printWtr.close();
				fileWtr1.close();
				printWtr1.close();
				} 
				catch (IOException e) 
				{
				e.printStackTrace();
				}
			}

		}
    }
}
