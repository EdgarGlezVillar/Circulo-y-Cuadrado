package CUADRADOPCKG;

public class Cuadrado {
public double lado;
public double diagonal;
public double area;
public double perimetro;
public Cuadrado(double a) {
	this.lado = a;
}
public double calcularDiagonal() {
	return Math.sqrt(Math.pow(lado,2) + Math.pow(lado,2));
}
public double calcularArea() {
	return Math.pow(lado, 2);
}
public double calcularPerimetro() {
	return lado*4;
}
}
