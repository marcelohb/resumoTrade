package br.com.resumotrade.dominio.lancamento;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.resumotrade.dominio.lancamento.Lancamento;
import br.com.resumotrade.dominio.lancamento.LancamentoId;
import br.com.resumotrade.dominio.mercado.MercadoId;

public class LancamentoTest {
	
	@Autowired
	private LancamentoRepositorio repositorio;
	
	@Test
	public void novoLancamento(){
		
		Lancamento lancamento = new Lancamento(new LancamentoId("3243"), new MercadoId("123"), new Double(1.5), new Double(100));
		
		assertEquals(new LancamentoId("3243"), lancamento.id());
		assertEquals("3243", lancamento.id().id());
		assertEquals(1.5, lancamento.odd(), 0.001);
		assertEquals(100, lancamento.stake(), 0.001);

	}
	
	@Test
	public void alterarLancamento(){
		
		Lancamento lancamento = new Lancamento(new LancamentoId("3243"), new MercadoId("123"), new Double(1.5), new Double(100));
		
		lancamento.alterarMercado(new MercadoId("432"));
		lancamento.alterarOdd(new Double(1.7));
		lancamento.alterarStake(new Double(200.50));
		
		assertEquals("432", lancamento.mercadoId().id());
		assertEquals(1.7, lancamento.odd(), 0.001);
		assertEquals(200.50, lancamento.stake(), 0.001);
		
	}
	
	@Test
	public void gravarLancamento(){
		
		Lancamento lancamento = new Lancamento(new LancamentoId("3243"), new MercadoId("123"), new Double(1.5), new Double(100));
		repositorio.salvar(lancamento);
		
		Lancamento aposta = repositorio.buscarLancamentoPorId(lancamento.id());
		
		assertEquals(lancamento.id(), aposta.id());
	}
}
