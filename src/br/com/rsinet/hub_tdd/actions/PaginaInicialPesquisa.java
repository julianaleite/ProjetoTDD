package br.com.rsinet.hub_tdd.actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub_tdd.pageObjects.TestPesquisa;

public class PaginaInicialPesquisa {

//public static void main(String[] args) {

//}

	public static void Elementos (WebDriver driver)  {
		
		 TestPesquisa.pesquisarlupaElement(driver).click();
		 TestPesquisa.escreverElement(driver).clear();
		 TestPesquisa.escreverElement(driver).click();
		 TestPesquisa.escreverElement(driver).sendKeys("TABLETS",Keys.ENTER);
		 TestPesquisa.cliqueProdutoEscolhido(driver).click();
		 
		 
		 
	}
}
