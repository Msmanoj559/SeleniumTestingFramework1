package Pack1;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class C {
	@BeforeTest
	public void Start()
	{
		System.out.println("Start Browser");
	}
	@Test
public void Tc_001()
{
	System.out.println("Test Case: 001");
	Assert.assertTrue(false);
}
	@Test(dependsOnMethods="Tc_001") // DependsON Annotation
public void Tc_002()
{
	System.out.println("Test Case: 002");
}
	@Test
public void Tc_003()
{
	System.out.println("Test Case: 003");
}

	@AfterTest
public void Close()
{
	System.out.println("Closing browser ");
}

}
