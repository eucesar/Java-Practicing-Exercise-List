package Loja;

import java.util.Random;

public class Produtos {
	
	private int id;
	private String descricao;
	private double preco;
	private double estoque;
	
	
	public Produtos(int id, String descricao, double preco, double estoque) {
		this.id = rd();
		this.descricao = descricao;
		this.preco = preco;
		this.estoque = estoque;
	}


	private int rd() {
		Random rd = new Random();
		int valor = rd.nextInt(1,100);
		return valor;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}


	public double getEstoque() {
		return estoque;
	}


	public void setEstoque(double estoque) {
		this.estoque = estoque;
	}
	
	
	
	
	
}
