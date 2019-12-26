package runners.meiosHospedagem.rede;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty"
				,"html:target/report-html/meiosHospedagem/rede/IncluirRede"
				}
		,features = "src/test/resources/features/meiosHospedagem/rede/IncluirRede.feature"
		,glue = {"stepDefinitions"}
		,monochrome = true
//		,dryRun = true
		,dryRun = false
		)
public class IncluirRedeRunner {

}
