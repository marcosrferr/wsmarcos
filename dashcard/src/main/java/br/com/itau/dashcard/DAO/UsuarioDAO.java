package br.com.itau.dashcard.DAO;

import org.springframework.data.repository.CrudRepository;

import br.com.itau.dashcard.beans.Usuario;

public interface UsuarioDAO extends CrudRepository<Usuario, Integer> {

	Usuario findByRacfAndSenha (String racf, String senha);
	Usuario findByEmailAndSenha (String email, String senha);
	Usuario findByRacf(String racf);
}
