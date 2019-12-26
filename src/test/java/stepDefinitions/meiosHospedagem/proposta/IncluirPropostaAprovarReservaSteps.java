package stepDefinitions.meiosHospedagem.proposta;

import java.util.List;

import core.BasePage;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pageObjects.meiosHospedagem.proposta.IncluirPropostaAprovarReservaPage;
import pageObjects.menu.MenuPage;
import utils.GeraCpfCnpj;

public class IncluirPropostaAprovarReservaSteps extends BasePage {
	
	MenuPage menu = new MenuPage();
	IncluirPropostaAprovarReservaPage incluirProposta = new IncluirPropostaAprovarReservaPage();
	
	@Dado("^que acesse o menu Painel Meios de Hospedagem$")
	public void que_acesse_o_menu_Painel_Meios_de_Hospedagem() throws Throwable {
	    incluirProposta.acessarPainelMeioHosp();
	}

	@Dado("^acesse o Menu Dados Bancários$")
	public void acesse_o_Menu_Dados_Bancários() throws Throwable {
	    incluirProposta.acessarDadosBancarios();
	}

	@Dado("^clique em Novo Dado Bancário$")
	public void clique_em_Novo_Dado_Bancário() throws Throwable {
	    incluirProposta.novoDadoBancario();
	}

	@Dado("^preencha os Dados$")
	public void preencha_os_Dados(DataTable formData) throws Throwable {
	    List<List<String>> data = formData.raw();
	    incluirProposta.preencheDadosBancarios(data.get(0).get(1), geraNumAuto(), data.get(2).get(1), geraNumAuto(), data.get(4).get(1));
	}

	@Dado("^clique em Salvar$")
	public void clique_em_Salvar() throws Throwable {
	    incluirProposta.salvarDadosBancarios();
	}

	@Então("^irá incluir o Dado Bancário$")
	public void irá_incluir_o_Dado_Bancário() throws Throwable {
	   incluirProposta.mensagemSucesso();
	}

	@Dado("^que acesse o Menu Fotos$")
	public void que_acesse_o_Menu_Fotos() throws Throwable {
	    incluirProposta.acessarFotosMeiosHosp();
	}

	@Dado("^clique no botão de Carregar$")
	public void clique_no_botão_de_Carregar() throws Throwable {
	    incluirProposta.carregarFoto();
	}

	@Dado("^selecione uma foto$")
	public void selecione_uma_foto() throws Throwable {
	    incluirProposta.robotFoto();
	}

	@Dado("^preencha os campos$")
	public void preencha_os_campos(DataTable formData) throws Throwable {
	    List<List<String>> data = formData.raw();
	    incluirProposta.camposFoto(data.get(0).get(1), data.get(1).get(1), data.get(2).get(1));
	}

	@Dado("^clique no botão Salvar Foto$")
	public void clique_no_botão_Salvar_Foto() throws Throwable {
	    incluirProposta.salvarFoto();
	}

	@Então("^a foto será incluída$")
	public void a_foto_será_incluída() throws Throwable {
	    incluirProposta.mensagemSucesso();
	}

	@Dado("^que acesse o menu  Localização$")
	public void que_acesse_o_menu_Localização() throws Throwable {
	    incluirProposta.acessarLocalizacao();
	}

	@Dado("^informe a Latitude e Longitude$")
	public void informe_a_Latitude_e_Longitude(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
	    incluirProposta.latitudeLongitude(data.get(0).get(1), data.get(1).get(1), data.get(2).get(1));
	}

	@Quando("^clicar para Salvar a Localização$")
	public void clicar_para_Salvar_a_Localização() throws Throwable {
	    incluirProposta.salvarLocalizacao();
	}

	@Então("^a localização será salva$")
	public void a_localização_será_salva() throws Throwable {
	    incluirProposta.mensagemSucesso();
	}

