package ex5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		double metros, milhas = 0.000621371, pes = 3.28084;
		
		System.out.print("Forneça os metros para converter: ");
		metros = in.nextDouble();
		
		Convercao convercao = new Convercao(metros, milhas, pes);
		
		
		
		milhas = convercao.getMilhas() * convercao.getMetros() ;
		
		pes = convercao.getPes() * convercao.getMetros();
		
		System.out.println("milhas --> " + milhas + "\n" + "pes --> " + pes);
	}

}
