package elementos;

import org.openqa.selenium.By;

public class Elementos {

	// Inspecionar a tela do Chrome com os dados de cada objeto.

	
	public By pesquisar = By.id("inpHeaderSearch");
	public By clickPesquisar = By.id("btnHeaderSearch");
	public By celular = By.cssSelector("#product_ed2ch75dg8 > a.product-li > div > img");
	public By carrinho = By.cssSelector("body > div.wrapper__main > div.wrapper__content.js-wrapper-content > div.wrapper__control > div.wrapper-product__content.wrapper-product__box-prime > div.wrapper-product__informations.js-block-product > button");
	public By cookie = By.cssSelector("body > div.container-banner-cookie > div.container-button-banner > p");
	public By sacola = By.cssSelector("#root > div > div.App.clearfix > div > div.BasketPage-title");
	
}