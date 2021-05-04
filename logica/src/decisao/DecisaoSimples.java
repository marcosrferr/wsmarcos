package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimples {
public static void main(String[] args) {

	String disciplina = JOptionPane.showInputDialog ("Disciplina").toUpperCase();
	float nota1 = Float.parseFloat(JOptionPane.showInputDialog ("Nota 1"));
	float nota2 = Float.parseFloat(JOptionPane.showInputDialog ("Nota 2"));
	float media = (nota1+nota2)/2;
	
	// && => and
	// || => or	
	
	//"Você foi reprovado" => media menor que 4
	if (media<4) {
		System.out.println("Você foi reprovado na disciplina:" + disciplina);
	}
	
	//"Você tem chance no exame" => média entre 5.9 e 4
	
	if(media>=4 && media<6)
		System.out.println("Você esta de exame na disciplina: " + disciplina);
	
	
	if(media>=6) {
		System.out.println("Você foi aprovado na disciplina: " + disciplina);
	}
	//somente vai ser executada se a condição for verdadeira
		
	System.out.println("Sua média foi: " + media);
		
		/*
		 * Captura:
		 * - Nome da disciplina
		 * - Primeira Nota
		 * - Segunda Nota
		 * - Calcular a media
		 * - exibir a media
		 */
		
}

}
