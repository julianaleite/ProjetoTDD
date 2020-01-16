package br.com.rsinet.hub_tdd.automacao;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import br.com.rsinet.hub_tdd.actions.PaginaInicialPesquisa;



public class RotateTest {

	public static void main(String[] args)  {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.advantageonlineshopping.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		PaginaInicialPesquisa.Elementos(driver);

		

	}

}
