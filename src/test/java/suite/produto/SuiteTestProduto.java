package suite.produto;

import org.junit.jupiter.api.AfterAll;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import core.DriverFactory;
import runners.login.LoginRunner;
import runners.produto.campanha.IncluirCampanhaRunner;
import runners.produto.canalVendas.IncluirCanalVendasMatrizRunner;
import runners.produto.gerenciarProdutos.IncluirProdutoRunner;
import runners.produto.listaDePreco.IncluirListaPrecoRunner;
import runners.produto.taxa.IncluirTaxaRunner;

@RunWith(Suite.class)
@SuiteClasses({
	LoginRunner.class,
	IncluirTaxaRunner.class,
	IncluirProdutoRunner.class,
	IncluirListaPrecoRunner.class,
	IncluirCanalVendasMatrizRunner.class,
	IncluirCampanhaRunner.class
})

public class SuiteTestProduto {

	@AfterAll
	public void sair() {
		DriverFactory.getDriver().quit();
	}
	
}
