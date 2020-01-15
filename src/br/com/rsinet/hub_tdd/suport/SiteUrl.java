package br.com.rsinet.hub_tdd.suport;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import br.com.rsinet.hub_tdd.estrutura.CadastraCliente;

public class SiteUrl {

	private static WebDriver driver = null;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.advantageonlineshopping.com/");
		driver.manage().window().maximize();
		
		CadastraCliente.Execute(driver);
	
		
	}
}
