package ex9;

import java.awt.geom.Area;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double raio;
		System.out.print("raio --> ");
		raio = in.nextDouble();
		
		Circulo circulo = new Circulo(raio);
		
		System.out.println("valor do raio alterado (soma 1) --> " + circulo.AlterarValorRaio());
		System.out.println("area -->" + String.format("%.2f", circulo.Area()));
		System.out.println("primetro --> "  + String.format("%.2f", circulo.Perimetro()));

	}

}
