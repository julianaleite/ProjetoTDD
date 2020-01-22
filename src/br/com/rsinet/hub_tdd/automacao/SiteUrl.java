package br.com.rsinet.hub_tdd.automacao;

import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import br.com.rsinet.hub_tdd.actions.CadastraCliente;
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

	}

	@Test
	public void TesteInvalido() {
		CadastraCliente.InvalidoTest(driver);
	}

	@After
	public void finaliza() {
		driver.close();
	}

}
// Abre a pagina inicial da url.

/*
 * public static void main(String[] args) throws Exception {
 * ExcelUtils.setExcelFile(Constant.PathTestData + Constant.FileTestData,
 * "Planilha1"); driver = new ChromeDriver();
 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 * driver.get("https://www.advantageonlineshopping.com/");
 * driver.manage().window().maximize();
 * 
 * //Busca a Classe e o metodo para a execuçao do teste.
 * 
 * CadastraCliente.ValidoTest(driver); CadastraCliente.InvalidoTest(driver);
 * 
 * driver.close();
 * 
 * }
 */
