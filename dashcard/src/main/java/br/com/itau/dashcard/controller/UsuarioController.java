package br.com.itau.dashcard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.itau.dashcard.DAO.UsuarioDAO;
import br.com.itau.dashcard.beans.Usuario;

@CrossOrigin("*")
@RestController
public class UsuarioController {

	@Autowired
	private UsuarioDAO dao;
	
	@PostMapping("/loginRacf")
	public ResponseEntity<Usuario> doLoginRacf(@RequestBody Usuario user){
		Usuario resposta = dao.findByRacfAndSenha(user.getRacf().toUpperCase(), user.getSenha());
		if (resposta==null) {
			return ResponseEntity.status(404).build();			
		}
		return ResponseEntity.ok(resposta);
	}
	
	@PostMapping("/loginEmail")
	public ResponseEntity<Usuario> doLoginEmail(@RequestBody Usuario user){
		Usuario resposta = dao.findByEmailAndSenha(user.getEmail(), user.getSenha());
		if (resposta==null) {
			return ResponseEntity.status(404).build();			
		}
		return ResponseEntity.ok(resposta);
	}
}
