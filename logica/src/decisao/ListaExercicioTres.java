package decisao;

import javax.swing.JOptionPane;

public class ListaExercicioTres {

	public static void main(String[] args) {

/*
 * 3. Elabore uma aplica��o que leia o valor de dois n�meros inteiros e a opera��o 
 * aritm�tica desejada; calcule, ent�o, a resposta adequada. 
 * Utilize os s�mbolos aritm�ticos para ler qual a opera��o aritm�tica escolhida.
 *  (exemplo: + para somar, - para subtrair e assim sucessivamente) (Corre��o: 14:40)
 *  * 
 */
int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Valor 1"));
int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Valor 2"));
char operacao = JOptionPane.showInputDialog 
("Digite:\n< + > Somar\n< - > Subtrair\n< * > Multiplicar\n< / > Dividir").charAt(0);

int resultado=0;
if (operacao =='+') {
	resultado=valor1+valor2;
}else if (operacao=='-') {
	resultado=valor1-valor2;
}else if (operacao=='*') {
	resultado=valor1*valor2;
}else if (operacao=='/') {
	resultado=valor1/valor2;
}else {
	System.out.println("Operacao Invalida");
}
	System.out.println("Resultado: " + resultado);
}
		
	}


