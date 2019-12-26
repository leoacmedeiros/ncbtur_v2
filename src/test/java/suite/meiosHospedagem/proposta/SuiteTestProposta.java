package suite.meiosHospedagem.proposta;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import core.BasePage;
import runners.login.LoginRunner;
import runners.meiosHospedagem.proposta.IncluirPropostaAprovarReservaRunner;


@RunWith(Suite.class)
@SuiteClasses({
	LoginRunner.class,
	IncluirPropostaAprovarReservaRunner.class
})

public class SuiteTestProposta extends BasePage{
	
//	@AfterClass
//	public static void fecharNavegador() {
//		fecharBrowser();
//	}

}
