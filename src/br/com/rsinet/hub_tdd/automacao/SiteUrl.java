package br.com.rsinet.hub_tdd.automacao;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import br.com.rsinet.hub_tdd.actions.CadastraCliente;
import br.com.rsinet.hub_tdd.utility.Constant;
import br.com.rsinet.hub_tdd.utility.ExcelUtils;

public class SiteUrl {

	private static WebDriver driver = null;

	public static void main(String[] args) throws Exception {
		ExcelUtils.setExcelFile(Constant.PathTestData + Constant.FileTestData, "Planilha1");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.advantageonlineshopping.com/");
		driver.manage().window().maximize();

		CadastraCliente.Execute(driver);

	}
}
