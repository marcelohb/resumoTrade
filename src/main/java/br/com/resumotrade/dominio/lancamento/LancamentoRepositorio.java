package br.com.resumotrade.dominio.lancamento;

import java.util.List;

public interface LancamentoRepositorio {

	Lancamento buscarLancamentoPorId(LancamentoId lancamentoId);
	
	void salvar(Lancamento  lancamento);
	
	void remover(LancamentoId lancamento);
	
	LancamentoId novaIdentidade();

	List<Lancamento> buscarTodos();
	
}
