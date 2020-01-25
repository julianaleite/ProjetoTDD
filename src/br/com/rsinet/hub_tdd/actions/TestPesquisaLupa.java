package br.com.rsinet.hub_tdd.actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub_tdd.pageObjects.MetodosTestDePesquisaNaLupa;
import br.com.rsinet.hub_tdd.utility.Log;

public class TestPesquisaLupa {

	public static void testePesquisaLupaValido(WebDriver driver) throws Exception {
		// Busca os metodos e executa comandos.
		MetodosTestDePesquisaNaLupa.clicarLupa(driver).click();
		Log.info("Clicando na lupa de Pesquisa");
		MetodosTestDePesquisaNaLupa.escreverNaLupa(driver).clear();
		Log.info("Limpando algum nome caso estege escrito na pesquisa");
		MetodosTestDePesquisaNaLupa.escreverNaLupa(driver).click();
		Log.info("Clicando no campo de escrever a pesquisa desejada");
		MetodosTestDePesquisaNaLupa.escreverNaLupa(driver).sendKeys("Laptops", Keys.ENTER);
		Log.info("Escrevendo Laptops no campo de pesquisa , dando enter");
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", MetodosTestDePesquisaNaLupa.fecharAnuncio(driver));
		Log.info("Comando java script para fechar a tela que ppo up que aparece");
		MetodosTestDePesquisaNaLupa.cliqueProdutoEscolhidoLaptops(driver).click();
		Log.info(" Clicando no laptop escolhido");
	}

	// metodo para tirar print
	public static void tiraPrintTesteLupaValido(WebDriver driver) {

		MetodosTestDePesquisaNaLupa.escreverNaLupa(driver).sendKeys("Laptops", Keys.ENTER);
		Log.info("Digitando na lupa");
		MetodosTestDePesquisaNaLupa.cliqueProdutoEscolhidoLaptops(driver).click();
		Log.info("Clicando no produto escolhido");

	}

	public static void testePesquisaLupaInvalido(WebDriver driver) {

		MetodosTestDePesquisaNaLupa.clicarLupa(driver).click();
		Log.info("Clicando na lupa de Pesquisa");
		MetodosTestDePesquisaNaLupa.escreverNaLupa(driver).clear();
		Log.info("Limpando algum nome caso estege escrito na pesquisa");
		MetodosTestDePesquisaNaLupa.escreverNaLupa(driver).click();
		Log.info("Clicando no campo de escrever a pesquisa desejada");
		MetodosTestDePesquisaNaLupa.escreverNaLupa(driver).sendKeys("IphoneX", Keys.ENTER);
		Log.info("Digitando Produto no campo de pesquisa");
	}

	// metodo para tirar print TestePesquisaInvalida
	public static void TirarPrintTestePesquisaInvalido(WebDriver driver) {

		MetodosTestDePesquisaNaLupa.escreverNaLupa(driver).sendKeys("IphoneX", Keys.ENTER);
		Log.info("Digitando no campo de pesquisa");

	}
}
