package negocio;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class GerenciadoraClientesTest {

	@Test					
	public void testPesquisaCliente(){
		//INSTÂNCIANDO
		Cliente cliente01 = new Cliente(1, "Gustavo Farias", 31, "gugafarias@gmail.com", 1 ,true);
		Cliente cliente02 = new Cliente(2, "Felipe Araujo", 34, "felipe@gmail.com", 1 ,true);

		//CRIANDO ARRAY
		List<Cliente> clientesDoBanco = new ArrayList<>();
		clientesDoBanco.add(cliente01);				
		clientesDoBanco.add(cliente02);

		//ENVIANDO ARRAY PARA CLASSE GERENCIADORA CLIENTES
		GerenciadoraClientes gerClientes = new GerenciadoraClientes(clientesDoBanco);

		//TESTAR MÉTODO DE PESQUISA - CONSULTANDO CLIENTE E PASSANDO COMO ARGUMENTO O ID DO MESMO E ARMAZENANDO ELE NO ARMAZENADOR cliente
		Cliente cliente = gerClientes.pesquisaCliente(1);

		//VERIFICAR SE A PESQUISA RETORNOU O CLIENTE QUE FOI SOLICITADO - CAPTA O ID DO CLIENTE E VERIFICA SE É 1 COMO FOI PASSADO
		assertThat(cliente.getId(), is(1));
		assertThat(cliente.getEmail(), is("gugafarias@gmail.com"));
	}
}
