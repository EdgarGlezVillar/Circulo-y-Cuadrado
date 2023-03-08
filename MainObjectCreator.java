package ObjectCreatorPckg;
import java.util.Random;
import java.util.Scanner;

public class MainObjectCreator {

	public static void main(String[] args) 
	{
		//arreglo de nombres
		String[] nombres = {"Edgar", "Andrés", "Mateo", "Pablo", "Luis", "Víctor", "Tomás"};
		//crear objeto
		Random random = new Random();
	
		Atleta[] atleta = new Atleta[10];
		int contador1 = 0;
		int contador2 = 0;
		int contador3 = 0;
		int contador4 = 0;
		
		
		
			for(int a = 0; a<10; a++)
			{
				boolean atributo1 = random.nextBoolean();
				boolean atributo2 = random.nextBoolean();
				boolean atributo3 = random.nextBoolean();
				boolean atributo4 = random.nextBoolean();

				
				atleta[a] = new Atleta(nombres[random.nextInt(7)], atributo1, atributo2, atributo3, atributo4);
				System.out.println("Nombre:" + atleta[a].getNombre());
		        System.out.println("Rápido:" + atleta[a].getRapido());
		        System.out.println("Fuerte:" + atleta[a].getFuerte());
		        System.out.println("Alto:" + atleta[a].getAlto());
		        System.out.println("Ágil:" + atleta[a].getAgil());
		        System.out.println();
			}
			
					
				for(int obj = 1; obj<10; obj++)
				{
					for(int a = 0; a<obj; a++)
					{
						if(atleta[obj].rapido == atleta[9-(9-a)].rapido && atleta[obj].fuerte == atleta[9-(9-a)].fuerte && atleta[obj].alto == atleta[9-(9-a)].alto && atleta[obj].agil == atleta[9-(9-a)].agil)
						{
							boolean atributo1 = random.nextBoolean();
							boolean atributo2 = random.nextBoolean();
							boolean atributo3 = random.nextBoolean();
							boolean atributo4 = random.nextBoolean();
							atleta[obj] = new Atleta(nombres[random.nextInt(7)], atributo1, atributo2, atributo3, atributo4);
					        obj = 1;
					        a = 0;
						}
					}//2do for
				}//1er for

		
			contador1 = 0;
			contador2 = 0;
			contador3 = 0;
			contador4 = 0;
			
			//contar veces en las qué cada atributo es verdadero
			for (int a = 0; a<10; a++)
			{
				if(atleta[a].rapido)
				{
					contador1 = contador1 + 1;
				}
				if(atleta[a].fuerte)
				{
					contador2 = contador2 + 1;
				}
				if(atleta[a].alto)
				{
					contador3 = contador3 + 1;
				}
				if(atleta[a].agil)
				{
					contador4 = contador4 + 1;
				}
			}
			
		
	
		System.out.println("el atributo 1 se repite: " + contador1);
		System.out.println("el atributo 2 se repite: " + contador2);
		System.out.println("el atributo 3 se repite: " + contador3);
		System.out.println("el atributo 4 se repite: " + contador4);
		
		//elegir persona
		Atleta quien = atleta[random.nextInt(10)];
		
		
		//preguntas
		String pregunta1 = "a) Es rápido?";
		String pregunta2 = "b) Es fuerte?";
		String pregunta3 = "c) Es alto?";
		String pregunta4 = "d) Es ágil?";
		
		char[] preguntas = new char[4];
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Cuál es tu primera pregunta?");
		
		System.out.println(pregunta1);
		System.out.println(pregunta2);
		System.out.println(pregunta3);
		System.out.println(pregunta4);
		
		preguntas[0] = scan.next().charAt(0);
		if(preguntas[0] == 'a')
		{
			System.out.println(quien.rapido);
		}
		if(preguntas[0] == 'b')
		{
			System.out.println(quien.fuerte);
		}
		if(preguntas[0] == 'c')
		{
			System.out.println(quien.alto);
		}
		if(preguntas[0] == 'd')
		{
			System.out.println(quien.agil);
		}
		
		
		System.out.println("Cuál es tu segunda pregunta?");
		
		System.out.println(pregunta1);
		System.out.println(pregunta2);
		System.out.println(pregunta3);
		System.out.println(pregunta4);
		
		preguntas[1] = scan.next().charAt(0);
		if(preguntas[1] == 'a')
		{
			System.out.println(quien.rapido);
		}
		if(preguntas[1] == 'b')
		{
			System.out.println(quien.fuerte);
		}
		if(preguntas[1] == 'c')
		{
			System.out.println(quien.alto);
		}
		if(preguntas[1] == 'd')
		{
			System.out.println(quien.agil);
		}
		
		
		System.out.println("Cuál es tu tercera pregunta?");
		
		System.out.println(pregunta1);
		System.out.println(pregunta2);
		System.out.println(pregunta3);
		System.out.println(pregunta4);
		
		preguntas[2] = scan.next().charAt(0);
		if(preguntas[2] == 'a')
		{
			System.out.println(quien.rapido);
		}
		if(preguntas[2] == 'b')
		{
			System.out.println(quien.fuerte);
		}
		if(preguntas[2] == 'c')
		{
			System.out.println(quien.alto);
		}
		if(preguntas[2] == 'd')
		{
			System.out.println(quien.agil);
		}
		
		int rapido = 0;
		int fuerte = 0;
		int alto = 0;
		int agil = 0;
		//Checar qué atrbutos buscar
		for(int a = 0; a<3; a++)
		{
			for(int b = 0; b<3; b++)
			{
				if(preguntas[b] == 'a')
				{
					rapido = 1;
				}
				if(preguntas[b] == 'b')
				{
					fuerte = 1;
				}
				if(preguntas[b] == 'c')
				{
					alto = 1;
				}
				if(preguntas[b] == 'd')
				{
					agil = 1;
				}
			}
		}
		
		//determinar condiciones en atletas
		Atleta[] posiblesQuien = new Atleta[10];
		int contador = 0;
		if(rapido<1)
		{
			//arreglo con posibles candidatos
			for(int a = 0; a<10; a++)
			{
				if(atleta[a].fuerte == quien.fuerte && atleta[a].alto == quien.alto && atleta[a].agil == quien.agil)
				{
					posiblesQuien[contador] = atleta[a];
					contador++;
				}
			}
		}
		if(fuerte<1)
		{
			//arreglo con posibles candidatos
			for(int a = 0; a<10; a++)
			{
				if(atleta[a].rapido == quien.rapido && atleta[a].alto == quien.alto && atleta[a].agil == quien.agil)
				{
					posiblesQuien[contador] = atleta[a];
					contador++;
				}
			}
			
		}
		if(alto<1)
		{
			//arreglo con posibles candidatos
			for(int a = 0; a<10; a++)
			{
				if(atleta[a].fuerte == quien.fuerte && atleta[a].rapido == quien.rapido && atleta[a].agil == quien.agil)
				{
					posiblesQuien[contador] = atleta[a];
					contador++;
				}
			}
		}
		if(agil<1)
		{
			//arreglo con posibles candidatos
			for(int a = 0; a<10; a++)
			{
				if(atleta[a].fuerte == quien.fuerte && atleta[a].alto == quien.alto && atleta[a].rapido == quien.rapido)
				{
					posiblesQuien[contador] = atleta[a];
					contador++;
				}
			}
		}
		
		System.out.println();
		for(int a = 0; a < (contador+1) && posiblesQuien[a]  != null ; a++)
		{
			System.out.println(a + ") " + posiblesQuien[a].getNombre());
			System.out.println("Rápido:" + posiblesQuien[a].getRapido());
	        System.out.println("Fuerte:" + posiblesQuien[a].getFuerte());
	        System.out.println("Alto:" + posiblesQuien[a].getAlto());
	        System.out.println("Ágil:" + posiblesQuien[a].getAgil());
		}
		
		System.out.println();
		System.out.println("Escribe el índice de la persona que crees que es la incógnita: ");
		int eleccion = scan.nextInt();
		
		if(posiblesQuien[eleccion] == quien)
		{
			System.out.println();
			System.out.println("Ganaste!");
		}
		else
		{
			System.out.println();
			System.out.println("Perdiste!");
		}
	}//main
}
