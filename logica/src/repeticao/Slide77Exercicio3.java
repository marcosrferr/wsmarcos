package repeticao;

import javax.swing.JOptionPane;

public class Slide77Exercicio3 {

			/*
		 * 3º) Crie um programa que pergunte ao 
		 * usuário o seu nível de escolaridade 
		 * (Médio, Superior ou Pós) 
		 * enquanto a resposta for válida, 
		 * irá computando os totais dos 
		 * níveis digitados, no final apresente
		 *  somente o nível que foi mais votado.
		 * 
		 */

	public static void main(String[] args) {
		
		String escolaridade = "";
		int contM=0;
		int contS=0;
		int contP=0;
		do {
			escolaridade =JOptionPane.showInputDialog("Escolaridade").toUpperCase();
		if (escolaridade.equals ("POS")) {
			contP++;
		}else if (escolaridade.equals("MEDIO")) {
			contM++;
		}else if (escolaridade.equals ("SUPERIOR")){
			contS++;
		}

	}while(escolaridade.equals("POS") || escolaridade.equals("SUPERIOR") || escolaridade.equals("MEDIO"));
	if (contM>contS && contM>contP) {
		System.out.println("MEDIO: " + contM);
	}else if (contS>contP) {
		System.out.println("SUPERIOR: " + contS);
	}else {
		System.out.println("POS: " + contP);
	}
	
	}

}

			
