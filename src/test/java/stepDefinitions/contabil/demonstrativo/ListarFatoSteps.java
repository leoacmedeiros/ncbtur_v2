package stepDefinitions.contabil.demonstrativo;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pageObjects.contabil.demonstrativo.ListarFatoPage;
import pageObjects.menu.MenuPage;

public class ListarFatoSteps {
	
	MenuPage menu = new MenuPage();
	ListarFatoPage listarFato = new ListarFatoPage();
	
	@Dado("^que acesse o menu contabil para visualizar os desmonstrativos$")
	public void que_acesse_o_menu_contabil_para_visualizar_os_desmonstrativos() throws Throwable {
		menu.acessarDemonstrativos();
	}

	@Quando("^selecionar o tipo de demonstrativo e fatos$")
	public void selecionar_o_tipo_de_demonstrativo_e_fatos(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		listarFato.setTipoDemonstrativo	(data.get(0).get(1));
		listarFato.setTipoFato			(data.get(1).get(1));
	}

	@Quando("^informar selecionar o período$")
	public void informar_selecionar_o_período(DataTable formData) throws Throwable {
		listarFato.setFormaConsulta();
		List<List<String>> data = formData.raw();
		listarFato.setPeriodoConsulta(data.get(0).get(1), data.get(1).get(1));
	}

	@Quando("^pesquisar$")
	public void pesquisar() throws Throwable {
		listarFato.pesquisar();
	}

	@Quando("^enviar fatos para processamento$")
	public void enviar_fatos_para_processamento() throws Throwable {
		listarFato.iniciarPartida();
	}

	@Então("^será processado o fato$")
	public void será_processado_o_fato() throws Throwable {
	}
	
	

}
