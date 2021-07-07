package com.guru99.demo.pageobject;


import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("http://demo.guru99.com/test/newtours/index.php")
public class LoginPageObject extends PageObject {

    By txtUserName = By.name("userName");
    By txtPasswor = By.name("password");
    By btnSubmit = By.name("submit");

    public By getTxtUserName() {
        return txtUserName;
    }

    public By getTxtPasswor() {
        return txtPasswor;
    }

    public By getBtnSubmit() {
        return btnSubmit;
    }
}
