package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class ExcelReader {

    public static String getExcelData(String label, String header){
  // public static void main(String[] args) {


        String value = null;

        try {
            FileInputStream fileInputStream = new FileInputStream("src/test/resources/Datasheet1.xlsx");
            XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
            XSSFSheet sheet = workbook.getSheet("DevopsUniv");
            int noofRows = sheet.getPhysicalNumberOfRows();
            int noofCols = sheet.getRow(0).getLastCellNum();

            System.out.println(noofRows);
            System.out.println(noofCols);
            String[] LabelValue = new String[noofRows];
            String[] HeaderValue = new String[noofCols];

//
//            for (int i =0; i<noofRows;i++){
//                LabelValue[i] = sheet.getRow(i).getCell(0).getStringCellValue();
//            }
//            System.out.println(Arrays.toString(LabelValue));
//
//            for (int j =0; j<noofCols;j++){
//                HeaderValue[j] = sheet.getRow(0).getCell(j).getStringCellValue();
//            }
//            System.out.println(Arrays.toString(HeaderValue));

           // System.out.println(sheet.getRow(1).getCell(5).getStringCellValue());




            for (int i =0; i<noofRows;i++){
                LabelValue[i] = sheet.getRow(i).getCell(0).getStringCellValue();
                if(LabelValue[i].equals(label)){
                    for (int j =0; j<noofCols;j++){
                        HeaderValue[j] = sheet.getRow(0).getCell(j).getStringCellValue();
                        if(HeaderValue[j].equals(header)){
                            value = sheet.getRow(i).getCell(j).getStringCellValue();
                            break;
                        }
                    }
                break;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

       System.out.println("Value is retrieved from excel sheet: "+value);

        return value;
    }

  //  public static void main(String[] args) {
//        System.out.println(getExcelData("OrangeHRM","Title"));
   // }

}
