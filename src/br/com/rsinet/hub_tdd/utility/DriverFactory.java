package br.com.rsinet.hub_tdd.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

	private static WebDriver driver;

	public static WebDriver getDriver() {
		// Checa se o driver já foi criado antes de retornar.

		if (driver == null) {
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.advantageonlineshopping.com");
			driver.manage().window().maximize();
		}

		return driver;

	}

	public static void killDriver() {

		// Checa se o driver existe antes de destruir.

		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}

}
