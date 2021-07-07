package com.guru99.demo.pageobject;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("http://automationpractice.com/index.php")
public class ExcelPageObject extends PageObject {

    By searchBox = By.id("search_query_top");
    By btnSubmit = By.name("submit_search");
    By resultTextLocator = By.cssSelector("span.heading-counter");

    public By getSearchBox() {
        return searchBox;
    }

    public By getBtnSubmit() {
        return btnSubmit;
    }

    public By getResultTextLocator() {
        return resultTextLocator;
    }
}
