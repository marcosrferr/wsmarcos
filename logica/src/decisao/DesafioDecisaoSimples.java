package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisaoSimples {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog ("Digite seu Nome:").toUpperCase();
		short idade = Short.parseShort(JOptionPane.showInputDialog ("Digite sua idade:"));

		if(idade<16) {
			System.out.println(nome  + " voc� n�o precisa votar");
		}
		
		if(idade>=18 && idade<=70) {
			System.out.println(nome  + " seu voto � obrigat�rio");
		}
		
		if(idade==16 || idade ==17 || idade>70) {
			System.out.println(nome  + " seu voto � facultativo");
		}
		
/*
 *Pedir: Nome e idade
 *De acordo com as regras para vota��o no Brasil
 *Oriente o usu�rio se ele pode votar, se ele
 *nao pode votar ou se o voto tele � facultativo
 *
 *16,17 e maior 70 facultaivo
 *18-69 0brigatorio
 *0-15 Nao vota
 */
	}

}
