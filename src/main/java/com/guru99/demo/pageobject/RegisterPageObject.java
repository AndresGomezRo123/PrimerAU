package com.guru99.demo.pageobject;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("http://demo.guru99.com/test/newtours/index.php")
public class RegisterPageObject extends PageObject {
    By btnRegister = By.xpath("//a[contains(text(),'REGISTER')]");
    By txtFirstName = By.xpath("//tbody/tr[2]/td[2]/input[1]");
    By txtLastName = By.xpath("//tbody/tr[3]/td[2]/input[1]");
    By txtTelefono = By.xpath("//tbody/tr[4]/td[2]/input[1]");
    By txtEmail = By.xpath("//input[@id='userName']");
    By txtDireccion = By.xpath("//tbody/tr[7]/td[2]/input[1]");
    By txtCiudad = By.xpath("//tbody/tr[8]/td[2]/input[1]");
    By txtState = By.xpath("//tbody/tr[9]/td[2]/input[1]");
    By txtPostal = By.xpath("//tbody/tr[10]/td[2]/input[1]");
    By btnPaises = By.xpath("//tbody/tr[11]/td[2]/select[1]");
    By txtUser = By.xpath("//input[@id='email']");
    By txtPassword= By.xpath("//tbody/tr[14]/td[2]/input[1]");
    By txtConfirm = By.xpath("//tbody/tr[15]/td[2]/input[1]");
    By btnEnviar = By.xpath("//tbody/tr[17]/td[1]/input[1]");



    public By getBtnRegister() {
        return btnRegister;
    }

    public By getTxtFirstName() {
        return txtFirstName;
    }

    public By getTxtLastName() {
        return txtLastName;
    }

    public By getTxtTelefono() {
        return txtTelefono;
    }

    public By getTxtEmail() {
        return txtEmail;
    }

    public By getTxtDireccion() {
        return txtDireccion;
    }

    public By getTxtCiudad() {
        return txtCiudad;
    }

    public By getTxtState() {
        return txtState;
    }

    public By getTxtPostal() {
        return txtPostal;
    }

    public By getBtnPaises() {
        return btnPaises;
    }

    public By getTxtUser() {
        return txtUser;
    }

    public By getTxtPassword() {
        return txtPassword;
    }

    public By getTxtConfirm() {
        return txtConfirm;
    }
    public By getBtnEnviar() {
        return btnEnviar;
    }

    By msjMensajeValidacion1 = By.xpath("//tbody/tr[3]/td[1]/p[2]/font[1]");
    public By getMsjMensajeValidacion1() {
        return msjMensajeValidacion1;
    }
}
