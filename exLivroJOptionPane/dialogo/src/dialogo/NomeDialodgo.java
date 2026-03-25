package dialogo;
import javax.swing.JOptionPane;

public class NomeDialodgo {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Qual é o seu nome? ");
		
		String mensagem = String.format("Bem vindo %s, na programação Java", nome);
		
		JOptionPane.showMessageDialog(null, mensagem);

	}

}
