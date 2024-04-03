package ex3;

public class Retangulos {
	
	private int[] retangulos;
	private int lados[];
	private double largura[];
	private double comprimento[];
	
	

	public Retangulos(int[] retangulos, int[] lados, double[] largura, double[] comprimento) {
		this.retangulos = retangulos;
		this.lados = lados;
		this.largura = largura;
		this.comprimento = comprimento;
	}



	public int[] getRetangulos() {
		return retangulos;
	}



	public void setRetangulos(int[] retangulos) {
		this.retangulos = retangulos;
	}



	public int[] getLados() {
		return lados;
	}



	public void setLados(int[] lados) {
		this.lados = lados;
	}



	public double[] getLargura() {
		return largura;
	}



	public void setLargura(double[] largura) {
		this.largura = largura;
	}



	public double[] getComprimento() {
		return comprimento;
	}



	public void setComprimento(double[] comprimento) {
		this.comprimento = comprimento;
	}

	
	
	
	
}
