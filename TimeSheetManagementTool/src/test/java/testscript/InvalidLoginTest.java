package testscript;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLib.BaseTest;
import genericLib.Flib;
import pompages.InvalidLogin;

public class InvalidLoginTest extends BaseTest
{
	@Test(groups = "FT")
	public void script1() throws IOException, InterruptedException
	{
		Reporter.log("Invalid login",true);
		Flib lib = new Flib();
		int rows = lib.getRowNum(Exc_path,"invalidlogin") ;
		
		for(int i=1;i<rows;i++)
		{
			InvalidLogin ilp = new InvalidLogin(driver) ;
			String username = lib.ExcelFetch(Exc_path,"invalidlogin",i, 0);
			String password = lib.ExcelFetch(Exc_path,"invalidlogin",i, 1);
			ilp.invalidlogin(username, password);
		}
	}
	
	
}

