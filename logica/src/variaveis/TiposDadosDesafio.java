package variaveis;

import javax.swing.JOptionPane;

public class TiposDadosDesafio {
	
	public static void main(String[] args) {

	String nome = JOptionPane.showInputDialog ("Digite nome do produto");
	double valorcompra = Double.parseDouble(JOptionPane.showInputDialog ("Digite o valor de compra"));
	int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade"));
	double valorvenda = valorcompra + (valorcompra * 0.20);
	double total = (valorvenda * quantidade);
	double imposto = (total * 0.22);
	double totalsemimposto = total - imposto;
	System.out.println("Nome Produto.....: " + nome);
	System.out.println("Valor Venda......: " + valorvenda);
	System.out.println("Total Sem Imposto: " + totalsemimposto);
			

}
	
}
