package ex3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Quantidade máxima de retângulos: ");
        int quantidadeMaximaRetangulos = in.nextInt();

        int elem = quantidadeMaximaRetangulos; //vai ter o valor maximo dentro do vetor
        // Criando um único objeto Retangulos
        Retangulos retangulos = new Retangulos(new int[elem], new int[2], new double[elem], new double[elem]);

        // Preenchendo o array de retângulos com valores de entrada
        for (int i = 0; i < quantidadeMaximaRetangulos; i++) {
            System.out.println((i + 1) + "º Retângulo:");
            System.out.print("Comprimento: ");
            double comprimento = in.nextDouble();
            System.out.print("Largura: ");
            double largura = in.nextDouble();
            
            //preciso igualar o get com o comprimeto para armazenar
            retangulos.getComprimento()[i] = comprimento;
            retangulos.getLargura()[i] = largura;
        }

        // Exibindo as áreas de todos os retângulos
        for (int i = 0; i < quantidadeMaximaRetangulos; i++) {
            double area = retangulos.getComprimento()[i] * retangulos.getLargura()[i];
            double perimetro = (retangulos.getComprimento()[i] + retangulos.getLargura()[i]) * 2;

            System.out.println((i + 1) + "º Retângulo - Área: " + area);
            System.out.println((i + 1) + "º Retângulo - Perímetro: " + perimetro);
        }

        // Fechando o Scanner
        in.close();
    }
}
