package stepDefinitions.produto.listaPreco;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pageObjects.produto.listaPreco.IncluirListaPrecoPage;
import pageObjects.produto.listaPreco.ListarListaPrecoPage;

public class IncluirListaPrecoSteps {
	
	ListarListaPrecoPage listarListaPreco = new ListarListaPrecoPage();
	IncluirListaPrecoPage incluriListaPreco = new IncluirListaPrecoPage();
	
	@Dado("^crie uma lista de preço$")
	public void crie_uma_lista_de_preço() throws Throwable {
		listarListaPreco.novaListaDePreco();
	}

	@Quando("^preencher os dados da lista de preço$")
	public void preencher_os_dados_da_lista_de_preço(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		incluriListaPreco.setNomeResponsavel(data.get(0).get(1));
		incluriListaPreco.setEmailResponsavel(data.get(1).get(1));
		incluriListaPreco.setDataInicio(data.get(2).get(1));
	}

	@Quando("^definir a taxa de adesão dos produtos$")
	public void definir_a_taxa_de_adesão_dos_produtos(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		incluriListaPreco.setTaxaAdesaoProdutos(data.get(0).get(1), data.get(1).get(1), data.get(2).get(1));
	}
	
	@Quando("^definir a taxa de manutenção para os produtos$")
	public void definir_a_taxa_de_manutenção_para_os_produtos(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		incluriListaPreco.setTaxaManutencaoProdutos(data.get(0).get(1), data.get(1).get(1));
	}

	@Quando("^salvar$")
	public void salvar() throws Throwable {
	}

	@Então("^será criada a lista de preço$")
	public void será_criada_a_lista_de_preço() throws Throwable {
	}

}
