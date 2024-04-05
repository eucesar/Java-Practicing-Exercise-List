package ex10;

public class Formulas2 {
	
	private double a, b ,c;
	double p, P, S, y, x, centroide;
	
	public Formulas2(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}
	
	
	public double p() {
		p = (getA() + getB() + getC()) / 2;
		return p;
	}
	
	public double S() {
		S = Math.sqrt(p() * (p()-getA()) * (p()-getB()) * (p()-getC()));
		return S;
	}
	
	public double P() {
		P = getA() + getB() + getC();
		return P;
	}
	
	public double Centroide() {
		centroide = (Math.pow(getA(), 2) + Math.pow(getB(), 2) - Math.pow(getC(), 2)) / (2 * getA() * getB());
		return centroide;
	}
	
	public double y() {
		y = (getA()/3) * Math.sqrt(1 - Math.pow(Centroide(), 2));
		return y;
	}
	
	public double x() {
		x = (getB() + getA() * Centroide()) / 3;
		return x;
	}
}
