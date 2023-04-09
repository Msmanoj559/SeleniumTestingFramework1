package Pack1;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class A 
{
	@BeforeMethod(alwaysRun=true)
	public void Start()
	{
		System.out.println("Start");
	}
	
	@AfterMethod(alwaysRun=true)
	public void close()
	{
		System.out.println("Close Browser");
	}
	
	@Test(priority=2)
	public void Tc_002()
	{
		System.out.println("Test Case 2 ``");
	}
	
	@Test(enabled=false)
	public void Tc_001()
	{
		System.out.println("Test Case 1");
	}
	
	@Test(priority=1)
	public void Tc_003()
	{
		System.out.println("Test Case 3");
		Assert.assertEquals("Hello", "Hi", "[Error]- Not Matched - ");
	}
	

	
}

