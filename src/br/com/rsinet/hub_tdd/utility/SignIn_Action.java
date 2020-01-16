package br.com.rsinet.hub_tdd.utility;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub_tdd.pageObjects.PaginaInicial;
import br.com.rsinet.hub_tdd.pageObjects.PaginaLogin;
import br.com.rsinet.hub_tdd.pageObjects.RegistraNome;

public class SignIn_Action {

	public static void Execute(WebDriver driver) throws Exception {
		
		

		 String sUserName = ExcelUtils.getCellData(1, 1);

		// String sPassword = ExcelUtils.getCellData(1, 2);

		PaginaInicial.clickElement(driver).click();
		PaginaLogin.criarConta(driver).sendKeys(Keys.ENTER);
		RegistraNome.registranome(driver).sendKeys(sUserName);
		RegistraNome.digitarEmail(driver).sendKeys("juliana@email.com");
		RegistraNome.passwordElement(driver).sendKeys("1415Ju");
		RegistraNome.ConfirmaSenha(driver).sendKeys("1415Ju");
		RegistraNome.firstName(driver).sendKeys("Juliana");
		RegistraNome.lastName(driver).sendKeys("Silva");
		RegistraNome.phoneNumber(driver).sendKeys("11987654321");
		RegistraNome.paisElement(driver).selectByVisibleText("Brazil");
		RegistraNome.cidadeElement(driver).sendKeys("Barueri");
		RegistraNome.endere�oElement(driver).sendKeys("Rua Mar vermelho");
		RegistraNome.estadoElement(driver).sendKeys("SP");
		RegistraNome.cogigoPostal(driver).sendKeys("123456");
		RegistraNome.cliquElement(driver).click();
		RegistraNome.concordoElement(driver).click();
		RegistraNome.registrarElement(driver).click();

	}

}