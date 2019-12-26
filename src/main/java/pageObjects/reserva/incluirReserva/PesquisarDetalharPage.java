package pageObjects.reserva.incluirReserva;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import core.BasePage;
import core.DriverFactory;
import pageObjects.menu.MenuPage;

public class PesquisarDetalharPage extends BasePage {
	
	MenuPage menu = new MenuPage();

	public void pesquisarCliente(String nomeCliente) {
		sleep(20);
		scrollElementoClicar(By.xpath("//div[@class='page-logo']//span"));
		menu.acessarIniciarReserva();
		escrever(By.name("filtroBusca"), nomeCliente);
		clicarBotao(By.xpath("(//a[contains(text(),'"+nomeCliente+"')])[1]"));
	}
	
	public void dataChegadaSaida() {

		LocalDate hoje = LocalDate.now();
		LocalDate qtdDiasInicio = hoje.plusDays(10);
		LocalDate qtdDiasFim = hoje.plusDays(11);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String inserirDiaInicio = qtdDiasInicio.format(formatter);
		String inserirDiaFim = qtdDiasFim.format(formatter);
	
		escrever(By.xpath("//label[contains(text(),'Chegada')]//parent::div//input"), inserirDiaInicio + " à " + inserirDiaFim);
		
		WebElement tab = DriverFactory.getDriver().findElement(By.xpath("//label[contains(text(),'Chegada')]//parent::div//input"));
		tab.sendKeys(Keys.TAB);
		
		//scrollElementoClicar(By.xpath("//button[contains(text(),'Aplicar')]"));
	}
	
	public void pesquisar(){
		scrollElementoClicar(By.xpath("//button[@class='btn blue btn-submit'][contains(text(),'Pesquisar')]"));
	}
	
	public void pesquisarCpf() {
		scrollElementoClicar(By.xpath("//i[@title='Expandir detalhes']"));
		sleep(3);
		String cpf = obterTexto(By.xpath("((//tr//td[contains(text(),'Mirella')])[2]//parent::tr//td)[3]")).replace(".", "").replace("-", "");
		scrollElementoClicar(By.xpath("//div[@id='modalDadosCliente']//button[@class='close']"));
		scrollElementoClicar(By.xpath("//div[@class='page-logo']//span"));
		menu.acessarIniciarReserva();
		scrollElementoClicar(By.xpath("//label[contains(text(),'CPF')]//span"));
		escrever(By.name("filtroBusca"), cpf);
		
		clicarBotao(By.xpath("(//a[contains(text(),'"+cpf.substring(0,3)+"')])[1]"));
	
	}
	
	public void pesquisarCodigo() {
		scrollElementoClicar(By.xpath("//i[@title='Expandir detalhes']"));
		sleep(3);
		String codigo = obterTexto(By.xpath("((//tr//td[contains(text(),'Mirella')])[2]//parent::tr//td)[1]"));
		scrollElementoClicar(By.xpath("//div[@id='modalDadosCliente']//button[@class='close']"));
		scrollElementoClicar(By.xpath("//div[@class='page-logo']//span"));
		menu.acessarIniciarReserva();
		scrollElementoClicar(By.xpath("//label[contains(text(),'Código')]//span"));
		escrever(By.name("filtroBusca"), codigo);
		
		clicarBotao(By.xpath("(//a[contains(text(),'Mirella')])[1]"));
		
	}
	
	public void pesquisarDestino(String destino) {
		scrollElementoClicar(By.xpath("//div[@class='page-logo']//span"));
		menu.acessarIniciarReserva();
		escrever(By.name("destino"), destino);
		clicarBotao(By.xpath("(//a[contains(text(),'"+destino+"')])[1]"));
		
	}
	
	public void detalharDestino() {
		scrollElementoClicar(By.xpath("(//a[contains(text(),'Detalhes')])[1]"));
	}
	
	public void validarDetalhes() {
		Assertions.assertEquals("Descrição", obterTexto(By.xpath("(//a[contains(text(),'Descrição')])[1]")));
	}
	
	
	
}
