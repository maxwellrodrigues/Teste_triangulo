package entities;

public class Triangle {
	// Declaração das variáveis
	public double a;
	public double b;
	public double c;
	
	// Declaração dos métodos
	public double area() {
		double p = (a + b + c) / 2;
		return  Math.sqrt(p * (p - a) * (p - b) * (p - c));
	
	}
	
}
