package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProjectAndCustomer extends BaseClass
{
	public ProjectAndCustomer(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//input[@value='Create New Customer']")
	private WebElement createcustomer ;
	
	@FindBy(xpath = "//input[@value='Create New Project']")
	private WebElement createproject ;
	
	@FindBy(linkText = "All")
	private WebElement all ;
	
	@FindBy(xpath = "//input[@value='Delete Selected']")
	private WebElement deleteselected ;
	
	@FindBy(xpath = "//input[@value='Delete These Customers']")
	private WebElement deletepopup ;
	
	
	public WebElement getCreatecustomer() {
		return createcustomer;
	}

	public WebElement getCreateproject() {
		return createproject;
	}
	
	public WebElement getall() {
		return all;
	}
	
	public WebElement getdeleteselected() {
		return deleteselected;
	}
	
	public WebElement getdeletepopup() {
		return deletepopup;
	}
	
	public void clickOnCreateCustomer()
	{
		createcustomer.click();
	}
	
	public void clickOnCreateProject()
	{
		createproject.click();
	}
	
	public void selectAndDelete()
	{
		all.click();
		deleteselected.click();
		deletepopup.click();
	}
}
