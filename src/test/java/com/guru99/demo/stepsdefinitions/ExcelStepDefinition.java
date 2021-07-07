package com.guru99.demo.stepsdefinitions;

import com.guru99.demo.pageobject.ExcelPageObject;
import com.guru99.demo.steps.ReadExcelFile;
import com.guru99.demo.steps.WriteExcelFile;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class ExcelStepDefinition {
    @Steps
    ReadExcelFile readExcelFile;
    WriteExcelFile writeExcelFile;
    ExcelPageObject selector;

    @Dado("^que el usuarioo esta en el portal de ropa$")
    public void queElUsuariooEstaEnElPortalDeRopa(){
    writeExcelFile.abrirPaginaWebb();
    }
    @Cuando("^el usuario busca un item en el buscador$")
    public void elUsuarioBuscaUnItemEnElBuscador() throws IOException {
        String filepath = "C:\\Users\\Usuario\\test.xlsx";
        String searchText = readExcelFile.getCellValue(filepath,"Hoja1",0,0);

        selector.getDriver().findElement(selector.getSearchBox()).sendKeys(searchText);

        selector.getDriver().findElement(selector.getBtnSubmit()).click();
        String resultText  = selector.getDriver().findElement(selector.getResultTextLocator()).getText();
        readExcelFile.readExcel(filepath,"Hoja1");
        writeExcelFile.writeCellValue(filepath,"Hoja1",0,1,resultText);
        readExcelFile.readExcel(filepath,"Hoja1");

    }
    @Entonces("^le aparecen los resultados$")
    public void leAparecenLosResultados(){

    }



}
