package day10.classroom;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Dataloading {
	
	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook wbook=new XSSFWorkbook("./data/createLead.xlsx");
		XSSFSheet wsheet = wbook.getSheetAt(0);
		int rowCount=wsheet.getLastRowNum();
		System.out.println(rowCount);
		short colCount=wsheet.getRow(0).getLastCellNum();
		System.out.println(colCount);
		for(int j=1; j<=rowCount;j++)
		{
		 XSSFRow row=wsheet.getRow(j);
		 for(int i=0;i<colCount;i++)
		 {
		XSSFCell cell=row.getCell(i);
		String value=cell.getStringCellValue();
		System.out.println(value+' ');
	}
 System.out.println();
}
	}}
	
