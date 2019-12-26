package pageObjects.financeiro.bandeiras;


import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import core.BasePage;


public class IncluirBandeiraPage extends BasePage {

	public void novaBandeira() {
		scrollElementoClicar(By.xpath("//a[contains(text(),'Nova Bandeira')]"));
	}

	public void nomeBandeira(String nome) {
		escrever(By.name("nome"), nome);
	}
	
	public void salvarBandeira() {
		clicarBotao(By.xpath("//button[contains(text(),'Salvar')]"));
	}
	
	public void mensagemSucesso() {
		Assertions.assertEquals("Dados gravados com sucesso!", obterTexto(By.xpath("//div[@class='toast-message']")));
	}
	
	public void situacaoBandeira(String nomeBandeira) {
		escrever(By.name("nome"), nomeBandeira);
		scrollElementoClicar(By.xpath("//button[contains(text(),'Pesquisar')]"));
		esperarElementoFicarVisivel2(By.xpath("(//span[contains(text(),'"+nomeBandeira+"')]//parent::th//parent::tr//span[contains(text(),'Ativo')])[1]"));
		Assertions.assertEquals("Ativo", obterTexto(By.xpath("(//span[contains(text(),'"+nomeBandeira+"')]//parent::th//parent::tr//span[contains(text(),'Ativo')])[1]")));
		
	}
}
