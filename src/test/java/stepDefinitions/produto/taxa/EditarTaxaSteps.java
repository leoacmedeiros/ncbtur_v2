package stepDefinitions.produto.taxa;

import java.util.List;

import core.BasePage;
import cucumber.api.DataTable;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pageObjects.produto.taxa.EditarTaxaPage;
import pageObjects.produto.taxa.FiltrarTaxaPage;
import pageObjects.produto.taxa.ListarTaxaPage;

public class EditarTaxaSteps extends BasePage {

	ListarTaxaPage listarTaxa = new ListarTaxaPage();
	FiltrarTaxaPage filtrarTaxa = new FiltrarTaxaPage();
	EditarTaxaPage editarTaxa = new EditarTaxaPage();

	@Quando("^buscar pela Taxa$")
	public void buscar_pela_Taxa(DataTable formData) throws Throwable {
		listarTaxa.filtrarTaxa();
		List<List<String>> data = formData.raw();
		filtrarTaxa.setCodigo(data.get(0).get(1));
		filtrarTaxa.setNome(data.get(1).get(1));
		filtrarTaxa.setTipo(data.get(2).get(1));
		filtrarTaxa.setSituacao(data.get(3).get(1));
		filtrarTaxa.buscar();
		
	}

	@Quando("^editar a Taxa desejada$")
	public void editar_a_Taxa_desejada(DataTable formData) throws Throwable {
		listarTaxa.editarTaxa();
		List<List<String>> data = formData.raw();
		editarTaxa.setTipo(data.get(0).get(1));
		editarTaxa.setNome(data.get(1).get(1));
		editarTaxa.setPermiteComissao(data.get(2).get(1));
		editarTaxa.setDescCampanha(data.get(3).get(1));
		editarTaxa.setDescConvenio(data.get(4).get(1));
		editarTaxa.setDescricao(data.get(5).get(1));
		editarTaxa.setSituacao(data.get(6).get(1));
	}
	
}
