package UtilityClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class KiteUtility1 {
	public static String getTD(int rowIndex,int colIndex) throws Throwable {
FileInputStream fis=new FileInputStream("C:\\Users\\lenovo\\Documents\\DDFramework.xlsx");
Sheet sh=WorkbookFactory.create(fis).getSheet("sheet1");
String data = sh.getRow(rowIndex).getCell(colIndex).getStringCellValue();
 return data;
}
}

