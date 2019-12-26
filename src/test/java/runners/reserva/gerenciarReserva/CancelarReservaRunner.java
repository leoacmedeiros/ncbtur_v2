package runners.reserva.gerenciarReserva;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty"
				,"html:target/report-html/reserva/gerenciarReserva/cancelarReserva"
				}
		,features = "src/test/resources/features/reserva/gerenciarReserva/CancelarReserva.feature"
		,glue = {"stepDefinitions"}
		,monochrome = true
//		,dryRun = true
		,dryRun = false
		)

public class CancelarReservaRunner {

}
