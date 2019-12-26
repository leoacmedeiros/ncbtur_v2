package pageObjects.meiosHospedagem.tipoMeiosHospedagem;


import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import core.BasePage;


public class IncluirTipoMeiosHospedagemPage extends BasePage {

	
	public void clicarNovoTipoMeioHospedagem() {
		scrollElementoClicar(By.xpath("//div//a[contains(text(),'Novo Tipo de Meio de Hospedagem')]"));
	}
	
	public void setDescricaoTipoMeioHospedagem(String descricao) {
		escrever(By.name("descricao"), descricao);
	}
	
	public void clicarSalvarTipoMeioHospedagem() {
		clicarBotao(By.xpath("//button[contains(text(),'Salvar tipo Meio de hospedagem')]"));
	}
	
	public void clicarSimConfirmarInclusao() {
		clicarBotao(By.xpath("//div[@class='modal-content']//button[contains(text(),'Sim')]"));
	}

	public void mensagemSucesso() {
		Assertions.assertEquals("Dados gravados com sucesso!", obterTexto(By.xpath("//div[@class='toast-message']")));
	}
	
}
