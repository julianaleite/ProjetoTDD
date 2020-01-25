package br.com.rsinet.hub_tdd.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import br.com.rsinet.hub_tdd.utility.Log;

public class CriarContaNoCadastraCliente {

	private static WebElement elementologin;

	public static WebElement criarContaNoCadastraCliente(WebDriver Driver) {
		elementologin = Driver.findElement(By.linkText("CREATE NEW ACCOUNT"));
		Log.info("Capturando o elemento Criar conta");
		return elementologin;
	}
}
