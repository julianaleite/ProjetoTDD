package br.com.rsinet.hub_tdd.actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub_tdd.pageObjects.PaginaInicial;
import br.com.rsinet.hub_tdd.pageObjects.PaginaLogin;
import br.com.rsinet.hub_tdd.pageObjects.RegistraNome;
import br.com.rsinet.hub_tdd.utility.ExcelUtils;

public class CadastraCliente {

	public static void Execute(WebDriver driver) throws Exception {

		String username = ExcelUtils.getCellData(1, 0);
		String Email = ExcelUtils.getCellData(1, 1);
		String senha = ExcelUtils.getCellData(1, 2);
		String senhaConfirme = ExcelUtils.getCellData(1, 3);
		String primeiroNome = ExcelUtils.getCellData(1, 4);
		String ultimoNome = ExcelUtils.getCellData(1, 5);
		String Telefone = ExcelUtils.getCellData(1, 6);
		String Pais = ExcelUtils.getCellData(1, 7);
		String Cidade = ExcelUtils.getCellData(1, 8);
		String Endereço = ExcelUtils.getCellData(1, 9);
		String Estado = ExcelUtils.getCellData(1, 10);
		String Codigo = ExcelUtils.getCellData(1, 11);

		PaginaInicial.clickElement(driver).click();
		PaginaLogin.criarConta(driver).sendKeys(Keys.ENTER);
		RegistraNome.registranome(driver).sendKeys(username);
		RegistraNome.digitarEmail(driver).sendKeys(Email);
		RegistraNome.passwordElement(driver).sendKeys(senha);
		RegistraNome.ConfirmaSenha(driver).sendKeys(senhaConfirme);
		RegistraNome.firstName(driver).sendKeys(primeiroNome);
		RegistraNome.lastName(driver).sendKeys(ultimoNome);
		RegistraNome.phoneNumber(driver).sendKeys(Telefone);
		RegistraNome.paisElement(driver).selectByVisibleText(Pais);
		RegistraNome.cidadeElement(driver).sendKeys(Cidade);
		RegistraNome.endereçoElement(driver).sendKeys(Endereço);
		RegistraNome.estadoElement(driver).sendKeys(Estado);
		RegistraNome.cogigoPostal(driver).sendKeys(Codigo);
		RegistraNome.cliquElement(driver).click();
		RegistraNome.concordoElement(driver).click();
		RegistraNome.registrarElement(driver).click();

	}

}
