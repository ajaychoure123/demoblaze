package utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbase.BaseClass;

public class Util extends BaseClass{

	@FindBy(xpath="//*[@class=\"btn btn-success btn-lg\"]")
	private  WebElement addtocart;
	
	public Util()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void addtocart()
	{
		addtocart.click();
	}
	
}
