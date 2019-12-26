package stepDefinitions.cliente.propostaAdesao;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pageObjects.cliente.propostaAdesao.IncluirPropostaAdesaoPage;
import pageObjects.cliente.propostaAdesao.ListarPropostaAdesaoPage;
import pageObjects.menu.MenuPage;
import utils.GeraCpfCnpj;

public class IncluirPropostaAdesaoSteps {
	
	MenuPage menu = new MenuPage();
	GeraCpfCnpj gerador = new GeraCpfCnpj();
	ListarPropostaAdesaoPage listarPropostaAddesao = new ListarPropostaAdesaoPage();
	IncluirPropostaAdesaoPage incluirPorpostaAdesao = new IncluirPropostaAdesaoPage();
	
	@Dado("^que acesse o módulo de Cliente para criar uma Nova Proposta de Adesão$")
	public void que_acesse_o_módulo_de_Cliente_para_criar_uma_Nova_Proposta_de_Adesão() throws Throwable {
		menu.acessarPropostaAdesao();
	}

	@Dado("^crie a Proposta de Adesão$")
	public void crie_a_Proposta_de_Adesão() throws Throwable {
		listarPropostaAddesao.novaPropostaAdesao();
	}

	@Quando("^preecher a aba Informações$")
	public void preecher_a_aba_Informações(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		String cpf = gerador.cpf(false);
		incluirPorpostaAdesao.setTipoPessoa			(data.get(0).get(1));
		incluirPorpostaAdesao.setConvenio			(data.get(1).get(1));
		incluirPorpostaAdesao.setCpfCnpj			(cpf);
		incluirPorpostaAdesao.setNome				(data.get(3).get(1) + cpf);
		incluirPorpostaAdesao.setRg					(data.get(4).get(1));
		incluirPorpostaAdesao.setOrgaoEmissor		(data.get(5).get(1));
		incluirPorpostaAdesao.setGenero				(data.get(6).get(1));
		incluirPorpostaAdesao.setNacionalidade		(data.get(7).get(1));
		incluirPorpostaAdesao.setEstadoCivil		(data.get(8).get(1));
		incluirPorpostaAdesao.setDataNascimento		(data.get(9).get(1));
		incluirPorpostaAdesao.setEmancipado			(data.get(10).get(1));
		incluirPorpostaAdesao.setTelefoneComercial	(data.get(11).get(1));
		incluirPorpostaAdesao.setTelefoneResidencial(data.get(12).get(1));
		incluirPorpostaAdesao.setEmail				(data.get(13).get(1));
		incluirPorpostaAdesao.setTelefoneCelular	(data.get(14).get(1));
		incluirPorpostaAdesao.setProfissao			(data.get(15).get(1));
		incluirPorpostaAdesao.setGrauInstrucao		(data.get(16).get(1));
		incluirPorpostaAdesao.setRendaMensal		(data.get(17).get(1));
		incluirPorpostaAdesao.setEnderecoCep		(data.get(18).get(1));
	}
	
	@Quando("^preecher a aba Informações para proposta Pessoa Jurídica$")
	public void preecher_a_aba_Informações_para_proposta_Pessoa_Jurídica(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		String cnpj = gerador.cnpj(false);
		incluirPorpostaAdesao.setTipoPessoa				(data.get(0).get(1));
		incluirPorpostaAdesao.setConvenio				(data.get(1).get(1));
		incluirPorpostaAdesao.setCpfCnpj				(cnpj);
		incluirPorpostaAdesao.setNome					(data.get(3).get(1) + cnpj);
		incluirPorpostaAdesao.setRazaoSocial			(data.get(4).get(1));
		incluirPorpostaAdesao.setTelefoneComercial		(data.get(5).get(1));
		incluirPorpostaAdesao.setEmail					(data.get(6).get(1));
		incluirPorpostaAdesao.setTelefoneCelular		(data.get(7).get(1));
		incluirPorpostaAdesao.setEnderecoCep			(data.get(8).get(1));
	}
	