	@Então("^clique em Nova Referência$")
	public void clique_em_Nova_Referência() throws Throwable {
	    incluirProposta.novaReferencia();
	}

	@Então("^preencha os dados de Referência$")
	public void preencha_os_dados_de_Referência(DataTable formData) throws Throwable {
	    List<List<String>> data = formData.raw();
	    incluirProposta.camposReferencia(data.get(0).get(1), data.get(1).get(1));
	}

	@Então("^clique para Salvar a Distância$")
	public void clique_para_Salvar_a_Distância() throws Throwable {
	    incluirProposta.salvarDistancia();
	}

	@Então("^a Referência será Salva$")
	public void a_Referência_será_Salva() throws Throwable {
	    incluirProposta.mensagemSucesso();
	}

	@Dado("^que acesse o menu Tipo de UH$")
	public void que_acesse_o_menu_Tipo_de_UH() throws Throwable {
	    incluirProposta.acessarTipoUH();
	}

	@Dado("^clique no botão Nova Unidade Habitacional$")
	public void clique_no_botão_Nova_Unidade_Habitacional() throws Throwable {
	    incluirProposta.novaUnidadeHabitacional();
	}

	@Dado("^preencha os dados de UH$")
	public void preencha_os_dados_de_UH(DataTable formData) throws Throwable {
	    List<List<String>> data = formData.raw();
	    incluirProposta.preencherDadosTipoUH(data.get(0).get(1), data.get(1).get(1), data.get(2).get(1), data.get(3).get(1), data.get(4).get(1), data.get(5).get(1));
	}

	@Dado("^em Ocupação máxima da acomodação preencha os campos$")
	public void em_Ocupação_máxima_da_acomodação_preencha_os_campos(DataTable formData) throws Throwable {
		 List<List<String>> data = formData.raw();
		 incluirProposta.ocupacaoMaxAcomodacao(data.get(0).get(1), data.get(1).get(1));
	}

	@Dado("^em Política de Gratuidade para Criança preencha os campos$")
	public void em_Política_de_Gratuidade_para_Criança_preencha_os_campos(DataTable formData) throws Throwable {
		 List<List<String>> data = formData.raw();
		 incluirProposta.gratuidadeCrianca(data.get(0).get(1), data.get(1).get(1), data.get(2).get(1), data.get(3).get(1), data.get(4).get(1));
	}

	@Dado("^em Ocupação da Unidade Habitacional selecione$")
	public void em_Ocupação_da_Unidade_Habitacional_selecione(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		incluirProposta.ocupacaoUnidadeHabitacional(data.get(0).get(1));
	}

	@Dado("^clique para Salvar Unidade Habitacional$")
	public void clique_para_Salvar_Unidade_Habitacional() throws Throwable {
		incluirProposta.salvarUnidadeHabitacional();
	}

	@Então("^irá ser incluído o registro$")
	public void irá_ser_incluído_o_registro() throws Throwable {
		incluirProposta.mensagemSucesso();
	}

	@Dado("^que acesse o menu Tarifário$")
	public void que_acesse_o_menu_Tarifário() throws Throwable {
		incluirProposta.acessarTarifario();
	}

	@Dado("^clique em Nova Condição de Contrato$")
	public void clique_em_Nova_Condição_de_Contrato() throws Throwable {
		incluirProposta.novaCondicaoContrato();
	}

	@Dado("^clique no botão Nova Temporada$")
	public void clique_no_botão_Nova_Temporada() throws Throwable {
		incluirProposta.novaTemporada();
	}

	@Dado("^preencha os campos de Nova Temporada$")
	public void preencha_os_campos_de_Nova_Temporada(DataTable formData) throws Throwable {
	    List<List<String>> data = formData.raw();
	    incluirProposta.condicaoContrato(data.get(0).get(1), data.get(1).get(1), data.get(2).get(1), data.get(4).get(1), data.get(5).get(1));
	}

