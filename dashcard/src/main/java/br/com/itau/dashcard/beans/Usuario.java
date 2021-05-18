package br.com.itau.dashcard.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MTB310_usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_usuario;
	@Column(name="nome_usuario",length=100)
	private String nome_usuario;
	@Column(name="email",length=100)
	private String email;
	@Column(name="racf",length=7)
	private String racf;
	@Column(name="senha",length=50)
	private String senha;
	
	public Usuario(int id_usuario, String nome_usuario, String email, String racf, String senha) {
		super();
		this.id_usuario = id_usuario;
		this.nome_usuario = nome_usuario;
		this.email = email;
		this.racf = racf;
		this.senha = senha;

	}
	
	public Usuario() {
		super();		
	}

	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getNome_usuario() {
		return nome_usuario;
	}

	public void setNome_usuario(String nome_usuario) {
		this.nome_usuario = nome_usuario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRacf() {
		return racf;
	}

	public void setRacf(String racf) {
		this.racf = racf;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
