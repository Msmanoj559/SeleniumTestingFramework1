package hrtc;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

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
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test
public class SeleniumSample 
{
public WebDriver driver;

@BeforeMethod
public void createDriver()
{
	System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
@Test
public void testAutomation0001()
{
	driver.findElement(By.xpath("//*[@id=\"Wikipedia1_wikipedia-search-input\"]")).sendKeys("TestNg");
	driver.findElement(By.xpath("//*[@id=\"Wikipedia1_wikipedia-search-form\"]/div/span[2]/span[2]/input")).click();
	driver.findElement(By.xpath("//*[@id=\"wikipedia-search-result-link\"]/a[1]")).click();
   
//	Set<String> windowHandles = driver.getWindowHandles();
//    List<String> windowHandlesList = new ArrayList<>(windowHandles); //Set to List Conversion
//    System.out.println("Total window number: " + windowHandlesList.size() + "\n");
//    driver.switchTo().window(windowHandlesList.get(1));
//    System.out.println("Current Window Handle: " + driver.getWindowHandle() + "\n");
    
    
    String mainWindowHandle = driver.getWindowHandle();
    Set<String> S = driver.getWindowHandles(); // set is a class to storing multiple value in String value
    for(String i :S)
 {
//    	System.out.println(i);
	 String j = driver.switchTo().window(i).getTitle();
	 System.out.println(j);
 }
}

@Test(enabled = false)
public void  testAutomationPractice() throws InterruptedException
{
	
	//Switched to Alert & Assertion of response
	driver.findElement(By.xpath("//*[@id=\"HTML9\"]/div[1]/button")).click();
	Alert alert = driver.switchTo().alert();
	Thread.sleep(3000);
	String alertText= alert.getText();
	String ExpectedString="Press a button!";
	Assert.assertEquals(alertText, ExpectedString);
	alert.accept();
	WebElement result = driver.findElement(By.xpath("//*[@id=\"demo\"]"));
	String resultText=result.getText();
	String ExpectedText="You pressed OK!";
	Assert.assertEquals(resultText, ExpectedText);
	
	driver.navigate().refresh();
	//Switched to Alert & Assertion of response
//	driver.findElement(By.xpath("//*[@id=\"HTML9\"]/div[1]/button")).click();
//	Alert alert1 = driver.switchTo().alert();
//	String resultStore = alert1.getText();
//	alert1.accept();
//	WebElement result3= driver.findElement(By.xpath("//*[@id=\"demo\"]"));
//	if(resultStore.contains("accepted"))
//	{
//		String ExpResultAccepted="You pressed OK!";
////		Assert.assertEquals(resultStore, ExpResultAccepted);
//        assert result3.getText().equals(ExpResultAccepted);
//	}
//	else
//	{
//		String ExpResultCancelled="You pressed Cancel!";	
////		Assert.assertEquals(resultStore, ExpResultCancelled);
//        assert result3.getText().equals(ExpResultCancelled);	
//	}

}
@AfterMethod
public void closeBrowser()
{
//	driver.close();
	driver.quit();
}
}
