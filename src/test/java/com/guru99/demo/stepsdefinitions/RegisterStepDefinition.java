package com.guru99.demo.stepsdefinitions;
import com.guru99.demo.pageobject.IngresoPageObject;
import com.guru99.demo.pageobject.RegisterPageObject;
import com.guru99.demo.steps.LoginSteps;
import com.guru99.demo.steps.RegisterSteps;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Y;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;
import org.hamcrest.Matchers;
import org.junit.Assert;

import java.util.regex.Matcher;

public class RegisterStepDefinition {
    @Steps
    RegisterSteps registro;
    RegisterPageObject selector;

    @Dado("^que el usuario esta en el viaja al registro$")
    public void elUsuarioViajaAlRegistro(){
    registro.abrirRegistro();
    registro.viajarAlRegistro();
    }
    @Cuando("^el usuario ingrese Primer nombre \"([^\"]*)\" el Apellido \"([^\"]*)\" el Telefono\"([^\"]*)\" el Email \"([^\"]*)\" la Direccion\"([^\"]*)\"La Ciudad\"([^\"]*)\" el State\"([^\"]*)\"El codigo Postal\"([^\"]*)\" User \"([^\"]*)\" Passwor \"([^\"]*)\" Confirm\"([^\"]*)\"$")
    public void elUsuarioIngresePrimerNombreElApellidoElTelefonoYElEmail(String nombre, String Apellido, String Telefono, String Email,String Direccion, String Ciudad,String State,String Postal, String User,String Passwor,String Confirm) {
    registro.ingresrNombre(nombre);
    registro.ingresarApellido(Apellido);
    registro.ingresarTelefono(Telefono);
    registro.ingresarCorreo(Email);
    registro.ingresarDireccion(Direccion);
    registro.ingresaCiudad(Ciudad);
    registro.ingresaState(State);
    registro.ingresaCodigoPostal(Postal);
    registro.ingresarUser(User);
    registro.ingresarPassword(Passwor);
    registro.ingresarConfirm(Confirm);
    }
    @Y("^selecciona el pais\"([^\"]*)\"$")
    public void seleccionaUnPais(String value){
    registro.seleccionarPais(value);
    }

    @Entonces("^da al boton enviar y visualiza el mensaje de registro exitoso$")
    public void daAlBotonEnviarYVisualizaElMensajeDeRegistroExitoso() {
    registro.enviarRegistro();
    Assert.assertThat(selector.getDriver().findElement(selector.getMsjMensajeValidacion1()).isDisplayed(), Matchers.is(true));
    }

}
