package br.com.rsinet.hub_tdd.automacao;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

//import java.util.concurrent.TimeUnit;

//import org.apache.log4j.xml.DOMConfigurator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import br.com.rsinet.hub_tdd.actions.CadastraCliente;
//import br.com.rsinet.hub_tdd.pageObjects.RegistraNome;
import br.com.rsinet.hub_tdd.utility.Constant;
import br.com.rsinet.hub_tdd.utility.ExcelUtils;
import br.com.rsinet.hub_tdd.utility.screenshot;

public class SiteUrl {

	public static WebDriver driver;

	@Before
	public void InicioTest() throws Exception {

		ExcelUtils.setExcelFile(Constant.PathTestData + Constant.FileTestData, "Planilha1");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.advantageonlineshopping.com");
		driver.manage().window().maximize();

	}

	@Test
	public void TesteValido() throws Exception {
		// DOMConfigurator.configure("log4j.xml");
//		Log.info("Iniciando o Teste!!!");
		CadastraCliente.ValidoTest(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 1000);");
		screenshot.ScreenShotCaptureTela(driver);
		System.out.println("Resultado : PERSONAL DETAILS");
		Assert.assertTrue(driver.getPageSource().contains("PERSONAL DETAILS"));

	}

	@Test
	public void TesteInvalido() throws InterruptedException, IOException {
		CadastraCliente.InvalidoTest(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 1000);");
		screenshot.ScreenShotCaptureTela(driver);
		System.out.println("Resultado: User name already exists");
		Assert.assertTrue(driver.getPageSource().contains("User name already exists"));

	}

	@After
	public void finaliza() throws InterruptedException, IOException {
	//	screenshot.ScreenShotCaptureTela(driver);
		driver.close();
	}

}
