package test;

import elementos.Elementos;
import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Entao;
import pages.Metodos;

public class Steps {

	Metodos metodo = new Metodos();
	Elementos elemento = new Elementos();

	@Dado("que esteja no {string}")
	public void que_esteja_no(String string) throws InterruptedException {
		metodo.abrirNavegador(string, "acessar Site");
		metodo.esperar(1000);
	}

	@Quando("pesquisar celular")
	public void pesquisar_celular() throws InterruptedException {
		metodo.preencher(elemento.pesquisar, "Samsung A51");
		metodo.esperar(2000);
		metodo.clicar(elemento.clickPesquisar);
		metodo.esperar(2000);
		metodo.clicar(elemento.cookie);
		metodo.esperar(2000);
		metodo.clicar(elemento.celular);
		metodo.esperar(2000);
		metodo.clicar(elemento.carrinho);

	}

	@Entao("adciono ele no carrinho de compras")
	public void adciono_ele_no_carrinho_de_compras() {
		metodo.esperarElemento(elemento.sacola);
		metodo.validarElementoExiste(elemento.sacola, "Sacola");
		metodo.fecharNavegador();

	}
}