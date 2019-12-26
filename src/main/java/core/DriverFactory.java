package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DriverFactory {
	private static WebDriver driver;

	private DriverFactory() {
	}

	public static WebDriver getDriver() {
		if (driver == null) {
			switch (Propriedades.browser) {
			case CHROME:
				String extensao = "";
				if (System.getProperty("os.name").startsWith("Win")) {
					extensao = ".exe";
				}
				System.setProperty("webdriver.chrome.driver", "drivers/chromedriver" + extensao);
				//driver = new ChromeDriver();
				
				//Abrir Chrome Navegação Anônima
				 DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			        ChromeOptions options = new ChromeOptions();
			        options.addArguments("incognito");
			        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
			        driver = new ChromeDriver(capabilities);
			       
			        driver.manage().window().maximize();
				
				break;
			case FIREFOX:
				driver = new FirefoxDriver();
				break;

			}
		}
		return driver;
	}
	
//	public static WebDriver getDriver() {
//		if (driver == null) {
//			String[] cli_args = new String[]{ "--ignore-ssl-errors=true" };
//			DesiredCapabilities DesireCaps = new DesiredCapabilities();
//			DesireCaps.setCapability(PhantomJSDriverService.PHANTOMJS_CLI_ARGS, cli_args );
//			DesireCaps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, "C:\\PhantomJs\\bin\\phantomjs.exe");
//			driver = new PhantomJSDriver(DesireCaps);
//		}
//		return driver;
//	}

	public static void killDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}
}
