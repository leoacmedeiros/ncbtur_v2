package pageObjects.meiosHospedagem.administradoraMeioHospedagem;


import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import core.BasePage;


public class IncluirAdministradoraMeioHospedagemPage extends BasePage {

	
	public void clicarBotaoNovaAdministradoraMeioHosp() {
		esperarElementoFicarVisivel2(By.xpath("//div//a[contains(text(),'Nova Administradora de Meios de Hospedagem')]"));
		clicarBotao(By.xpath("//div//a[contains(text(),'Nova Administradora de Meios de Hospedagem')]"));
	}
	
	public void setNome(String nomeFantasia) {
		escrever(By.name("NomeFantasia"), nomeFantasia);
	}
	
	public void setCNPJ(String numeroDocumento) {
		escrever(By.name("CodigoCNPJ"), numeroDocumento);
	}
	
	public void setRazaoSocial(String razaoSocial) {
		escrever(By.name("RazaoSocial"), razaoSocial);
	}
	
	public void setCEP(String cep) {
		escrever(By.name("endereco_cep"), cep);
	}
	
	public void setNomeContComercial(String responsavel) {
		escrever(By.name("responsavel"), responsavel);
	}
	
	public void setEmailContComercial(String email) {
		escrever(By.name("email"), email);
	}
	
	public void setTelefoneContComercial(String telefone) {
		escrever(By.name("telefone_comercial"), telefone);
	}
	
	public void clicarSalvarAdministradora() {
		esperarElementoFicarVisivel2(By.xpath("//div//button[contains(text(),'Salvar Administradora de Meios de Hospedagem')]"));
		clicarBotao(By.xpath("//div//button[contains(text(),'Salvar Administradora de Meios de Hospedagem')]"));
	}
	
	public void mensagemSucesso() {
		Assertions.assertEquals("Dados gravados com sucesso!", obterTexto(By.xpath("//div[@class='toast-message']")));
	}
	
	

}
