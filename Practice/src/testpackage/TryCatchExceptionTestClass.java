package testpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TryCatchExceptionTestClass 
{
public void getData()
{
	try
	{
		File FileObject=new File("D://TestData.txt");
		FileReader FileReaderObject=new FileReader(FileObject);	
		int a=4;
		int b=0;
		int c =a/b;
		System.out.println(c);
//		System.out.println(FileReaderObject.read());
		System.out.println("Start");
	}
	
	catch(FileNotFoundException ExceptionObj)
	{
	System.out.println("Error - Ecxeption of File not Found");	
	}
	
	catch(Exception ExceptionObj)
	{
		System.out.println("Error - Exception coming");
	}
	
	finally 
	{
		System.out.println("Excecuted");
	}
	
}
}
