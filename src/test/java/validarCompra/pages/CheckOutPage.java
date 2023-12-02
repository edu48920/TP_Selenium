package validarCompra.pages;

import org.openqa.selenium.By;
import validarCompra.DriverActions;

public class CheckOutPage {
    //private By txt_email = By.xpath("//input[@id='customer-email']");
    private By txt_email =  By.id("customer-email");
    private By txt_first_name = By.name("firstname");
    private By txt_last_name = By.name("lastname");
    private By txt_adress = By.name("street[0]");
    private By txt_city = By.name("city");

    private By txt_post_code = By.name("postcode");
    private By txt_country = By.name("country_id");
    private By txt_phone = By.name("telephone");


    public By getTxt_email() {
        return txt_email;
    }

    public By getTxt_first_name() {
        return txt_first_name;
    }

    public By getTxt_last_name() {
        return txt_last_name;
    }

    public By getTxt_adress() {
        return txt_adress;
    }

    public By getTxt_city() {
        return txt_city;
    }

    public By getTxt_post_code() {
        return txt_post_code;
    }

    public By getTxt_country() {
        return txt_country;
    }

    public By getTxt_phone() {
        return txt_phone;
    }
}



