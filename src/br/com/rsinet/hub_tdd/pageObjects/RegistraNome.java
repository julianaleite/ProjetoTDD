package br.com.rsinet.hub_tdd.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegistraNome {

	//private static final String Brazil = null;
	public static WebElement element;

	public static WebElement registranome(WebDriver driver) {
		element = driver.findElement(By.name("usernameRegisterPage"));
		return element;

	}

	public static WebElement digitarEmail(WebDriver driver) {
		element = driver.findElement(By.name("emailRegisterPage"));
		return element;
	}

	public static WebElement passwordElement(WebDriver driver) {
		element = driver.findElement(By.name("passwordRegisterPage"));
		return element;
	}

	public static WebElement ConfirmaSenha(WebDriver driver) {
		element = driver.findElement(By.name("confirm_passwordRegisterPage"));
		return element;
	}

	public static WebElement firstName(WebDriver driver) {
		element = driver.findElement(By.name("first_nameRegisterPage"));
		return element;
	}

	public static WebElement lastName(WebDriver driver) {

		element = driver.findElement(By.name("last_nameRegisterPage"));
		return element;
	}

	public static WebElement phoneNumber(WebDriver driver) {
		element = driver.findElement(By.name("phone_numberRegisterPage"));
		return element;
	}

	public static Select paisElement(WebDriver driver) {
		element = driver.findElement(By.name("countryListboxRegisterPage"));
		Select select = new Select(element);
		return select;
	}

	public static WebElement cidadeElement(WebDriver driver) {
		element = driver.findElement(By.name("cityRegisterPage"));
		return element;
	}

	public static WebElement endereçoElement(WebDriver driver) {
		element = driver.findElement(By.name("addressRegisterPage"));
		return element;

	}

	public static WebElement estadoElement(WebDriver driver) {
		element = driver.findElement(By.name("state_/_province_/_regionRegisterPage"));
		return element;

	}

	public static WebElement cogigoPostal(WebDriver driver) {
		element = driver.findElement(By.name("postal_codeRegisterPage"));
		return element;
	}

	public static WebElement cliquElement(WebDriver driver) {
		element = driver.findElement(By.name("allowOffersPromotion"));
		return element;
	}

	public static WebElement concordoElement(WebDriver driver) {
		element = driver.findElement(By.name("i_agree"));
		return element;
	}

	public static WebElement registrarElement(WebDriver driver) {
		element = driver.findElement(By.id("register_btnundefined"));
		return element;
	}

	public static WebElement falharegistro(WebDriver driver) {
		element = driver.findElement(By.className("center block smollMargin invalid"));
		return element;
	}
}
