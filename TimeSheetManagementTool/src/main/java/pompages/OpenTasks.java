package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpenTasks extends BaseClass
{

	public OpenTasks(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(xpath = "//a[text()='Projects & Customers']")
	private WebElement projcutomer ;

	public WebElement getProjcutomer() {
		return projcutomer;
	}
	
	public void clickOnProjectAndCustomer()
	{
		projcutomer.click();
	}

}
