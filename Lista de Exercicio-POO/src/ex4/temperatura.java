package ex4;

public class temperatura {
	
	private double celsius;
	private double fahrenheit, kelvin;
	
	public temperatura(double celsius, double fahrenheit, double kelvin) {
		this.celsius = celsius;
		this.fahrenheit = fahrenheit;
		this.kelvin = kelvin;
	}

	public double getCelsius() {
		return celsius;
	}

	public void setCelsius(int celsius) {
		this.celsius = celsius;
	}

	public double getFahrenheit() {
		return fahrenheit;
	}

	public void setFahrenheit(double fahrenheit) {
		this.fahrenheit = (9/5) * celsius + 32;
	}

	public double getKelvin() {
		return kelvin;
	}

	public void setKelvin(double kelvin) {
		this.kelvin = celsius + 273;
	}
	
	
	
	
	
}
