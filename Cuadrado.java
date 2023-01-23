package CUADRADOPCKG;

public class Cuadrado {
public double lado;
Cuadrado(){
	this(170142);
}
Cuadrado(double lado) {
	this.lado = lado;
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
