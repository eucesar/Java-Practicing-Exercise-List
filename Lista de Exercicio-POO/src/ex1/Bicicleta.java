package ex1;

public class Bicicleta {
	
	private String cor;
	private int marchas;
	private double preco;
	
	public Bicicleta(String cor, int marchas, double preco) {
		this.cor = cor;
		this.marchas = marchas;
		this.preco = preco;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getMarchas() {
		return marchas;
	}

	public void setMarchas(int marchas) {
		this.marchas = marchas;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
	
}
