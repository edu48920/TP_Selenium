package validarCompra.pages;

import org.openqa.selenium.By;

public class CartPage {
    private By btn_continuar_compra = By.id("top-cart-btn-checkout");

    public By getBtn_continuar_compra() {
        return btn_continuar_compra;
    }
}
