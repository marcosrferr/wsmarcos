package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisaoSimples {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog ("Digite seu Nome:").toUpperCase();
		short idade = Short.parseShort(JOptionPane.showInputDialog ("Digite sua idade:"));

		if(idade<16) {
			System.out.println(nome  + " você não precisa votar");
		}
		
		if(idade>=18 && idade<=70) {
			System.out.println(nome  + " seu voto é obrigatório");
		}
		
		if(idade==16 || idade ==17 || idade>70) {
			System.out.println(nome  + " seu voto é facultativo");
		}
		
/*
 *Pedir: Nome e idade
 *De acordo com as regras para votação no Brasil
 *Oriente o usuário se ele pode votar, se ele
 *nao pode votar ou se o voto tele é facultativo
 *
 *16,17 e maior 70 facultaivo
 *18-69 0brigatorio
 *0-15 Nao vota
 */
	}

}
