package suite.reserva.incluirReserva;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import core.BasePage;
import runners.login.LoginRunner;
import runners.reserva.incluirReserva.IncluirReservaRunner;
import runners.reserva.incluirReserva.PesquisarDetalharRunner;

@RunWith(Suite.class)
@SuiteClasses({
	LoginRunner.class,
	IncluirReservaRunner.class,
	PesquisarDetalharRunner.class
})

public class SuiteTestReserva extends BasePage{
	
//	@AfterClass
//	public static void fecharNavegador() {
//		fecharBrowser();
//	}
	

}
