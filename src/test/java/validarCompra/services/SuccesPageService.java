package validarCompra.services;

import validarCompra.DriverActions;
import validarCompra.pages.SuccessPage;

public class SuccesPageService {
    public SuccessPage successPage;
    public SuccesPageService(){
        this.successPage = new SuccessPage();
    }
    public  void continuar(){
        DriverActions.click(this.successPage.getBtn_continue());
    }

    public String tituloIgual(){
        return DriverActions.getText(this.successPage.getTxt_titulo());
    }


}
