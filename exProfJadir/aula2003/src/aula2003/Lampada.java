package aula2003;
import java.util.Scanner;

public class Lampada {
	boolean status;

	Scanner input = new Scanner(System.in);
	int resp;

	public Lampada() {
	}

	public Lampada(boolean status) {
		this.status = status;
	}

	public String ligar() {
		return ("Ligando >>>>>>");
	}

	public String desligar() {
		return ("Desligando >>>>>>");
	}

	public void observar() {
		if (status) {
			System.out.println("A Lampada está apagada, aperte 1 para Liga-la: ");
			resp = input.nextInt();
			while (resp != 1 && resp != 2) {
				System.out.println("Opção invalida");
				System.out.println("A Lampada está apagada, aperte 1 para Liga-la: ");
				resp = input.nextInt();
			}

			while (resp == 2) {
				System.out.println("A Lampada já está apagada, aperte 1 para Liga-la: ");
				resp = input.nextInt();
				if (resp != 1 && resp != 2) {
					System.out.println("Opção invalida");
					System.out.println("A Lampada está apagada, aperte 1 para Liga-la: ");
					resp = input.nextInt();
				}
			}

			System.out.println(ligar());
			System.out.println("A Lampada está Acesa, aperte 2 para Apaga-la: ");
			resp = input.nextInt();

			while (resp == 1) {
				System.out.println("A Lampada já está Acesa, aperte 2 para Apaga-la: ");
				resp = input.nextInt();
				if (resp != 1 && resp != 2) {
					System.out.println("Opção invalida");
					System.out.println("A Lampada está Acesa, aperte 2 para Apaga-la: ");
					resp = input.nextInt();
				}

			}
			if (resp == 2) {
				System.out.println("Lampada: " + desligar());
			}

		}

	}
}
