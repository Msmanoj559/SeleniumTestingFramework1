package fileHandle;
import java.io.File;
import java.io.IOException;

public class A {
    public static void main(String[] args) throws IOException
    {
//        // File name specified
//        File obj = new File("myfile.txt");
//          System.out.println("File Created!");
    	ReadDataFromFile r=new ReadDataFromFile();
//    	r.readData();
    	r.writeData("Central state Library Testing Manoj Kumar Sharma");
    }
}