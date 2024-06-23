package pompages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import genericLib.Flib;

public class LoginPage extends BaseClass
{
	public LoginPage(WebDriver driver) 
	{
		super(driver);
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



	public void login(String uname , String pwd) throws IOException
	{
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginbutton.click();
	}
}
