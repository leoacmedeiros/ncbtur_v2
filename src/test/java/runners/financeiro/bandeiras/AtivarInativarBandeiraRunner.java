package runners.financeiro.bandeiras;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty"
				,"html:target/report-html/financeiro/bandeiras/AtivarInativarBandeira"
				}
		,features = "src/test/resources/features/financeiro/bandeiras/AtivarInativarBandeira.feature"
		,glue = {"stepDefinitions"}
		,monochrome = true
//		,dryRun = true
		,dryRun = false
		)
public class AtivarInativarBandeiraRunner {

}
