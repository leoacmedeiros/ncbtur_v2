package stepDefinitions.produto.canalVendas;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pageObjects.menu.MenuPage;
import pageObjects.produto.canalVendas.IncluirCanalVendasPage;
import pageObjects.produto.canalVendas.ListarCanalVendasPage;

public class IncluirCanalVendasSteps {
	
	MenuPage menu = new MenuPage();
	ListarCanalVendasPage visualizarCanal = new ListarCanalVendasPage();
	IncluirCanalVendasPage incluirCanal = new IncluirCanalVendasPage();

	@Dado("^que acesse o modulo de Canal de Vendas$")
	public void que_acesse_o_modulo_de_Canal_de_Vendas() throws Throwable {
		menu.acessarCanalVendas();
	}

	@Dado("^criar um Canal de Vendas$")
	public void criar_um_Canal_de_Vendas() throws Throwable {
		visualizarCanal.novoCanalVenda();
	}

	@Quando("^preencher os dados do canal de vendas filial$")
	public void preencher_os_dados_do_canal_de_vendas_filial(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		incluirCanal.setTipo				(data.get(0).get(1));
		incluirCanal.setNomeCanalVendas		(data.get(1).get(1));
		incluirCanal.setDescricaoCanalVendas(data.get(2).get(1));
		incluirCanal.setEmpresaCanalVendas	(data.get(3).get(1));
		incluirCanal.setFilialCanalVendas	(data.get(4).get(1));
		incluirCanal.setSite				(data.get(5).get(1));
	}
	
	@Quando("^preencher os dados do canal de vendas matriz$")
	public void preencher_os_dados_do_canal_de_vendas_matriz(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		incluirCanal.setTipo				(data.get(0).get(1));
		incluirCanal.setNomeCanalVendas		(data.get(1).get(1));
		incluirCanal.setDescricaoCanalVendas(data.get(2).get(1));
		incluirCanal.setEmpresaCanalVendas	(data.get(3).get(1));
		incluirCanal.setSite				(data.get(4).get(1));
	}
	
	@Quando("^preencher os dados do canal de vendas Representante$")
	public void preencher_os_dados_do_canal_de_vendas_Representante(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		incluirCanal.setTipo				(data.get(0).get(1));
		incluirCanal.setNomeCanalVendas		(data.get(1).get(1));
		incluirCanal.setDescricaoCanalVendas(data.get(2).get(1));
		incluirCanal.setRazaoSocial			(data.get(3).get(1));
		incluirCanal.setCnpj				(data.get(4).get(1));
		incluirCanal.setSite				(data.get(5).get(1));
		incluirCanal.setCore				(data.get(6).get(1));
	}
	
	@Quando("^preencher os dados do canal de vendas Cooperado$")
	public void preencher_os_dados_do_canal_de_vendas_Cooperado(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		incluirCanal.setTipo				(data.get(0).get(1));
		incluirCanal.setNomeCanalVendas		(data.get(1).get(1));
		incluirCanal.setDescricaoCanalVendas(data.get(2).get(1));
		incluirCanal.setRazaoSocial			(data.get(3).get(1));
		incluirCanal.setCnpj				(data.get(4).get(1));
		incluirCanal.setSite				(data.get(5).get(1));
	}
	
	@Quando("^preencher os dados do canal de vendas Convênio$")
	public void preencher_os_dados_do_canal_de_vendas_Convênio(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		incluirCanal.setTipo				(data.get(0).get(1));
		incluirCanal.setNomeCanalVendas		(data.get(1).get(1));
		incluirCanal.setDescricaoCanalVendas(data.get(2).get(1));
		incluirCanal.setParametrosVinculo	(data.get(3).get(1));
		incluirCanal.setRazaoSocial			(data.get(4).get(1));
		incluirCanal.setCnpj				(data.get(5).get(1));
		incluirCanal.setSite				(data.get(6).get(1));
	}

	@Quando("^adicionar contatos$")
	public void adicionar_contatos(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		incluirCanal.setContatosObrigatorios(data.get(0).get(1), data.get(1).get(1));
	}

	@Quando("^informar o endereço$")
	public void informar_o_endereço(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		incluirCanal.setCep(data.get(0).get(1));
	}

	@Quando("^marcar o canal de vendas como ativo$")
	public void marcar_o_canal_de_vendas_como_ativo() throws Throwable {
		incluirCanal.setCanalVendasAtivo();
	}

	@Quando("^preecher a vigencia do canal de vendas$")
	public void preecher_a_vigencia_do_canal_de_vendas(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		incluirCanal.setDataInicio			(data.get(1).get(1));
		incluirCanal.setDataFim				(data.get(2).get(1));
		incluirCanal.setTempoIndeterminado	(data.get(0).get(1));
	}

