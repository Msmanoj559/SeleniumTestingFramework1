package Pack1;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class B 
{
	@BeforeMethod(alwaysRun=true)
	public void Start()
	{
		System.out.println("Start Browser");
	}
	
	@Test(groups= {"Sanity", "High"})
public void Tc_001()
{
	System.out.println("Test Case: Sanity");
}
	
	@Test(groups= {"Medium", "Smoke"})
	public void Tc_002()
	{
	System.out.println("Test Case: Smoke");
	Assert.assertEquals("Hello", "Hello");
	}

	@AfterMethod(alwaysRun=true)
public void Close()
{
	System.out.println("Close Browser");
}

}
