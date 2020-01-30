package br.com.rsinet.hub_tdd.actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub_tdd.pageObjects.MetodosConsultaProdutoTelaPrincipal;
import br.com.rsinet.hub_tdd.utility.Log;

public class ConsultarProdutoTelaPrincipal {

	public static void produtoEscolhidoMouseValido(WebDriver driver) {
		MetodosConsultaProdutoTelaPrincipal.clicarNoMouse(driver).click();
		Log.debug("clincando no item da tela");
		MetodosConsultaProdutoTelaPrincipal.escolherMause(driver).click();
		Log.info("eccolhendo o produto mouse");

	}

	public static void produtoEscolhidoInvalido(WebDriver driver) {
		MetodosConsultaProdutoTelaPrincipal.clicarTablets(driver).click();
		Log.info("clicando no produto Tablets");
		MetodosConsultaProdutoTelaPrincipal.escolherTablets(driver).click();
		Log.info("Escolhendo o Tablets desejado");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 1000);");
		for (int i = 0; i < 20; i++) {
			MetodosConsultaProdutoTelaPrincipal.BotaoMaisQuantidadeDeTablets(driver).click();
			MetodosConsultaProdutoTelaPrincipal.assertPopularItems(driver).getText();

		}
		MetodosConsultaProdutoTelaPrincipal.adicionarAoCarinho(driver).click();
		Log.info("Adicionando produto desejado ao carrinho");
		Log.info(" Metodo do assert, verificando se um nome é igual a ele mesmo");
	}
}