	@Quando("^informar dados para receber notificação$")
	public void informar_dados_para_receber_notificação(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		incluirCanal.setColaboradorResponsavel		(data.get(0).get(1));
		incluirCanal.setEmailColaboradorResponsavel	(data.get(1).get(1));
	}

	@Quando("^preencher o formulário de responsável do canal de vendas$")
	public void preencher_o_formulário_de_responsavel_do_canal_de_vendas(DataTable formData)
			throws Throwable {
		List<List<String>> data = formData.raw();
		incluirCanal.setResponsavel();
		incluirCanal.setNomeResponsavel				(data.get(0).get(1));
		incluirCanal.setSexoResponsavel				(data.get(1).get(1));
		incluirCanal.setCpfResponsavel				(data.get(2).get(1));
		incluirCanal.setRgResponsavel				(data.get(3).get(1));
		incluirCanal.setOrgaoExpedidorResponsavel	(data.get(4).get(1));
		incluirCanal.setProfissaoResponsavel		(data.get(5).get(1));
		incluirCanal.setCargoResponsavel			(data.get(6).get(1));
		incluirCanal.setNacionalidadeResponsavel	(data.get(7).get(1));
		incluirCanal.setEstadoCivilResponsavel		(data.get(8).get(1));
		incluirCanal.setDataNascimentoResponsavel	(data.get(9).get(1));
		incluirCanal.setEmailResponsavel			(data.get(10).get(1));
	}

	@Quando("^adicionar telefone$")
	public void adicionar_telefone(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		incluirCanal.setTelefoneResponsavel(data.get(0).get(1));
	}
	
	@Quando("^informar o endereço do responsável$")
	public void informar_o_endereço_do_responsável(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		incluirCanal.setCepResponsavel(data.get(0).get(1));		
	}

	@Quando("^adicionar responsável$")
	public void adicionar_responsável() throws Throwable {
		incluirCanal.adicionarResponsavelAtivo();
	}
	
	@Quando("^preencher o formulário de vendedor do canal de vendas$")
	public void preencher_o_formulário_de_vendedor_do_canal_de_vendas(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
//		incluirCanal.setVendedor();
		incluirCanal.setCpfVendedor		(data.get(0).get(1));
//		incluirCanal.setPromotorVendas	(data.get(1).get(1));
//		incluirCanal.adicionarVendedor();
	}
	
	@Quando("^preencher o formulário conveniado do canal de vendas$")
	public void preencher_o_formulário_conveniado_do_canal_de_vendas(DataTable formData) throws Throwable {
		incluirCanal.setConveniado();
		List<List<String>> data = formData.raw();
		incluirCanal.setNomeConveniado				(data.get(0).get(1));
		incluirCanal.setParametroVinculoConveniado	(data.get(1).get(1));
		incluirCanal.adicionarConveniado();		
	}
	
	@Quando("^preencer o formulário de oferta do canal de vendas$")
	public void preencer_o_formulário_de_oferta_do_canal_de_vendas(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		incluirCanal.setValorDescontoOferta			(data.get(0).get(1));
		incluirCanal.setPeriodoPromocionalOferta	(data.get(1).get(1), data.get(2).get(1), data.get(3).get(1), data.get(4).get(1));
	}
	
	@Quando("^adicionar novo desconto$")
	public void adicionar_novo_desconto(DataTable formData) throws Throwable {
		incluirCanal.setNovoDesconto();
		List<List<String>> data = formData.raw();
		incluirCanal.setEmpresaDesconto		(data.get(0).get(1));
		incluirCanal.setValorNovoDesconto	(data.get(1).get(1));
		incluirCanal.setObservacoesDesconto	(data.get(2).get(1));
		incluirCanal.adicionarDesconto();
	}

	@Quando("^preencher o formulário de dados bancários do canal de vendas$")
	public void preencher_o_formulário_de_dados_bancários_do_canal_de_vendas(DataTable formData)
			throws Throwable {
		List<List<String>> data = formData.raw();
		incluirCanal.setBancoCanalVendas	(data.get(0).get(1));
		incluirCanal.setAgencia				(data.get(1).get(1));
		incluirCanal.setDigitoAgencia		(data.get(1).get(1));
		incluirCanal.setConta				(data.get(2).get(1));
		incluirCanal.setDigitoConta			(data.get(2).get(1));
		incluirCanal.setOperacao			(data.get(3).get(1), data.get(0).get(1));
	}

	@Quando("^anexar documentações$")
	public void anexar_documentações(DataTable formData) throws Throwable {
	}

	@Quando("^salvar os dados do canal de vendas$")
	public void salvar_os_dados_do_canal_de_vendas() throws Throwable {
//		incluirCanal.salvarCanalVendas();
	}

	@Então("^será criado o canal de vendas$")
	public void será_criado_o_canal_de_vendas() throws Throwable {
//		incluirCanal.mensagemSucesso();
	}

}
