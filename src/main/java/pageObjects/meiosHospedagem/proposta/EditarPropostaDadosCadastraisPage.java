package pageObjects.meiosHospedagem.proposta;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import core.BasePage;
import core.DriverFactory;

public class EditarPropostaDadosCadastraisPage extends BasePage {
	
	public void pesquisarNomeMeioHospedagem(String nomeFantasia) {
		
		JavascriptExecutor jse = (JavascriptExecutor) DriverFactory.getDriver();
		jse.executeScript("scroll(0, -250);");
		escrever(By.name("nomeFantasia"), nomeFantasia);
		clicarBotaoContainsTexto("Filtrar");
		esperarElementoFicarVisivel2(By.xpath("//div[@class='data-table-box']"));
		clicarBotao(By.xpath("(//div//span[contains(text(),'"+nomeFantasia+"')])[1]//parent::td//parent::tr//button[@data-toggle='dropdown']"));
		
		}

	public void clicarPainelMeioHospedagem() {
		clicarBotao(By.xpath("(//div//span[contains(text(),'HOTEL POUSADA VILLA DO CERRADO')])[1]//parent::td//parent::tr//a"));
	}

	public void clicarDadosCadastrais() {
		clicarBotao(By.xpath("//div[@id='openClosePanel']//a[contains(text(),'Dados Cadastrais')]"));
	}
	
	public void clicarSalvarMeioHospedagem() {
		clicarBotao(By.xpath("//button[contains(text(),'Salvar Meio de Hospedagem')]"));
	}
	
	public void mensagemSucessoAlterarDadosMeiosHosp() {
		Assertions.assertEquals("Meio de hospedagem salvo com sucesso", obterTexto(By.xpath("//div[@class='toast-message']")));
	}
	

}
