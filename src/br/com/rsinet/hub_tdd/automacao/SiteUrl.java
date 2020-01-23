package br.com.rsinet.hub_tdd.automacao;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import br.com.rsinet.hub_tdd.actions.CadastraCliente;
//import br.com.rsinet.hub_tdd.pageObjects.RegistraNome;
import br.com.rsinet.hub_tdd.utility.Constant;
import br.com.rsinet.hub_tdd.utility.ExcelUtils;

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
		CadastraCliente.ValidoTest(driver);
		System.out.println("Resultado : PERSONAL DETAILS");
		Thread.sleep(5000);
		Assert.assertTrue(driver.getPageSource().contains("PERSONAL DETAILS"));

	}

	@Test
	public void TesteInvalido() throws InterruptedException {
		CadastraCliente.InvalidoTest(driver);
		System.out.println("Resultado: User name already exists");
		Thread.sleep(5000);
		Assert.assertTrue(driver.getPageSource().contains("User name already exists"));

	}

	@After
	public void finaliza() throws InterruptedException {

		driver.close();
	}

}
