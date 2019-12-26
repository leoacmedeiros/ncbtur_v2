package stepDefinitions.meiosHospedagem.tipoMeiosHospedagem;

import java.util.List;
import core.BasePage;
import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pageObjects.meiosHospedagem.tipoMeiosHospedagem.VisualizarTipoMeiosHospedagemPage;


public class VisualizarTipoMeiosHospedagemSteps extends BasePage {
	
	VisualizarTipoMeiosHospedagemPage visualizarTipoMeioHospedagem = new VisualizarTipoMeiosHospedagemPage();

	@Dado("^realize uma pesquisa pelo Tipo de Meio de Hospedagem$")
	public void realize_uma_pesquisa_pelo_Tipo_de_Meio_de_Hospedagem(DataTable formData) throws Throwable {
	    List<List<String>> data = formData.raw();
		visualizarTipoMeioHospedagem.pesquisarTipoMeioHospedagem(data.get(0).get(1));
	}

	@Dado("^realize outra busca pelo código do Tipo de Meio de Hospedagem$")
	public void realize_outra_busca_pelo_código_do_Tipo_de_Meio_de_Hospedagem() throws Throwable {
	    visualizarTipoMeioHospedagem.pesquisaPorCodigo();
	}

	@Dado("^clique no botão para Visualizar o registro$")
	public void clique_no_botão_para_Visualizar_o_registro() throws Throwable {
		visualizarTipoMeioHospedagem.clicarVisualizar();
	}

	@Então("^irá ser exibido o registro pesquisado$")
	public void irá_ser_exibido_o_registro_pesquisado() throws Throwable {
	    visualizarTipoMeioHospedagem.validarRegistroPesquisado();
	}
	
}
