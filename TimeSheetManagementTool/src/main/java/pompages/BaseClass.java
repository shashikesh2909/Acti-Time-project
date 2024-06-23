package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import genericLib.IAutoConstant;

public class BaseClass implements IAutoConstant
{
	public BaseClass(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
