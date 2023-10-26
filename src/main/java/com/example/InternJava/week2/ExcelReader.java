package com.example.InternJava.week2;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReader {
    public static void main(String[] args) {
        String filePath = "E:\\Algorithm\\Algorithm\\src\\main\\java\\com\\example\\InternJava\\MyExcel.xlsx";

        try (FileInputStream fis = new FileInputStream(filePath);
             Workbook workbook = WorkbookFactory.create(fis)) {

            // Lấy sheet đầu tiên từ workbook
            Sheet sheet = workbook.getSheetAt(0);

            // Duyệt qua từng dòng trong sheet
            for (Row row : sheet) {
                // Duyệt qua từng ô trong dòng
                for (Cell cell : row) {
                    // In ra giá trị của ô
                    System.out.print(cell.toString() + "\t");
                }
                System.out.println();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
