package br.com.rsinet.hub_tdd.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaginaLogin {

	private static WebElement elementologin;
	

	public static WebElement criarConta(WebDriver Driver) {
		elementologin = Driver.findElement(By.linkText("CREATE NEW ACCOUNT"));
		return elementologin;
	}
}
