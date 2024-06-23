package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateNewCustomer extends BaseClass
{

	public CreateNewCustomer(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(name = "name")
	private WebElement name ;
	
	@FindBy(name = "createCustomerSubmit")
	private WebElement createbutton ;

	public WebElement getName() {
		return name;
	}

	public WebElement getCreatebutton() {
		return createbutton;
	}
	
	public void creatingCustomer(String Name)
	{
		name.sendKeys(Name);
		createbutton.click();
	}
	
}
