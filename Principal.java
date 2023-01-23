package CUADRADOPCKG;

public class Principal {

	public static void main(String[] args) {
		Cuadrado cuadrado1 = new Cuadrado();
		System.out.println(cuadrado1.calcularDiagonal());
		System.out.println(cuadrado1.calcularArea());
		System.out.println(cuadrado1.calcularPerimetro());
		
		Circulo circulo1 = new Circulo();
		System.out.println(circulo1.calcularArea());
		System.out.println(circulo1.calcularCircunferencia());
	}
}
