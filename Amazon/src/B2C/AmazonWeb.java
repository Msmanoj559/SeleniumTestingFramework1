package B2C;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AmazonWeb 


{
	public ChromDriver driver;
	@BeforeMethod
	public void startBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manoj\\Downloads\\driver\\chromedriver.exe");
		driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
	}

	@Test
	public void tc001_home() throws InterruptedException
	{
		Actions act=new Actions(driver);
		act.moveToElement((WebElement) By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).build().perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='nav-flyout-ya-signin']//a[@class='nav-action-button']//Span[contains(text(),'Sign in')]")).click();
		driver.findElement(By.name("email")).sendKeys("15bcs8056@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("Mstar@12");
		driver.findElement(By.id("signInSubmit")).click();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("Apple iPhone 12 (128GB) - White");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
//		driver.findElement(By.linkText("Apple iPhone 12 (128GB) - Black")).click();
		driver.findElement(By.xpath("//div[@class='a-section aok-relative s-image-fixed-height' or  contains(text(),'alt=\"Sponsored Ad - Apple iPhone 12 (128GB)')]")).click();
		driver.switchTo().window(driver.getWindowHandles().stream().reduce((f, s) -> s).orElse(null));// NEW
		driver.findElement(By.xpath("//input[@id='add-to-cart-button'  or contains(text(),'Add to cart')]")).click();

		Thread.sleep(5000);
		driver.navigate().refresh();
		driver.findElement(By.xpath("//span[@class='nav-cart-icon nav-sprite']")).click();
	}
	
	
	
	@AfterMethod
	public void closeBrowser() 
	{
//	driver.close();
	}
}	