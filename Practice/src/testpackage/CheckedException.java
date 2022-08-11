package testpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException 
{
public void getData() throws Exception //Declare the Exception someother can handle it
									  //Can be declare on method level
									 //We can throw multiple exception.
									//Exception class Name.
{
File FileObject=new File("D://TestData.txt");
FileReader FileReaderObject=new FileReader(FileObject); // throwing - Unhandled exception type FileNotFoundException
}
}
