package entities;

public class Triangle {
	// Declara��o das vari�veis
	public double a;
	public double b;
	public double c;
	
	// Declara��o dos m�todos
	public double area() {
		double p = (a + b + c) / 2;
		return  Math.sqrt(p * (p - a) * (p - b) * (p - c));
	
	}
	
}
