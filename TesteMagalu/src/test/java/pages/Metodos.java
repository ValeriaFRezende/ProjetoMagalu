
package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Metodos {

	// Criar um objeto do tipo WebDriver chamado driver (direcionador) "driver �
	// comum entre as empresas".
	WebDriver driver;

	public void abrirNavegador(String appUrl, String descricaoPasso) {

		// Configura��o do browser que ser� utilizado;
		// Na primeiro key incluimos o nome do driver;
		// Na segunda key incluimos o caminho do driver (neste caso ainda estou
		// utilizando o do meu hd).
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");

		// abrir navegador atrav�s do objeto driver.
		driver = new ChromeDriver();

		// acessar o site desejado.
		driver.get(appUrl);
		// maximizar a tela.
		driver.manage().window().maximize();

	}

	public void clicar(By elemento) {
		// Na primerira key � pedido o caminho;
		// Na segunda key � a fun��o.
		driver.findElement(elemento).click();
	}

	public void esperar(int tempo) throws InterruptedException {
		// Tempo que o bot ter� que aguardar antes de continuar.
		Thread.sleep(tempo);

	}

	public void validarElementoExiste(By elemento, String txtEsperado) {

		String texto = driver.findElement(elemento).getText();
		Assert.assertTrue(texto.contains(txtEsperado));
	}

	public void fecharNavegador() {
		// Fechar navegador.
		driver.quit();
	}
	
    // Esperar elemento ser clicavel
	public void esperarElemento(By el) {

		(new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated((el)));

	}
	// Caminhos de busca;

	// Na primeira key � o campos encontrado;
	// Na segunda key � o nome que deve ser preenchido conforme a aba da primeira
	// key.
	public void preencher(By elemento, String texto) throws InterruptedException {

		driver.findElement(elemento).sendKeys(texto);

	}

}