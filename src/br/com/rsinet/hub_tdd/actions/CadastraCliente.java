package br.com.rsinet.hub_tdd.actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub_tdd.pageObjects.PaginaInicial;
import br.com.rsinet.hub_tdd.pageObjects.PaginaLogin;
import br.com.rsinet.hub_tdd.pageObjects.RegistraNome;
import br.com.rsinet.hub_tdd.utility.ExcelUtils;

public class CadastraCliente {

	public static void ValidoTest(WebDriver driver) throws Exception {

		// busca a massa no Excel
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

		// Busca os metodos e execulta comando com as informaçoes do Excel.

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

	public static void InvalidoTest(WebDriver driver) {

		PaginaInicial.clickElement(driver).click();
		PaginaLogin.criarConta(driver).sendKeys(Keys.ENTER);
		RegistraNome.registranome(driver).sendKeys("Juliana");
		RegistraNome.digitarEmail(driver).sendKeys("juliana.silva@rsinet.com.br");
		RegistraNome.passwordElement(driver).sendKeys("1415Ju");
		RegistraNome.ConfirmaSenha(driver).sendKeys("1415Ju");
		RegistraNome.firstName(driver).sendKeys("Juliana");
		RegistraNome.lastName(driver).sendKeys("Silva");
		RegistraNome.phoneNumber(driver).sendKeys("987654321");
		RegistraNome.paisElement(driver).selectByVisibleText("Brazil");
		RegistraNome.cidadeElement(driver).sendKeys("Barueri");
		RegistraNome.endereçoElement(driver).sendKeys("Rua Mar Vermelho");
		RegistraNome.estadoElement(driver).sendKeys("SP");
		RegistraNome.cogigoPostal(driver).sendKeys("123456");
		RegistraNome.cliquElement(driver).click();
		RegistraNome.concordoElement(driver).click();
		RegistraNome.registrarElement(driver).click();
	}

}
