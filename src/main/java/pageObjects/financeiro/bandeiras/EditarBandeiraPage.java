package pageObjects.financeiro.bandeiras;


import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import core.BasePage;


public class EditarBandeiraPage extends BasePage {

	
	public void pesquisarBandeira(String nome) {
		escrever(By.name("nome"), nome);
		clicarElementoScrollVisivel(By.xpath("//button[contains(text(),'Pesquisar')]"));
	}

	public void clicarEditarBandeira() {
		clicarBotao(By.xpath("(//table//button[@title='Editar'])[1]"));
	}
	
	public void alterarNomeBandeira(String nome) {
		escrever(By.name("nome"), nome);
	}
	
	public void clicarSalvarEdicao() {
		clicarBotao(By.xpath("//button[contains(text(),'Salvar')]"));
	}
	
	public void mensagemSucesso() {
		Assertions.assertEquals("Dados gravados com sucesso!", obterTexto(By.xpath("//div[@class='toast-message']")));
	}
	
}
