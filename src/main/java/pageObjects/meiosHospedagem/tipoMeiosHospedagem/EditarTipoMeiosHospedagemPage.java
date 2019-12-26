package pageObjects.meiosHospedagem.tipoMeiosHospedagem;


import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import core.BasePage;


public class EditarTipoMeiosHospedagemPage extends BasePage {

	public void clicarFiltrar() {
		scrollElementoClicar(By.xpath("//a[@href='#modal-filtro']"));
	}
	
	public void setDescricao(String descricao) {
		escrever(By.name("descricao"), descricao);
	}
	
	public void clicarFiltrarBusca() {
		clicarBotao(By.xpath("//button[contains(text(),'Filtrar')]"));
	}
	
	public void clicarEditar() {
		clicarBotao(By.xpath("(//button[@title='Editar'])[1]"));
	}
	
	public void clicarSalvar() {
		clicarBotao(By.xpath("//button[contains(text(),'Salvar')]"));
	}
	
	public void clicarSim() {
		clicarBotao(By.xpath("//div[@class='modal-content']//button[contains(text(),'Sim')]"));
	}
	
	public void mensagemSucesso() {
		Assertions.assertEquals("Dados gravados com sucesso!", obterTexto(By.xpath("//div[@class='toast-message']")));
	}
}
