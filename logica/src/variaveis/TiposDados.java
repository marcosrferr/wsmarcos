package variaveis;

import javax.swing.JOptionPane;

public class TiposDados {

	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog ("Digite seu nome");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
		//int idade = 47
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura"));
		// double altura = 1.85;
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso"));
		//double peso = 99;
		double imc = peso / (altura * altura);
		System.out.println("Nome..: " + nome);
		System.out.println("Idade.: " + idade);
		System.out.println("Altura: " + altura);
		System.out.println("Peso..: " + peso);
		System.out.println("IMC...: " + imc);	


	} // fechando o método (start point de uma aplicação java)

} // fechando a classe


/*
 * Ctrl+i (identação)
 * Ctrl+Shift+S (Salva tudo)
 * Ctrl+Z (voltar)
 * Ctrl+A (Marcar Tudo)
 * Crtl+Shit+O (Import)
 * 
 * Tipo de dados:
 * -Numerico: É o Dado que pode ser utilizado em expressões matematicas;
 * -Alfanumérico: 
 * println (imprime e coloca os dados na linha de baixo)
 * swig = Telas no Java
 * 
 * REGRAS:
 * 1ª Não começaras com números;
 * 2ª Não usar palavras reservadas (if, double, int, class)
 * 3ª Não usar caracteres especiais (n@me, d@t@, tr#s)
 * 
 *  PADROES:
 *  - UML: Padrao para orientação objeto;
 *  	- Classes devem comecar com letras maiusculas;
 *  	- Variaveis começam com letras minusculas (substantivos)
 *  	- Metodos começam com letras minusculas (verbos seguidos com ())
 *  	
 *  - CamelCase: maiusculas e minusculas
 *  	- Da segunda palavra em diante todas as palavras devem inicar com letra maiuscula;
 *  
 *  - Utilize nomes significativos
 */

