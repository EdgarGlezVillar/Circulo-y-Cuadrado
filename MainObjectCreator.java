package ObjectCreatorPckg;
import java.util.Random;

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
		
		
		
	}//main
}
