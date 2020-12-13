package SeleniumFirstScript;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.IOException;
import org.testng.annotations.DataProvider;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadExcel {
	
	//@Test
	@DataProvider(name = "TestResult")
	public Object[][] ExcelDatas() throws BiffException, IOException, Exception{
		
		String filepath = "C:\\Users\\khush\\eclipse-workspace\\SeleniumFirstClass\\SeleniumFirstScript\\TestResult.xls";
		
		FileInputStream Excelfile = new FileInputStream(filepath);
		
		Workbook Exbook = Workbook.getWorkbook(Excelfile);
		
		Sheet Exsheet  = Exbook.getSheet("Sheet1");
		
		int Rows = Exsheet.getRows();
		int Columns = Exsheet.getColumns();
		
		String Testdata[][] = new String[Rows-1][Columns];
		
		int count = 0;
		
		for(int i=1;i<Rows;i++)
		{
			for(int j=0;j<Columns;j++) {
				
				Cell Excell = Exsheet.getCell(j,i);
				Testdata[count][j] = Excell.getContents();
			}
			count++;
		}
		Excelfile.close();
		return Testdata;
	}
	

}
