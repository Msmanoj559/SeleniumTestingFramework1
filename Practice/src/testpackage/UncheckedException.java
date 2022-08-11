package testpackage;

public class UncheckedException {
	public static void main(String args[]) {
	try
	{
		int a=4;
		int b=0;
		int c=a/b;
	System.out.println(c);
	}
	catch(ArithmeticException e)
	{
		System.out.println(e.getMessage() + " occured Please check" ); // Unchecked Exception
	}
	
	}
}
