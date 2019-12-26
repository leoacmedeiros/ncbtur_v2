package pageObjects.reserva.incluirReserva;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import core.BasePage;
import core.DriverFactory;

public class IncluirReservaPage extends BasePage {

	public void pesquisarCliente(String nomeCliente) {
		escrever(By.name("filtroBusca"), nomeCliente);
		clicarBotao(By.xpath("(//a[contains(text(),'"+nomeCliente+"')])[1]"));
	}
	
	public void pesquisarDestino(String destino) {
		escrever(By.name("destino"), destino);
		clicarBotao(By.xpath("(//a[contains(text(),'"+destino+"')])[1]"));
	}
	
	public void dataChegadaSaida() {

		LocalDate hoje = LocalDate.now();
		LocalDate qtdDiasInicio = hoje.plusDays(7);
		LocalDate qtdDiasFim = hoje.plusDays(8);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String inserirDiaInicio = qtdDiasInicio.format(formatter);
		String inserirDiaFim = qtdDiasFim.format(formatter);
	
		escrever(By.xpath("//label[contains(text(),'Chegada')]//parent::div//input"), inserirDiaInicio + " à " + inserirDiaFim);
		
		scrollElementoClicar(By.xpath("//button[contains(text(),'Aplicar')]"));
	}
	
	public void selecionarQtdQuarto(String quarto) {
		selecionarComboPeloXPath("//select[@name='quarto']", quarto);
		sleep(2);
	}
	
	public void pesquisar(){
		scrollElementoClicar(By.xpath("(//button[contains(text(),'Pesquisar')])[2]"));
	}
	
	public void selecionarQtdDiarias(String numDiaria) {
		
		Boolean produto = DriverFactory.getDriver().findElements(By.xpath("//select[@data-nivel-utilizacao='EXECUTIVO']")).size() > 0;
		
		if (produto == true) {
			selecionarComboPeloXPath("//select[@data-nivel-utilizacao='EXECUTIVO']", numDiaria);
			
		} else {
			selecionarComboPeloXPath("//select[@data-nivel-utilizacao='SUPERIOR']", numDiaria);
		}
		
		
	}
	
	public void verQuartos() {
		scrollElementoClicar(By.xpath("(//h4[contains(text(),'HOTEL MARANATA')]//parent::div//parent::div//a[contains(text(),'Ver Quartos')])[1]"));
	}
	
	public void confirmarAcomodacao() {
		scrollElementoClicar(By.xpath("//td[contains(text(),'Tipo de quarto')]//parent::tr//parent::table//label//span"));
	}
	
	public void avancar() {
		scrollElementoClicar(By.xpath("//button[contains(text(),'Avançar')]"));
	}
	
	public void hospedeResponsavel() {
		try {
			boolean validarHospede = DriverFactory.getDriver().getPageSource().contains("Mirella Emily");
			Assertions.assertTrue(validarHospede);
			//System.out.println("Hospede: "+validarHospede);
			}

		catch (Exception e) {
		}
	}
	
	public void confirmar() {
		scrollElementoClicar(By.xpath("//button[contains(text(),'Confirmar')]"));
	}
	
	
	
}
