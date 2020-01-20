package br.com.rsinet.hub_tdd.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestPesquisa {

	public static WebElement pesquisaElement;

	public static WebElement pesquisarlupaElement(WebDriver driver) {
		pesquisaElement = driver.findElement(By.id("menuSearch"));
		return pesquisaElement;

	}

	public static WebElement escreverElement(WebDriver driver) {
		pesquisaElement = driver.findElement(By.id("autoComplete"));

		return pesquisaElement;
	}

	public static WebElement produtoElement(WebDriver driver) {
		pesquisaElement = driver.findElement(By.className("imgProduct"));
		return pesquisaElement;
	}

	public static WebElement fecharPesquisa(WebDriver driver) {
		pesquisaElement = driver.findElement(By.xpath("//*[@id=\"search\"]/div/div"));
		return pesquisaElement;
	}

	public static WebElement cliqueProdutoEscolhido(WebDriver driver) {
		pesquisaElement = driver.findElement(By.id("11"));
		return pesquisaElement;
	}
}
