package ArrayPckg;

import java.util.Scanner;

public class ArregloString {
	
	
	 //constructor de arreglo
	public String[] arregloString;
	public ArregloString(int size) 
	{
		this.arregloString = new String[size];
	}
	
	//mostrar contenidos método
	public void mostrarContenidos(String[] arreglo)
	{
		int longitudArreglo = arreglo.length;
		for(int i = 0; i < longitudArreglo-1; i++)
		{
			System.out.println(arreglo[i]);
		}
	}
	
	//Método buscar valor
	public int valorArreglo(String[] arreglo)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("inserte el espacio del que desea saber su valor");
		String posicion = scan.nextLine();
		
		int posicionInt = Integer.parseInt(posicion);
		System.out.println(arreglo[posicionInt-1]);
		return posicionInt-1;
	}
	
	//Método eliminar valor de un arreglo y recorrer 
	public String[] EliminarYRecorrer(String[] arreglo)
	{
		System.out.println("¿Qué espacio desea eliminar de "+arreglo.length+"?");
		Scanner scan = new Scanner(System.in);
		String posString = scan.nextLine();
		int pos = Integer.parseInt(posString);
		String posBorrado = arreglo[pos-1];
		
		for(int i = 0; i == arreglo.length-1; i++)
		{
			String storage1 = arreglo[pos-1+i];
			String storage2 = arreglo[pos+i];
			
			arreglo[pos-1+i] = storage2;
		}
		System.out.println("Se borró: "+posBorrado);
		return arreglo;
	}
	
}

