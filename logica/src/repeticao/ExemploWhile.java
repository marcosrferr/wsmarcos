package repeticao;

import javax.swing.JOptionPane;

public class ExemploWhile {
	
	public static void main (String[] args) {

	String email = JOptionPane.showInputDialog("Digite o email").toLowerCase();
	
	//System.out.println("Usuario: " + email.substring(0,email.indexOf("@")));
	//if (email.contains("@")==false) { (aqui faz uma unica vez) com while ele fica no laco de repeti��o
	
	while (email.contains("@")==false) {
		//while la�o de repeti��o enquanto nao fizer a a��o pedida fica preso nessa situa��o.
		email = JOptionPane.showInputDialog("Digite o email com @").toLowerCase();
	}
	System.out.println("Usuario: "+ email.substring(0, email.indexOf("@")));
	
	String nome = JOptionPane.showInputDialog("Digite o nome").toUpperCase();
	//exibam o nome somente se o nome tiver mais que 3 caracteres
	//e menos que 15
	
	while (nome.length()<=3 || nome.length()>=15) {
		nome = JOptionPane.showInputDialog("Digite o nome").toUpperCase();
	}
	System.out.println("Nome: " + nome);
	
	
	}
	}



