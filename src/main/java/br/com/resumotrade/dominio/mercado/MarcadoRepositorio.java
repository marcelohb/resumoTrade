package br.com.resumotrade.dominio.mercado;

import java.util.List;

public interface MarcadoRepositorio {
	
	void salvar(Mercado mercado);

	void remover(MercadoId mercado);

	MercadoId novaIdentidade();

	List<Mercado> buscarTodos();
	
}
