package com.guru99.demo.steps;

import com.guru99.demo.pageobject.LoginPageObject;
import com.guru99.demo.utils.Datos;
import net.thucydides.core.annotations.Step;

public class LoginSteps {
    Datos datos = new Datos();
    String []datosUsuarios = datos.obtenerdatos();

    LoginPageObject login = new LoginPageObject();
@Step
    public void abrirPaginaWeb(){
        login.open();
    }
    @Step
    public void ingresarUsuario(){
    login.getDriver().findElement(login.getTxtUserName()).sendKeys(datosUsuarios[0]);
    }
    @Step
    public void ingresarClave(){
        login.getDriver().findElement(login.getTxtPasswor()).sendKeys(datosUsuarios[1]);
    }
    @Step
    public void hacerClickSubmit(){
    login.getDriver().findElement(login.getBtnSubmit()).click();
    }
}
