package stepDefinitions.cliente.propostaAdesao;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pageObjects.cliente.propostaAdesao.FiltrarPropostaAdesaoPage;
import pageObjects.cliente.propostaAdesao.GerenciarPropostaAdesaoPage;
import pageObjects.cliente.propostaAdesao.ListarPropostaAdesaoPage;
import pageObjects.menu.MenuPage;

public class AprovarPropostaAdesaoSteps {

	MenuPage menu = new MenuPage();
	ListarPropostaAdesaoPage listarPropostaAdesao = new ListarPropostaAdesaoPage();
	FiltrarPropostaAdesaoPage filtrarPropostaAdesao = new FiltrarPropostaAdesaoPage();
	GerenciarPropostaAdesaoPage gerenciarPropostaAdesao = new GerenciarPropostaAdesaoPage();

	@Dado("^que acesse o módulo de Cliente para pesquisar Propostas de Adesão$")
	public void que_acesse_o_módulo_de_Cliente_para_pesquisar_Propostas_de_Adesão(DataTable formData) throws Throwable {
		menu.acessarPropostaAdesao();
		listarPropostaAdesao.filtrarPropostaAdesao();
		List<List<String>> data = formData.raw();
		filtrarPropostaAdesao.setSituacao(data.get(0).get(1));
		filtrarPropostaAdesao.filtrar();
	}

	@Quando("^Gerenciar proposta$")
	public void gerenciar_proposta(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		listarPropostaAdesao.gerenciarProposta(data.get(0).get(1));
	}

	@Quando("^aprovar$")
	public void aprovar() throws Throwable {
		gerenciarPropostaAdesao.aprovarProposta();
	}

	@Então("^será alterado a situação da proposta$")
	public void será_alterado_a_situação_da_proposta() throws Throwable {
		listarPropostaAdesao.mensagemSucesso();
	}

}
