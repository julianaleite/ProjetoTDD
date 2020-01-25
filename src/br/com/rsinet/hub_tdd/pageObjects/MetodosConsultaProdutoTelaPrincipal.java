package br.com.rsinet.hub_tdd.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import br.com.rsinet.hub_tdd.utility.Log;

public class MetodosConsultaProdutoTelaPrincipal {

	public static WebElement metodosProdutoTelaPrincipal;

	public static WebElement clicarNoMouse(WebDriver driver) {
		metodosProdutoTelaPrincipal = driver.findElement(By.id("miceImg"));
		Log.info("Capturando elemento Produtos Mouses");
		return metodosProdutoTelaPrincipal;
	}

	// Metodo que clica no Mouse escolhido .
	public static WebElement escolherMause(WebDriver driver) {
		metodosProdutoTelaPrincipal = driver.findElement(By.id("30"));
		Log.info(" Capturando elemento do mouse desejado");
		return metodosProdutoTelaPrincipal;
	}

	public static WebElement clicarTablets(WebDriver driver) {
		metodosProdutoTelaPrincipal = driver.findElement(By.id("tabletsImg"));
		Log.info("Capturando elemento Produtos Tablets");
		return metodosProdutoTelaPrincipal;
	}

	public static WebElement escolherTablets(WebDriver driver) {
		metodosProdutoTelaPrincipal = driver.findElement(By.id("18"));
		Log.info("Capturando elemento do Tablet desejado");
		return metodosProdutoTelaPrincipal;

	}

	public static WebElement BotaoMaisQuantidadeDeTablets(WebDriver driver) {
		metodosProdutoTelaPrincipal = driver.findElement(By.xpath("//*[@id=\"productProperties\"]/div[2]/e-sec-plus-minus/div/div[3]"));
		Log.info("Capturando elemento do botao adicionar mais quantidade de tablet");
		return metodosProdutoTelaPrincipal;
	}

	public static WebElement adicionarAoCarinho(WebDriver driver) {
		metodosProdutoTelaPrincipal = driver.findElement(By.name("save_to_cart"));
		Log.info("Capturando elemento Adicionar carrinho");
		return metodosProdutoTelaPrincipal;
	}

	public static WebElement assertPopularItems(WebDriver driver) {
		metodosProdutoTelaPrincipal = driver.findElement(By.cssSelector("#productProperties > label"));
		Log.info(" Capturando elemento do nome PopularItems");
		return metodosProdutoTelaPrincipal;
	}

}
