package pageObjects.meiosHospedagem.fornecedores;

import org.openqa.selenium.By;

import core.BasePage;


public class IncluirFornecedorPage extends BasePage {

	public void clicarNovoFornecedor() {
		sleep(2);
		scrollElementoClicar(By.xpath("//a[contains(text(),'Novo Fornecedor')]"));
	}

	public void nomeFornecedor(String nome) {
		escrever(By.name("nomeFantasia"), nome);
	}
	
	public void cnpjFornecedor(String cnpj) {
		escrever(By.name("codigoCNPJ"), cnpj);
	}
	
	public void razaoSocialFornecedor(String razaoSocial) {
		escrever(By.name("razaoSocial"), razaoSocial);
	}

	public void cepEnderecoFornecedor(String cepEndereco) {
		escrever(By.xpath("(//input[@name='endereco_cep'])[1]"), cepEndereco);
	}
	
	public void cepCorrespondenciaFornecedor(String cepCorrespondencia) {
		escrever(By.xpath("(//input[@name='endereco_cep'])[2]"), cepCorrespondencia);
	}
	
	public void novoContato() {
		scrollElementoClicar(By.xpath("//div//a[contains(text(),'Novo contato')]"));
	}
	
	public void tipoContato(String tipoContato, String emailContato) {
		selecionarComboPeloXPath("//select[@name='tipoContato']", tipoContato);
		escrever(By.name("email"), emailContato);
	}
	
	public void contatoPrincipal() {
		clicarBotao(By.xpath("//label[contains(text(),'Contato Principal')]//span"));
	}
	
	public void adicionarContato() {
		clicarBotao(By.xpath("//div//button[contains(text(),'Adicionar')]"));
	}
	
	public void selecionarBanco(String nomeBanco) {
		selecionarComboPeloXPath("//div//label[contains(text(),'Banco')]//parent::div//select", nomeBanco);
	}
	
	public void agenciaEDigito(String agenciaNumero, String agenciaDigito) {
		escrever(By.name("agenciaNumero"), agenciaNumero);
		escrever(By.name("agenciaDigito"), agenciaDigito);
	}
	
	public void contaEDigito(String contaNumero, String contaDigito) {
		escrever(By.name("debito_conta"), contaNumero);
		escrever(By.name("contaDigito"), contaDigito);
	}

	public void salvarFornecedor() {
		clicarBotao(By.xpath("//div//button[contains(text(),'Salvar Fornecedor')]"));
		
	}
	
}



