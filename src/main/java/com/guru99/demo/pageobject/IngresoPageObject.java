package com.guru99.demo.pageobject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class IngresoPageObject extends PageObject {

    By msjMensajeValidacion = By.xpath("//h3[contains(.,'Login Successfully')]");
    public By getMsjMensajeValidacion() {
        return msjMensajeValidacion;
    }
}
