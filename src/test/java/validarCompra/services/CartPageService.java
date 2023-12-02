package validarCompra.services;

import validarCompra.DriverActions;
import validarCompra.pages.CartPage;
import validarCompra.pages.PayPage;

public class CartPageService {
     CartPage cartPage;

    public CartPageService() {
        this.cartPage = new CartPage();
    }

    public void ProceedToCheckout(){
      DriverActions.click(this.cartPage.getBtn_continuar_compra());


    }
}
