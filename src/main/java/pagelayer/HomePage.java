package pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbase.BaseClass;

public class HomePage extends BaseClass {

	@FindBy(xpath="(//a[@id=\"itemc\"])[1]")
	private  WebElement phone;
	
	@FindBy(xpath="(//a[@class=\"hrefch\"])[1]")
	private  WebElement samsunggalaxy6;
	
	@FindBy(xpath="//a[text()='Nokia lumia 1520']")
	private  WebElement Nokialumia1520;
	
	@FindBy(xpath="//a[text()='Nexus 6']")
	private  WebElement Nexus6;

	@FindBy(xpath="//a[text()='Samsung galaxy s7']")
	private  WebElement Samsunggalaxys7;


	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnPhones() 
	{
		phone.click();
	}
	
	public void buySamsungGalaxy6()
	{
		samsunggalaxy6.click();
	}
	public void buyNokialumia1520()
	{
		Nokialumia1520.click();
	}
	public void buyNexus6()
	{
		Nexus6.click();
	}
	public void buySamsunggalaxys7()
	{
		Samsunggalaxys7.click();
	}
}
