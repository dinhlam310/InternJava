package com.example.InternJava.week1;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class HaNoiTower {

    private static Workbook workbook = new XSSFWorkbook();
    private static Sheet sheet = workbook.createSheet("Data of HaNoiTower");

    private static int rowNumberStep = 2;
    private static int rowNumberCount = 2;
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long startTime = System.currentTimeMillis();

        System.out.println("Nhap so dia:");
        int n = sc.nextInt();
        solveHanoi(n, 'A', 'C', 'B');

        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        Row row1 = sheet.createRow(0);
        Cell cell_A = row1.createCell(0);
        cell_A.setCellValue("Tổng số đĩa : " + n + ", tổng thời gian chạy(mili sec)" + executionTime + " ms, tổng số bước :" + count);

        Row row2 = sheet.createRow(1);
        Cell cell_X = row2.createCell(0);
        cell_X.setCellValue("Bước thứ");

        Cell cell_B = row2.createCell(1);
        cell_B.setCellValue("Thay đổi");

        // Lưu workbook vào một file
        String filePath = "E:\\Algorithm\\Algorithm\\src\\main\\java\\com\\example\\InternJava\\MyExcel.xlsx";
        try (FileOutputStream outputStream = new FileOutputStream(filePath)) {
            workbook.write(outputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Count: " + count);
    }

    public static void solveHanoi(int n, char source, char destination, char auxiliary) {
        count += 1;
        addStepToExcelForCount(count);

        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            addStepToExcelForStep("Move disk " + n + " from " + source + " to " + destination);
            return;
        }
        solveHanoi(n - 1, source, auxiliary, destination);
        System.out.println("Move disk " + n + " from " + source + " to " + destination);

        addStepToExcelForStep("Move disk " + n + " from " + source + " to " + destination);
        solveHanoi(n - 1, auxiliary, destination, source);
    }

    public static void addStepToExcelForStep(String step) {
        Row row = sheet.getRow(rowNumberStep);
        if (row == null){
            row = sheet.createRow(rowNumberStep);
        }
        Cell cell = row.createCell(1);
        cell.setCellValue(step);
        rowNumberStep++;
    }

    public static void addStepToExcelForCount(int step) {
        Row row = sheet.getRow(rowNumberCount);
        if (row == null){
            row = sheet.createRow(rowNumberCount);
        }
        Cell cell = row.createCell(0);
        cell.setCellValue(step);
        rowNumberCount++;
    }

//    public static void addStepToExcelForCount(int step) {
//        if (rowNumberCount <= 9) {
//            Row row = sheet.getRow(rowNumberCount);
//            if (row == null) {
//                row = sheet.createRow(rowNumberCount);
//            }
//            Cell cell = row.createCell(0);
//            cell.setCellValue(step);
//            rowNumberCount++;
//        } else {
//            Row row = sheet.getRow(rowNumberCount - 7);
//            if (row == null) {
//                row = sheet.createRow(rowNumberCount - 7);
//            }
//            Cell cell = row.createCell(0);
//            cell.setCellValue(step);
//            rowNumberCount++;
//        }


}
