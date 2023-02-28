package Pack1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class A 
{
	@BeforeTest
	public void Start()
	{
		System.out.println("Start");
	}
	
	@AfterTest
	public void close()
	{
		System.out.println("Close");
	}
	
	@Test
	public void Tc_002()
	{
		System.out.println("Test Case 2 ``");
	}
	
	@Test
	public void Tc_001()
	{
		System.out.println("Test Case 1");
	}
	
	@Test
	public void Tc_003()
	{
		System.out.println("Test Case 3");
	}
	

	
}

