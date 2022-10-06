package testbase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import pagelayer.HomePage;
import utility.Util;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static HomePage h;
	
	public static Util util;
	
	@BeforeMethod
	public void launchDriver()
	{
  WebDriverManager.chromedriver().setup();
  
  driver=new ChromeDriver();
  driver.manage().window().maximize();
  driver.navigate().to("https://www.demoblaze.com/#");
  driver.manage().deleteAllCookies();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  
  h=new HomePage();
  
  util=new Util();
  
}
  @AfterMethod
  public void CloseDriver()
  {
	  driver.quit();
  }
  }