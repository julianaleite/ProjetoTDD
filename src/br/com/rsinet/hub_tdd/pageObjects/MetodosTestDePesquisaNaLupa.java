package br.com.rsinet.hub_tdd.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import br.com.rsinet.hub_tdd.utility.Log;

public class MetodosTestDePesquisaNaLupa {

	public static WebElement pesquisaNaLupa;

	public static WebElement clicarLupa(WebDriver driver) {
		pesquisaNaLupa = driver.findElement(By.id("menuSearch"));
		Log.info("Capturando o elemento Clicar na lupa");
		return pesquisaNaLupa;

	}

	public static WebElement escreverNaLupa(WebDriver driver) {
		pesquisaNaLupa = driver.findElement(By.id("autoComplete"));
		Log.info("Capturando o elemento campo digitar na lupa");
		return pesquisaNaLupa;
	}

	public static WebElement clicarProdutoEscolhido(WebDriver driver) {
		pesquisaNaLupa = driver.findElement(By.className("imgProduct"));
		Log.info("Capturando o elemento clicar no produto escolhido");
		return pesquisaNaLupa;
	}

	public static WebElement fecharAnuncio(WebDriver driver) {
		pesquisaNaLupa = driver.findElement(By.xpath("//*[@id=\"search\"]/div/div"));
		Log.info("Capturando o elemento fechar anuncio que exibe na tela ");
		return pesquisaNaLupa;
	}

	public static WebElement cliqueProdutoEscolhidoLaptops(WebDriver driver) {
		pesquisaNaLupa = driver.findElement(By.id("11"));
		Log.info("Capturando o elemento do priduto escolhido");
		return pesquisaNaLupa;
	}

	public static WebElement escreverProdutoInavlido(WebDriver driver) {
		pesquisaNaLupa = driver.findElement(By.id("autoComplete"));
		Log.info("Capturando o elemento do produto que nao existe");
		return pesquisaNaLupa;

	}

	public static WebElement hpPavilion(WebDriver driver) {
		pesquisaNaLupa = driver.findElement(By.className("roboto-regular screen768 ng-binding"));
		Log.info("Capturando o elemento do nome hpPavilion");
		return pesquisaNaLupa;
	}
}