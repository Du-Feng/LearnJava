package com.example.poi;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

/**
 * https://www.baeldung.com/java-microsoft-excel
 * https://www.viralpatel.net/java-read-write-excel-file-apache-poi/
 */
public class ExcelDemo {
    public void ReadExcel(String fileLocation) {
        try (
                FileInputStream file = new FileInputStream(new File(fileLocation));
                Workbook workbook = new XSSFWorkbook(file);
        ) {
            int sheetNumber = workbook.getNumberOfSheets();
            System.out.println("Sheet Number: " + sheetNumber);
            for (int sheetIndex = 0; sheetIndex < sheetNumber; sheetIndex++) {
                ReadSheet(workbook, sheetIndex);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void ReadSheet(Workbook workbook, int sheetIndex) {
        Sheet sheet = workbook.getSheetAt(sheetIndex);
        System.out.println(String.format("\nSheet Number: %d. Sheet Name: %s", sheetIndex, sheet.getSheetName()));
        int i = 0;
        Map<Integer, List<String>> data = new HashMap<>();
        for (Row row : sheet) {
            ArrayList<String> rowData = new ArrayList<String>();
            for (Cell cell : row) {
                ReadCellValue(rowData, cell);
            }
            data.put(i, rowData);
            String rowString = rowData.stream().map(Object::toString).collect(Collectors.joining(", "));
            System.out.println("Row " + i + ": " + rowString);
            i++;
        }
    }

    private void ReadCellValue(ArrayList<String> rowData, Cell cell) {
        switch (cell.getCellType()) {
            case STRING:
                rowData.add(cell.getRichStringCellValue().getString());
                break;
            case BOOLEAN:
                rowData.add(Boolean.toString(cell.getBooleanCellValue()));
                break;
            case NUMERIC:
                if (DateUtil.isCellDateFormatted(cell)) {
                    rowData.add(cell.getDateCellValue().toString());
                } else {
                    rowData.add(Double.toString(cell.getNumericCellValue()));
                }
                break;
            case FORMULA:
                //rowData.add(cell.getCellFormula()); // To get the formula
                // To get the result after calculate the formula
                CellType resultType = cell.getCachedFormulaResultType();
                if (resultType == CellType.NUMERIC) {
                    rowData.add(Double.toString(cell.getNumericCellValue()));
                } else if (resultType == CellType.STRING) {
                    rowData.add(cell.getRichStringCellValue().getString());
                }
                break;
            case ERROR:
                rowData.add(Byte.toString(cell.getErrorCellValue()));
                break;
            case BLANK:
            case _NONE:
            default:
                rowData.add("");
                break;
        }
    }

    public void WriteExcel(String fileLocation) {
        try (
                FileOutputStream outputStream = new FileOutputStream(fileLocation);
                Workbook workbook = new XSSFWorkbook();
        ) {
            Sheet sheet = workbook.createSheet("Persons");
            sheet.setColumnWidth(0, 6000);
            sheet.setColumnWidth(1, 4000);

            Row header = sheet.createRow(0);

            CellStyle headerStyle = workbook.createCellStyle();
            headerStyle.setFillForegroundColor(IndexedColors.LIGHT_BLUE.getIndex());
            headerStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);

            XSSFFont font = ((XSSFWorkbook) workbook).createFont();
            font.setFontName("Arial");
            font.setFontHeightInPoints((short) 16);
            font.setBold(true);
            headerStyle.setFont(font);

            Cell headerCell = header.createCell(0);
            headerCell.setCellValue("Name");
            headerCell.setCellStyle(headerStyle);

            headerCell = header.createCell(1);
            headerCell.setCellValue("Age");
            headerCell.setCellStyle(headerStyle);

            CellStyle style = workbook.createCellStyle();
            style.setWrapText(true);

            Row row = sheet.createRow(1);
            Cell cell = row.createCell(0);
            cell.setCellValue("John Smith");
            ;
            cell.setCellStyle(style);

            cell = row.createCell(1);
            cell.setCellValue(20);
            cell.setCellStyle(style);

            workbook.write(outputStream);
            //workbook.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void WriteExcel(String fileLocation, String sheetName, List<Object[]> data) {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet(sheetName);
        int rowNum = 0;
        for (Object[] objArr : data) {
            Row row = sheet.createRow(rowNum++);
            int cellNum = 0;
            for (Object obj : objArr) {
                Cell cell = row.createCell(cellNum++);
                if (obj instanceof Date) {
                    cell.setCellValue((Date) obj);
                } else if (obj instanceof Boolean) {
                    cell.setCellValue((Boolean) obj);
                } else if (obj instanceof String) {
                    String cellValue = (String) obj;
                    if (cellValue.startsWith("=")) {
                        cell.setCellFormula(cellValue.substring(1));
                    } else {
                        cell.setCellValue((String) obj);
                    }
                } else if (obj instanceof Double) {
                    cell.setCellValue((Double) obj);
                } else if (obj instanceof Integer) {
                    cell.setCellValue((Integer) obj);
                } else {
                    cell.setCellValue(obj.toString());
                }
            }
        }

        try (
                FileOutputStream outputStream = new FileOutputStream(fileLocation);
        ) {
            workbook.write(outputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
