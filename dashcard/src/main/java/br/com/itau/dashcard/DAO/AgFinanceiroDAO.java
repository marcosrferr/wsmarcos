package br.com.itau.dashcard.DAO;

import org.springframework.data.repository.CrudRepository;

import br.com.itau.dashcard.beans.AgFinanceiro;

public interface AgFinanceiroDAO  extends CrudRepository<AgFinanceiro, Integer> {
		

}
