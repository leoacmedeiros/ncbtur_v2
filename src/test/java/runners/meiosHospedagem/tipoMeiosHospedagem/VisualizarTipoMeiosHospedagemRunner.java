package runners.meiosHospedagem.tipoMeiosHospedagem;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty"
				,"html:target/report-html/meiosHospedagem/tipoMeiosHospedagem/visualizarTipoMeiosHospedagem"
				}
		,features = "src/test/resources/features/meiosHospedagem/tipoMeiosHospedagem/VisualizarTipoMeiosHospedagem.feature"
		,glue = {"stepDefinitions"}
		,monochrome = true
//		,dryRun = true
		,dryRun = false
		)
public class VisualizarTipoMeiosHospedagemRunner {

}
