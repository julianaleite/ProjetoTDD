package br.com.rsinet.hub_tdd.utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


import br.com.rsinet.hub_tdd.actions.CadastrarClienteAcaoComandos;

public class screenshot extends DriverFactory {
	
public static void ScreenShotCaptureTela (WebDriver driver) throws IOException{

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			FileUtils.copyFile(src, new File("C:\\Users\\juliana.silva\\Desktop\\workspace-nova\\ProjetoTDDJuliana\\Screenshot\\" + System.currentTimeMillis() + ".png"));

	}	

}


