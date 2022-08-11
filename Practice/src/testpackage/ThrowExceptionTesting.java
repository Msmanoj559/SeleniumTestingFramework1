package testpackage;

public class ThrowExceptionTesting 
{
public void getData(int a)
{
	if (a<10)
	{
		throw(new ArithmeticException()); // Manually throw an exception.
										 // Written inside the  method body.
										//	We can throw only one exception.
									   // We need to pass the object of exception class.
	}									
	else
	{
		System.out.println("NUmber is : " + a);
	}
}
}
