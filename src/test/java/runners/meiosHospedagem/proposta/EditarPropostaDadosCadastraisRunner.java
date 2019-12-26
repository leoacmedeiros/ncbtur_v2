package runners.meiosHospedagem.proposta;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty"
				,"html:target/report-html/meiosHospedagem/novoConvenioProposta/editarPropostaDadosCadastrais"
				}
		,features = "src/test/resources/features/meiosHospedagem/novoConvenioProposta/EditarPropostaDadosCadastrais.feature"
		,glue = {"stepDefinitions"}
		,monochrome = true
//		,dryRun = true
		,dryRun = false
		)
public class EditarPropostaDadosCadastraisRunner {

}
