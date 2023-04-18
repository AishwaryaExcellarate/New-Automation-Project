package ObjectRepositry;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import GeneralComponents.BaseClass;

public class ExcelData 
{
	@Test
	public ArrayList<String> getDatafromExcel(String testcaseName) throws IOException
	{
		ArrayList<String>a=new ArrayList<String>();
		FileInputStream fis=new FileInputStream("C:\\Users\\aishwaryaa\\eclipse-workspace\\NewAutomationProject\\src\\test\\resources\\TestData\\Rahulshettyacademy.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		int sheets = workbook.getNumberOfSheets();
		for(int i=0;i<sheets;i++)
		{
			if(workbook.getSheetName(i).equalsIgnoreCase("LoginpageData"))
			{
				XSSFSheet sheet = workbook.getSheetAt(i);
				Iterator<Row> rows = sheet.iterator();
				Row firstrow = rows.next();	
				Iterator<Cell> cell = firstrow.cellIterator();
				int k=0;
				int column = 0;
				while(cell.hasNext())
				{
					Cell value = cell.next();
					if(value.getStringCellValue().equalsIgnoreCase(testcaseName))
					{
						column=k;
					}
					k++;

				}
				System.out.println(column);

				while(rows.hasNext())
				{
					Row r = rows.next();
					if(r.getCell(column).getStringCellValue().equalsIgnoreCase("Username"))
					{
						Iterator<Cell> cv = r.cellIterator();
						while(cv.hasNext())
						{

							a.add(cv.next().getStringCellValue());
						}
					}


				}


			}
			


		}
		return a;




	}

}
