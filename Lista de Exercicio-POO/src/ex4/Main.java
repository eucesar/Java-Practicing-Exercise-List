package ex4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		temperatura temperatura = new temperatura(0, 0, 0);
		
		Scanner in = new Scanner(System.in);
		int celsius;
		double fahrenheit, kelvin;
		
		System.out.print("Celsius: ");
		celsius = in.nextInt();
		
		System.out.print("Fahrenheit: ");
		fahrenheit = in.nextInt();
		
		System.out.print("Kaelvin: ");
		kelvin = in.nextInt();
		
		temperatura.setCelsius(celsius);
		temperatura.setFahrenheit(fahrenheit);
		temperatura.setKelvin(kelvin);
		
		System.out.println("celsius: " + temperatura.getCelsius());
		System.out.println("fahrenheit: " + temperatura.getFahrenheit());
		System.out.println("kalvin: " + temperatura.getKelvin());
	}

}
