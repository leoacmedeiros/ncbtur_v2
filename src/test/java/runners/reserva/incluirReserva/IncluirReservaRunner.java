package runners.reserva.incluirReserva;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty"
				,"html:target/report-html/reserva/incluirReserva"
				}
		,features = "src/test/resources/features/reserva/incluirReserva/IncluirReserva.feature"
		,glue = {"stepDefinitions"}
		,monochrome = true
//		,dryRun = true
		,dryRun = false
		)

public class IncluirReservaRunner {

}
