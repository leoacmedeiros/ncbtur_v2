package pageObjects.produto.listaPreco;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import core.BasePage;

public class IncluirListaPrecoPage extends BasePage {

	public void setNomeResponsavel(String nomeResponsavel) {
		escrever(By.xpath("//input[@name='nomeResponsavel']"), nomeResponsavel);
	}

	public void setEmailResponsavel(String emailResponsavel) {
		escrever(By.xpath("//input[@name='emailResponsavel']"), emailResponsavel);
	}

	public void setDataInicio(String dataInicio) {
		escrever(By.xpath("//input[@name='dataInicio']"), dataInicio);
	}

	public void setTaxaAdesaoProdutos(String produtos, String valorTaxaAdesao, String qtdParcelas) {
		for (String produto : produtos.split(",")) {
			clicarBotao(By.xpath("//a[contains(text(),'" + produto.trim() + "')]"));
			clicarCheck(By.xpath("//td[contains(text(),'adesão')]//parent::tr//label/span"));
			escrever(By.xpath("//td[contains(text(),'adesão')]//parent::tr//input[@name='precoCtrl']"),
					valorTaxaAdesao);
			escrever(By.xpath("//td[contains(text(),'adesão')]//parent::tr//touchspin//input"), qtdParcelas);
			clicarBotao(By.xpath("//a[contains(text(),'" + produto.trim() + "')]"));
		}
	}

	public void setTaxaManutencaoProdutos(String produtos, String valoresTaxaManutencao) {
		for (String produto : produtos.split(",")) {
			clicarBotao(By.xpath("//a[contains(text(),'" + produto.trim() + "')]"));
			clicarCheck(By.xpath("//td[contains(text(),'manutenção')]//parent::tr//label/span"));
			for (String valorTaxaManutencao : valoresTaxaManutencao.split("/")) {
				clicarBotao(By.xpath("//a[contains(text(),'" + produto.trim() + "')]"));
				escrever(By.xpath("//td[contains(text(),'manutenção')]//parent::tr//input[@name='precoCtrl']"),
						valorTaxaManutencao);
				clicarBotao(By.xpath("//a[contains(text(),'" + produto.trim() + "')]"));
			}
		}
	}

	public void salvarListaPreco() {
		clicarBotao(By.xpath("//button[@class='btn btn-primary button-submit']"));
	}

	public void mensagemSucesso() {
		esperarElementoFicarVisivel2(By.className("//div[@class='toast-message']"));
		Assertions.assertEquals("Dados gravados com sucesso!", obterTexto(By.xpath("//div[@class='toast-message']")));
	}
}
