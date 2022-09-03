package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage 
{
	@FindBy(name="fld_username") WebElement userNameTextBox; 
	@FindBy(name="fld_email") WebElement userEmailTextBox;
	@FindBy(xpath="//input[@type='password']") WebElement userPasswordTextBox;
	@FindBy(name="fld_cpassword")WebElement userConfirmPasswordTextBox;
	@FindBy(name="dob") WebElement UserDobPicker;
	@FindBy(name="phone") WebElement UserPhoneTextField;
	@FindBy(xpath="//input[@type='radio' and @value='home']") WebElement userAddressTypeRadioButton;
	@FindBy(xpath="//Select[@name='sex']//option[@value='1']") WebElement userMaleSexDropdown;
	@FindBy(xpath="//Select[@name='country']//option[@value='101']") WebElement userCountryDropdown;
	@FindBy(xpath="//Select[@name='state']//option[@value='14']") WebElement userCountryStateDropdown;
	@FindBy(xpath="//Select[@name='city']//option[@value='1225']") WebElement userCityDropdown;
	@FindBy(name="zip") WebElement userZipTextbox;
	@FindBy(name="terms") WebElement termsCheckbox;
	@FindBy(xpath="//input[@value='Sign up']") WebElement signUpButton;

	
public void firstName()
{
	userNameTextBox.sendKeys("Manoj Sharma");
}

public void enterEmail()
{
	userEmailTextBox.sendKeys("Mks.qa000@gmail.com");

}
public void enterPassword()
{
	userPasswordTextBox.sendKeys("123456");

}
public void confirmEnterPassword()
{
	userConfirmPasswordTextBox.sendKeys("123456");
}
public void userDob()
{
	UserDobPicker.sendKeys("09/02/1993");
}
public void userPhone()
{
	UserPhoneTextField.sendKeys("88943163922");
}
public void userAddressType()
{
	userAddressTypeRadioButton.click();
}
public void userSex()
{
	userMaleSexDropdown.click();
}

public void userCountry() throws InterruptedException
{
	userCountryDropdown.click();
	Thread.sleep(4000);
}
public void userCountryState() throws InterruptedException
{
	userCountryStateDropdown.click();
	Thread.sleep(4000);
}
public void userCity()
{
	userCityDropdown.click();
}
public void userZipCode()
{
	userZipTextbox.sendKeys("176044");
}
public void termsCondition()
{
	termsCheckbox.click();
}
public void signUp()
{
	signUpButton.click();
}
}
