package stepDefinitions.meiosHospedagem.tipoMeiosHospedagem;

import java.util.List;


import core.BasePage;
import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pageObjects.meiosHospedagem.tipoMeiosHospedagem.ExcluirTipoMeiosHospedagemPage;



public class ExcluirTipoMeiosHospedagemSteps extends BasePage {

	ExcluirTipoMeiosHospedagemPage excluirTipoMeiosHospedagem = new ExcluirTipoMeiosHospedagemPage();
	
	@Dado("^no resultado da busca solicite a opção para Excluir o registro$")
	public void no_resultado_da_busca_solicite_a_opção_para_Excluir_o_registro() throws Throwable {
	    excluirTipoMeiosHospedagem.clicarExcluir();
	}

	@Dado("^na tela de confirmação clique na opção Sim$")
	public void na_tela_de_confirmação_clique_na_opção_Sim() throws Throwable {
	    excluirTipoMeiosHospedagem.clicarSimConfirmarExclusao();
	}

	@Então("^o registro será removido$")
	public void o_registro_será_removido() throws Throwable {
	    //excluirTipoMeiosHospedagem.mensagemSucesso();
	}
	
}
