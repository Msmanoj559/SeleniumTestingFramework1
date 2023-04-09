package hrtc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IFramesDemo {
public WebDriver driver;

@BeforeMethod
public void startBrowser(){
//System.setProperty("webdriver.driver.driver", "./driver/chromedriver.exe");
//driver=new ChromeDriver();
System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
driver=new FirefoxDriver();
driver.manage().window().maximize();
//driver.navigate().to("https://demo.automationtesting.in/Frames.html");
driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe");
}

@Test(enabled = false)
public void TC_iframe001() throws InterruptedException
{
driver.switchTo().frame("SingleFrame");
driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("123");
driver.switchTo().defaultContent();
Thread.sleep(3000);
//driver.navigate().refresh();

driver.findElement(By.xpath("//a[normalize-space()='Iframe with in an Iframe']")).click();

Thread.sleep(3000);
WebElement outerframe = driver.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe"));
driver.switchTo().frame(outerframe);
Thread.sleep(6000);

WebElement innerframe = driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
driver.switchTo().frame(innerframe);

driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Manoj");

}


@Test
public void w3school_Tciframe()
{
driver.switchTo().frame("iframeResult"); //outer frame
System.out.println("Text of outer iframe : " + driver.findElement(By.xpath("/html/body/h1")).getText());
//driver.switchTo().frame(0);

WebElement frame2=driver.findElement(By.xpath("/html/body/iframe")); // inner frame
driver.switchTo().frame(frame2);
System.out.println("Text of Inner iframe: " + driver.findElement(By.xpath("//*[@id=\"w3loginbtn\"]")).getText());


driver.switchTo().parentFrame();
System.out.println("Text of outer iframe : " + driver.findElement(By.xpath("/html/body/h1")).getText());


//WebElement innerFrameText = driver.findElement(By.xpath("/html/body/iframe"));
//driver.switchTo().frame(innerFrameText);
//String text = innerFrameText.getText();
//System.out.println(text);





	
}



@AfterMethod
public void close()
{
driver.close();
}

}
