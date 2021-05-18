package br.com.itau.dashcard.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.itau.dashcard.DAO.TransactionDAO;
import br.com.itau.dashcard.beans.Transaction;


@CrossOrigin("*")
@RestController
public class TransactionController {
	
	@Autowired
	private TransactionDAO dao;
	
	@GetMapping("/Transactions")
	public ResponseEntity<ArrayList<Transaction>> getOcorrencias(){
		ArrayList<Transaction> resposta = (ArrayList<Transaction>)dao.findAll();
		if (resposta.size() == 0) {
			return ResponseEntity.status(404).build();			
		}
		return ResponseEntity.ok(resposta);
	}
	
	@GetMapping("/Transactions/countAceito")
	public int countAceito(){
		int resposta = dao.countAceito();
		return resposta;
	}
	
	@GetMapping("/Transactions/countRejeitado")
	public int countRejeitado(){
		int resposta = dao.countRejeitado();
		return resposta;
	}
	
	@GetMapping("/Transactions/countFraude")
	public int countFraude(){
		int resposta = dao.countFraude();
		return resposta;
	}
	
	@GetMapping("/Transactions/countAceito/{ag_financeiro}")
	public int countAceitoAg(@PathVariable int ag_financeiro){
		int resposta = dao.countAceitoByAgente(ag_financeiro);
		return resposta;
	}
	
	@GetMapping("/Transactions/countRejeitado/{ag_financeiro}")
	public int countRejeitadoAg(@PathVariable int ag_financeiro){
		int resposta = dao.countRejeitadoByAgente(ag_financeiro);
		return resposta;
	}
	
	@GetMapping("/Transactions/countFraude/{ag_financeiro}")
	public int countFraudeAg(@PathVariable int ag_financeiro){
		int resposta = dao.countFraudeByAgente(ag_financeiro);
		return resposta;
	}


}
