package decisao;

import javax.swing.JOptionPane;

public class DecisaoComposta {
public static void main(String[] args) {

	String disciplina = JOptionPane.showInputDialog ("Disciplina").toUpperCase();
	float nota1 = Float.parseFloat(JOptionPane.showInputDialog ("Nota 1"));
	float nota2 = Float.parseFloat(JOptionPane.showInputDialog ("Nota 2"));
	float media = (nota1+nota2)/2;

	if(media>=6) {
		System.out.println("Voc? foi aprovado na disciplina: " + disciplina);
	}

	else if (media<4) {
		System.out.println("Voc? foi reprovado na disciplina:" + disciplina);
	}
	
	else {
		System.out.println("Voc? esta de exame na disciplina: " + disciplina);
	}
	
	if(media>=6) {
		System.out.println("Voc? foi aprovado na disciplina: " + disciplina);
	}
			
	System.out.println("Sua m?dia foi: " + media);
		
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
