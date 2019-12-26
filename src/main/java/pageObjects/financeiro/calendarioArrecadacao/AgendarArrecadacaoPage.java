package pageObjects.financeiro.calendarioArrecadacao;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import core.BasePage;

public class AgendarArrecadacaoPage extends BasePage {

	public void avancarMesCalendario() {
		clicarBotao(By.xpath("//button[@class='fc-next-button fc-button fc-state-default fc-corner-right']"));
	}

	public void selecionarBanco(String grupo, String banco) {
		if (grupo.trim().equals("Grupo 8")) {
			clicarBotao(By.xpath("(//a[@class='fc-more'])[1]"));
			clicarBotao(By.xpath("//div[@class='fc-event-container']//span[contains(text(),'" + banco + "')]"));
		} else if (grupo.trim().equals("Grupo 20")) {
			clicarBotao(By.xpath("(//a[@class='fc-more'])[2]"));
			clicarBotao(By.xpath("//div[@class='fc-event-container']//span[contains(text(),'" + banco + "')]"));
		} else if (grupo.trim().equals("Grupo 30")) {
			clicarBotao(By.xpath("(//a[@class='fc-more'])[3]"));
			clicarBotao(By.xpath("//div[@class='fc-event-container']//span[contains(text(),'" + banco + "')]"));
		}
	}

	public void setDataExecucao(String dataExecucao) {
		forcarLimparTexto(By.xpath("//input[@name='dataExecucao']"));
		escrever(By.xpath("//input[@name='dataExecucao']"), dataExecucao);
	}

	public void setHoraExecucao(String horaExecucao) {
		escrever(By.xpath(
				"//touchspin[@name='horaExecucao']//input[@class='form-control ng-untouched ng-pristine ng-valid']"),
				horaExecucao);
	}

	public void setMinutoSomadoExecucao(String minutoSomadoExecucao) {
		escrever(By.xpath(
				"//touchspin[@name='minutoExecucao']//input[@class='form-control ng-untouched ng-pristine ng-valid']"),
				minutoSomadoExecucao);
	}

	public void salvarArrecadacao() {
		clicarBotao(By.xpath("//button[text()=' Salvar Arrecadação ']"));
	}

	public void mensagemSucesso() {
		esperarElementoFicarVisivel2(By.className("//div[@class='toast-message']"));
		Assertions.assertEquals("Dados gravados com sucesso!", obterTexto(By.xpath("//div[@class='toast-message']")));
	}

}
