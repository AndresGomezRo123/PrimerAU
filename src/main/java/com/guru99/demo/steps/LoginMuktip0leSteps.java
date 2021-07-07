package com.guru99.demo.steps;

import com.guru99.demo.pageobject.LoginPageObject;
import net.thucydides.core.annotations.Step;

public class LoginMuktip0leSteps {
    LoginPageObject loginPageObject = new LoginPageObject();
    @Step
    public void abrirPagina(){
        loginPageObject.open();
    }
    @Step
    public void ingresarUsuarioMultiple(String usuario){
    loginPageObject.getDriver().findElement(loginPageObject.getTxtUserName()).sendKeys(usuario);
    }
    @Step
    public void ingresarContraseñaMultiple(String clave){
        loginPageObject.getDriver().findElement(loginPageObject.getTxtPasswor()).sendKeys(clave);
    }
    @Step
    public void ingresoLogin(){
        loginPageObject.getDriver().findElement(loginPageObject.getBtnSubmit()).click();
    }
}
