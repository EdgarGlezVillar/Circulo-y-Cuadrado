package CUADRADOPCKG;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese el método que desea correr");
		String metodo = scan.nextLine();
		
		if(metodo.contains("cuadrado")){
			System.out.println("Ingrese la medida del lado");
			String ladoa = scan.nextLine();
			Integer ladoint = Integer.parseInt(ladoa);
			double lado = ladoint;
			Cuadrado cuadrado1 = new Cuadrado(lado);
			
			System.out.println("Ingrese lo que se desea calcular");
			String calc = scan.nextLine();
			
			if(calc.contains("area")) {
				double area = cuadrado1.calcularArea();
				int areaint = (int) area;
				System.out.println(area);
				System.out.println(areaint);
			}
			else if(calc.contains("diagonal")) {
				double diagonal = cuadrado1.calcularDiagonal();
				int diagonalint = (int) diagonal;
				System.out.println(diagonal);
				System.out.println(diagonalint);
			}
			else {
				double perimetro = cuadrado1.calcularPerimetro();
				int perimetroint = (int) perimetro;
				System.out.println(perimetro);
				System.out.println(perimetroint);
			}
		
		}
		
	
		else if(metodo.contains("circulo")){
			System.out.println("Ingrese la medida del radio");
			String radioa = scan.nextLine();
			Integer radio = Integer.parseInt(radioa);
			Circulo circulo1 = new Circulo(radio);
			
			System.out.println("Ingrese lo que se desea calcular");
			String calc = scan.nextLine();
			
			if(calc.contains("area")) {
				double area = circulo1.calcularArea();
				int areaint = (int) area;
				System.out.println(area);
				System.out.println(areaint);

				
			}
			else {
				double circunferencia = circulo1.calcularCircunferencia();
				int circunferenciaint = (int) circunferencia;
				System.out.println(circunferencia);
				System.out.println(circunferenciaint);
			}
						
		}
	}
}
