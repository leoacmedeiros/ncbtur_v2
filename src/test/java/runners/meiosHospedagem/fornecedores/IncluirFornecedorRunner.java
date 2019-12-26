package runners.meiosHospedagem.fornecedores;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty"
				,"html:target/report-html/meiosHospedagem/fornecedores/IncluirFornecedor"
				}
		,features = "src/test/resources/features/meiosHospedagem/fornecedores/IncluirFornecedor.feature"
		,glue = {"stepDefinitions"}
		,monochrome = true
//		,dryRun = true
		,dryRun = false
		)
public class IncluirFornecedorRunner {

}
