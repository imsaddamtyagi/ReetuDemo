package PharmaAddon;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestUtil {
	

	public static String TESTDATA_SHEET_PATH= "C:\\Users\\admin\\eclipse-workspace\\SAPWindowsPharmaAddonApplication\\Data For Test\\Test Data.xlsx";
	
	static Workbook book;
	static org.apache.poi.ss.usermodel.Sheet sheet;
	
	public static Object[][] getTestData(String sheetName)
	{
		FileInputStream file = null;
		try
		{
			file = new FileInputStream(TESTDATA_SHEET_PATH);
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		try {
			book = WorkbookFactory.create(file);
		}catch(InvalidFormatException e)
		{
			e.printStackTrace();
		}catch (IOException e)
		{
			e.printStackTrace();
		}
		
		sheet = book.getSheet(sheetName);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		
		for(int i=0;i<sheet.getLastRowNum();i++)
		{
			for(int k=0;k<sheet.getRow(0).getLastCellNum();k++)
			{
				data[i][k]= sheet.getRow(i+1).getCell(k).toString();
				
			}
		}
		return data;
	}

}
