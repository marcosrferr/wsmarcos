package decisao;

import javax.swing.JOptionPane;

public class ListaExercicioDois {

	public static void main(String[] args) {
			
		/*
		 * 1. Um hotel cobra R$ 80,00 a di�ria e mais uma taxa de servi�os. 
A taxa de servi�os � de: 
�	R$ 5,50 por di�ria, se o n�mero de di�rias for maior que 15; 
�	R$ 6,00 por di�ria, se o n�mero de di�rias for igual a 15; 
�	R$ 8,00 por di�ria, se o n�mero de di�rias for menor que 15.
Monte uma aplica��o que apresente a conta do cliente. (Corre��o: 14h15)
		 */
	
		short diarias = Short.parseShort(JOptionPane.showInputDialog ("Diarias"));
		float total = (diarias)*80;
		double tx1 = (diarias)*5.5;
		double tx2 = (diarias)*6;
		double tx3 = (diarias)*8;
		
		
		if (diarias>15) {
			System.out.println("Valor da conta = " +(total + tx1));					
			}
		if (diarias==15) {
			System.out.println("Valor da conta = " +(total + tx2));		
		}
		if (diarias<15) {
			System.out.println("Valor da conta = " +(total + tx3));		
		}
	
	}
}
	

/*
 * 
 *METODO PROFESSOR:
 *
 * 		short diarias = Short.parseShort(JOptionPane.showInputDialog("Diarias"));
		float taxa = (float) 5.5;
		if (diarias==15) {
			taxa = 6;
		}else if (diarias<15) {
			taxa = 8;
		}
		System.out.println("Total: " + ((80 + taxa) * diarias));
	
		
		/*
		short diarias2 = Short.parseShort(JOptionPane.showInputDialog("Diarias"));
		float valorDiaria = (float) 85.5;
		if (diarias2==15) {
			valorDiaria = 86;
		}else if (diarias2<15) {
			valorDiaria = 88;
		}
		System.out.println("Total: " + (valorDiaria * diarias));
		
		*
		*
		*/
 
