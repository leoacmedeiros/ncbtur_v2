package runners.financeiro.gerenciarOperadoraCartoes;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty"
				,"html:target/report-html/financeiro/gerenciarOperadoraCartoes/IncluirOperadoraCartoes"
				}
		,features = "src/test/resources/features/financeiro/gerenciarOperadoraCartoes/IncluirOperadoraCartoes.feature"
		,glue = {"stepDefinitions"}
		,monochrome = true
//		,dryRun = true
		,dryRun = false
		)

public class IncluirOperadoraCartoesRunner {

}
