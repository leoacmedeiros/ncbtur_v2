package pageObjects.meiosHospedagem.tipoMeiosHospedagem;


import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import core.BasePage;


public class AtivarInativarTipoMeiosHospedagemPage extends BasePage {

	public void clicarAtivar() {
		clicarBotao(By.xpath("(//button[contains(text(),'Ativar')])[1]"));
	}
	
	public void clicarSimAtivarInativar() {
		clicarBotao(By.xpath("(//div[@class='modal-content']//button[contains(text(),'Sim')])[1]"));
	}
	
	public void clicarInativar() {
		clicarBotao(By.xpath("(//button[contains(text(),'Inativar')])[1]"));
	}
	
	public void validarRegistroInativo() {
		String registroInativo = obterTexto(By.xpath("(//button[contains(text(),'Ativar')])[1]"));
		Assertions.assertEquals("ATIVAR", registroInativo);
		
	}
}
