package fileHandle;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadDataFromFile 

{
public void writeData(String data) throws IOException
{
File fileObject=new File("D://TestData123.txt");
FileWriter fileWriterObject=new FileWriter(fileObject,true);
//fileWriterObject.write("Hello Testing World"); // Write Directly
//fileWriterObject.write(data); // Dynamic Write
//fileWriterObject.flush();
//fileWriterObject.close();
BufferedWriter bufferedWriterObject =new  BufferedWriter (fileWriterObject); 
bufferedWriterObject.newLine(); // without append it write in new line by using buffered without break
bufferedWriterObject.write(data);
bufferedWriterObject.flush();
bufferedWriterObject.close();
}
	
	
public void readData() throws IOException
{
File f1=new File("D://TestData.txt"); // select the file
FileReader fr=new FileReader(f1); // read file

//int i=fr.read(); // ASCII
//	while(i!=-1)
//	{
//		System.out.println((char)i);
//		i=fr.read();
//	}
BufferedReader bufferObject=new BufferedReader(fr);
String bufferString=bufferObject.readLine();
while(bufferString!=null)
{
	System.out.println(bufferString);
	bufferString=bufferObject.readLine();
}

}
}
