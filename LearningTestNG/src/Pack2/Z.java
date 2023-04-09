package Pack2;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Z 
{
@BeforeMethod
public void Start()
{
	System.out.println("Start IT");
}
@Test(groups= {"High","Sanity"})
public void Tc_1() {
	System.out.println("Tc_1 is - Sanity");
}
@AfterMethod
public void close()
{
	System.out.println("Close IT");
}
}
