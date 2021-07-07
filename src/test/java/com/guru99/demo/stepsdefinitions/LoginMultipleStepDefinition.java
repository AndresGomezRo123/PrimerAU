package com.guru99.demo.stepsdefinitions;

import com.guru99.demo.models.Datos;
import com.guru99.demo.pageobject.IngresoPageObject;
import com.guru99.demo.steps.LoginMuktip0leSteps;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

import java.util.List;

public class LoginMultipleStepDefinition {
    @Steps
    LoginMuktip0leSteps loginMuktip0leSteps;
    IngresoPageObject ingresoPageObject;

    @Dado("^que el usuario esta en el portal X$")
    public void queElUsuarioEstaEnElPortalX() {
    loginMuktip0leSteps.abrirPagina();
    }


    @Cuando("^el ingresa su usuario y la clave$")
    public void elIngresaSuUsuarioYLaClave(List<Datos>datos) {
    loginMuktip0leSteps.ingresarUsuarioMultiple(datos.get(0).getUsuario());
    loginMuktip0leSteps.ingresarContraseñaMultiple(datos.get(0).getClave());
    loginMuktip0leSteps.ingresoLogin();
    }

    @Entonces("^visualiza el mensaje \"([^\"]*)\"$")
    public void visualizaElMensaje(String mensaje) {
        Assert.assertEquals(mensaje,ingresoPageObject.getDriver().findElement(ingresoPageObject.getMsjMensajeValidacion()).getText());
    }
}
