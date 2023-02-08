package EXMNPCKG;

import java.util.Scanner;

public class MainExamen 
{
	String sentence;
	
	public MainExamen(String sentence) //constructor de oraciones
	{
		this.sentence = sentence;
	}
	
	//método para primera mayúscula
	public String primeraMayuscula(String sentence) 
	{
		char firstLetterChar = sentence.charAt(0);
		String firstLetterString = Character.toString(firstLetterChar);
		String firstLetterUpperCase = firstLetterString.toUpperCase();
		int sentenceLength = sentence.length();
		String sentenceWithOutFirstLetter = sentence.substring(1,sentenceLength);
		return firstLetterUpperCase + sentenceWithOutFirstLetter;
	}
	
	//método para invertir cadena
	public String invertirCadena(String sentence) 
	{
		String[] arrayOriginal = sentence.split("");
		int sentenceLength = sentence.length();
		String[] arrayReversed = new String[sentenceLength];
		int x = sentenceLength-1;
		String concatenacion = "";
		for(int i = 0; i < sentenceLength ; i++)
		{
			arrayReversed[i] = arrayOriginal[x];
			x = x - 1;
			concatenacion = concatenacion + arrayReversed[i];
		}//fin del for
		return concatenacion;
	}
	
	//metodo para vocales en mayusculas
	public String vocalesMayuscula(String sentence)
	{
		String[] arrayOriginal = sentence.split("");
		int sentenceLength = sentence.length();
		String concatenacion = "";
		for(int i = 0; i < sentenceLength; i++)
		{
			if(arrayOriginal[i].equals("a") || 
					arrayOriginal[i].equals("e")||
					arrayOriginal[i].equals("i")||
					arrayOriginal[i].equals("o")||
					arrayOriginal[i].equals("u"))
			{
				arrayOriginal[i] = arrayOriginal[i].toUpperCase();
			}//end if
			concatenacion = concatenacion + arrayOriginal[i];
		}//end for
		return concatenacion;
	}
	
	public void fizzBuzz()
	{
		for(int i = 1; i<101;i++)
		{
			if( i%5 == 0 && i%3 == 0)
			{
				System.out.println("FizzBuzz");
			}
			else if( i%5 == 0)
			{
				System.out.println("Buzz");
			}
			else if( i%3 == 0)
			{
				System.out.println("Fizz");
			}
			else
			{
				System.out.println(i);
			}
		}
	}
	
	//comprobar palindromo
	public boolean palindromo(String sentence)
	{
		boolean check;
		String sentenceWithoutGaps = sentence.replace(" ", "");
		String sentenceLowerCase = sentenceWithoutGaps.toLowerCase();
		MainExamen thisSentence = new MainExamen(sentenceLowerCase);
		String sentenceReversed = thisSentence.invertirCadena(sentenceLowerCase);
		if(sentenceLowerCase.equalsIgnoreCase(sentenceReversed))
		{
			check = true;
		}
		else
		{
			check = false;
		}
		return check;
	}
	
	
	public static void main(String[] args) //rutina main
	{
		//escanear oración
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese la oración que desea");
		String sentence = scan.nextLine();

		//construit objeto con oración
		MainExamen oracion1 = new MainExamen(sentence);
		//llamar rutina
		String ejercicio1 = oracion1.primeraMayuscula(sentence);
		String ejercicio2 = oracion1.invertirCadena(sentence);
		String ejercicio3 = oracion1.vocalesMayuscula(sentence);
		boolean ejercicio5 = oracion1.palindromo(sentence);
		//imprimir outputs
		System.out.println(ejercicio1);
		System.out.println(ejercicio2);
		System.out.println(ejercicio3);
		oracion1.fizzBuzz();
		System.out.println("¿la oración es palindromo? " + ejercicio5);
	}
	
}




	

	



