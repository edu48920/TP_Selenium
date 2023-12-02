package validarCompra.pages;

import org.openqa.selenium.By;

public class ProductPage {
    private By txt_talle = By.id("option-label-size-143-item-169");
    private By txt_color = By.id("option-label-color-93-item-50");
    private By txt_cantidad = By.id("qty");
    private By btn_agregarAlCarrito = By.id("product-addtocart-button");
    private By txt_carrito = By.xpath("//div[@class='minicart-wrapper']");


    public By getTxt_talle() {
        return txt_talle;
    }

    public By getBtn_agregarAlCarrito() {
        return btn_agregarAlCarrito;
    }

    public By getTxt_color() {
        return txt_color;
    }

    public By getTxt_cantidad() {
        return txt_cantidad;
    }

    public By getTxt_carrito() {
        return txt_carrito;
    }
}
