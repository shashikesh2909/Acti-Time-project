package pompages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InvalidLogin extends BaseClass
{

	public InvalidLogin(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy (name = "username")
	private WebElement username ;
	
	@FindBy (name = "pwd")
	private WebElement password ;
	
	@FindBy (id = "loginButton")
	private WebElement loginbutton ;
	
	
	
	public WebElement getUsername() {
		return username;
	}



	public WebElement getPassword() {
		return password;
	}



	public WebElement getLoginbutton() {
		return loginbutton;
	}



	public void invalidlogin(String uname , String pwd) throws IOException
	{
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginbutton.click();
		username.clear();
	}

}
