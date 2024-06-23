package testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLib.BaseTest;
import genericLib.Flib;
import genericLib.WorkLib;
import pompages.CreateNewCustomer;
import pompages.CreateNewProject;
import pompages.HomePage;
import pompages.LoginPage;
import pompages.OpenTasks;
import pompages.ProjectAndCustomer;

public class CreateCustomerAndProjectTest extends BaseTest
{
	
	@Test
	public void createCustomerAndProject() throws IOException, InterruptedException
	{
		// Login into the Actitime
		Flib lib = new Flib();
		String username = lib.ExcelFetch(Exc_path,"login",1,0);
		String password = lib.ExcelFetch(Exc_path,"login",1,1);		
		LoginPage lp = new LoginPage(driver);
		lp.login(username, password);
		
		// click on Tasks on home page
		
		HomePage hp = new HomePage(driver);
		hp.clickOnTasks();
		
		//to click on project on customer
		OpenTasks ot = new OpenTasks(driver) ;
		ot.clickOnProjectAndCustomer();
		
		// to click on create new customer
		ProjectAndCustomer pnc = new ProjectAndCustomer(driver) ;
		pnc.clickOnCreateCustomer();
		
		// to filling the details and create a customer
		
		WorkLib r = new WorkLib();
		CreateNewCustomer cnc = new CreateNewCustomer(driver);
		String n = lib.ExcelFetch(Exc_path,sheetcreatecustomer,1, 0)+ r.getRandomNumber();
		cnc.creatingCustomer(n);
		
		// to crate a project now need to click on create project ProjectAndCustomer pom class
		pnc.clickOnCreateProject();
		
		// to fill in project details and create a project
		String cxname = lib.ExcelFetch(Exc_path,sheetprojectcreation,1,0);
		String pjname = lib.ExcelFetch(Exc_path,sheetprojectcreation,1,1)+r.getRandomNumber();
		CreateNewProject cnp = new CreateNewProject(driver) ;
		cnp.projectCreation(1, pjname);
	}
	
}
