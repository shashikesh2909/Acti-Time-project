package genericLib;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseTest implements IAutoConstant
{
	public WebDriver driver ;
	public static WebDriver stdriver ;
	
	
	@BeforeSuite(alwaysRun = true)
	public void beforeSuite()
	{
		Reporter.log("Connection with server",true);
	}
	
	@BeforeTest (alwaysRun = true)
	public void beforeTest()
	{
		Reporter.log("Connection with Database",true);
	}
	
	@Parameters("browser")
	@BeforeClass(alwaysRun = true)
	public void beforeClass(@Optional("chrome") String browser) throws IOException
	{
		Flib lib = new Flib();
	//	String browser = lib.propFetch(pro_path,"browser");
		String url = lib.propFetch(pro_path,"url");
		

		if(browser.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else
		{
			Reporter.log("Invalid browser",true);
		}
		stdriver = driver ;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
		}
	
	@AfterClass (alwaysRun = true)
	public void AfterClass()
	{
		driver.close();
		Reporter.log("Closing the browser",true);
	}
	
	@AfterTest (alwaysRun = true)
	public void AfterTest()
	{
		Reporter.log("disconnecting with database",true);
	}
	
	@AfterSuite (alwaysRun = true)
	public void AfterSuite()
	{
		Reporter.log("disconnecting with server " ,true);
	}
	
}
