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
public class WindowHandles 
{
public WebDriver driver;
@BeforeMethod
public void createDriver()
{
	System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.automationtesting.in/Windows.html");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
@Test(enabled = false)
public void testAutomation0001() throws InterruptedException
{
driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
String parent_handle= driver.getWindowHandle();
//System.out.println("Parent Window Handle: " + parent_handle);
driver.findElement(By.xpath("//*[@id=\"Seperate\"]/button")).click();

// Getting the window handles of all the open windows
Set <String> WindowHandles=driver.getWindowHandles();

// Creating an ArrayList to store the window titles
ArrayList<String> windowTitles =new ArrayList <String>();

// Iterating through the window handles using for-each loop
	for(String windowHandle :WindowHandles){
		
        // Switching to the window with the current window handle
		driver.switchTo().window(windowHandle);

		// Getting the title of the current window
		String pageTitle = driver.getTitle();
		windowTitles.add(pageTitle);
	}
	
    // Printing the window titles to the console
for(String Title: windowTitles){
	System.out.println("Page Title: " + Title);
}


for(String handle: WindowHandles){
//	System.out.println("Child Window: "+handle);
	if(!handle.equals(parent_handle)){
		driver.switchTo().window(handle);
		Thread.sleep(5000);
		String title=driver.getTitle();
		System.out.println("Child page title : " + title);
		driver.findElement(By.xpath("/html/body/div/main/section[2]/div/div/div[1]/div/div[2]/div/a")).click();
	driver.close();
	}
}
driver.switchTo().window(parent_handle);
driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
Thread.sleep(3000);

}

@Test
public void alertTC_001() throws InterruptedException
{
driver.navigate().to("https://demo.automationtesting.in/Alerts.html");
driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
Alert alert = driver.switchTo().alert();
String diplayText = alert.getText();
System.out.println(diplayText);
Thread.sleep(3000);
alert.accept();

driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
Alert alert1 = driver.switchTo().alert();
String diplayText1 = alert.getText();
System.out.println(diplayText1);
Thread.sleep(3000);
alert1.dismiss(); 
String getText = driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText();
String ExpectedText="You Pressed Cancel";
Assert.assertEquals(getText, ExpectedText);


driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
Alert alert2 = driver.switchTo().alert();
alert2.getText();
Thread.sleep(3000);
//alert2.sendKeys("mks");
alert2.accept();

String getText1= driver.findElement(By.xpath("//*[@id=\"demo1\"]")).getText();
String ExpectedText1="Hello mks How are you today";
Assert.assertEquals(getText1, ExpectedText1);


}


@AfterMethod
public void closeBrowser()
{
//	driver.close();
	driver.quit();
}
}
