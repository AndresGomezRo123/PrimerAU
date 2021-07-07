package com.guru99.demo.steps;

import com.guru99.demo.pageobject.RegisterPageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterSteps {
    RegisterPageObject register = new RegisterPageObject();
    @Step
    public void abrirRegistro(){
        register.open();
    }
    @Step
    public void viajarAlRegistro(){
        register.getDriver().findElement(register.getBtnRegister()).click();
    }
    @Step
    public void ingresrNombre(String nombre){
        register.getDriver().findElement(register.getTxtFirstName()).sendKeys(nombre);

    }
    @Step
    public void ingresarApellido(String Apellido){
        register.getDriver().findElement(register.getTxtLastName()).sendKeys(Apellido);
    }
    @Step
    public void ingresarTelefono(String Telefono){
        register.getDriver().findElement(register.getTxtTelefono()).sendKeys(Telefono);
    }
    @Step
    public void ingresarCorreo(String Email){
        register.getDriver().findElement(register.getTxtEmail()).sendKeys(Email);
    }
    @Step
    public void ingresarDireccion(String Direccion){
    register.getDriver().findElement(register.getTxtDireccion()).sendKeys(Direccion);
    }
    @Step
    public void ingresaCiudad(String Ciudad){
        register.getDriver().findElement(register.getTxtCiudad()).sendKeys(Ciudad);
    }
    @Step
    public void ingresaState(String State){
        register.getDriver().findElement(register.getTxtState()).sendKeys(State);
    }
    @Step
    public void ingresaCodigoPostal(String Postal){
        register.getDriver().findElement(register.getTxtPostal()).sendKeys(Postal);
    }
    @Step
    public void seleccionarPais(String value){
        Select dropdown = new Select(register.getDriver().findElement(register.getBtnPaises()));
        dropdown.selectByValue(value);
    }
    @Step
    public void ingresarUser(String User){
        register.getDriver().findElement(register.getTxtUser()).sendKeys(User);
    }
    @Step
    public void ingresarPassword(String Password){
        register.getDriver().findElement(register.getTxtPassword()).sendKeys(Password);
    }
    @Step
    public void ingresarConfirm(String Confirm){
        register.getDriver().findElement(register.getTxtConfirm()).sendKeys(Confirm);
    }
    @Step
    public void enviarRegistro(){
    register.getDriver().findElement(register.getBtnEnviar()).click();
    }
}
