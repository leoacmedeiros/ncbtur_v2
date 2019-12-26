package runners.produto.canalVendas;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty"
				,"html:target/report-html/produto/canalVendas/incluirCanalVendasMatriz"
				}
		,features = "src/test/resources/features/produto/canalVendas/IncluirCanalVendasMatriz.feature"
		,glue = {"stepDefinitions"}
		,monochrome = true
//		,dryRun = true
		,dryRun = false
		)
public class IncluirCanalVendasMatrizRunner {

}
