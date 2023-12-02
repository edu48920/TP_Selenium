package validarCompra.services;

import org.openqa.selenium.By;
import validarCompra.DriverActions;
import validarCompra.pages.CheckOutPage;

public class CheckOutPageService {
    CheckOutPage checkOutPage;

    public CheckOutPageService(){
        this.checkOutPage = new CheckOutPage();
    }


    public void formDatosEnvio(String email, String firstName, String lastName, String direccion,
                               String ciudad, int codPostal, String pais, String numtel) {
        DriverActions.insertText(this.checkOutPage.getTxt_email(),email);
        DriverActions.insertText(this.checkOutPage.getTxt_first_name(),firstName);
        DriverActions.insertText(this.checkOutPage.getTxt_last_name(),lastName);
        DriverActions.insertText(this.checkOutPage.getTxt_adress(),direccion);
        DriverActions.insertText(this.checkOutPage.getTxt_city(),ciudad);
        DriverActions.insertText(this.checkOutPage.getTxt_post_code(), String.valueOf(codPostal));
        DriverActions.selectOption(this.checkOutPage.getTxt_country(), pais);
        DriverActions.insertText(this.checkOutPage.getTxt_phone(),numtel);



    }
}
