package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateNewUser extends BaseClass
{

	public CreateNewUser(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(name = "username")
	private WebElement uname ;
	
	@FindBy(name = "passwordText")
	private WebElement pwd ;
	
	@FindBy(name = "passwordTextRetype")
	private WebElement repwd ;
	
	@FindBy(name = "firstName")
	private WebElement fname ;
	
	@FindBy(name = "lastName")
	private WebElement lname ;
	
	@FindBy(xpath = "//input[@value='   Create User   ']")
	private WebElement createuser ;

	public WebElement getUname() {
		return uname;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public WebElement getRepwd() {
		return repwd;
	}

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}
	
	public void createNewUser (String username , String password , String firstname , String lastname)
	{
		uname.sendKeys(username);
		pwd.sendKeys(password);
		repwd.sendKeys(password);
		fname.sendKeys(firstname);
		lname.sendKeys(lastname);
		createuser.click();
	}

}
