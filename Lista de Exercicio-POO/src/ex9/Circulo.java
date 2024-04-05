package ex9;

public class Circulo {

	private double raio, pi = Math.PI;
	double area, perimetro;

	public Circulo(double raio) {
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getPi() {
		return pi;
	}

	public void setPi(double pi) {
		this.pi = pi;
	}
	
	public double AlterarValorRaio() {
		double raio2 = getRaio();
		raio2 = raio2 + 1;
		return raio2;
	}
	
	public double Area() {
		area = getPi() * Math.pow(AlterarValorRaio(), 2); 
		return area;
	}
	
	public double Perimetro() {
		perimetro = 2 * getPi() * AlterarValorRaio(); 
		return perimetro;
	}
}
