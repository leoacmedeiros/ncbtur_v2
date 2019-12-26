package pageObjects.cliente.propostaAdesao;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import core.BasePage;

public class ListarPropostaAdesaoPage extends BasePage {

	public void novaPropostaAdesao() {
		clicarBotao(By.xpath("//a[contains(text(),'Nova Proposta Adesão')]"));
	}

	public void filtrarPropostaAdesao() {
		clicarBotao(By.xpath("//a[text()='Filtrar']"));
	}

	public void gerenciarProposta(String nomeProposta) {
		clicarBotao(By.xpath("//div[contains(text(),'" + nomeProposta
				+ "')]//ancestor::tr/td/div/button[@title='Gerenciar proposta']"));
	}
	
	public void mensagemSucesso() {
		esperarElementoFicarVisivel2(By.className("//div[@class='toast-message']"));
		Assertions.assertEquals("Dados gravados com sucesso!", obterTexto(By.xpath("//div[@class='toast-message']")));
	}

}
