package stepDefinitions.meiosHospedagem.fornecedores;

import java.util.List;


import core.BasePage;
import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pageObjects.meiosHospedagem.fornecedores.IncluirFornecedorPage;
import pageObjects.menu.MenuPage;
import utils.GeraCpfCnpj;


public class IncluirFornecedorSteps extends BasePage {

	MenuPage menu = new MenuPage();
	GeraCpfCnpj gerador = new GeraCpfCnpj();
	IncluirFornecedorPage incluirFornecedor = new IncluirFornecedorPage();

	@Dado("^acesse o Menu Fornecedores$")
	public void acesse_o_Menu_Fornecedores() throws Throwable {
	    menu.acessarMeiosHospedagemFornecedores();
	}

	@Dado("^clique no botão Novo Fornecedor$")
	public void clique_no_botão_Novo_Fornecedor() throws Throwable {
	    incluirFornecedor.clicarNovoFornecedor();
	}

	@Quando("^preencher os campos de Fornecedor com dados válidos$")
	public void preencher_os_campos_de_Fornecedor_com_dados_válidos(DataTable formData) throws Throwable {
		String cnpj = gerador.cnpj(false);
		
	    List<List<String>> data = formData.raw();
	    incluirFornecedor.nomeFornecedor(data.get(0).get(1)+" - "+cnpj);
	    incluirFornecedor.cnpjFornecedor(cnpj);
	    incluirFornecedor.razaoSocialFornecedor(data.get(2).get(1));
	    incluirFornecedor.cepEnderecoFornecedor(data.get(3).get(1));
	    incluirFornecedor.cepCorrespondenciaFornecedor(data.get(4).get(1));
	}

	@Quando("^preencher os campos referente a Contatos$")
	public void preencher_os_campos_referente_a_Contatos(DataTable formData) throws Throwable {
		
		List<List<String>> data = formData.raw();
	    incluirFornecedor.novoContato();
	    incluirFornecedor.tipoContato(data.get(0).get(1),geraEmailAuto());
	    incluirFornecedor.contatoPrincipal();
	    incluirFornecedor.adicionarContato();
	}

	@Quando("^preencher os dados bancários$")
	public void preencher_os_dados_bancários(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
	    incluirFornecedor.selecionarBanco(data.get(0).get(1));
	    incluirFornecedor.agenciaEDigito(data.get(1).get(1), data.get(2).get(1));
	    incluirFornecedor.contaEDigito(data.get(3).get(1), data.get(4).get(1));
	}

	@Quando("^clicar no botao Salvar Fornecedor de Meios de Hospedagem$")
	public void clicar_no_botao_Salvar_Fornecedor_de_Meios_de_Hospedagem() throws Throwable {
	    incluirFornecedor.salvarFornecedor();
	}

	@Então("^o sistema irá incluir um novo Fornecedor$")
	public void o_sistema_irá_incluir_um_novo_Fornecedor() throws Throwable {
	    
	}

}
