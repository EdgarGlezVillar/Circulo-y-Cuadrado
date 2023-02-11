package ArrayPckg;

public class Circulo {
	double radio;
	Circulo(){
		this(170142);
	}
	 Circulo(double radio) {
		this.radio = radio;
	}
	public double calcularCircunferencia() {
		return Math.PI * 2*radio;
	}
	public double calcularArea() {
		return Math.PI * Math.pow(radio, 2);
	}

}
