package br.com.rsinet.hub_tdd.automacao;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import br.com.rsinet.hub_tdd.actions.TestMassaTelaPrincipal;
import br.com.rsinet.hub_tdd.utility.screenshot;

public class RodaTestTelaPrincipal {

	public static WebDriver driver;

	@Before
	public void AbreURL() {
		driver = new ChromeDriver();
		driver.get("https://www.advantageonlineshopping.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@Test
	public void RodaTestValido() throws InterruptedException, IOException {
		TestMassaTelaPrincipal.elementtext(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 1000);");
		screenshot.ScreenShotCaptureTela(driver);
		System.out.println("O Resultado é :PRODUCT SPECIFICATIONS");
		Assert.assertTrue(driver.getPageSource().contains("PRODUCT SPECIFICATIONS"));

	}

	@Test
	public void RodaTestInvalido() throws InterruptedException, IOException {
		TestMassaTelaPrincipal.TestInvalidoPgInicial(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 1000);");
		screenshot.ScreenShotCaptureTela(driver);

		System.out.println("O Resultado é :HP PRO TABLET 608 G1");
		Assert.assertTrue(driver.getPageSource().contains("HP PRO TABLET 608 G1"));

	}

	@After
	public void finaldoTest() {

		driver.close();

	}

}
