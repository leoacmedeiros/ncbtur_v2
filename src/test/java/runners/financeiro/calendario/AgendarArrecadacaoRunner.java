package runners.financeiro.calendario;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty"
				,"html:target/report-html/financeiro/calendario/AgendarArrecadacao"
				}
		,features = "src/test/resources/features/financeiro/calendarioArrecadacao/AgendarArrecadacao.feature"
		,glue = {"stepDefinitions"}
		,monochrome = true
//		,dryRun = true
		,dryRun = false
		)

public class AgendarArrecadacaoRunner {

}
