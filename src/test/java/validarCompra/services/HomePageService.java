package validarCompra.services;

import validarCompra.DriverActions;
import validarCompra.pages.HomePage;

public class HomePageService {
    HomePage homePage;

    public HomePageService(){
        this.homePage = new HomePage();
    }
    public void seleccionarProducto(){
        DriverActions.click(this.homePage.getTxt_product_name());


    }
}
