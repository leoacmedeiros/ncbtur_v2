package stepDefinitions.financeiro.gerenciarOperadoraCartoes;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pageObjects.financeiro.gerenciarOperadoraCartoes.IncluirOperadoraCartoesPage;
import pageObjects.menu.MenuPage;

public class IncluirOperadoraCartoesSteps {
	
	MenuPage menu = new MenuPage();
	IncluirOperadoraCartoesPage gerenciarOperadoraCartoes = new IncluirOperadoraCartoesPage();
	
	@Dado("^que acesse o menu financeiro gerenciar operadoras de cartões$")
	public void que_acesse_o_menu_financeiro_gerenciar_operadoras_de_cartões() throws Throwable {
		menu.acessarFinanceiro();
		menu.acessarOperadoras();
	}

	@Quando("^selecionar os dados$")
	public void selecionar_os_dados(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		gerenciarOperadoraCartoes.setAno			(data.get(0).get(1));
		gerenciarOperadoraCartoes.setBandeiras		(data.get(1).get(1));
		gerenciarOperadoraCartoes.setGrupoDebito	(data.get(2).get(1));
	}

	@Quando("^selecionar os meses para cada operadora$")
	public void selecionar_os_meses_para_cada_operadora(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		gerenciarOperadoraCartoes.setMesesCielo	(data.get(0).get(1));
		gerenciarOperadoraCartoes.setMesesRede	(data.get(1).get(1));
	}
	
	@Quando("^salvar o gerenciamento$")
	public void salvar_o_gerenciamento() throws Throwable {
		gerenciarOperadoraCartoes.salvarGerenciamento();
	}

	@Então("^será adicionado a operadora de cartão$")
	public void será_adicionado_a_operadora_de_cartão() throws Throwable {
		gerenciarOperadoraCartoes.mensagemSucesso();
	}

}
