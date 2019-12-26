package pageObjects.financeiro.gerenciarOperadoraCartoes;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import core.BasePage;

public class IncluirOperadoraCartoesPage extends BasePage {

	public void setAno(String ano) {
		selecionarComboPorXPath("//select[@name='ano']", ano);
	}

	public void setBandeiras(String bandeira) {
		selecionarComboPeloXPath("//select[@name='bandeira']", bandeira);
	}

	public void setGrupoDebito(String grupoDebito) {
		selecionarComboPeloXPath("//select[@name='grupo']", grupoDebito);
	}

	public void setMesesCielo(String mesesRede) {
		scrollPageUP();
		for (String mesCielo : mesesRede.trim().split(",")) {
			selecionarComboPeloXPath("(//select[@name='months[]'])[1]", mesCielo.trim());
		}
		clicarBotao(By.xpath("(//button[@title='Editar'])[1]"));
	}

	public void setMesesRede(String mesesRede) {
		for (String mesRede : mesesRede.trim().split(",")) {
			selecionarComboPeloXPath("(//select[@name='months[]'])[1]", mesRede.trim());
		}
		clicarBotao(By.xpath("(//button[@title='Editar'])[2]"));
	}

	public void salvarGerenciamento() {
		clicarBotao(By.xpath("//button[text()=' Salvar ']"));
	}

	public void mensagemSucesso() {
		esperarElementoFicarVisivel2(By.className("//div[@class='toast-message']"));
		Assertions.assertEquals("Dados gravados com sucesso!", obterTexto(By.xpath("//div[@class='toast-message']")));
	}

}
