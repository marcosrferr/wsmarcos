package br.com.caicai.modelo;

public class Elevador {

	private String nome;
	private int andarMaximo;
	private int andarMinimo;
	private int capacidadePessoas;
	private int andarAtual;
	private int qtdePessoas;

	public void entrar(int pQtde) {
		int resultado = pQtde + qtdePessoas;
		if (resultado<=capacidadePessoas) {
			qtdePessoas+=pQtde;
		}
	}

	public void entrar() {
		if (qtdePessoas<capacidadePessoas) {
			qtdePessoas++;
		}
	}

	public void sair() {
		if (qtdePessoas>0) {
			qtdePessoas--;
		}
	}

	public String descer() {
		if (andarAtual>andarMinimo) {
			andarAtual--;
			return "Descendo...";
		}
		return "Não pode descer";
	}

	public String subir() {
		if (andarAtual<andarMaximo) {
			andarAtual++;
			return "Subindo...";
		}
		return "Não pode subir";

	}

	public String retornarTudo() {
		return
				"Nome.........: " + nome + "\n" +
				"Andar Máximo.: " + andarMaximo + "\n" + 
				"Andar Minimo.: " + andarMinimo + "\n" + 
				"Capacidade...: " + capacidadePessoas + "\n" + 
				"Andar Atual..: " + andarAtual + "\n" + 
				"Qtde Pessoas.: " + qtdePessoas;
	}

	public void inicializar(String pNome, int pAndarMax, int pAndarMin, int capPessoas) {
		nome = pNome;
		andarMaximo = pAndarMax;
		andarMinimo = pAndarMin;
		capacidadePessoas = capPessoas;	
	}

}










































/*
 * 	private String nome;
		private byte andarmaximo;
		private byte andarminimo;
		private byte capacidadepessoas;
		private byte andaratual;
		private byte qtepessoas;



		public void preecherNome(String param) {
			if(param.length()<=40){
				nome = param.toUpperCase();
			}
		}


		public void inicializar(String pNome, byte pAndarMax, byte pAndarMin, byte capPessoas) {
			nome = pNome;
			andarmaximo = pAndarMax;
			andarminimo = pAndarMin;
			capacidadepessoas = capPessoas;

		}	

		public String retornarTudo() {
			return  "Nome.......: " + nome + "\n" +
					"Andar Max..: " + andarmaximo + "\n" +
					"Andar Min..: " + andarminimo + "\n" +
					"Cap Pessoas: " + capacidadepessoas;

	}


 * 
 * 
 * 
 * 	
 */
