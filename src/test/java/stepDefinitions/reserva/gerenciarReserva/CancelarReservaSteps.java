package stepDefinitions.reserva.gerenciarReserva;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pageObjects.menu.MenuPage;
import pageObjects.reserva.gerenciarReserva.CancelarReservaPage;


public class CancelarReservaSteps {
	
	MenuPage menu = new MenuPage();
	CancelarReservaPage cancelar = new CancelarReservaPage();
	
	
	@Dado("^acesse o menu Gerenciar Reservas$")
	public void acesse_o_menu_Gerenciar_Reservas() throws Throwable {
	    menu.acessarGerenciarReservas();
	}

	@Dado("^na tela de Reservas realize a pesquisa pelo nome do Cliente$")
	public void na_tela_de_Reservas_realize_a_pesquisa_pelo_nome_do_Cliente(DataTable formData) throws Throwable {
	    List<List<String>> data = formData.raw();
	    cancelar.pesquisarCliente(data.get(0).get(1));
	}

	@Dado("^clique no botão Gerenciar de uma Reserva que esteja com a situação Confirmada$")
	public void clique_no_botão_Gerenciar_de_uma_Reserva_que_esteja_com_a_situação_Confirmada() throws Throwable {
	    cancelar.gerenciarReservaConfirmada();
	}

	@Dado("^clique na opção Cancelar$")
	public void clique_na_opção_Cancelar() throws Throwable {
	    cancelar.cancelar();
	}

	@Quando("^confirmar o cancelamento da Reserva$")
	public void confirmar_o_cancelamento_da_Reserva() throws Throwable {
	    cancelar.cancelarReserva();
	}

	@Então("^a Reserva será cancelada$")
	public void a_Reserva_será_cancelada() throws Throwable {
	    
	}


}
