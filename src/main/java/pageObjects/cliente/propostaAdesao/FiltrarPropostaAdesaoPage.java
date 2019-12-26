package pageObjects.cliente.propostaAdesao;

import org.openqa.selenium.By;

import core.BasePage;

public class FiltrarPropostaAdesaoPage extends BasePage {

	public void setSituacao(String situacao) {
		selecionarComboPorXPath("//select[@name='situacao']", "Em análise");
	}
	
	public void filtrar() {
		clicarBotao(By.xpath("//button[contains(text(),'Filtrar')]"));
	}

}
