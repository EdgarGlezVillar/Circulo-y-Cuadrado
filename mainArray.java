package ArrayPckg;

import java.util.Scanner;

public class mainArray 
{	
	//Método main
	public static void main(String[] args)
	{
		ArregloInt arregloInt1 = new ArregloInt(15);
		//Objeto creado arregloInt1, atributos: arregloInt
		ArregloString arregloNombres = new ArregloString(10);
		//Objeto creado arregloString1, atributos: arregloString
		Circulo[] circulosArray = new Circulo[100];
		
		arregloInt1.arregloInt[10] = 5;
		arregloNombres.arregloString[1] = "Francisco";
		
		arregloNombres.mostrarContenidos(arregloNombres.arregloString);
		arregloNombres.valorArreglo(arregloNombres.arregloString);
		arregloNombres.EliminarYRecorrer(arregloNombres.arregloString);
		
		
	}
}//fin clase mainArray
