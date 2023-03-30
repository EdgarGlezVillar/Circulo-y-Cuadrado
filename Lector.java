package EXAMEN_3PCKG;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Lector {

	public void ejecutar(int id)
	{
		int Id;
		Id = id % 1000;
		String line;
		int renglon = 1;
		int[] suma = new int[3001];
		String[] stringLine;
		String[] stringReducedLine = new String[3001];
		int[] intLine = new int[3001];
		
		
		File emails = new File("C:\\Users\\Dell\\eclipse-workspace\\EXAMEN_3\\src\\EXAMEN_3PCKG\\archive\\emails.csv");
		if(emails.exists())
		{			
			System.out.println("El archivo se abrió exitosamente");
			try
			{
				FileReader filerdr = new FileReader(emails);
				BufferedReader buffrdr = new BufferedReader(filerdr);
				line = buffrdr.readLine();
				renglon = renglon+1;
				String[] palabras = line.split(",");
				
				//llegar hasta el Id necesario
				for(int x = 2;x<Id;x++)
				{
					line = buffrdr.readLine();
					renglon = renglon + 1;
				}
				//para cada renglón hasta 50 más
				for(int x =0;x<51;x++)
				{
					line = buffrdr.readLine();
					stringLine = line.split(",");
					System.arraycopy(stringLine, 1, stringReducedLine, 0, stringReducedLine.length);
					//pasar de string a int y sumar cada int con su respectivo lugar en la suma
					for(int i=0; i<3001; i++)
					{
						intLine[i] = Integer.parseInt(stringReducedLine[i]);
						
						//System.out.println(intLine[i]);
						suma[i] = suma[i] + intLine[i];
						//System.out.println(suma[i]);
					}				
					renglon = renglon +1;
				}
				
				File guardar = new File("C:\\Users\\Dell\\eclipse-workspace\\EXAMEN_3\\src\\EXAMEN_3PCKG\\Consulta.txt");
				if(guardar.exists()) 
				{
					System.out.println("El archivo ya se encontraba guardado");
				}
				else
				{
					System.out.println("El archivo está siendo guardado...");
					try
					{
						FileWriter fileWtr = new FileWriter(guardar);
						PrintWriter prntWtr = new PrintWriter(fileWtr);
						for(int i = 0; i<3001;i++)
						{
							prntWtr.println(palabras[1+i] + ": " + suma[i]);  
						}
						fileWtr.close();
						prntWtr.close();
						System.out.println("El archivo ha sido guardado exitosamente!");
					}
					catch(IOException e)
					{
						
					}
				}
				
				buffrdr.close();
				filerdr.close();
					
			}
			catch(IOException e)
			{
	
			}		
		}
	}
}