	@Quando("^clicar no botão de Adicionar$")
	public void clicar_no_botão_de_Adicionar() throws Throwable {
		incluirProposta.adicionarCondicaoContrato();
	}

	@Então("^irá ser incluído uma Condição de Contrato$")
	public void irá_ser_incluído_uma_Condição_de_Contrato() throws Throwable {
	}

	@Então("^selecione as opções$")
	public void selecione_as_opções(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		incluirProposta.adicionarOpcoesContrato(data.get(0).get(1), data.get(1).get(1), data.get(2).get(1), data.get(3).get(1), data.get(4).get(1), data.get(5).get(1));
	}

	@Então("^inserir os valores dos quartos$")
	public void inserir_os_valores_dos_quartos(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		incluirProposta.valoresQuartos(data.get(0).get(1),data.get(1).get(1),data.get(2).get(1),data.get(3).get(1));
	}

	@Quando("^clicar no botão Adicionar$")
	public void clicar_no_botão_Adicionar() throws Throwable {
		incluirProposta.adicionarTarifario();
	}

	@Então("^será incluído um novo Tarifário$")
	public void será_incluído_um_novo_Tarifário() throws Throwable {
		incluirProposta.mensagemSucesso();
	}

	@Dado("^que acesse o menu Bloqueio$")
	public void que_acesse_o_menu_Bloqueio() throws Throwable {
		incluirProposta.acessarBloqueio();
	}
	
	@Dado("^clique no botão Novo Bloqueio Devolução$")
	public void clique_no_botão_Novo_Bloqueio_Devolução() throws Throwable {
	    incluirProposta.novoBloqueioDevolucao();
	}

	@Dado("^clique no botão Novo Bloqueio pra inserir a quantidade de bloqueios e a vigência$")
	public void clique_no_botão_Novo_Bloqueio_pra_inserir_a_quantidade_de_bloqueios_e_a_vigência() throws Throwable {
	    incluirProposta.novoBloqueio();
	}

	@Dado("^preencha os campos de Bloqueio e Vigência$")
	public void preencha_os_campos_de_Bloqueio_e_Vigência(DataTable formData) throws Throwable {
	    List<List<String>> data = formData.raw();
	    incluirProposta.preencheCamposBloqueio(data.get(0).get(1),data.get(1).get(1),data.get(2).get(1));
	}
	
	@Dado("^clique no botão Adicionar Bloqueio$")
	public void clique_no_botão_Adicionar_Bloqueio() throws Throwable {
		incluirProposta.adicionarBloqueio();
	}

	@Dado("^clique no botão Salvar Bloqueio e Devolução$")
	public void clique_no_botão_Salvar_Bloqueio_e_Devolução() throws Throwable {
		incluirProposta.salvarBloqueioDevolucao();
	}

	@Então("^o Bloqueio será cadastrado$")
	public void o_Bloqueio_será_cadastrado() throws Throwable {
		incluirProposta.mensagemSucesso();
	}

	@Dado("^que acesse o menu Ativar Contrato$")
	public void que_acesse_o_menu_Ativar_Contrato() throws Throwable {
	    incluirProposta.acessarAtivarContrato();
	}
	
	@Dado("^marque as opções para Ativar o Contrato$")
	public void marque_as_opções_para_Ativar_o_Contrato() throws Throwable {
	    incluirProposta.marcarOpcoesAtivarContrato();
	}
	
	@Dado("^preencha o campo observação$")
	public void preencha_o_campo_observação(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		incluirProposta.preencherObservacaoAtivarContrato(data.get(0).get(1));
	}
	
	@Dado("^clique no botão Ativar Contrato$")
	public void clique_no_botão_Ativar_Contrato() throws Throwable {
	    incluirProposta.clicarAtivarContrato();
	}
	
	@Então("^o Contrato ficará Ativo$")
	public void o_Contrato_ficará_Ativo() throws Throwable {
	    
	}

}
