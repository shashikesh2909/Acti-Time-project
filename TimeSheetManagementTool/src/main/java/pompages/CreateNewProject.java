package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CreateNewProject extends BaseClass
{

	public CreateNewProject(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(name = "customerId")
	private WebElement customername ;
	
	@FindBy(name = "name")
	private WebElement projectname ;
	
	@FindBy(name = "createProjectSubmit")
	private WebElement projectsubmitbutton ;

	public WebElement getCustomername() {
		return customername;
	}

	public WebElement getProjectname() {
		return projectname;
	}

	public WebElement getProjectsubmitbutton() {
		return projectsubmitbutton;
	}
	
	public void projectCreation( int num , String pjname) throws InterruptedException
	{
		customername.click();
		Select s = new Select(customername) ;
		s.selectByIndex(num);
		projectname.sendKeys(pjname);
		projectsubmitbutton.click();
		
	}

}
