package genericLib;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib implements IAutoConstant
{
	public int numrow ;
	public String propFetch(String path , String key) throws IOException
	{
		FileInputStream f = new FileInputStream(path);
		Properties p = new Properties() ;
		p.load(f);
		return p.getProperty(key) ;
	}
	
	
	public String ExcelFetch(String path , String sheet , int row ,int cell) throws IOException
	{
		FileInputStream fis = new FileInputStream(path);
		Workbook book = WorkbookFactory.create(fis) ;
		numrow = book.getSheet(sheet).getLastRowNum();
		return book.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();	
	}
	
	public int getRowNum(String path , String sheet) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(path);
		Workbook book = WorkbookFactory.create(fis) ;
		return book.getSheet(sheet).getLastRowNum();
	}
	
}
