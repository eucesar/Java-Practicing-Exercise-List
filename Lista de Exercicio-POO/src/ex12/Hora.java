package ex12;

import java.util.Random;

public class Hora {
	
	private int horas, minutos, segundos;

	Random random = new Random();
	
	public Hora() {
		this.horas = random.nextInt(0,23);
		this.minutos = random.nextInt(0,59);
		this.segundos = random.nextInt(0,59);
	}

	public int getHoras() {
		if (horas < 0 || horas > 23) {
			System.out.println("horas deu valor errado");
			return horas = 0;
		}
		return horas;
	}

	public void setHoras(int horas) {

		this.horas = horas;
	}

	public int getMinutos() {
		if (minutos < 0 || minutos > 59) {
			System.out.println("horas deu valor errado");
			return minutos = 0;
		}
		return minutos;
	}

	public void setMinutos(int minutos) {
		 this.minutos = minutos;
	}

	public int getSegundos() {
		if (segundos < 0 || segundos > 59) {
			System.out.println("horas deu valor errado");
			return segundos = 0;
		}
		return segundos;
	}

	public void setSegundos(int segundos) {

		this.segundos = segundos;
	}
	
	public void imprimirHora() {
		System.out.println(getHoras() + ":" + getMinutos() + ":" + getSegundos());
	}
	
}
