package fileHandle;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteMultipleFileData 

{
public void readWriteData() throws IOException
{
File file1Object=new File("D://TestData.txt");
File file2Object=new File("D://TestData123.txt");
File file3Object=new File("D://TestData3.txt");

FileReader fileReader1Object=new FileReader(file1Object);
FileReader fileReader2Object=new FileReader(file2Object);
FileWriter fileWriterObject=new FileWriter(file3Object);

BufferedReader bufferedReaderObject1=new BufferedReader(fileReader1Object);
BufferedReader bufferedReaderObject2=new BufferedReader(fileReader2Object);
BufferedWriter bufferedWriterObject=new BufferedWriter(fileWriterObject);

String S1=bufferedReaderObject1.readLine();
while(S1!=null)
{
	bufferedWriterObject.write(S1);
	S1=bufferedReaderObject1.readLine();
	bufferedWriterObject.newLine();
}

String S2=bufferedReaderObject2.readLine();
{
	while(S2!=null)
	{
		bufferedWriterObject.write(S2);
		S2=bufferedReaderObject2.readLine();
		bufferedWriterObject.newLine();
	}
}
bufferedWriterObject.flush();
bufferedWriterObject.close();


}
}
