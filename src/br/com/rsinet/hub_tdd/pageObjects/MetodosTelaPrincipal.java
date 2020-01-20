package br.com.rsinet.hub_tdd.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MetodosTelaPrincipal {
	
	public static WebElement PesquisaMassa;
	
	public static WebElement clickMice (WebDriver driver) {
		PesquisaMassa = driver.findElement(By.id("miceImg"));
		return PesquisaMassa;
	}
public static WebElement escolhaMause (WebDriver driver) {
	PesquisaMassa = driver.findElement(By.id("30"));
	return PesquisaMassa;
}
}
