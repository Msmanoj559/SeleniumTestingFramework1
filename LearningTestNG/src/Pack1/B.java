package Pack1;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class B 
{
	@BeforeMethod
	public void Start()
	{
		System.out.println("Start Browser");
	}
	@Test
public void Tc_001()
{
	System.out.println("Test Case: 001");
}
	@Test
public void Tc_002()
{
	System.out.println("Test Case: 002");
	Assert.assertEquals("Hello", "Hillo");
}


	@AfterMethod
public void Close()
{
	System.out.println("Close Browser");
}

}
