package com.guru99.demo.utils;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

public class Datos {
    public String [] obtenerdatos(){
    String  archivoExcel = "DatosUsuario.xlsx";
    String usuario = null;
    String clave=null;

        try {
            FileInputStream file = new FileInputStream(new File(archivoExcel));
            //XSSFWorkbook = nombre del excel
            XSSFWorkbook libro = new XSSFWorkbook(file);
            //XSSFSheet Nombre de la hoja de al cual se van a leer los datos
            XSSFSheet hoja = libro.getSheet("DatosUsuario");

            Row row;
            Cell cell;

            row = hoja.getRow(1);
            cell = row.getCell(0);
            usuario = cell.toString();
            cell = row.getCell(1);
            clave = cell.toString();

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }

        String datosUser[] = { usuario, clave };
        return datosUser;
    }
}
