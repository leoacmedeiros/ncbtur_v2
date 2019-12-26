package pageObjects.produto.gerenciarProduto;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import core.BasePage;

public class VisualizarProdutoPage extends BasePage {
	
	public void verificarPagina() {
		Assertions.assertEquals("Editar produto...", obterTexto(By.xpath("//span[@class='caption-helper']")));
	}

}
