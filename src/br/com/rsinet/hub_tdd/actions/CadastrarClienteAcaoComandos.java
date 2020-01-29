package br.com.rsinet.hub_tdd.actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub_tdd.pageObjects.CriarContaNoCadastraCliente;
import br.com.rsinet.hub_tdd.pageObjects.HomePageCadastraCliente;
import br.com.rsinet.hub_tdd.pageObjects.RegistrarContaDoCadastro;
import br.com.rsinet.hub_tdd.utility.ExcelUtils;
import br.com.rsinet.hub_tdd.utility.Log;

public class CadastrarClienteAcaoComandos {

	public static void testeMassaValido(WebDriver driver) throws Exception {

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

		HomePageCadastraCliente.clicaNoBotaoUtilizador(driver).click();
		Log.info("Clicando no botao login");
		CriarContaNoCadastraCliente.criarContaNoCadastraCliente(driver).sendKeys(Keys.ENTER);
		Log.info("Criando conta");
		RegistrarContaDoCadastro.digitaNome(driver).sendKeys(username);
		Log.info("Digitando nome do usuario");
		RegistrarContaDoCadastro.digitaEmail(driver).sendKeys(Email);
		Log.info("Digitando email do usuario");
		RegistrarContaDoCadastro.digitaSenha(driver).sendKeys(senha);
		Log.info("Criando senha");
		RegistrarContaDoCadastro.confirmaSenha(driver).sendKeys(senhaConfirme);
		Log.info("Confirmando senha");
		RegistrarContaDoCadastro.primeiroNome(driver).sendKeys(primeiroNome);
		Log.info("Digitando Primeiro nome do usuario");
		RegistrarContaDoCadastro.segundoNome(driver).sendKeys(ultimoNome);
		Log.info("Digitando Segundo nome do usuario");
		RegistrarContaDoCadastro.numeroDeTelefone(driver).sendKeys(Telefone);
		Log.info("Diditando numero de telefone");
		RegistrarContaDoCadastro.escolherPais(driver).selectByVisibleText(Pais);
		Log.info("Escolhendo o Pais onde reside ");
		RegistrarContaDoCadastro.digitarCidade(driver).sendKeys(Cidade);
		Log.info("Digitando cidade");
		RegistrarContaDoCadastro.digitarEndereco(driver).sendKeys(Endereço);
		Log.info("Digitando o endereço");
		RegistrarContaDoCadastro.digitarEstado(driver).sendKeys(Estado);
		Log.info("Digitando o Estado onde reside");
		RegistrarContaDoCadastro.digitarCodigoPostal(driver).sendKeys(Codigo);
		Log.info("Digitando o codigo");
		RegistrarContaDoCadastro.clicarEmPermitirOfertas(driver).sendKeys(Keys.ENTER);
		Log.info("aceitando a opçao de permitir ofertas");
		RegistrarContaDoCadastro.clicarAceitaCondicoes(driver).click();
		Log.info("Clicando em aceitar termos");
		RegistrarContaDoCadastro.registrarONome(driver).click();
		Log.info("Registrando usuario");

	}

	public static void testeMassaInvalido(WebDriver driver) {
// buscando os metodos e dando os comandos para o teste invalido rodar 
		HomePageCadastraCliente.clicaNoBotaoUtilizador(driver).click();
		Log.info("Clicando no botao login");
		CriarContaNoCadastraCliente.criarContaNoCadastraCliente(driver).sendKeys(Keys.ENTER);
		Log.info("Criando conta");
		RegistrarContaDoCadastro.digitaNome(driver).sendKeys("Heitor");
		Log.info("Digitando nome do usuario");
		RegistrarContaDoCadastro.digitaEmail(driver).sendKeys("heitor@teste.com.br");
		Log.info("Digitando email do usuario");
		RegistrarContaDoCadastro.digitaSenha(driver).sendKeys("1415He");
		Log.info("Digitando senha");
		RegistrarContaDoCadastro.confirmaSenha(driver).sendKeys("1415He");
		Log.info("Confirmando senha");
		RegistrarContaDoCadastro.primeiroNome(driver).sendKeys("Heitor");
		Log.info("Digitando Primeiro nome do usuario");
		RegistrarContaDoCadastro.segundoNome(driver).sendKeys("Silva");
		Log.info("Digitando ultimo nome do usuario");
		RegistrarContaDoCadastro.numeroDeTelefone(driver).sendKeys("987654322");
		Log.info("Diditando numero de telefone");
		RegistrarContaDoCadastro.escolherPais(driver).selectByVisibleText("Brazil");
		Log.info("Escolhendo o Pais onde reside ");
		RegistrarContaDoCadastro.digitarCidade(driver).sendKeys("Barueri");
		Log.info("Digitando cidade");
		RegistrarContaDoCadastro.digitarEndereco(driver).sendKeys("Rua Mar Vermelho");
		Log.info("Digitando o endereço");
		RegistrarContaDoCadastro.digitarEstado(driver).sendKeys("SP");
		Log.info("Digitando o Estado onde reside");
		RegistrarContaDoCadastro.digitarCodigoPostal(driver).sendKeys("654321");
		Log.info("Digitando o codigo");
		RegistrarContaDoCadastro.clicarEmPermitirOfertas(driver).sendKeys(Keys.ENTER);
		Log.info("aceitando a opçao de permitir ofertas");
		RegistrarContaDoCadastro.clicarAceitaCondicoes(driver).click();
		Log.info("Clicando em aceitar termos");
		RegistrarContaDoCadastro.registrarONome(driver).click();
		Log.info("Clicando em registar nome");
		RegistrarContaDoCadastro.oNomeDoUsuarioJaExiste(driver);
		RegistrarContaDoCadastro.ACCOUNTDETAILS(driver).getText();
		Log.info(" Assert = Verificando se o nome é igual nome ACCOUNT DETAILS ");
	
	}

}
