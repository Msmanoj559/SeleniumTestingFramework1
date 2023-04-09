package hrtc;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PlayerLogin 
{
public WebDriver driver;
String day="31";
String year= "2023";
String month="March";

@BeforeMethod
public void createDriver()
{
	System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.hrtchp.com");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}

@Test
public void  bookTicket() throws InterruptedException
{
	//Open a Link in a new Tab
	WebElement loginLink = driver.findElement(By.xpath("//a[normalize-space()='Book Now!']"));
	Actions action=new Actions(driver);
	action.keyDown(Keys.CONTROL).moveToElement(loginLink).click().perform();	
	
	// Created Array List - initial it object to Switch new tab
    ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
    driver.switchTo().window(tabs.get(1));
   
    Thread.sleep(3000);
    driver.findElement(By.xpath("//*[@id=\"searchBtn\"]")).click();
    
 // Handle pop up
    Alert alert = driver.switchTo().alert();
    Thread.sleep(3000);
	alert.accept();
	
	// Select From List
	driver.findElement(By.xpath("//*[@id=\"fromPlaceName\"]")).sendKeys("ISBT");
	List <WebElement> dropList = driver.findElements(By.xpath("//ul[@id=\"ui-id-1\"]/li[@class=\"ui-menu-item\"]/a"));
	System.out.println("Size : "+ dropList.size());
	
	for(WebElement listResult : dropList){
	if(listResult.getText().equals("DELHI ISBT KASHMIRI GATE")){
			listResult.click();
			}
	}
	
	
	//To List - Select the Destination
	driver.findElement(By.name("toPlaceName")).sendKeys("CHAND");
	Thread.sleep(4000);
	List <WebElement> toList = driver.findElements(By.xpath("//*[@id=\"ui-id-4\"]/li"));
	System.out.println("Destination List : " + toList.size());
	for(WebElement destination : toList)
	{
		if(destination.getText().equals("CHANDIGARH"))
		{
		destination.click();
		}
	}
	
	// Select Date
	driver.findElement(By.name("txtJourneyDate")).click();

//	while(true)
//		{
//	String monthText = driver.findElement(By.xpath("//span[normalize-space()='March'] ")).getText();
//	System.out.println(monthText);
//		if(monthText.equals(month))
//		{
//			break;
//		}
//		else
//		{
//			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
//		}
//		
//		}
	


		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[5]/td[6]/a")).click();

		//Return 
		driver.findElement(By.name("txtReturnJourneyDate")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/table/tbody/tr[1]/td[7]/a")).click();
		driver.findElement(By.name("searchBtn")).click();
		
		
		driver.findElement(By.id("SrvcSelectBtnForward0")).click();
		Select smartCard= new Select (driver.findElement(By.id("concessionId")));
//		smartCard.selectByIndex(1);
		smartCard.selectByVisibleText("Smart Card");
		driver.findElement(By.name("OnwardLayoutBtn")).click();
		
		driver.findElement(By.xpath("//*[@id=\"ShowLayoutDiv\"]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[4]/td[2]/div/table/tbody/tr[1]/td/table/tbody/tr[1]/td[11][@id=\"Forward11\"]")).click();	
		
		driver.findElement(By.name("mobileNo")).sendKeys("8894300000");
		driver.findElement(By.name("email")).sendKeys("mks@yopmail.com");
		driver.findElement(By.name("cardNumber")).sendKeys("123456789");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		
		driver.findElement(By.xpath("//*[@id=\"BookNowBtnDivID\"]/*[@id=\"BookRetBtn\"]")).click();
		Alert alert1=driver.switchTo().alert();
		Thread.sleep(3000);
		alert1.accept();
		
		Select genderSelect= new Select(driver.findElement(By.id("genderCodeIdForward0")));
		genderSelect.selectByVisibleText("MALE");
		
		driver.findElement(By.id("passengerNameForward0")).sendKeys("Testing");
		driver.findElement(By.id("passengerAgeForward0")).sendKeys("99");
		driver.findElement(By.xpath("//*[@id=\"BookNowBtnDivID\"]/*[@id=\"BookRetBtn\"]")).click();

		Alert alert2=driver.switchTo().alert(); 
		Thread.sleep(3000);
		alert2.accept();
		
		driver.findElement(By.id("SrvcSelectBtnReturn1")).click();
		driver.findElement(By.name("ReturnLayoutBtn")).click();
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,350)", "");
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"ShowLayoutDiv\"]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[4]/td[2]/div/table/tbody/tr[1]/td/table/tbody/tr[1]/td[5][@id=\"Forward5\"]")).click();
		driver.findElement(By.id("BookNowBtn")).click();
}
@AfterMethod
public void closeBrowser()
{
//	driver.close();
//	driver.quit();
}
}
