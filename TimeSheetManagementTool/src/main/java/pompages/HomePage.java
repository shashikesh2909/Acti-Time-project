package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BaseClass 
{
	public HomePage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(xpath = "//a[@class='content users']")
	private WebElement user ;
	
	@FindBy(xpath = "//a[@class='content tasks']")
	private WebElement tasks ;

	public WebElement getUser() {
		return user;
	}
	
	public void clickOnUsers()
	{
		user.click();
	}

	public void clickOnTasks()
	{
		tasks.click();
	}
	
	
	
}
