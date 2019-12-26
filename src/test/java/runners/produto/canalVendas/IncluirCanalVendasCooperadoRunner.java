package runners.produto.canalVendas;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty"
				,"html:target/report-html/produto/canalVendas/IncluirCanalVendasCooperado"
				}
		,features = "src/test/resources/features/produto/canalVendas/IncluirCanalVendasCooperado.feature"
		,glue = {"stepDefinitions"}
		,monochrome = true
//		,dryRun = true
		,dryRun = false
		)
public class IncluirCanalVendasCooperadoRunner {

}
