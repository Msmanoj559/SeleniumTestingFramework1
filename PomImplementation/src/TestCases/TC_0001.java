package TestCases;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Base.InstansiateDriver;
import Pages.RegisterPage;

public class TC_0001 extends InstansiateDriver
{
	@Test
public void tcase1() throws InterruptedException 
{
		
//Approach 1
//RegisterPage registerObj = PageFactory.initElements(driver, RegisterPage.class);
		
//Approach 2
RegisterPage registerObj=new RegisterPage();
PageFactory.initElements(driver, registerObj);

registerObj.enterEmail();
registerObj.enterPassword();
registerObj.firstName();
registerObj.confirmEnterPassword();
registerObj.userDob();
registerObj.userPhone();
registerObj.userAddressType();
registerObj.userSex();
registerObj.userCountry();
registerObj.userCountryState();
registerObj.userCity();
registerObj.userZipCode();
registerObj.termsCondition();
registerObj.signUp();
}
}