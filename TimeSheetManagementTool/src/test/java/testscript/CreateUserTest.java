package testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLib.BaseTest;
import genericLib.Flib;
import genericLib.WorkLib;
import pompages.CreateNewUser;
import pompages.HomePage;
import pompages.LoginPage;
import pompages.UserList;

public class CreateUserTest extends BaseTest 
{
	@Test(groups = "FT")
	public void createUser() throws IOException
	{
		// Login into the Actitime
		Flib lib = new Flib();
		String username = lib.ExcelFetch(Exc_path,"login",1,0);
		String password = lib.ExcelFetch(Exc_path,"login",1,1);		
		LoginPage lp = new LoginPage(driver);
		lp.login(username , password);
		
		// to click on users link on home page
		HomePage hp = new HomePage(driver);
		hp.clickOnUsers();
		
		// to click on create a new user option
		UserList ul = new UserList(driver);
		ul.clickOnCreateNewUser();
		
		// to fill in the details and creates a user 
		WorkLib r = new WorkLib();
		CreateNewUser cu = new CreateNewUser(driver);
		String uname = lib.ExcelFetch(Exc_path,sheetcreateuser,1,0) + r.getRandomNumber();
		String pwd = lib.ExcelFetch(Exc_path,sheetcreateuser,1,1) ;
		String repwd = lib.ExcelFetch(Exc_path,sheetcreateuser,1,1) ;
		String fname = lib.ExcelFetch(Exc_path,sheetcreateuser,1,2) + r.getRandomNumber();
		String lname = lib.ExcelFetch(Exc_path,sheetcreateuser,1,3) + r.getRandomNumber();
		
		CreateNewUser cnu = new CreateNewUser(driver) ;
		cnu.createNewUser(uname, pwd, fname, lname);
	}
}
