package br.com.rsinet.hub_tdd.pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import br.com.rsinet.hub_tdd.utility.Log;

public class RegistrarContaDoCadastro {

	public static WebElement metodosDeCadastarCliente;
	

	public static WebElement digitaNome (WebDriver driver) {
		metodosDeCadastarCliente = driver.findElement(By.name("usernameRegisterPage"));
		Log.info("Buscando o Elemento digitar nome");
		return metodosDeCadastarCliente;
	
	
	}

	public static WebElement digitaEmail(WebDriver driver) {
		metodosDeCadastarCliente = driver.findElement(By.name("emailRegisterPage"));
		Log.info("Capturando o Elemento digitar email");
		return metodosDeCadastarCliente;
	}

	public static WebElement digitaSenha(WebDriver driver) {
		metodosDeCadastarCliente = driver.findElement(By.name("passwordRegisterPage"));
		Log.info("Capturando o elemento digitar senha");
		return metodosDeCadastarCliente;
	}

	public static WebElement confirmaSenha(WebDriver driver) {
		metodosDeCadastarCliente = driver.findElement(By.name("confirm_passwordRegisterPage"));
		Log.info("Capsturando o elemento corfimar senha");
		return metodosDeCadastarCliente;
	}

	public static WebElement primeiroNome (WebDriver driver) {
		metodosDeCadastarCliente = driver.findElement(By.name("first_nameRegisterPage"));
		Log.info("Capturando o elemento primeiro nome");
		return metodosDeCadastarCliente;
	}

	public static WebElement segundoNome(WebDriver driver) {
		metodosDeCadastarCliente = driver.findElement(By.name("last_nameRegisterPage"));
		Log.info("Capturando o elemento segundo nome");
		return metodosDeCadastarCliente;
	}

	public static WebElement numeroDeTelefone(WebDriver driver) {
		metodosDeCadastarCliente = driver.findElement(By.name("phone_numberRegisterPage"));
		Log.info("Capturando o elemento nuemro de telefone");
		return metodosDeCadastarCliente;
	}

	public static Select escolherPais(WebDriver driver) {
		metodosDeCadastarCliente = driver.findElement(By.name("countryListboxRegisterPage"));
		Select select = new Select(metodosDeCadastarCliente);
		Log.info("Capturando o Elemento Pais Brazil");
		return select;
	}

	public static WebElement digitarCidade(WebDriver driver) {
		metodosDeCadastarCliente = driver.findElement(By.name("cityRegisterPage"));
		Log.info("Capturando o elemento Digitar cidade");
		return metodosDeCadastarCliente;
	}

	public static WebElement digitarEndereco(WebDriver driver) {
		metodosDeCadastarCliente = driver.findElement(By.name("addressRegisterPage"));
		Log.info("Capturando o elemento digitar o enedereço");
		return metodosDeCadastarCliente;

	}

	public static WebElement digitarEstado(WebDriver driver) {
		metodosDeCadastarCliente = driver.findElement(By.name("state_/_province_/_regionRegisterPage"));
		Log.info("Capturando o elemento Digitar estado");
		return metodosDeCadastarCliente;
	}

	public static WebElement digitarCodigoPostal(WebDriver driver) {
		metodosDeCadastarCliente = driver.findElement(By.name("postal_codeRegisterPage"));
		Log.info("Capturando o elemento digitar codigo postal");
		return metodosDeCadastarCliente;
	}

	public static WebElement clicarEmPermitirOfertas(WebDriver driver) {
		metodosDeCadastarCliente = driver.findElement(By.name("allowOffersPromotion"));
		Log.info("Capturando o elemento Clicar em permiçoes de oferta ");
		return metodosDeCadastarCliente;
	}

	public static WebElement clicarAceitaCondicoes(WebDriver driver) {
		metodosDeCadastarCliente = driver.findElement(By.name("i_agree"));
		Log.info(" Capturando o elemento de Aceitar os termos ");
		return metodosDeCadastarCliente;
	}

	public static WebElement registrarONome(WebDriver driver) {
		metodosDeCadastarCliente = driver.findElement(By.id("register_btnundefined"));
		Log.info("Capturando o elemento registar nome ");
		return metodosDeCadastarCliente;
	}

	public static String oNomeDoUsuarioJaExiste(WebDriver driver) {
		metodosDeCadastarCliente = driver.findElement(By.cssSelector("#registerPage > article > sec-form > div.center > label.center.block.smollMargin.invalid"));
		Log.info("Capturando o elemento o usuario ja existe");
		return metodosDeCadastarCliente.getText();
	
	}
	public static WebElement ACCOUNTDETAILS (WebDriver driver) {
		metodosDeCadastarCliente = driver.findElement(By.xpath("//*[@id=\"formCover\"]/div[1]/h3"));
		Log.info(" Capturando o Elemento ACCOUNT DETAILS ");
		return metodosDeCadastarCliente;
		
		
	}

}