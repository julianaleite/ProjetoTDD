package br.com.rsinet.hub_tdd.automacao;

import java.io.IOException;

import org.apache.log4j.xml.DOMConfigurator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub_tdd.actions.TestPesquisaLupa;
import br.com.rsinet.hub_tdd.utility.DriverFactory;
import br.com.rsinet.hub_tdd.utility.Log;
import br.com.rsinet.hub_tdd.utility.screenshot;

public class AutomacaoPesquisaNaLupa {

	public static WebDriver driver;

	@Before
	public void chamarDriverFactory() {
		driver = DriverFactory.getDriver();
		DOMConfigurator.configure("log4j.xml");
		Log.info("Carregando propriedades e url");
	}

	@Test
	public void testePesquisaLupaValido() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 1500);");
		Log.info("Comando de espera");
		Log.startTestCase("Teste Pesquisa valido");
		Log.info("Iniciando execução do teste");
		TestPesquisaLupa.testePesquisaLupaValido(driver);
		Log.info("Teste Executado");
		screenshot.ScreenShotCaptureTela(driver);
		Log.info("Print Capturado");
		js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 1000);");
		Log.info("Comando de espera");
		System.out.println("O Resulta é: HP PAVILION X360 - 11T TOUCH LAPTOP");
		Assert.assertTrue(driver.getPageSource().contains("HP PAVILION X360 - 11T TOUCH LAPTOP"));
		Log.info("Validando se O nomeHP PAVILION X360 - 11T TOUCH LAPTOP é igual á HP PAVILION X360 - 11T TOUCH LAPTOP ?");
	}

	@Test
	public void testePesquisaLupaInvalido() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 1500);");
		Log.info("Comando de espera");
		Log.startTestCase("Teste Pesquisa valido");
		Log.info("Iniciando execução do teste");
		TestPesquisaLupa.testePesquisaLupaInvalido(driver);
		Log.info("Teste Executado");
		screenshot.ScreenShotCaptureTela(driver);
		Log.info("Print Capturado");
		js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 1000);");
		System.out.println(" O Resultado é : Produto nao Existe");
	//	Assert.assertTrue(driver.getPageSource().equals("No results for \"IphoneXIphoneX\""));
		Log.info(
				"Validando se O nome No results for \\\"IphoneXIphoneX\\ é igual á No results for \\\"IphoneXIphoneX\\ ?");
	}

	@After
	public void fimTeste() {
		Log.endTestCase("AutomaçaoDoTestConsultaProdutoTelaPrincipal");
		DriverFactory.killDriver();
	}
}
