package ArrayPckg;

import java.util.Scanner;

public class mainArray 
{
	 //constructor de arreglo
	public String[] arregloString;
	public mainArray(String[] arregloString) 
	{
		this.arregloString = arregloString;
	}
	
	//mostrar contenidos método
	public void mostrarContenidos(String[] arregloString)
	{
		int longitudArreglo = arregloString.length;
		for(int i = 1; i < longitudArreglo; i++)
		{
			System.out.println(arregloString[i]);
		}
	}
	
	//Método buscar valor
	public int valorArreglo(String[] arregloString)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("inserte la posición de la que desea saber su valor");
		String posicion = scan.nextLine();
		
		int posicionInt = Integer.parseInt(posicion);
		System.out.println(arregloString[posicionInt]);
		return posicionInt;
	}
	
	//Método eliminar valor de un arreglo y recorrer 
	public String[] EliminarYRecorrer(String[] arregloString)
	{
		mainArray arregloParaMetodo  = new mainArray(arregloString);
		int posicionDelArreglo = arregloParaMetodo.valorArreglo(arregloString);
		arregloString[posicionDelArreglo] = null;
		for(int i=0; i< arregloString.length; i++)
		{
			String storage1 = arregloString[posicionDelArreglo-1+i];
			String storage2 = arregloString[posicionDelArreglo+i];
			arregloString[posicionDelArreglo-1+i] = storage2;
			arregloString[posicionDelArreglo+i] = storage1;	
		}
		String[] nuevoArreglo = arregloString;
		System.out.println(nuevoArreglo);
		return nuevoArreglo;
	}
	
	//Método main
	public static void main(String[] args)
	{
		int[] arregloNumeros = new int[15];
		String[] arregloNombres = new String[20];
		Circulo[] circulosArray = new Circulo[100];
		
		arregloNumeros[10] = 5;
		arregloNombres[1] = "Francisco";
		mainArray arreglo1 = new mainArray(arregloNombres);
		
		arreglo1.mostrarContenidos(arregloNombres);
		arreglo1.valorArreglo(arregloNombres);
		arreglo1.EliminarYRecorrer(arregloNombres);
		
		
	}
}//fin clase mainArray
