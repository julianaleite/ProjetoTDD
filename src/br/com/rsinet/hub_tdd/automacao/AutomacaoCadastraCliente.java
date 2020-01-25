package br.com.rsinet.hub_tdd.automacao;

import java.io.IOException;

import org.apache.log4j.xml.DOMConfigurator;

import org.junit.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import br.com.rsinet.hub_tdd.actions.CadastrarClienteAcaoComandos;
import br.com.rsinet.hub_tdd.utility.Constant;
import br.com.rsinet.hub_tdd.utility.DriverFactory;
import br.com.rsinet.hub_tdd.utility.ExcelUtils;
import br.com.rsinet.hub_tdd.utility.Log;
import br.com.rsinet.hub_tdd.utility.screenshot;

public class AutomacaoCadastraCliente {

	public static WebDriver driver;

	@Before
	public void inicioTest() throws Exception {
		ExcelUtils.setExcelFile(Constant.PathTestData + Constant.FileTestData, "Planilha1");
		driver = DriverFactory.getDriver();
		DOMConfigurator.configure("log4j.xml");
		Log.info("Carregando propriedades e url");

	}

	@Test
	public void testeValido() throws Exception {
		DOMConfigurator.configure("log4j.xml");
		Log.startTestCase("Teste Cadastro valido");
		Log.info("Iniciando o Teste!!!");
		CadastrarClienteAcaoComandos.testeMassaValido(driver);
		Log.info("teste executado");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 1000);");
		Log.info("Comando de espera");
		screenshot.ScreenShotCaptureTela(driver);
		Log.info("Print capturado");
		System.out.println("Resultado : PERSONAL DETAILS");
		Log.info("Mostrar na tela se o resultado comprado for igual a Personal Details");
		Assert.assertTrue(driver.getPageSource().contains("PERSONAL DETAILS"));
		Log.info("Verficando de um nome é igual a ele mesmo");

	}

	@Test
	public void testeInvalido() throws IOException {
		DOMConfigurator.configure("log4j.xml");
		Log.startTestCase("Teste Cadastro Invalido");
		Log.info("Iniciando o Teste!!!");
		CadastrarClienteAcaoComandos.testeMassaInvalido(driver);
		Log.info("Teste executado");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 1000);");
		Log.info("Comando de espera");
		screenshot.ScreenShotCaptureTela(driver);
		Log.info("print capturado");
		System.out.println("Resultado: User name already exists");
		Log.info(" Mostrar na tela User name already exists, se o resultado for igual a ele mesmo");
		Assert.assertTrue(driver.getPageSource().contains("User name already exists"));
		Log.info("Comparando se um nome é igual a ele mesmo");

	}

	@After
	public void finalizarTesteMassa() throws InterruptedException, IOException {

		screenshot.ScreenShotCaptureTela(driver);
		Log.info("Tela final capturada");
		DriverFactory.killDriver();
		Log.endTestCase("AutomacaoCadastraCliente");

	}

}
