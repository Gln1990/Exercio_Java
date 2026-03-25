package conta;

public class Conta {

	private double saldo;
	private String nrAgencia;
	private String titular;
	private String nrConta;
	private int codBanco;
	
	public Conta(double saldo, String nrAgencia, String titular, String nrConta, int codBanco) {
		super();
		this.saldo = saldo;
		this.nrAgencia = nrAgencia;
		this.titular = titular;
		this.nrConta = nrConta;
		this.codBanco = codBanco;
	}

	//contrutor
	/*public Conta(double saldoInicial) {
		//valida que saldoInicial é maior do que 0, se não o saldo é inicializado com valor padrão que é 0
		if(saldoInicial > 0.0)
			saldo = saldoInicial;
	}// fim do contrutor Conta*/
	
	//adiciona uma quantia na conta
	public void deposito(double credito) {
		
		saldo += credito;
	}//fim do método deposito
	
	public void saque(double valor) {
		if(valor > 0) {
			if(saldo > valor) {
				System.out.printf("Realizando o Saque de R$%.2f\n", valor);
				saldo -= valor;
			}else {
				System.out.println("Saldo insuficiente");
			}
		}
	}
	
	public void imprimeDados() {
		System.out.println("\n----------------------------");
		System.out.println("AGENCIA: "+nrAgencia+"\t BANCO: "+codBanco);
		System.out.println("Conta: "+nrConta);
		System.out.println("TITULAR: "+titular);
		System.out.printf("SALDO: R$%.2f\n", saldo);
		System.out.println("-----------------------------\n");
	}
	
	//retorna o saldo da conta
	public double getSaldo() {
		
		return saldo;
	}// fim do método getSaldo

}// fim da classe Conta