	@Quando("^adicionar um novo sócio-administrador$")
	public void adicionar_um_novo_sócio_administrador(DataTable formData) throws Throwable {
		incluirPorpostaAdesao.setSocioAdministrador();
		List<List<String>> data = formData.raw();
		incluirPorpostaAdesao.setNomeSocioAdministrador				(data.get(0).get(1));
		incluirPorpostaAdesao.setCpfSocioAdministrador				(data.get(1).get(1));
		incluirPorpostaAdesao.setCargoSocioAdministrador			(data.get(2).get(1));
		incluirPorpostaAdesao.setDataNascimentoSocioAdministrador	(data.get(3).get(1));
		incluirPorpostaAdesao.setGeneroSocioAdministrador			(data.get(4).get(1));
		incluirPorpostaAdesao.setEstadoCivilSocioAdministrador		(data.get(5).get(1));
		incluirPorpostaAdesao.setEmailSocioAdministrador			(data.get(6).get(1));
		incluirPorpostaAdesao.setTelefoneSocioAdministrador			(data.get(7).get(1));
		incluirPorpostaAdesao.setReceberNovidades					(data.get(8).get(1));
		incluirPorpostaAdesao.setContactarAssociado					(data.get(9).get(1));
		incluirPorpostaAdesao.adicionarSocioAdministrador();
	}
	
	@Então("^salvar proposta$")
	public void salvar_proposta() throws Throwable {
		incluirPorpostaAdesao.salvarContinuar();
	}

	@Quando("^preencher a aba Produtos$")
	public void preencher_a_aba_Produtos(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		incluirPorpostaAdesao.setCampanha			(data.get(0).get(1));
		incluirPorpostaAdesao.setProduto			(data.get(1).get(1));
		incluirPorpostaAdesao.setCanalVendasVendedor(data.get(2).get(1));
		incluirPorpostaAdesao.setDescontoVendedor	(data.get(3).get(1));
		incluirPorpostaAdesao.setIndicador			(data.get(4).get(1), data.get(5).get(1), data.get(6).get(1));
	}
	
	@Quando("^preencher a aba Pagamento$")
	public void preencher_a_aba_Pagamento(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		incluirPorpostaAdesao.setParcelasProduto		(data.get(0).get(1));
		incluirPorpostaAdesao.setMesmaFormaPagamento	(data.get(1).get(1));
		incluirPorpostaAdesao.setFormaPagamento			(data.get(2).get(1));
		incluirPorpostaAdesao.setDiaDebito				(data.get(3).get(1));
		incluirPorpostaAdesao.setBanco					(data.get(2).get(1), data.get(4).get(1));
		incluirPorpostaAdesao.setAgencia				(data.get(2).get(1), data.get(5).get(1));
		incluirPorpostaAdesao.setDigitoAgencia			(data.get(2).get(1), data.get(5).get(1));
		incluirPorpostaAdesao.setConta					(data.get(2).get(1), data.get(6).get(1));
		incluirPorpostaAdesao.setDigitoConta			(data.get(2).get(1), data.get(6).get(1));
		incluirPorpostaAdesao.setBandeira				(data.get(2).get(1), data.get(7).get(1));
		incluirPorpostaAdesao.setNomeImpressoCartao		(data.get(2).get(1), data.get(8).get(1));
		incluirPorpostaAdesao.setNumeroCartao			(data.get(2).get(1), data.get(9).get(1));
		incluirPorpostaAdesao.setCodigoSegurancaCartao	(data.get(2).get(1), data.get(10).get(1));
		incluirPorpostaAdesao.setDataValidadeCartao		(data.get(2).get(1), data.get(11).get(1));
	}
	
	@Quando("^salvar a proposta$")
	public void salvar_a_proposta() throws Throwable {
		incluirPorpostaAdesao.salvarPropostaAdesao();
	}

	@Então("^será criada a proposta$")
	public void será_criada_a_proposta() throws Throwable {
	}

}
