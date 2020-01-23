package br.com.rsinet.hub_tdd.automacao;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import br.com.rsinet.hub_tdd.actions.TestMassaTelaPrincipal;

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
	public void RodaTestValido() throws InterruptedException {
		TestMassaTelaPrincipal.elementtext(driver);
		System.out.println("O Resultado é :PRODUCT SPECIFICATIONS");
		Thread.sleep(5000);
		Assert.assertTrue(driver.getPageSource().contains("PRODUCT SPECIFICATIONS"));

	}

	@Test
	public void RodaTestInvalido() throws InterruptedException {
		TestMassaTelaPrincipal.TestInvalidoPgInicial(driver);
		System.out.println("O Resultado é :HP PRO TABLET 608 G1");
		Thread.sleep(5000);
		Assert.assertTrue(driver.getPageSource().contains("HP PRO TABLET 608 G1"));
	}

	@After
	public void finaldoTest() {

		driver.close();

	}

}
