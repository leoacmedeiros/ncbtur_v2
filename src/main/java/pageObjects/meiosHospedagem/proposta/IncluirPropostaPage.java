package pageObjects.meiosHospedagem.proposta;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import core.BasePage;
import core.DriverFactory;


public class IncluirPropostaPage extends BasePage {

	public void clicarNovaProposta() {

		JavascriptExecutor jse = (JavascriptExecutor) DriverFactory.getDriver();
		jse.executeScript("scroll(0, -250);");

		clicarBotao(By.xpath("//a[@routerlink='/hotel/proposta/novo'][@ng-reflect-router-link='/hotel/proposta/novo']"));

	}

	public void setCNPJ(String numeroDocumento) {
		escrever(By.name("numeroDocumento"), numeroDocumento);
	}

	public void setNome(String nome) {
		forcarLimparTexto(By.name("nomeFantasia"));
		escrever(By.name("nomeFantasia"), nome);
	}

	public void setRazaoSocial(String razaoSocial) {
		forcarLimparTexto(By.name("razaoSocial"));
		escrever(By.name("razaoSocial"), razaoSocial);
	}
	
	public void setEmail(String emailGeradoAuto) {
		escrever(By.name("email"), emailGeradoAuto);

	}
	
	public void setSite(String site) {
		escrever(By.name("site"), site);
	}
	
	public void setTelefone(String telefone) {
		escrever(By.name("telefone"), telefone);
	}
	
	public void setInscricaoMunicipal(String inscricaoMunicipal) {
		escrever(By.name("inscricaoMunicipal"), inscricaoMunicipal);
	}
	
	public void setInscricaoEstadual(String inscricaoEstadual) {
		escrever(By.name("inscricaoEstadual"), inscricaoEstadual);
	}
	
	public void setRede(String rede) {
		clicarBotao(By.xpath("//div[@formgroupname='rede']//a"));
		escrever(By.xpath("//div//input[@name='nomeRede']"), rede);
		clicarBotao(By.xpath("//div//label[contains(text(),'Nome da Rede')]//parent::div//parent::div//parent::div//parent::form//parent::div//parent::div//button[contains(text(),'Salvar')]"));
	}
	
	public void setTipoMeioHospedagem(String tipoHotel) {
		selecionarComboPeloXPath("//select[@formcontrolname='tipohotel'][@name='tipohotel']", tipoHotel);
	}
	
	public void administradora() {
		sleep(2);
		clicarBotao(By.xpath("(//select[@formcontrolname='administradora'])"));
		sleep(2);
		clicarBotao(By.xpath("(//select[@formcontrolname='administradora']//option)[1]"));
		
	}
	
	public void setTipoAdministracao(String tipoAdmin) {
		selecionarComboPeloXPath("//select[@formcontrolname='tipoAdmin'][@name='tipoAdmin']", tipoAdmin);
	}
	
	public void setNomeContComercial(String nomeResponsavel) {
		escrever(By.name("responsavel"), nomeResponsavel);
	}
	
	public void setEmailContComercial(String emailContComercial) {
		escrever(By.xpath("(//div//input[@name='email'])[2]"), emailContComercial);
	}
	
	public void setTelefoneContComercial(String telefoneComercial) {
		escrever(By.name("telefone_comercial"), telefoneComercial);
	}
	
	public void setCepEndereco(String cepEndereco) {
		escrever(By.xpath("(//input[@formcontrolname='CEP'][@name='endereco_cep'])[1]"), cepEndereco);
	}
	
	public void setCepEnderecoCorrespondencia(String cepEnderecoCorrespondencia) {
		escrever(By.xpath("(//input[@formcontrolname='CEP'][@name='endereco_cep'])[2]"), cepEnderecoCorrespondencia);
	}
	
	public void clicarSalvarMeioHospedagem() {
		esperarElementoFicarVisivel2(By.xpath("//button[contains(text(),'Salvar Meio de Hospedagem')]"));
		clicarBotao(By.xpath("//button[contains(text(),'Salvar Meio de Hospedagem')]"));
	}
	
	public void mensagemSucesso() {
		Assertions.assertEquals("Dados gravados com sucesso!", obterTexto(By.xpath("//div[@class='toast-message']")));
	}
	
	

}
