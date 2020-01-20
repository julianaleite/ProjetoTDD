package br.com.rsinet.hub_tdd.actions;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub_tdd.pageObjects.MetodosTelaPrincipal;

public class TestMassaTelaPrincipal {
	
	public static void elementtext (WebDriver driver) {
		
	
		MetodosTelaPrincipal.clickMice(driver).click();
		MetodosTelaPrincipal.escolhaMause(driver).click();
		
	}

}
