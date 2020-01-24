package br.com.rsinet.hub_tdd.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaginaInicial {
		private static WebElement element;

		public static WebElement clickElement (WebDriver driver) {
			element = driver.findElement(By.id("menuUser"));
			return element;
		}

	}



