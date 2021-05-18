package br.com.itau.dashcard.DAO;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import br.com.itau.dashcard.beans.Transaction;

public interface TransactionDAO  extends CrudRepository<Transaction, Integer> {	
	
	@Query(value = "select COUNT(status) from mtb310_transaction where status=0 group by STATUS",nativeQuery=true)
	public int countAceito();
	
	@Query(value = "select COUNT(status) from mtb310_transaction where status=1 group by STATUS",nativeQuery=true)
	public int countRejeitado();
	
	@Query(value = "select COUNT(status) from mtb310_transaction where status=2 group by STATUS",nativeQuery=true)
	public int countFraude();
	
	@Query(value = "select COUNT(status) from mtb310_transaction where status=0 and ag_financeiro = :agfinanceiro group by STATUS",nativeQuery=true)
	public int countAceitoByAgente(
			@Param("agfinanceiro") Integer ag_financeiro
			);
	
	@Query(value = "select COUNT(status) from mtb310_transaction where status=1 and ag_financeiro = :agfinanceiro group by STATUS",nativeQuery=true)
	public int countRejeitadoByAgente(
			@Param("agfinanceiro") Integer ag_financeiro
			);
	
	@Query(value = "select COUNT(status) from mtb310_transaction where status=2 and ag_financeiro = :agfinanceiro group by STATUS",nativeQuery=true)
	public int countFraudeByAgente(
			@Param("agfinanceiro") Integer ag_financeiro
			);

}

