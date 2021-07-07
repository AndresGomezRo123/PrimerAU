package com.guru99.demo.steps;

import com.guru99.demo.pageobject.ExcelPageObject;
import net.thucydides.core.annotations.Step;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcelFile {
    ExcelPageObject excelPageObject = new ExcelPageObject();
    @Step
    public void abrirPaginaWebb(){
        excelPageObject.open();
    }
    @Step
    public void writeExcel(String filepath,String sheetName, String[] dataToWrite) throws IOException {
        File file = new File(filepath);
        FileInputStream inputStream = new FileInputStream(file);

        XSSFWorkbook newWoorbook = new XSSFWorkbook(inputStream);

        XSSFSheet newSheet = newWoorbook.getSheet(sheetName);

        int rowCount = newSheet.getLastRowNum()-newSheet.getFirstRowNum();

        XSSFRow row = newSheet.getRow(0);

        XSSFRow newRow = newSheet.createRow(rowCount+1);

        for (int i=0; i<row.getLastCellNum();i++){
            XSSFCell newCell = newRow.createCell(i);
            newCell.setCellValue(dataToWrite[i]);
        }
        inputStream.close();
        FileOutputStream outputStream = new FileOutputStream(file);

        newWoorbook.write(outputStream);

        outputStream.close();
    }
    @Step
    public void writeCellValue(String filepath, String sheetName, int rowNumbre, int cellNumbre,String resultText) throws IOException{
        File file = new File(filepath);
        FileInputStream inputStream = new FileInputStream(file);

        XSSFWorkbook newWoorbook = new XSSFWorkbook(inputStream);

        XSSFSheet newSheet = newWoorbook.getSheet(sheetName);

        XSSFRow row = newSheet.getRow(rowNumbre);

        XSSFCell firstCell = row.getCell(cellNumbre-1);

        System.out.println("first cell value is:"+ firstCell.getStringCellValue());

        XSSFCell newxtCell = row.createCell(cellNumbre);

        newxtCell.setCellValue(resultText);

        System.out.println("nextcell value:"+newxtCell.getStringCellValue());

        inputStream.close();

        FileOutputStream outputStream = new FileOutputStream(file);

        newWoorbook.write(outputStream);

        outputStream.close();
    }
    @Step
    public void buscar(){
        excelPageObject.getDriver().findElement(excelPageObject.getBtnSubmit()).click();
    }
}
