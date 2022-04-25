package com.mmhayes.test_cases;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ApachePOI {


    public static void main(String[] args) throws IOException {

        //Create an object of the File class to open xlsx file
        File file = new File("C:\\Users\\fhasan\\Desktop\\idPass.xlsx");

        // Create an object of FileInputStream class to read excel file
        FileInputStream inputStream = new FileInputStream(file);

        //Create a workbook instance that refers to .xlsx file
        XSSFWorkbook wb = new XSSFWorkbook(inputStream);

        XSSFSheet sheet = wb.getSheetAt(0);
        for (int i = 1; i < 4; i++) {

            String str1 = sheet.getRow(i).getCell(0).getStringCellValue();
            System.out.println(str1);
            String str2 = sheet.getRow(i).getCell(1).getStringCellValue();
            System.out.println(str2);
        }
    }


    public static int minFunction(int n1, int n2) {
        int min;
        if (n1 > n2) {
            min = n2;
        } else {
            min = n1;
        }
        return min;
    }

    public static void noReturnMinFunction(int n1, int n2) {
        int min;
        if (n1 > n2) {
            min = n2;
        } else {
            min = n1;
        }
        System.out.println(min);
    }

    static int plusMethod(int x, int y) {
        return x + y;
    }

    static double plusMethod(double x, double y) {
        return x + y;
    }

    static int pointCalculation(int spentAmount) {

        int point = 0;
        point = spentAmount;

        return point;
    }

}

