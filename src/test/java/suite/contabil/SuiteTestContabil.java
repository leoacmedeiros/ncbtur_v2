package suite.contabil;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import runners.contabil.demonstrativo.ListarFatoRunner;
import runners.login.LoginRunner;

@RunWith(Suite.class)
@SuiteClasses({
	LoginRunner.class,
	ListarFatoRunner.class
})

public class SuiteTestContabil {

}
