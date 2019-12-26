package suite.cliente;

import org.junit.jupiter.api.AfterAll;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import core.DriverFactory;
import runners.cliente.propostaAdesao.AprovarPropostaAdesaoRunner;
import runners.cliente.propostaAdesao.IncluirPropostaAdesaoPessoaFisicaRunner;
import runners.cliente.propostaAdesao.IncluirPropostaAdesaoPessoaJuridicaRunner;
import runners.login.LoginRunner;

@RunWith(Suite.class)
@SuiteClasses({
	LoginRunner.class,
	IncluirPropostaAdesaoPessoaFisicaRunner.class,
	IncluirPropostaAdesaoPessoaJuridicaRunner.class,
	AprovarPropostaAdesaoRunner.class,
})

public class SuiteTestCliente {
	
	@AfterAll
	public void sair() {
		DriverFactory.getDriver().quit();
	}

}
