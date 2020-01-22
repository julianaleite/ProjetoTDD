package br.com.rsinet.hub_tdd.automacao;

import java.util.concurrent.TimeUnit;

import org.junit.After;
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
}
@Test
public void OutroMetodoTest() {
	PaginaInicialPesquisa.TestePesquisaInvalida(driver);
	
}
@After
public void FimTeste() {
//	driver.close();
}
}


