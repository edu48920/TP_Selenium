package validarCompra.pages;

import org.openqa.selenium.By;

public class SuccessPage {

    private By txt_titulo = By.xpath("//h1[@class='page-title']");
    private By btn_continue = By.xpath("//a[@spam='Continue Shopping']");

    public By getTxt_titulo() {
        return txt_titulo;
    }

    public By getBtn_continue() {
        return btn_continue;
    }
}
