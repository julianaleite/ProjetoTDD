package br.com.rsinet.hub_tdd.actions;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub_tdd.pageObjects.MetodosTelaPrincipal;

public class TestMassaTelaPrincipal {

	public static void elementtext(WebDriver driver) {

		MetodosTelaPrincipal.clickMice(driver).click();
		MetodosTelaPrincipal.escolhaMause(driver).click();

	}

	public static void TestInvalidoPgInicial(WebDriver driver) {

		MetodosTelaPrincipal.clickTablets(driver).click();
		MetodosTelaPrincipal.escolhaTablets(driver).click();

		for (int i = 0; i < 20; i++) {
			MetodosTelaPrincipal.botaoClica(driver).click();
		}
		{
			MetodosTelaPrincipal.AddCarinho(driver).click();
		}

	}

}
