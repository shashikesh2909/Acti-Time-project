package dataprovider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import genericLib.Flib;
import genericLib.IAutoConstant;

public class WorkingDataProvider implements IAutoConstant
{
	@DataProvider (name ="TestData")
	public Object[][] testData()
	{
		Object o[][] = new Object[5][2];
		
		o[0][0] = "admin12345" ;
		o[0][1] = "manager12345" ;

		o[1][0] = "admin12345" ;
		o[1][1] = "manager12345" ;
		
		o[2][0] = "admin12345" ;
		o[2][1] = "manager12345" ;
		
		o[3][0] = "admin12345" ;
		o[3][1] = "manager12345" ;
		
		o[4][0] = "admin12345" ;
		o[4][1] = "manager12345" ;
		
		return o ;
	}
	
	@DataProvider (name ="TestDataexcel")
	public Object[][] testData1()
	{
		Flib lib = new Flib();
		
		Object o[][] = new Object[5][2];
		
		o[0][0] = lib.ExcelFetch(Exc_path, sheetcreatecustomer, 0, 0)
		o[0][1] = 

		o[1][0] = 
		o[1][1] = 
		
		o[2][0] = 
		o[2][1] = 
		
		o[3][0] = 
		o[3][1] = 
		
		o[4][0] = 
		o[4][1] = 
		
		return o ;
	}
	
	@Test(dataProvider = "TestData")
	public void loginWithDataProvider(String username , String password)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://desktop-6aohfh7/login.do");
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginbutton")).click();
	}
	
	
}
