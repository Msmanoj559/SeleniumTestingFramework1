package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage 
{
	@FindBy(name="fld_username") WebElement userNameTextBox; 
	@FindBy(name="fld_email") WebElement userEmailTextBox;
	@FindBy(xpath="//input[@type='password']") WebElement userPasswordTextBox;

public void firstName()
{
	userNameTextBox.sendKeys("Manoj");
}

public void enterEmail()
{
	userEmailTextBox.sendKeys("Manoj");

}
public void enterPassword()
{
	userPasswordTextBox.sendKeys("123456");

}
}
