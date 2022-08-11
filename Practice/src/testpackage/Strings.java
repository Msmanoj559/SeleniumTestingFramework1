package testpackage;
import java.util.Scanner;

public class Strings 
{
public static void main(String[] args) 
{

Scanner sc=new Scanner (System.in);
String name=sc.next();
System.out.println("Your name is : " + name);
//concatenation
String FirstName="TOny";
String LastName="Stark";
String FullName= FirstName + LastName;
System.out.println(FullName.length());
}
}
