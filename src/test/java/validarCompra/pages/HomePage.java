package validarCompra.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class HomePage {
    private String urlHomePage = "https://magento.softwaretestingboard.com/";

   private By txt_product_name = By.xpath("//a[@title='Radiant Tee']");




    public String getUrlHomePage() {
        return urlHomePage;
    }

    public By getTxt_product_name() {
        return txt_product_name;
    }


}
