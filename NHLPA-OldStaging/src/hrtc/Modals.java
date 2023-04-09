package hrtc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Modals {
public WebDriver driver;

@BeforeMethod
public void startBrowser(){
//System.setProperty("webdriver.driver.driver", "./driver/chromedriver.exe");
//driver=new ChromeDriver();
System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
driver=new FirefoxDriver();
driver.manage().window().maximize();
//driver.navigate().to("https://demo.automationtesting.in/Frames.html");
driver.get("https://demo.automationtesting.in/Modals.html");
}
@Test
public void w3school_Tciframe()
{
	
}



@AfterMethod
public void close()
{
//driver.close();
}

}
