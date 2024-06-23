package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserList extends BaseClass
{
	public UserList(WebDriver driver) 
	{
		super(driver);
	}
	@FindBy (xpath = "//input[@value='Create New User']")
	private WebElement CreateNewUser ;
	
	public void clickOnCreateNewUser ()
	{
		CreateNewUser.click();
	}
	public WebElement getCreateNewUser() 
	{
		return CreateNewUser;
	}
}
