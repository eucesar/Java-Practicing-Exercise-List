package ex6;

public class Main {

    public static void main(String[] args) {

        Bola bola1 = new Bola("azul", 2.75);
        Bola bola2 = new Bola("branca", 3.5);
        Bola bola3 = new Bola("azul", 3.25);

        //vai aramazenar tanto a cor quanto o valor do valor colocado no contrutor e dentro do metodo
        Bola maiorBola = Bola.maiorBola(bola1, bola2);
        System.out.println("A maior bola tem cor " + maiorBola.getCor() + " e raio " + maiorBola.getRaio());
    }
}
