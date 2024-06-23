package testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLib.BaseTest;
import genericLib.Flib;
import pompages.HomePage;
import pompages.LoginPage;
import pompages.OpenTasks;
import pompages.ProjectAndCustomer;

public class DeleteAllProjectsCustomerTest extends BaseTest
{
	@Test
	public void deleteAll() throws IOException
	{
		//login into actitime page
		Flib lib = new Flib();
		String username = lib.ExcelFetch(Exc_path,"login",1,0);
		String password = lib.ExcelFetch(Exc_path,"login",1,1);		
		LoginPage lp = new LoginPage(driver);
		lp.login(username , password);
		
		// click on tasks
		HomePage hp = new HomePage(driver);
		hp.clickOnTasks();
		
		//click on project and customer 
		OpenTasks ot = new OpenTasks(driver);
		ot.clickOnProjectAndCustomer();
		
		// select all and delete 
		ProjectAndCustomer pac = new ProjectAndCustomer(driver);
		pac.selectAndDelete();
	}
}
