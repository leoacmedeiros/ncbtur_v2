package stepDefinitions.financeiro.calendario;

import java.util.List;

import core.BasePage;
import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pageObjects.financeiro.calendarioArrecadacao.AgendarArrecadacaoPage;
import pageObjects.menu.MenuPage;

public class AgendarArrecadacaoSteps extends BasePage {

	MenuPage menu = new MenuPage();
	AgendarArrecadacaoPage calendarioArrecadacao = new AgendarArrecadacaoPage();

	@Dado("^que acesse o menu financeiro para agendar arrecadação$")
	public void que_acesse_o_menu_financeiro_para_agendar_arrecadação() throws Throwable {
		menu.acessarFinanceiro();
		menu.acessarCalendarioArrecadacao();
	}

	@Quando("^selecionar o calendário$")
	public void selecionar_o_calendário() throws Throwable {
		calendarioArrecadacao.avancarMesCalendario();
	}

	@Quando("^selecionar o banco$")
	public void selecionar_o_banco(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		calendarioArrecadacao.selecionarBanco(data.get(0).get(1), data.get(1).get(1));
	}

	@Quando("^selecionar o momento de execução$")
	public void selecionar_o_momento_de_execução(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		calendarioArrecadacao.setDataExecucao(obterDataAtual());
		calendarioArrecadacao.setHoraExecucao(obterHora());
		calendarioArrecadacao.setMinutoSomadoExecucao(somaMinuto());
	}

	@Quando("^salvar arrecadação$")
	public void salvar_arrecadação() throws Throwable {
		calendarioArrecadacao.salvarArrecadacao();
	}

	@Então("^será realizado o agendamento da Remessa$")
	public void será_realizado_o_agendamento_da_Remessa() throws Throwable {
		calendarioArrecadacao.mensagemSucesso();
	}

}
