package stepDefinitions.meiosHospedagem.tipoMeiosHospedagem;

import core.BasePage;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import pageObjects.meiosHospedagem.tipoMeiosHospedagem.AtivarInativarTipoMeiosHospedagemPage;



public class AtivarInativarTipoMeiosHospedagemSteps extends BasePage {
	
	AtivarInativarTipoMeiosHospedagemPage ativarInativar = new AtivarInativarTipoMeiosHospedagemPage();
	
	@Dado("^no registro pesquisado acione a opção Ativar$")
	public void no_registro_pesquisado_acione_a_opção_Ativar() throws Throwable {
	    ativarInativar.clicarAtivar();
	}

	@Dado("^clique em Sim para confirmar a ativação$")
	public void clique_em_Sim_para_confirmar_a_ativação() throws Throwable {
	    ativarInativar.clicarSimAtivarInativar();
	}

	@Dado("^clique no botão para Inativar o registro$")
	public void clique_no_botão_para_Inativar_o_registro() throws Throwable {
	    ativarInativar.clicarInativar();
	}

	@Dado("^clique em Sim para confirmar a inativação$")
	public void clique_em_Sim_para_confirmar_a_inativação() throws Throwable {
		ativarInativar.clicarSimAtivarInativar();
	}

	@Então("^o registro irá ficar inativado$")
	public void o_registro_irá_ficar_inativado() throws Throwable {
	    ativarInativar.validarRegistroInativo();
	}
	
	
}
