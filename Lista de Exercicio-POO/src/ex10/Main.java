package ex10;

import java.util.Scanner;

import ex8.Formulas;

public class Main {

	public static void main(String[] args) {

		
		double a, b , c;
		Scanner in = new Scanner(System.in);
		System.out.print("a --> ");
		a = in.nextDouble();
		
		System.out.print("b --> ");
		b = in.nextDouble();
		
		System.out.print("c --> ");
		c = in.nextDouble();
		
		Formulas2 formulas = new Formulas2(a, b, c);
		
		System.out.println("p --> " + formulas.p());
		System.out.println("S --> " + formulas.S());
		System.out.println("P --> " + formulas.P());
		System.out.println("Centroide --> " + formulas.Centroide());
		System.out.println("y --> " + formulas.y());
		System.out.println("x -->" + formulas.x());
		
	}

}
