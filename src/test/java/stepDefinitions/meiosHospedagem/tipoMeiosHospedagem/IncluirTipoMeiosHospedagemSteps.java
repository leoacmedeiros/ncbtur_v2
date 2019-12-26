package stepDefinitions.meiosHospedagem.tipoMeiosHospedagem;

import java.util.List;


import core.BasePage;
import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pageObjects.menu.MenuPage;
import utils.GeraCpfCnpj;
import pageObjects.meiosHospedagem.administradoraMeioHospedagem.IncluirAdministradoraMeioHospedagemPage;
import pageObjects.meiosHospedagem.pesquisar.PesquisarPage;
import pageObjects.meiosHospedagem.tipoMeiosHospedagem.IncluirTipoMeiosHospedagemPage;


public class IncluirTipoMeiosHospedagemSteps extends BasePage {

	MenuPage menu = new MenuPage();
	IncluirTipoMeiosHospedagemPage incluirTipoMeiosHospedagem = new IncluirTipoMeiosHospedagemPage();
	
	@Dado("^acesse o sub-menu Tipo de Meios de Hospedagem$")
	public void acesse_o_sub_menu_Tipo_de_Meios_de_Hospedagem() throws Throwable {
		menu.acessarMeiosHospedagemTipoMeiosHospedagem();
	}

	@Dado("^clique no botão Novo Tipo de Meio de Hospedagem$")
	public void clique_no_botão_Novo_Tipo_de_Meio_de_Hospedagem() throws Throwable {
	    incluirTipoMeiosHospedagem.clicarNovoTipoMeioHospedagem();
	}

	@Dado("^preencha a descrição do Novo Tipo de Meio de Hospedagem$")
	public void preencha_a_descrição_do_Novo_Tipo_de_Meio_de_Hospedagem(DataTable formData) throws Throwable {
	    List<List<String>> data = formData.raw();
	    incluirTipoMeiosHospedagem.setDescricaoTipoMeioHospedagem(data.get(0).get(1));
	}

	@Dado("^clique no botão para salvar o registro$")
	public void clique_no_botão_para_salvar_o_registro() throws Throwable {
	    incluirTipoMeiosHospedagem.clicarSalvarTipoMeioHospedagem();
	}

	@Dado("^clique em Sim para confirmar a inclusão$")
	public void clique_em_Sim_para_confirmar_a_inclusão() throws Throwable {
	    incluirTipoMeiosHospedagem.clicarSimConfirmarInclusao();
	}

	@Então("^irá salvar o Novo Tipo de Meio de Hospedagem$")
	public void irá_salvar_o_Novo_Tipo_de_Meio_de_Hospedagem() throws Throwable {
	    incluirTipoMeiosHospedagem.mensagemSucesso();
	}

}
