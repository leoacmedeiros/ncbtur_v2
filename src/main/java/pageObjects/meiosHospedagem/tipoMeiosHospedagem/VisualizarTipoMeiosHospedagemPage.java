package pageObjects.meiosHospedagem.tipoMeiosHospedagem;


import org.openqa.selenium.By;

import core.BasePage;



public class VisualizarTipoMeiosHospedagemPage extends BasePage {

	public void pesquisarTipoMeioHospedagem(String descricao) {
		escrever(By.name("descricao"), descricao);
		scrollElementoClicar(By.xpath("//button[contains(text(),'Filtrar')]"));
		sleep(2);
	}
	
	public void pesquisaPorCodigo() {
		String codigo = obterTexto(By.xpath("(//table//div)[1]"));
		scrollElementoClicar(By.xpath("//a[@href='#modal-filtro']"));
		scrollElementoClicar(By.xpath("//button[contains(text(),'Limpar')]"));
		scrollElementoClicar(By.xpath("//button[contains(text(),'Todos')]"));
		scrollElementoClicar(By.xpath("//a[@href='#modal-filtro']"));
		escrever(By.name("tipoHotelId"), codigo);
		scrollElementoClicar(By.xpath("//button[contains(text(),'Filtrar')]"));
		
	}
	
	public void clicarVisualizar(){
		scrollElementoClicar(By.xpath("(//button[@title='Visualizar'])[1]"));
		
	}

	public void validarRegistroPesquisado() {
		scrollElementoClicar(By.xpath("//div//a[contains(text(),'Fechar visualização')]"));
		
	}
	
	
	
}
