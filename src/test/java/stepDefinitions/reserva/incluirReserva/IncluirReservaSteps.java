package stepDefinitions.reserva.incluirReserva;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pageObjects.menu.MenuPage;
import pageObjects.reserva.incluirReserva.IncluirReservaPage;

public class IncluirReservaSteps {
	
	MenuPage menu = new MenuPage();
	IncluirReservaPage reserva = new IncluirReservaPage();

	@Dado("^que acesse o módulo de Reserva$")
	public void que_acesse_o_módulo_de_Reserva() throws Throwable {
		menu.acessarReserva();
	}

	@Dado("^acesse o menu Iniciar Reserva$")
	public void acesse_o_menu_Iniciar_Reserva() throws Throwable {
		menu.acessarIniciarReserva();
	}

	@Dado("^realize pesquisa pelo nome do Cliente$")
	public void realize_pesquisa_pelo_nome_do_Cliente(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		reserva.pesquisarCliente(data.get(0).get(1));
	}

	@Dado("^realize pesquisa pelo nome do Destino$")
	public void realize_pesquisa_pelo_nome_do_Destino(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		reserva.pesquisarDestino(data.get(0).get(1));
	}

	@Dado("^informe a data de Chegada e Saída$")
	public void informe_a_data_de_Chegada_e_Saída() throws Throwable {
		reserva.dataChegadaSaida();
	}

	@Dado("^selecione a quantidade de Quartos$")
	public void selecione_a_quantidade_de_Quartos(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		reserva.selecionarQtdQuarto(data.get(0).get(1));
	}

	@Dado("^clique em Pesquisar para realizar a busca de Hospedagem$")
	public void clique_em_Pesquisar_para_realizar_a_busca_de_Hospedagem() throws Throwable {
		reserva.pesquisar();
	}

	@Dado("^selecione a quantidade de diárias para usar$")
	public void selecione_a_quantidade_de_diárias_para_usar(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		reserva.selecionarQtdDiarias(data.get(0).get(1));
	}

	@Dado("^selecione a opção Ver Quartos do Meio de Hospedagem pesquisado$")
	public void selecione_a_opção_Ver_Quartos_do_Meio_de_Hospedagem_pesquisado() throws Throwable {
		reserva.verQuartos();
	}

	@Dado("^clique para confirmar as acomodações$")
	public void clique_para_confirmar_as_acomodações() throws Throwable {
		reserva.confirmarAcomodacao();
	}

	@Dado("^clique em Avançar$")
	public void clique_em_Avançar() throws Throwable {
		reserva.avancar();
	}

	@Então("^irá ser apresentado os detalhes da reserva e o botão para confirmar$")
	public void irá_ser_apresentado_os_detalhes_da_reserva_e_o_botão_para_confirmar() throws Throwable {
		reserva.hospedeResponsavel();
	}

	@Quando("^clicar para confirmar$")
	public void clicar_para_confirmar() throws Throwable {
		reserva.confirmar();
	}

	@Então("^a Reserva será confirmada$")
	public void a_Reserva_será_confirmada() throws Throwable {
		reserva.hospedeResponsavel();
	}

	
	
	
	
}
