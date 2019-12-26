package pageObjects.cliente.propostaAdesao;

import org.openqa.selenium.By;

import core.BasePage;

public class GerenciarPropostaAdesaoPage extends BasePage {
	
	public void aprovarProposta() {
		sleep(3);
		clicarBotao(By.xpath("//button[text()=' Aprovar ']"));
		clicarBotao(By.xpath("//button[text()='Sim']"));
	}

}
