package br.com.unixyz.modelo;
/*
 * Desing Pattern: compilado de padroes de projeto para OO.
 * Um dos padroes e o DTO (Data Transfer Object) cuja funcão e aplicar
 * boa pratica na transição entre o projeto e a programação
 * Sugestão:
 * 1- TODOS os atributos devem estar como privados;
 * 2 - Cada atributo deve possuir um metodo set e outro metodo get.
 * 3 -
 * 
 */

public class Aluno {

	private int rm;
	private String nome;
	private String email;
	private String fone;
	private String cpf;
		
	public int getRm() {
		return rm;
	}
	public void setRm(int rm) {
		this.rm = rm;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@Override // cenas dos proximos capitulos
	public String toString() {
		return "Aluno [rm=" + rm + ", nome=" + nome + ", email=" + email + ", fone=" + fone + ", cpf=" + cpf + "]";
	}
	
	public void setBasico(String nome, int rm) {
		this.nome = nome;
		this.rm = rm;
	}
	
	
	public String getResumo() {
		return
				"Nome..: " + nome + "\n"+
				"RM....: " + rm;
			
			}
	
	public String getUsuario() {
		if(email.contains("@")){
		return email.substring(0,email.indexOf("@"));
	}
	return email;
}

	
	
}
