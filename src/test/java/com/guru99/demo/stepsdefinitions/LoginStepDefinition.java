package com.guru99.demo.stepsdefinitions;

import com.guru99.demo.pageobject.IngresoPageObject;
import com.guru99.demo.steps.LoginSteps;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class LoginStepDefinition {
    @Steps
    LoginSteps loginSteps;
    IngresoPageObject ingreso;


    @Dado("^que el usuario esta en el portal$")
    public void queElUsuarioEstaEnElPortal() {
    loginSteps.abrirPaginaWeb();
    }

    @Cuando("^el ingresa su usuario  \"([^\"]*)\" y la clave \"([^\"]*)\"$")
    public void elIngresaSuUsuarioYLaClave(String usuario, String clave) {
    loginSteps.ingresarUsuario();
    loginSteps.ingresarClave();
    loginSteps.hacerClickSubmit();
    }

    @Entonces("^el usuario ingresa su cuenta y visualiza el mensaje \"([^\"]*)\"$")
    public void elUsuarioIngresaSuCuentaYVisualizaElMensaje(String mensaje) {
        Assert.assertEquals(mensaje,ingreso.getDriver().findElement(ingreso.getMsjMensajeValidacion()).getText());

    }
}
