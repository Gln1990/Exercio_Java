package aula2003;

public class Lampada1 {
	boolean status;
	
	public void ligar() {
		status = true;
	}
	
	public void desligar() {
		status = false;
	}
	
	public void obs(String resp) {
		System.out.println(resp);
	}
}
