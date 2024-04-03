package ex6;

public class Bola {

	private String cor;
	private double raio;
	
	public Bola(String cor, double raio) {
		this.cor = cor;
		this.raio = raio;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
    // Método para comparar raios de duas bolas
    public static Bola maiorBola(Bola bola1, Bola bola2) {
        if (bola1.getRaio() > bola2.getRaio()) {
            return bola1;
        } else {
            return bola2;
        }
    }
	
}
