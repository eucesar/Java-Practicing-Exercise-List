package ex8;

public class Formulas {

	private double a, b, c, delta, x1, x2;

	public Formulas(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.delta = delta;
		this.x1 = x1;
		this.x2 = x2;
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
	

	public double getDelta() {
		return delta = Math.pow(getB(), 2) - 4 * getA() * getC();
	}

	public double getX1() {
	    if (getDelta() < 0) {
	    	System.out.println(" X1 n tem raizes reais");
	    }
	    return (-getB() + Math.sqrt(getDelta())) / (2 * getA());
	}

	public double getX2() {
	    if (getDelta()  < 0) {
	    	System.out.println(" X2 n tem raizes reais");
	    }
	    return (-getB() - Math.sqrt(getDelta())) / (2 * getA());
	}

	
}
