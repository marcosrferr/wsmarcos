package repeticao;

import javax.swing.JOptionPane;

public class ExemploFor {

	public static void main(String[] args) {
	
		/*
		 * Sintaxe do "for" � formada por 3 parametros
		 * - variavel que vai contar e o valor que ela vai iniciar
		 * - condi��o (at� quando o la�o vai ser repetido);
		 * - a forma de contagem (se vai ser de 1 em 1, 2 em 2, ...)
		 * 
		 */

		
		//for (int cont=10;cont<50;cont+=5) {
		//	System.out.println("Contador: " + cont);
		//}
		int tabuada = Integer.parseInt(JOptionPane.showInputDialog("Tabuada"));
		for (int cont=1;cont<11;cont+=1) {
			System.out.println(tabuada + " x " + cont + " = " + (tabuada*cont));
		}
	}

}
