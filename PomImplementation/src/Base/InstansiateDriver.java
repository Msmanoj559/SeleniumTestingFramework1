package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class InstansiateDriver 
{
public WebDriver driver;
@BeforeMethod
public void startBrowser()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manoj\\Downloads\\chromedriver_win32\\chromedriver.exe");	
	driver=new ChromeDriver();
	driver.get("https://www.thetestingworld.com/testings");
	}

@AfterMethod
public void closeBrowser()
	{
	driver.close();
	}
}
