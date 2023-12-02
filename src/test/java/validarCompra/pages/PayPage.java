package validarCompra.pages;

import org.openqa.selenium.By;

public class PayPage {
    private By btn_placeOrder = By.xpath("//button[@title='Place Order']");
    private By input_check = By.id("billing-address-same-as-shipping-checkmo");

    public By getBtn_placeOrder() {
        return btn_placeOrder;
    }

    public By getInput_check() {
        return input_check;
    }
}
