package aula2003;

public class UsarLampada1 {

	public static void main(String[] args) {
		Lampada1 lam1 = new Lampada1();
		Lampada1 lam2 = new Lampada1();
		
		lam1.ligar();
		lam1.obs("Lampada 1: Ligada");
		try {
			Thread.sleep(1000);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Desligando >>>>>>");
		try {
			Thread.sleep(1000);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		lam1.desligar();
		lam1.obs("Lampada 1: Desligada");
		
		try {
			Thread.sleep(2000);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(">>>>>>>>>>");
		
		try {
			Thread.sleep(3000);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		lam2.ligar();
		lam2.obs("Lampada 2: Ligada");
		System.out.println("Desligando >>>>>>");
		try {
			Thread.sleep(1000);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		lam1.desligar();
		lam1.obs("Lampada 2: Desligada");
	}

}
