package aula2003;

public class Computador {
	private String marca;
	private String cor;
	private String modelo;
	private String serie;
	private double valor;
	
	public Computador(String marca, String cor, String modelo, String serie, double valor) {
		super();
		this.marca = marca;
		this.cor = cor;
		this.modelo = modelo;
		this.serie = serie;
		this.valor = valor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public void imprimirDados() {
		System.out.println(marca);
		System.out.println(cor);
		System.out.println(modelo);
		System.out.println(serie);
		System.out.println(valor);
	}
}
