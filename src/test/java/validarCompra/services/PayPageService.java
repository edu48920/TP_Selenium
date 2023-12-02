package validarCompra.services;

import validarCompra.DriverActions;
import validarCompra.DriverManager;
import validarCompra.pages.PayPage;

public class PayPageService  {
    public PayPage payPage;

    public PayPageService(){
        this.payPage = new PayPage();
    }
    public void pagar(){
        DriverActions.click(this.payPage.getBtn_placeOrder());
    }

    public void checkBilling(){
        DriverActions.isEnabled(payPage.getBtn_placeOrder());
      boolean isCheck = DriverManager.getDriver().findElement(this.payPage.getBtn_placeOrder()).isSelected();
      if(!isCheck){
          DriverManager.getDriver().findElement(this.payPage.getBtn_placeOrder()).click();
      }
    }
}
