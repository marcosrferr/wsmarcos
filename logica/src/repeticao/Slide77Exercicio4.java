package repeticao;
import javax.swing.JOptionPane;
public class Slide77Exercicio4 {
/*
 * 4º) Monte um programa que solicite a idade e o nome das pessoas. A aplicação continuará perguntando nome e idade 
 * enquanto o usuário afirmar que deseja continuar.
 *Ao terminar, a aplicação deverá exibir:
 *- a quantidade de pessoas maiores de idade e 
 *- a média entre todas as idades que foram digitadas. 
 *- a pessoa mais experiente (nome e idade)
 *- a pessoa mais jovem (nome e idade)
 *  
 */
public static void main(String[] args) {
	
	int maioresIdade=0;
	int qtdePessoas=0;
	int totalIdades=0;
	short idadeExperiente=0;
	short idadeJovem=0;
	String nomeJovem="";
	String nomeExperiente="";
	
	do {
		String nome = JOptionPane.showInputDialog("Nome").toUpperCase();
		short idade = Short.parseShort(JOptionPane.showInputDialog("Idade"));
		if (idade<idadeJovem || qtdePessoas==0) {
			idadeJovem=idade;
			nomeJovem=nome;				
		}
		if (idade>idadeExperiente) {
			idadeExperiente=idade;
			nomeExperiente=nome;
		}
		totalIdades= totalIdades + idade; //=>qqtotalIdades+=idade;
		qtdePessoas++;
		if (idade>=18) {
			maioresIdade++;
		}
	}while(JOptionPane.showConfirmDialog(null, "?","Title", JOptionPane.YES_NO_OPTION)==0);

	JOptionPane.showMessageDialog(null, "Maiores: " + maioresIdade);
	JOptionPane.showMessageDialog(null, "Média: " + (totalIdades/qtdePessoas));
	JOptionPane.showMessageDialog(null, "A pessoa mais experiente é: " 
			+ nomeExperiente + " com " + idadeExperiente + " anos.");
	JOptionPane.showMessageDialog(null, "A pessoa mais jovem é: " 
			+ nomeJovem + " com " + idadeJovem + " anos.");

}

}
