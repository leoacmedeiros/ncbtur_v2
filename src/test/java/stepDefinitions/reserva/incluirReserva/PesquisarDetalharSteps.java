package stepDefinitions.reserva.incluirReserva;

import java.util.List;
import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pageObjects.menu.MenuPage;
import pageObjects.reserva.incluirReserva.PesquisarDetalharPage;


public class PesquisarDetalharSteps {
	
	MenuPage menu = new MenuPage();
	PesquisarDetalharPage pesquisar = new PesquisarDetalharPage();
	
	
	@Dado("^realize a pesquisa pelo nome do Cliente$")
	public void realize_a_pesquisa_pelo_nome_do_Cliente(DataTable formData) throws Throwable {
	    List<List<String>> data = formData.raw();
	    pesquisar.pesquisarCliente(data.get(0).get(1));
	    pesquisar.dataChegadaSaida();
	    pesquisar.pesquisar();
	}

	@Dado("^realize a pesquisa pelo CPF do Cliente$")
	public void realize_a_pesquisa_pelo_CPF_do_Cliente() throws Throwable {
	   pesquisar.pesquisarCpf();
	   pesquisar.dataChegadaSaida();
	   pesquisar.pesquisar();
	}

	@Dado("^realize a pesquisa pelo Código do Cliente$")
	public void realize_a_pesquisa_pelo_Código_do_Cliente() throws Throwable {
	    pesquisar.pesquisarCodigo();
	    pesquisar.dataChegadaSaida();
		pesquisar.pesquisar();
	    
	}
	
	@Dado("^realize a pesquisa pelo Destino$")
	public void realize_a_pesquisa_pelo_Destino(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		pesquisar.pesquisarDestino(data.get(0).get(1));
		pesquisar.dataChegadaSaida();
		pesquisar.pesquisar();
	}
	
	@Quando("^clicar em Detalhar o destino$")
	public void clicar_em_Detalhar_o_destino() throws Throwable {
	    pesquisar.detalharDestino();
	}
	
	@Então("^irá ser visualizado os Detalhes$")
	public void irá_ser_visualizado_os_Detalhes() throws Throwable {
	    pesquisar.validarDetalhes();
	}
	
	
}
