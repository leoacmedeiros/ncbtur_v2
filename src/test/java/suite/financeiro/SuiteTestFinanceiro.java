package suite.financeiro;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import runners.financeiro.calendario.AgendarArrecadacaoRunner;
import runners.financeiro.gerenciarOperadoraCartoes.IncluirOperadoraCartoesRunner;
import runners.login.LoginRunner;

@RunWith(Suite.class)
@SuiteClasses({
	LoginRunner.class,
	AgendarArrecadacaoRunner.class,
	IncluirOperadoraCartoesRunner.class
})

public class SuiteTestFinanceiro {

}
