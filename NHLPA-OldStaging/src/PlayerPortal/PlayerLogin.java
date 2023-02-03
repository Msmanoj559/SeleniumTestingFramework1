package PlayerPortal;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PlayerLogin 
{
public WebDriver driver;

@BeforeMethod
public void createDriver()
{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://nhl-nhlpawlp-stg1.agilecollab.com/User/Login?ReturnUrl=%2F");
}

@Test
public void  TestCase_001() throws InterruptedException
{
driver.findElement(By.id("name")).sendKeys("manoj.kumar@netsolutions.com");
driver.findElement(By.id("password")).sendKeys("Admin@123");
driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
driver.findElement(By.id("AccessCode")).sendKeys("123456");
driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
Actions ActObject=new Actions(driver);

//Click on moreresource to go in video feature page
ActObject.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'More Resources')]"))).perform();
driver.findElement(By.xpath("//a[contains(text(),'UNLMT Video Features')]")).click();
driver.findElement(By.name("Search")).sendKeys("testings");
driver.findElement(By.xpath("//Span[@class=\"dib pa2 ba b--moon-gray hover-bg-blue hover-b--blue c-pointer\"]")).click();
//driver.findElement(By.xpath("//label[contains(text(),'Test')]//input[@type=\"checkbox\" and @value=\"10\"]")).click();
driver.findElement(By.xpath("//label[@class='container db relative f5 fw7 black tl']")).click();
driver.findElement(By.id("btnCross")).click();
//driver.findElement(By.xpath("//div[@class=\"relative h-100 w-100 c-pointer\"]//img[@src=\"https://unlmtmediaservicedev-cact.streaming.media.azure.net/aef88366-6afc-44d2-93af-c465e820f780/Thumbnail000001.jpg\"]")).click();
ActObject.moveToElement(driver.findElement(By.xpath("//div[@class='w-auto flex']"))).perform();
driver.findElement(By.xpath("//div[@class='w-100 scrollbar']//p[contains(text(),'test')]")).click();
driver.findElement(By.name("Search")).sendKeys("test");
driver.findElement(By.id("btnSearchVideoClear")).click();

//Click on profile to go to accounts of player
driver.findElement(By.xpath("//span[contains(text(),'Kumar')]")).click();
driver.findElement(By.xpath("//a[contains(text(),'profile')]")).click();
driver.findElement(By.xpath("//button[@type=\"button\" and @onClick=\"location.href='/Account/Create'\"]")).click();
driver.findElement(By.xpath("//input[@value=\"Save\"]")).click();

//Network portal
//ActObject.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'More Resources')]"))).perform();

driver.findElement(By.xpath("//a[@title='Networking Hub']//*[name()='svg']")).click();
driver.findElement(By.xpath("//img[@alt=\"profile-check\"]")).click();
driver.findElement(By.xpath("//a[contains(text(),'EDIT PROFILE')]")).click();
driver.findElement(By.name("MobilePhone")).clear();
driver.findElement(By.name("MobilePhone")).sendKeys("+918894316392");


//driver.findElement(By.id("divProfileCountry']")).click();
List<WebElement> allOptions = driver.findElements(By.xpath("//ul[@class=\"select-options scrollbar\"]"));
System.out.println(allOptions.size());

for(int i = 0; i<=allOptions.size()-1; i++) {   
    if(allOptions.get(i).getText().contains("ANGOLA")) {
        allOptions.get(i).click();
        break;
       
    }
}



}

@AfterMethod
public void closeBrowser()
{
//	driver.close();
}
}
