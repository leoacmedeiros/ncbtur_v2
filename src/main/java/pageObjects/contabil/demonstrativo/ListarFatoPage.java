package pageObjects.contabil.demonstrativo;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import core.BasePage;

public class ListarFatoPage extends BasePage {

	public void setTipoDemonstrativo(String tipoDemonstrativo) {
		selecionarComboPorXPath("//select[@name='demonstrativoId']", tipoDemonstrativo);
	}

	public void setTipoFato(String tipoFato) {
		selecionarComboPorXPath("//select[@name='fatoId']", tipoFato);
	}

	public void setFormaConsulta() {
		clicarBotao(By.xpath("//button[@name='filtroButton']"));
	}

	public void setPeriodoConsulta(String periodoInicio, String periodoFim) {
		forcarLimparTexto(By.xpath("//input[@name='dataInicioFiltro']"));
		escrever(By.xpath("//input[@name='dataInicioFiltro']"), periodoInicio);
		forcarLimparTexto(By.xpath("//input[@name='dataFimFiltro']"));
		escrever(By.xpath("//input[@name='dataFimFiltro']"), periodoFim);
	}

	public void pesquisar() {
		clicarBotao(By.xpath("//button[@name='persquisarButton']"));
	}
	
	public void iniciarPartida() {
		clicarBotao(By.xpath("//button[@name='startPartidaButton']"));
	}
	
	public void mensagemSucesso() {
		esperarElementoFicarVisivel2(By.xpath("//div[@id='toast-container']"));
		Assertions.assertEquals("Partida iniciada com sucesso.", obterTexto(By.xpath("//div[@id='toast-container']")));
	}

}
