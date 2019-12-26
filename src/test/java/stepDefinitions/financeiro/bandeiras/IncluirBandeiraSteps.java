package stepDefinitions.financeiro.bandeiras;

import java.util.List;
import core.BasePage;
import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pageObjects.financeiro.bandeiras.IncluirBandeiraPage;
import pageObjects.menu.MenuPage;



public class IncluirBandeiraSteps extends BasePage {

	MenuPage menu = new MenuPage();
	IncluirBandeiraPage incluirBandeira = new IncluirBandeiraPage();
	
	@Dado("^que acesse o Menu Financeiro$")
	public void que_acesse_o_Menu_Financeiro() throws Throwable {
	    menu.acessarFinanceiro();
	}

	@Dado("^acesse o Menu Bandeiras$")
	public void acesse_o_Menu_Bandeiras() throws Throwable {
	    menu.acessarBandeiras();
	}

	@Dado("^clique no botão para incluir uma Nova Bandeira$")
	public void clique_no_botão_para_incluir_uma_Nova_Bandeira() throws Throwable {
	    incluirBandeira.novaBandeira();
	}

	@Dado("^informe o Nome$")
	public void informe_o_Nome(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		incluirBandeira.nomeBandeira(data.get(0).get(1));
	}

	@Quando("^acionar o botão para salvar o registro$")
	public void acionar_o_botão_para_salvar_o_registro() throws Throwable {
		incluirBandeira.salvarBandeira();
	}

	@Então("^a Bandeira de Cartão será criada$")
	public void a_Bandeira_de_Cartão_será_criada() throws Throwable {
	    incluirBandeira.mensagemSucesso();
	}

	@Então("^a Bandeira do cartão ficará ativa$")
	public void a_Bandeira_do_cartão_ficará_ativa(DataTable formData) throws Throwable {
	    List<List<String>> data = formData.raw();
	    incluirBandeira.situacaoBandeira(data.get(0).get(1));
 	}
	
	
}
