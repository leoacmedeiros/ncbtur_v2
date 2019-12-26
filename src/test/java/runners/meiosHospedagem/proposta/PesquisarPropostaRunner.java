package runners.meiosHospedagem.proposta;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty"
				,"html:target/report-html/meiosHospedagem/novoConvenioProposta/pesquisarProposta"
				}
		,features = "src/test/resources/features/meiosHospedagem/novoConvenioProposta/PesquisarProposta.feature"
		,glue = {"stepDefinitions"}
		,monochrome = true
//		,dryRun = true
		,dryRun = false
		)
public class PesquisarPropostaRunner {

}
