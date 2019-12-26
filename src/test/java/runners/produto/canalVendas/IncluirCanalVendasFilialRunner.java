package runners.produto.canalVendas;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty"
				,"html:target/report-html/produto/canalVendas/incluirCanalVendasFilial"
				}
		,features = "src/test/resources/features/produto/canalVendas/IncluirCanalVendasFilial.feature"
		,glue = {"stepDefinitions"}
		,monochrome = true
//		,dryRun = true
		,dryRun = false
		)
public class IncluirCanalVendasFilialRunner {

}
