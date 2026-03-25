package conta;
import java.util.Scanner;

public class ContaTeste {

	public static void main(String[] args) {
		Conta conta = new Conta(500.00, "0123", "Gleyson", "3210", 1234);//cria um objeto do tipo Conta para a conta1
		
		
		System.out.printf("Saldo da conta é: R$%.2f\n", conta.getSaldo());	
		
		Scanner retirada = new Scanner(System.in);
		Scanner entrada = new Scanner(System.in);
		double quantia;
		double saida;
		
		System.out.println("Informe o valor que deseja sacar: ");
		saida = retirada.nextInt();
		conta.saque(saida);
		System.out.printf("Saldo da conta é: R$%.2f\n", conta.getSaldo());
		System.out.print("Informe a quantia a depositar na conta: ");
		quantia = entrada.nextDouble();
		System.out.printf("\nAdicionando R$%.2f no saldo da conta\n\n", quantia);
		conta.deposito(quantia);
		
		conta.imprimeDados();
		System.out.printf("Saldo da conta é: R$%.2f\n", conta.getSaldo());
		
		
		
		
		

	}

}
