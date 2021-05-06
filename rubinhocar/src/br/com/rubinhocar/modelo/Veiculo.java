package br.com.rubinhocar.modelo;

public class Veiculo {

	private float valor;
	private String modelo;
	private String montadora;

	//<Modificador> <tipo retorno> <nome do metodo> (<tipo do param> <nome do param>)

	public void preencherModelo(String param) {
		if (param.length()<=40){
			modelo = param.toUpperCase();
			//}else {
			//	thorw new RuntimeException("Derruba Apilcação")
			//}
		}
	}

	public String retornarModelo () {
		return modelo;
	}

		public void preecherMontadora(String param) {
			if(param.length()<=30){
				montadora = param.toUpperCase();
		}
	}

	public String retornarMontadora() {
		return montadora;
	}

	public void preecherValor(float param) {
		if (param>0) {
			valor=param;
		}
	}

	public void preecherTudo(float pValor, String pModelo, String pMontadora) {
		valor = pValor;
		modelo = pModelo;
		montadora = pMontadora;
	}	


	public String retornarTudo() {
		return  "Modelo.....: " + modelo + "\n" +
				"Montadora..: " + montadora + "\n" +
				"Valor......: " + valor;
		
		//return modelo ";"+ montadora ";" + valor (monta uma linha com o separador).
	}

	public float retornarDesconto() {
		return valor * (float)0.9;

	}

	public String retornarValor() {
		// TODO Auto-generated method stub
		return null;
	}

}
