package br.com.rsinet.hub_tdd.actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import br.com.rsinet.hub_tdd.pageObjects.TestPesquisa;

public class PaginaInicialPesquisa {

//}

	public static void Elementos(WebDriver driver) throws Exception {
		// Busca os metodos e executa comandos.

		TestPesquisa.pesquisarlupaElement(driver).click();
		TestPesquisa.escreverElement(driver).clear();
		TestPesquisa.escreverElement(driver).click();
		TestPesquisa.escreverElement(driver).sendKeys("Laptops", Keys.ENTER);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", TestPesquisa.fecharPesquisa(driver));
		TestPesquisa.cliqueProdutoEscolhido(driver).click();

	}

	public static void TestePesquisaInvalida(WebDriver driver) {

		TestPesquisa.pesquisarlupaElement(driver).click();
		TestPesquisa.escreverElement(driver).clear();
		TestPesquisa.escreverElement(driver).click();
		TestPesquisa.escreverElement(driver).sendKeys("Notbook", Keys.ENTER);

		WebElement Notbook = TestPesquisa.produtonaoExiste(driver);

		if (Notbook.equals(Notbook)) {
			System.out.println("Produto nao Existe");
		}

	}
}
