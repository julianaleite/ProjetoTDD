package br.com.rsinet.hub_tdd.automacao;

import java.io.IOException;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub_tdd.actions.PaginaInicialPesquisa;
import br.com.rsinet.hub_tdd.utility.DriverFactory;
import br.com.rsinet.hub_tdd.utility.screenshot;

public class RotateTest {

	public static WebDriver driver;

	@Before
	public void RodaPrimeiroTest() {
		driver = DriverFactory.getDriver();
	}

	@Test
	public void MetodoTest() throws Exception {
		PaginaInicialPesquisa.Elementos(driver);
		screenshot.ScreenShotCaptureTela(driver);
		PaginaInicialPesquisa.TiraPrintElementos(driver);
		screenshot.ScreenShotCaptureTela(driver);

		System.out.println("O Resulta é: HP PAVILION X360 - 11T TOUCH LAPTOP");
		Thread.sleep(5000);
		Assert.assertTrue(driver.getPageSource().contains("HP PAVILION X360 - 11T TOUCH LAPTOP"));
	}

	@Test
	public void OutroMetodoTest() throws InterruptedException, IOException {
		PaginaInicialPesquisa.TestePesquisaInvalida(driver);
		screenshot.ScreenShotCaptureTela(driver);
		PaginaInicialPesquisa.TirarPrintTestePesquisa(driver);

		System.out.println(" O Resultado é : Produto nao Existe");
		Thread.sleep(5000);

		Assert.assertTrue(driver.getPageSource().contains("No results for \"IphoneXIphoneX\""));
	}

//	}

	@After
	public void FimTeste() {
		DriverFactory.killDriver();
	}
}
