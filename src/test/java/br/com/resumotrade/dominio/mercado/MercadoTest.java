package br.com.resumotrade.dominio.mercado;

import static org.junit.Assert.*;
import org.junit.Test;

public class MercadoTest {

	@Test
	public void novoMercado(){
		
		Mercado futebol = Mercado.novoFutebol(new MercadoId("123"), "Over 1.5 HT");
		assertEquals("Over 1.5 HT", futebol.descricao());
	}
	
	@Test
	public void renomear(){
		
		Mercado mercado = Mercado.novoFutebol(new MercadoId("123"), "Over 1.5 HT");
		mercado.alterarDescricao("Over 2.5 HT");
		
		assertEquals(new MercadoId("123"), mercado.id());
		assertEquals("Over 2.5 HT", mercado.descricao());
		
	}

}
