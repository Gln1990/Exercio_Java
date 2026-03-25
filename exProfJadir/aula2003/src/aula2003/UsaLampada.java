package aula2003;

public class UsaLampada {

	public static void main(String[] args) {
		Lampada lampada1 = new Lampada();
		lampada1.status = true;
		lampada1.ligar();
		lampada1.observar();
		
		Lampada lampada2 = new Lampada(true);
		lampada2.observar();
		
	}

}
