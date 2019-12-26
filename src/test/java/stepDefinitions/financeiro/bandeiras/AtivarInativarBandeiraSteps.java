package stepDefinitions.financeiro.bandeiras;

import java.util.List;
import core.BasePage;
import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pageObjects.financeiro.bandeiras.AtivarInativarBandeiraPage;
import pageObjects.menu.MenuPage;



public class AtivarInativarBandeiraSteps extends BasePage {

	MenuPage menu = new MenuPage();
	AtivarInativarBandeiraPage ativarInativar = new AtivarInativarBandeiraPage();
	
	
	@Dado("^realize a pesquisa da Bandeira$")
	public void realize_a_pesquisa_da_Bandeira(DataTable formData) throws Throwable {
	    List<List<String>> data = formData.raw();
	    ativarInativar.pesquisarBandeira(data.get(0).get(1));
	}

	@Quando("^clicar para Inativar a Bandeira$")
	public void clicar_para_Inativar_a_Bandeira() throws Throwable {
	    ativarInativar.clicarInativarBandeira();
	}

	@Então("^a Bandeira ficará Inativa$")
	public void a_Bandeira_ficará_Inativa() throws Throwable {
		
	}

	@Quando("^clicar para Ativar a Bandeira$")
	public void clicar_para_Ativar_a_Bandeira() throws Throwable {
	    ativarInativar.clicarAtivarBandeira();
	}

	@Então("^a Bandeira ficará Ativa$")
	public void a_Bandeira_ficará_Ativa() throws Throwable {
	   
	}
}
