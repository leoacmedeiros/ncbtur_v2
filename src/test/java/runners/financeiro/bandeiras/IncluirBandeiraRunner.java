package runners.financeiro.bandeiras;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty"
				,"html:target/report-html/financeiro/bandeiras/IncluirBandeira"
				}
		,features = "src/test/resources/features/financeiro/bandeiras/IncluirBandeira.feature"
		,glue = {"stepDefinitions"}
		,monochrome = true
//		,dryRun = true
		,dryRun = false
		)
public class IncluirBandeiraRunner {

}
