package br.com.rsinet.hub_tdd.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import br.com.rsinet.hub_tdd.utility.Log;

public class HomePageCadastraCliente {
		private static WebElement element;

		public static WebElement clicaNoBotaoUtilizador (WebDriver driver) {
			element = driver.findElement(By.id("menuUser"));
			Log.info("Capturando elemento da pagina inicial");
			return element;
		}

	}



