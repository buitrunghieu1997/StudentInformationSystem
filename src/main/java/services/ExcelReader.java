/*
 * Copyright(C) 2018 Bùi Trung Hiếu
 * StudentInformationSystem, services - IntelliJ IDEA
 * ExcelReader.java
 * Created at 09:41 ~ 28/11/2018 by Bùi Trung Hiếu
 */
package services;

import org.apache.poi.ss.usermodel.*;
import utils.Constants;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

/**
 * Description about this Class/Interface/Enum...
 *
 * @author Bùi Trung Hiếu  Created: 09:41 ~ 28/11/2018
 */
public class ExcelReader {
    public static void main(String[] args) throws IOException {
        InputStream inp;
        Workbook workbook = WorkbookFactory.create(new File(Constants.EXCEL_WORKBOOK_LOCATION));
        System.out.println("Workbook có " + workbook.getNumberOfSheets() + " sheets.");

        Iterator<Sheet> sheetIterator = workbook.sheetIterator();
        // Có thể dùng foreach: for(Sheet sheet :workbook) or workbook.forEach(sheet -> {}):
        System.out.println("Duyệt các sheet của workbook bằng Iterator.");
        while(sheetIterator.hasNext()) {
            Sheet sheet = sheetIterator.next();
            System.out.println("=> " + sheet.getSheetName());
            DataFormatter dataFormater = new DataFormatter();
            System.out.println("Duyệt các row bằng lambda foreach java 8:");
            sheet.forEach(row -> {
                row.forEach(cell -> {
                    String cellValue = dataFormater.formatCellValue(cell);
                    System.out.print(cellValue + "\t");
                });                System.out.println();
            });
        }
        workbook.close();
    }
}
