package stepDefinitions.meiosHospedagem.tipoMeiosHospedagem;

import java.util.List;


import core.BasePage;
import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pageObjects.meiosHospedagem.tipoMeiosHospedagem.EditarTipoMeiosHospedagemPage;


public class EditarTipoMeiosHospedagemSteps extends BasePage {

	EditarTipoMeiosHospedagemPage editarTipoMeiosHospedagem = new EditarTipoMeiosHospedagemPage();
	
	@Dado("^clique no botão Filtrar$")
	public void clique_no_botão_Filtrar() throws Throwable {
	    editarTipoMeiosHospedagem.clicarFiltrar();
	}

	@Dado("^digite o nome do Tipo de Meio de Hospedagem para realizar a busca$")
	public void digite_o_nome_do_Tipo_de_Meio_de_Hospedagem_para_realizar_a_busca(DataTable formData) throws Throwable {
	    List<List<String>> data = formData.raw();
	    editarTipoMeiosHospedagem.setDescricao(data.get(0).get(1));
	}

	@Dado("^clique em Filtrar para confirmar a busca$")
	public void clique_em_Filtrar_para_confirmar_a_busca() throws Throwable {
	    editarTipoMeiosHospedagem.clicarFiltrarBusca();
	}

	@Dado("^no resultado da busca solicite a opção para Editar o registro$")
	public void no_resultado_da_busca_solicite_a_opção_para_Editar_o_registro() throws Throwable {
	    editarTipoMeiosHospedagem.clicarEditar();
	}

	@Dado("^altere o nome do Tipo de Meio de Hospedagem$")
	public void altere_o_nome_do_Tipo_de_Meio_de_Hospedagem(DataTable formData) throws Throwable {
	    List<List<String>> data = formData.raw();
	    editarTipoMeiosHospedagem.setDescricao(data.get(0).get(1));
	}

	@Quando("^clicar em Salvar$")
	public void clicar_em_Salvar() throws Throwable {
	    editarTipoMeiosHospedagem.clicarSalvar();
	}
	
	@Quando("^clicar em Sim para confirmar a alteração da descrição$")
	public void clicar_em_Sim_para_confirmar_a_alteração_da_descrição() throws Throwable {
	    editarTipoMeiosHospedagem.clicarSim();
	}

	@Então("^a descrição do Tipo de Meio de Hospedagem irá ser alterada$")
	public void a_descrição_do_Tipo_de_Meio_de_Hospedagem_irá_ser_alterada() throws Throwable {
	    editarTipoMeiosHospedagem.mensagemSucesso();
	}

}
