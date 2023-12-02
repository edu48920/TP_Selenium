package validarCompra;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import validarCompra.pages.PayPage;
import validarCompra.services.*;

public class CompraTest {

    @BeforeMethod
    public  void setUp(){
        DriverManager.create("chrome");
        DriverManager.goSite("https://magento.softwaretestingboard.com/");
    }

    @Test
    public void compra() {
        HomePageService homePageService = new HomePageService();
        homePageService.seleccionarProducto();

        ProductPageService productPageService = new ProductPageService();
        productPageService.seleccionarOpciones();
        productPageService.agregarAlCarrito();
        productPageService.verCarrito();

        CartPageService cartPageService = new CartPageService();
        cartPageService.ProceedToCheckout();


        CheckOutPageService checkOutPageService = new CheckOutPageService();
        checkOutPageService.formDatosEnvio("asd@gmail.com", "a", "s", "asd 123",
                "Cdia", 3200, "Argentina", "345454545");

        PayPageService payPageService = new PayPageService();
        payPageService.pagar();

        SuccesPageService succesPageService = new SuccesPageService();

        Assert.assertEquals(succesPageService.tituloIgual(), "Thank you for your purchase!");





    }





}
