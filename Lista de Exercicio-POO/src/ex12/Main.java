package ex12;

public class Main {

	public static void main(String[] args) {

		Hora hora = new Hora();
		
		int horas = hora.getHoras();
		int minutos = hora.getMinutos();
		int segundos = hora.getHoras();
		
		if (segundos == -1 || segundos == 60) {
			System.out.println("horas deu valor errado");
		}else if (minutos == -1 || minutos == 60) {
			System.out.println("horas deu valor errado");
		}else if (horas == -1 || horas == 24) {
			System.out.println("horas deu valor errado");
		}
	
		hora.imprimirHora();
	}

}
