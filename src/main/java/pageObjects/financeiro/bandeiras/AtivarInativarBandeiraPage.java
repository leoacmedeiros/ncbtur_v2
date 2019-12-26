package pageObjects.financeiro.bandeiras;


import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import core.BasePage;


public class AtivarInativarBandeiraPage extends BasePage {

	
	public void pesquisarBandeira(String nome) {
		escrever(By.name("nome"), nome);
		sleep(2);
		clicarBotao(By.xpath("//button[contains(text(),'Pesquisar')]"));
	}

	public void clicarInativarBandeira() {
		String situacaoInativar = obterTexto(By.xpath("(//span[contains(text(),'Cartão Visa')]//parent::th//parent::tr//span[contains(text(),'tivo')])[1]"));		
				
		if (situacaoInativar.contains("Ativo") ) {
			clicarBotao(By.xpath("(//button[@title='Inativar'])[1]"));
			sleep(2);
			Assertions.assertEquals("Dados gravados com sucesso!", obterTexto(By.xpath("//div[@class='toast-message']")));
			
		} else if (situacaoInativar.contains("Inativo") ){
			clicarBotao(By.xpath("(//button[@title='Ativar'])[1]"));
			sleep(2);
			Assertions.assertEquals("Dados gravados com sucesso!", obterTexto(By.xpath("//div[@class='toast-message']")));
			System.out.println("Está na situação: " + situacaoInativar);
		}
		
	}
	
	public void clicarAtivarBandeira() {
		String situacaoAtivar = obterTexto(By.xpath("(//span[contains(text(),'Cartão Visa')]//parent::th//parent::tr//span[contains(text(),'tivo')])[1]"));	
		
		if (situacaoAtivar.contains("Inativo") ) {
			clicarBotao(By.xpath("(//button[@title='Ativar'])[1]"));
			sleep(2);
			Assertions.assertEquals("Dados gravados com sucesso!", obterTexto(By.xpath("//div[@class='toast-message']")));
			
		} else if (situacaoAtivar.contains("Ativo")){
			clicarBotao(By.xpath("(//button[@title='Inativar'])[1]"));
			sleep(2);
			Assertions.assertEquals("Dados gravados com sucesso!", obterTexto(By.xpath("//div[@class='toast-message']")));
			System.out.println("Está na situação: " + situacaoAtivar);
		}
		
	}
	
	
	public void mensagemSucesso() {
		Assertions.assertEquals("Dados gravados com sucesso!", obterTexto(By.xpath("//div[@class='toast-message']")));
	}
	
	
}
