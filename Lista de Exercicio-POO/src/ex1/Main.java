package ex1;

import java.util.Scanner;

import ex1.Bicicleta;

public class Main {

	public static void main(String[] args) {

		int marchas;
		double preco;
		String cor;
		
		Bicicleta bicicleta = new Bicicleta(null, 0, 0);
		Scanner in = new Scanner(System.in);
		
		System.out.print("Cor da Bicileta: ");
		cor = in.nextLine();
		bicicleta.setCor(cor);
		
		System.out.print("Quantidade de marchas: ");
		marchas = in.nextInt();
		bicicleta.setMarchas(marchas);
		
		System.out.print("Preco da Bike: ");
		preco = in.nextDouble();
		bicicleta.setPreco(preco);;
		
		System.out.println(bicicleta.getCor() + " " + bicicleta.getMarchas() + " R$" + String.format("%.2f", bicicleta.getPreco()));

		
	}

}
