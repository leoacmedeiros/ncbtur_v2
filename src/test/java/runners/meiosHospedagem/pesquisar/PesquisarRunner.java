package runners.meiosHospedagem.pesquisar;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty"
				,"html:target/report-html/meiosHospedagem/pesquisar/PesquisarMeiosHospedagem"
				}
		,features = "src/test/resources/features/meiosHospedagem/pesquisar/Pesquisar.feature"
		,glue = {"stepDefinitions"}
		,monochrome = true
//		,dryRun = true
		,dryRun = false
		)
public class PesquisarRunner {

}
