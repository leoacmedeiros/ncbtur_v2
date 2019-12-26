package suite.meiosHospedagem.tipoMeiosHospedagem;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import core.BasePage;
import core.DriverFactory;
import pageObjects.login.LoginPage;
import runners.login.LoginRunner;
import runners.meiosHospedagem.tipoMeiosHospedagem.AtivarInativarTipoMeiosHospedagemRunner;
import runners.meiosHospedagem.tipoMeiosHospedagem.EditarTipoMeiosHospedagemRunner;
import runners.meiosHospedagem.tipoMeiosHospedagem.ExcluirTipoMeiosHospedagemRunner;
import runners.meiosHospedagem.tipoMeiosHospedagem.IncluirTipoMeiosHospedagemRunner;
import runners.meiosHospedagem.tipoMeiosHospedagem.VisualizarTipoMeiosHospedagemRunner;

@RunWith(Suite.class)
@SuiteClasses({
	
	LoginRunner.class,
	IncluirTipoMeiosHospedagemRunner.class,
	VisualizarTipoMeiosHospedagemRunner.class,
	EditarTipoMeiosHospedagemRunner.class,
	AtivarInativarTipoMeiosHospedagemRunner.class,
	ExcluirTipoMeiosHospedagemRunner.class
	
})


public class SuiteTestTipoMeiosHospedagem extends BasePage{

	
//	@BeforeClass
//	public static void login() {
//		DriverFactory.getDriver().get("http://ncbtur-tst.bancorbras.com.br");
//		
//	}
//	
//	@AfterClass
//	public static void fecharNavegador() {
//		fecharBrowser();
//	}
//	
	
}
