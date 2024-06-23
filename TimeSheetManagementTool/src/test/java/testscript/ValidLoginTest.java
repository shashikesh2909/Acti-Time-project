package testscript;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericLib.BaseTest;
import genericLib.CustomListener;
import genericLib.Flib;
import pompages.LoginPage;

@Listeners(CustomListener.class)
public class ValidLoginTest extends BaseTest
{
	
	@Test(groups = "FT")
	public void validLogin() throws IOException
	{
		Flib lib = new Flib();
		String username = lib.ExcelFetch(Exc_path,"login",1,0);
		String password = lib.ExcelFetch(Exc_path,"login",1,1);	
		LoginPage lp = new LoginPage(driver);
		
		lp.login(username , password);
	}
}
