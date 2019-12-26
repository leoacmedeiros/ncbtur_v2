package runners.cliente.propostaAdesao;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty"
				,"html:target/report-html/cliente/propostaAdesao/AprovarPropostaAdesao"
				}
		,features = "src/test/resources/features/cliente/propostaAdesao/AprovarPropostaAdesao.feature"
		,glue = {"stepDefinitions"}
		,monochrome = true
//		,dryRun = true
		,dryRun = false
		)

public class AprovarPropostaAdesaoRunner {

}
