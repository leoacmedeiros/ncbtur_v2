
package pageObjects.menu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import core.BasePage;
import core.DriverFactory;

public class MenuPage extends BasePage {

	public void acessarTaxa() {
		clicarBotao(By.xpath("//span[contains(text(),'Produto')]"));
		clicarBotao(By.xpath("//span[contains(text(),'Taxa')]"));
	}

	public void acessarGerenciarProdutos() {
//		clicarBotao(By.xpath("//span[contains(text(),'Produto')]"));
		clicarBotao(By.xpath("//span[contains(text(),'Gerenciar Produtos')]"));
	}

	public void acessarListaDePreco() {
//		clicarBotao(By.xpath("//span[contains(text(),'Produto')]"));
		clicarBotao(By.xpath("//span[contains(text(),'Lista de Preço')]"));
	}

	public void acessarCampanha() {
//		clicarBotao(By.xpath("//span[contains(text(),'Produto')]"));
		clicarBotao(By.xpath("//span[contains(text(),'Campanha')]"));
	}

	public void acessarCanalVendas() {
//		clicarBotao(By.xpath("//span[contains(text(),'Produto')]"));
		clicarBotao(By.xpath("//span[contains(text(),'Canal de Vendas')]"));
		sleep(5);
	}

	public void acessarMeiosHospedagemGerenciar() {
		clicarBotao(By.xpath("(//span[contains(text(),'Meios de Hospedagem')])[1]"));
		clicarBotao(By.xpath("(//span[contains(text(),'Meios de Hospedagem')])//parent::a//parent::li//span[contains(text(),'Gerenciar')]"));
	}

	public void acessarMeiosHospedagemNegociacao() {
		clicarBotao(By.xpath("(//span[contains(text(),'Meios de Hospedagem')])[1]"));
		clicarBotao(By.xpath("(//span[contains(text(),'Negociação')])[1]"));
	}

	public void acessarMeiosHospedagemAdministradoraMeioHospedagem() {
		clicarBotao(By.xpath("(//span[contains(text(),'Administradora de Meio de Hospedagem')])"));
	}

	public void acessarMeiosHospedagemFornecedores() {
		clicarBotao(By.xpath("//span[contains(text(),'Fornecedores')]"));
	}

	public void acessarMeiosHospedagemPesquisar() {
		clicarBotao(By.xpath("(//span[contains(text(),'Pesquisar')])[2]"));
	}

	public void acessarMeiosHospedagemCadastro() {
		clicarBotao(By.xpath("(//span[contains(text(),'Cadastro')])[@class='title']"));
	}

	public void acessarMeiosHospedagemRede() {
		clicarBotao(By.xpath("(//span[contains(text(),'Rede')])[1]"));
	}

	public void acessarNovoConvenioProposta() {
		clicarBotao(By.xpath("(//span[contains(text(),'Novo convênio')])[1]"));
	}

	public void acessarMenuPainelMeioHospedagem() {
		clicarBotao(By.xpath("//a[@href='#meiosDeHospedagem']//i"));
	}

	public void acessarMeiosHospedagemTipoMeiosHospedagem() {
		clicarBotao(By.xpath("(//span[contains(text(),'Tipo de Meio de Hospedagem')])[1]"));
	}

	public void acessarPropostaAdesao() {
		clicarBotao(By.xpath("(//span[contains(text(),'Cliente')])[1]"));
		clicarBotao(By.xpath("(//span[contains(text(),'Proposta de adesão')])"));
	}

	public void acessarFinanceiro() {
		clicarBotao(By.xpath("(//span[contains(text(),'Financeiro')])[1]"));
	}

	public void acessarBandeiras() {
		clicarBotao(By.xpath("(//a[contains(text(),'Contas a Receber')])[1]"));
		clicarBotao(By.xpath("(//span[contains(text(),'Gerenciar')])[1]"));
		clicarBotao(By.xpath("(//span[contains(text(),'Bandeiras')])[1]"));
	}

	public void acessarOperadoras() {
		clicarBotao(By.xpath("(//span[contains(text(),'Gerenciar')])[1]"));
		clicarBotao(By.xpath("//a[contains(text(),'Operadoras')]"));
	}

	public void acessarReserva() {
		clicarBotao(By.xpath("(//span[contains(text(),'Reserva')])[1]"));
	}

	public void acessarIniciarReserva() {
		clicarBotao(By.xpath("(//span[contains(text(),'Iniciar reserva')])[1]"));
	}

	public void acessarGerenciarReservas() {
		clicarBotao(By.xpath("(//span[contains(text(),'Gerenciar reservas')])[1]"));
	}

	public void acessarCalendarioArrecadacao() {
		clicarBotao(By.xpath("(//a[contains(text(),'Contas a Receber')])[1]"));
		clicarBotao(By.xpath("(//span[contains(text(),'Calendário')])[1]"));
	}
	
	public void acessarDemonstrativos() {
		clicarBotao(By.xpath("//span[contains(text(),'Contabil')]"));
		clicarBotao(By.xpath("//span[contains(text(),'Demonstrativo')]"));
	}

}
