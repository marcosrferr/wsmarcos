package br.com.itau.dashcard.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.itau.dashcard.DAO.AgFinanceiroDAO;
import br.com.itau.dashcard.beans.AgFinanceiro;


@CrossOrigin("*")
@RestController
public class AgFinanceiroController {
	
	@Autowired
	private AgFinanceiroDAO dao;
	
	@GetMapping("/AgFinanceiro")
	public ResponseEntity<ArrayList<AgFinanceiro>> getOcorrencias(){
		ArrayList<AgFinanceiro> resposta = (ArrayList<AgFinanceiro>)dao.findAll();
		if (resposta.size() == 0) {
			return ResponseEntity.status(404).build();			
		}
		return ResponseEntity.ok(resposta);
	}

}
