package pageObjects.reserva.gerenciarReserva;

import org.openqa.selenium.By;

import core.BasePage;

public class CancelarReservaPage extends BasePage {

	
	public void pesquisarCliente(String nomeCliente) {
		escrever(By.name("buscaCliente"), nomeCliente);
		clicarBotao(By.xpath("(//a[contains(text(),'"+nomeCliente+"')])[1]"));
	}
	
	public void gerenciarReservaConfirmada() {
		scrollElementoClicar(By.xpath("(//td//span[contains(text(),'Confirmada')]//parent::td//parent::tr//button[contains(text(),'Gerenciar')])[1]"));
	}
	
	public void cancelar() {
		scrollElementoClicar(By.xpath("//a[contains(text(),'Cancelar')]"));
	}
	
	public void cancelarReserva() {
		scrollElementoClicar(By.xpath("//button[contains(text(),'Cancelar Reserva')]"));
	}
	
	
}
