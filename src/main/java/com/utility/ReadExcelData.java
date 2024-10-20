package com.utility;

import java.io.File;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;
import com.mysql.cj.result.Row;

public class ReadExcelData {
	public static void main(String[] args) {
		
	}
	private  void readParticularCell(){
		File file=new File("\"C:\\Users\\91988\\OneDrive\\Documents\\DataDriven.xlsx\"");
		Workbook book=new XSSFWorkbook(file);
		
		Sheet sheet=book.getSheetAt(0);
		Row row=sheet.getRow(0);
		int lastRowNum=sheet.getLastRowNum();
		System.out.println("No of rows"+lastRowNum);
		short lastcellNo=Sheet.getRow(0);//check the line
		Cell cell=row.getCell(2);
		//double data=cell.getNumericCellValue();
		DataFormatter dataFormat=new DataFormatter();
		String data=dataFormat.formatCellValue(cell);
		System.out.println(data);
		
	} 
	private void readParticularMultiCells(){
		File file=new File("\"C:\\Users\\91988\\OneDrive\\Documents\\DataDriven.xlsx\"");
		Workbook book=new XSSFWorkbook(file);
		
		Sheet sheet=book.getSheetAt(0);
		Row row=sheet.getRow(0);
		Cell cell=row.getCell(2);
		//double data=cell.getNumericCellValue();
		DataFormatter dataFormat=new DataFormatter();
		String data=dataFormat.formatCellValue(cell);
		System.out.println(data);
		
	}
	private void readAllData() {
		
	}

}
