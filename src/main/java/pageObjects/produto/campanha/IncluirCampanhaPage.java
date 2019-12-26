package pageObjects.produto.campanha;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import core.BasePage;

public class IncluirCampanhaPage extends BasePage {

	public void setCodigoPromocional(String codigoPromocional) {
		escrever(By.xpath("//input[@id='codigoPromocional']"), codigoPromocional);
	}

	public void setNome(String nome) {
		escrever(By.xpath("//input[@name='nome']"), nome);
	}

	public void setTipo(String tipo) {
		selecionarComboPeloXPath("//select[@name='tipo']", tipo);
	}

	public void setDescricao(String descricao) {
		escrever(By.xpath("//textarea[@name='descricao']"), descricao);
	}

	public void setSituacao(String situacao) {
		if (situacao.trim().equals("Ativa"))
			clicarCheck(By.xpath("//label[contains(text(),'Campanha ativa?')]/span"));
	}

	public void setRestricoes(String restricoes) {
		escrever(By.xpath("//textarea[@name='observacoes']"), restricoes);
	}

	public void clicarProximo() {
		clicarBotao(By.xpath("//button[contains(text(),'PRÓXIMO')]"));
	}

	public void setTipoVigencia(String vigencia) {
		if (vigencia.trim().equals("Período definido")) {
			clicarRadio(By.xpath("//input[@value='periodo']"));
		} else if (vigencia.trim().equals("Meses")) {
			clicarRadio(By.xpath("//input[@value='meses']"));
		}
	}

	public void setVigencia(String tempoIndeterminado, String vigencia, String qtdMeses, String dataInicio,
			String dataFim) {
		if (tempoIndeterminado.trim().equals("Sim") && vigencia.trim().equals("Período definido")) {
			clicarRadio(By.xpath("//label[contains(text(),'Tempo Indeterminado?')]/span"));
			escrever(By.xpath("//input[@name='inicioVigencia']"), dataInicio);
		} else if (tempoIndeterminado.trim().equals("Não") && vigencia.trim().equals("Período definido")) {
			escrever(By.xpath("//input[@name='inicioVigencia']"), dataInicio);
			escrever(By.xpath("//input[@name='fimVigencia']"), dataFim);
		} else if (vigencia.trim().equals("Meses")) {
			escrever(By.xpath("//div[@class='input-group bootstrap-touchspin']//input"), qtdMeses);
		}
	}

	public void setProduto(String produtos) {
		scrollPageUP();
		if (!produtos.trim().equals("Todos")) {
			for (String produto : produtos.split(","))
				clicarBotao(By
						.xpath("//input[@name='valueNome']//parent::label[contains(text(),'" + produto.trim() + "')]"));
		} else {
			clicarBotao(By.xpath("//label[contains(text(),'Selecionar todos')]"));
		}
	}

	public void setCanaisDeVenda(String canais) {
		scrollPageUP();
		clicarBotao(By.xpath("//button[@class='btn green'][contains(text(),'Pesquisar')]"));
		if (canais.trim().equals("Todos")) {
			clicarBotao(By.xpath("//button[@class='btn blue'][contains(text(),'Pesquisar')]"));
			esperarElementoFicarVisivel2(By.xpath(
					"//table[@class='table table-striped table-bordered table-advance table-hover']//thead//tr//th//span"));
			clicarRadio(By.xpath(
					"//table[@class='table table-striped table-bordered table-advance table-hover']//thead//tr//th//span"));
			clicarBotao(By.xpath("//button[contains(text(),'Adicionar Canais')]"));
		} else {
			escrever(By.xpath("//form[@class='row ng-untouched ng-pristine ng-valid']//input[@name='nome']"), canais);
			clicarBotao(By.xpath("//button[contains(text(),'Pesquisar')]"));
			esperarElementoFicarVisivel2(By.xpath("//tbody//label[@class='mt-checkbox mt-checkbox-outline']//span"));
			clicarCheck(By.xpath("//tbody//label[@class='mt-checkbox mt-checkbox-outline']//span"));
			clicarBotao(By.xpath("//button[contains(text(),'Adicionar Canais')]"));
		}
	}

	public void setAbrangencia(String abrangencia) {
		if (abrangencia.trim().equals("Todos")) {
			clicarBotao(By.xpath("//label[contains(text(),'Selecionar tudo')]/span"));
		}
		// clicarCheck(By.xpath("//div[@class='form-group
		// mult']//div[1]//div[1]//label[1]"));(//div[@class='form-group
		// mult']//div[1]//input[@name='selecionarTudo'])[1]
	}

	public void salvar() {
		clicarBotao(By.xpath("//button[@class='btn green button-submit']"));
	}

	public void mensagemSucesso() {
		esperarElementoFicarVisivel2(By.className("//div[@class='toast-message']"));
		Assertions.assertEquals("Dados gravados com sucesso!", obterTexto(By.xpath("//div[@class='toast-message']")));
	}

}
