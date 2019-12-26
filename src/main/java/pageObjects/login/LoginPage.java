package pageObjects.login;

import org.openqa.selenium.By;

import core.BasePage;
import core.DriverFactory;

public class LoginPage extends BasePage {
	
	private static String EXTERNO = "http://cbtur-hml.bancorbras.com.br/";
	private static String TST = "http://ncbtur-tst.bancorbras.com.br/";
	private static String DEV = "http://ncbtur-dev.bancorbras.com.br";
	private static String HML = "http://ncbtur-hml.bancorbras.com.br";
	
	
	public void acessarCBTUR() {
		DriverFactory.getDriver().get(DEV);
	}

	public void setUsuario(String usuario) {
		escrever("UserName", usuario);
	}

	public void setSenha(String senha) {
		escrever("Password", senha);
	}

	public void entrar() {
		clicarBotao(By.xpath("//input[@class='btn btn-lg btn-primary btn-block']"));
		sleep(5);
	}
	
	public boolean verificaPaginaInicial() {
		String cabecalho = obterTexto(By.xpath("//img[@class='logo-default']"));
		return cabecalho.contains("logo");
	}

	public void telaInicial() {
		try {
			sleep(3);
			obterHome("Home", "//button[contains(text(),'Home')]");
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public void logar(String usuario, String senha) {
		sleep(5);
		setUsuario(usuario);
		setSenha(senha);
		entrar();
	}

	public void logarUsuarioGeral() {
		acessarCBTUR();
		logar("002.747.501-80", "0000");
		sleep(10);
	}

}