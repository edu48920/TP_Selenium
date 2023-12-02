package validarCompra.services;

import validarCompra.DriverActions;
import validarCompra.pages.ProductPage;

public class ProductPageService {

    public ProductPage productPage;

    public ProductPageService(){
        this.productPage = new ProductPage();
    }

    public void seleccionarOpciones(){
        DriverActions.click(this.productPage.getTxt_talle());
        DriverActions.click(this.productPage.getTxt_color());
        DriverActions.insertText(this.productPage.getTxt_cantidad(), "2");

    }
    public void agregarAlCarrito(){
       DriverActions.click(this.productPage.getBtn_agregarAlCarrito());
    }
    public void verCarrito(){
        DriverActions.click(this.productPage.getTxt_carrito());
    }
}
