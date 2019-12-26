package runners.contabil.demonstrativo;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty"
				,"html:target/report-html/cliente/propostaAdesao/ListarFatos"
				}
		,features = "src/test/resources/features/contabil/demonstrativos/ListarFatos.feature"
		,glue = {"stepDefinitions"}
		,monochrome = true
//		,dryRun = true
		,dryRun = false
		)

public class ListarFatoRunner {

}
