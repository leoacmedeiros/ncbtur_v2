package pageObjects.meiosHospedagem.tipoMeiosHospedagem;


import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import core.BasePage;


public class ExcluirTipoMeiosHospedagemPage extends BasePage {

	public void clicarExcluir() {
		clicarBotao(By.xpath("(//button[@title='Excluir'])[1]"));
	}
	
	public void clicarSimConfirmarExclusao() {
		clicarBotao(By.xpath("//div[@class='modal-content']//button[contains(text(),'Sim')]"));		
	}
	
	public void mensagemSucesso() {
		Assertions.assertEquals("Tipo de Meio de hospedagem excluido com sucesso!", obterTexto(By.xpath("//div[@class='toast-message']")));
	}
}
