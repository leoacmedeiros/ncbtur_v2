package stepDefinitions.financeiro.bandeiras;

import java.util.List;
import core.BasePage;
import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pageObjects.financeiro.bandeiras.EditarBandeiraPage;
import pageObjects.financeiro.bandeiras.IncluirBandeiraPage;
import pageObjects.menu.MenuPage;



public class EditarBandeiraSteps extends BasePage {

	MenuPage menu = new MenuPage();
	EditarBandeiraPage editarBandeira = new EditarBandeiraPage();
	
	@Dado("^pesquise a Bandeira$")
	public void pesquise_a_Bandeira(DataTable formData) throws Throwable {
	    List<List<String>> data = formData.raw();
	    editarBandeira.pesquisarBandeira(data.get(0).get(1));
	}

	@Dado("^clique no botão para Editar$")
	public void clique_no_botão_para_Editar() throws Throwable {
	    editarBandeira.clicarEditarBandeira();
	}

	@Dado("^altere o nome$")
	public void altere_o_nome(DataTable formData) throws Throwable {
	    List<List<String>> data = formData.raw();
	    editarBandeira.alterarNomeBandeira(data.get(0).get(1));
	}

	@Dado("^clique no botão para Salvar a Edição$")
	public void clique_no_botão_para_Salvar_a_Edição() throws Throwable {
	    editarBandeira.clicarSalvarEdicao();
	}

	@Então("^o nome da Bandeira irá ser alterado$")
	public void o_nome_da_Bandeira_irá_ser_alterado() throws Throwable {
	    editarBandeira.mensagemSucesso();
	}
	
	
}
