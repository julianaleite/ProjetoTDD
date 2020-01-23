package br.com.rsinet.hub_tdd.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MetodosTelaPrincipal {

	public static WebElement PesquisaMassa;

	public static WebElement clickMice(WebDriver driver) {
		PesquisaMassa = driver.findElement(By.id("miceImg"));
		return PesquisaMassa;
	}

	// Metodo que clica no Mouse escolhido .
	public static WebElement escolhaMause(WebDriver driver) {
		PesquisaMassa = driver.findElement(By.id("30"));
		return PesquisaMassa;
	}

	public static WebElement clickTablets(WebDriver driver) {
		PesquisaMassa = driver.findElement(By.id("tabletsImg"));
		return PesquisaMassa;
	}

	public static WebElement escolhaTablets(WebDriver driver) {
		PesquisaMassa = driver.findElement(By.id("18"));
		return PesquisaMassa;

	}

	public static WebElement botaoClica(WebDriver driver) {
		PesquisaMassa = driver
				.findElement(By.xpath("//*[@id=\"productProperties\"]/div[2]/e-sec-plus-minus/div/div[3]"));
		return PesquisaMassa;
	}

	public static WebElement AddCarinho(WebDriver driver) {
		PesquisaMassa = driver.findElement(By.xpath("//*[@id=\"productProperties\"]/div[3]/button"));
		return PesquisaMassa;
	}
public static WebElement PopularItems(WebDriver driver) {
	PesquisaMassa = driver.findElement(By.cssSelector("#productProperties > label"));
	return PesquisaMassa;
}
	
	

}
