package pageObjects.meiosHospedagem.rede;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import core.BasePage;

public class IncluirRedePage extends BasePage {

	public void clicarNovaRede() {
		scrollElementoClicar(By.xpath("//div//a[contains(text(),'Nova Rede')]"));
	}

	public void setNome(String nomeRede) {
		escrever(By.name("nome"), nomeRede);
	}

	public void clicarRedeAtiva() {
		clicarCheck(By.xpath("//label[contains(text(),'Rede ativa')]//span"));
	}

	public void setCEP(String cep) {
		escrever(By.name("endereco_cep"), cep);
	}

	public void setCEPCorresp(String cepCorresp) {
		escrever(By.xpath("(//input[@formcontrolname='CEP'])[2]"), cepCorresp);
	}

	public void novoContato() {
		clicarBotao(By.xpath("//div//a[contains(text(),'Novo contato')]"));
	}
	
	public void selecionarTipoContato(String email) {
		selecionarComboPeloXPath("//select[@name='tipoContato']", email);
	}
	
	public void setEmail(String emailContato) {
		escrever(By.name("email"), emailContato);
	}

	public void setContatoPrincipal() {
		clicarBotao(By.xpath("//input[@name='contatoPrincipal']//parent::label//span"));
	}
	
	public void adicionarContato() {
		clicarBotao(By.xpath("//button[contains(text(),'Adicionar')]"));
	}
	public void clicarSalvarRede() {
		clicarBotao(By.xpath("//div//button[contains(text(),'Salvar Rede')]"));
		clicarBotao(By.xpath("//div[@class='modal-content']//button[contains(text(),'Sim')]"));
	}
	
	public void mensagemSucesso() {
		Assertions.assertEquals("Dados gravados com sucesso!", obterTexto(By.xpath("//div[@class='toast-message']")));
	}
}
