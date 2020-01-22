package br.com.rsinet.hub_tdd.automacao;

import java.util.concurrent.TimeUnit;

import org.junit.After;
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
	public void RodaTestValido() {
		TestMassaTelaPrincipal.elementtext(driver);
	}

	@Test
	public void RodaTestInvalido() {
		TestMassaTelaPrincipal.TestInvalidoPgInicial(driver);
	}

	@After
	public void finaldoTest() {
//	driver.close();
	}

}
