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


	} // fechando o m�todo (start point de uma aplica��o java)

} // fechando a classe


/*
 * Ctrl+i (identa��o)
 * Ctrl+Shift+S (Salva tudo)
 * Ctrl+Z (voltar)
 * Ctrl+A (Marcar Tudo)
 * Crtl+Shit+O (Import)
 * 
 * Tipo de dados:
 * -Numerico: � o Dado que pode ser utilizado em express�es matematicas;
 * -Alfanum�rico: 
 * println (imprime e coloca os dados na linha de baixo)
 * swig = Telas no Java
 * 
 * REGRAS:
 * 1� N�o come�aras com n�meros;
 * 2� N�o usar palavras reservadas (if, double, int, class)
 * 3� N�o usar caracteres especiais (n@me, d@t@, tr#s)
 * 
 *  PADROES:
 *  - UML: Padrao para orienta��o objeto;
 *  	- Classes devem comecar com letras maiusculas;
 *  	- Variaveis come�am com letras minusculas (substantivos)
 *  	- Metodos come�am com letras minusculas (verbos seguidos com ())
 *  	
 *  - CamelCase: maiusculas e minusculas
 *  	- Da segunda palavra em diante todas as palavras devem inicar com letra maiuscula;
 *  
 *  - Utilize nomes significativos
 */

