package br.com.rsinet.hub_tdd.automacao;

import java.io.IOException;

import org.apache.log4j.xml.DOMConfigurator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import br.com.rsinet.hub_tdd.actions.ConsultarProdutoTelaPrincipal;
import br.com.rsinet.hub_tdd.utility.DriverFactory;
import br.com.rsinet.hub_tdd.utility.screenshot;
import br.com.rsinet.hub_tdd.utility.Log;

public class AutomaçaoDoTestConsultaProdutoTelaPrincipal {

	public static WebDriver driver;

	@Before
	public void abrirURLSiteAdvantageon() {	
		driver = DriverFactory.getDriver();
		DOMConfigurator.configure("log4j.xml");
		Log.info("Carregando propriedades e url");
	
	}

	@Test
	public void rodarTesteTelaPrincipalValido() throws InterruptedException, IOException {
		Log.startTestCase("Teste tela Principal valido");
		Log.info("Iniciando execução do teste");
		ConsultarProdutoTelaPrincipal.produtoEscolhidoMouseValido(driver);
		Log.info("Executado");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 1000);");
		screenshot.ScreenShotCaptureTela(driver);
		Log.info("ScreenShot capturado");
		System.out.println("O Resultado é :PRODUCT SPECIFICATIONS");
		Assert.assertTrue(driver.getPageSource().contains("PRODUCT SPECIFICATIONS"));
		Log.info("O nome PRODUCT SPECIFICATIONS é igual á PRODUCT SPECIFICATIONS ?");

	}

	@Test
	public void rodarTesteTelaInvalido() throws InterruptedException, IOException {
		Log.startTestCase("Teste tela Principal InValido");
		Log.info("Iniciando execução do teste");
		ConsultarProdutoTelaPrincipal.produtoEscolhidoInvalido(driver);
		Log.info("Teste Executado");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 1000);");
		screenshot.ScreenShotCaptureTela(driver);
		Log.info("ScreenShot Capiturado");
		System.out.println("O Resultado é :HP PRO TABLET 608 G1");
		Assert.assertTrue(driver.getPageSource().contains("HP PRO TABLET 608 G1"));
		Log.info("Comparaçao se HP PRO TABLET 608 G1 é igual a HP PRO TABLET 608 G1");
	}

	@After
	public void finalDoTest() {
		Log.endTestCase("AutomaçaoDoTestConsultaProdutoTelaPrincipal");
		DriverFactory.killDriver();

	}

}
