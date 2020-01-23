package br.com.rsinet.hub_tdd.automacao;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import br.com.rsinet.hub_tdd.actions.PaginaInicialPesquisa;

public class RotateTest {

	public static WebDriver driver;

	@Before
	public void RodaPrimeiroTest() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.advantageonlineshopping.com");
		driver.manage().window().maximize();

	}

	@Test
	public void MetodoTest() throws Exception {
		PaginaInicialPesquisa.Elementos(driver);
		System.out.println("O Resulta é: HP PAVILION X360 - 11T TOUCH LAPTOP");
		Thread.sleep(5000);
		Assert.assertTrue(driver.getPageSource().contains("HP PAVILION X360 - 11T TOUCH LAPTOP"));
	}

	@Test
	public void OutroMetodoTest() throws InterruptedException {
		PaginaInicialPesquisa.TestePesquisaInvalida(driver);

		System.out.println(" O Resultado é : Produto nao Existe");
		Thread.sleep(5000);

		Assert.assertTrue(driver.getPageSource().contains("No results for \"Juliana\""));
	}

//	}

	@After
	public void FimTeste() {

		driver.close();
	}
}
