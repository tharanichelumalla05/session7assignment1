/*programing for calling protected method of class inside another class of different package*/

package package1;// here I have created a package as package1
import java.io.IOException;
//ioexception is a class of exception that was raised due to inptu or output
import java.util.*;
 public class Student {
	//declares a class called Student
			//classes are the basics of opps(object oriented programming)
 private String name ="veena";//here we are taking string and int data type as primitive to declare
 private int rollno = 25;//initilaizing variables
 public void accept ()throws IOException{
	 //Here public is a access modifier which defines who can access this method
		//void is used to define return type of the method,void means method wont return any value
	 Scanner sc =new Scanner(System.in);
	 System.out.println("enter name: "+name );//to accept name and roll no
	// system is used to return code
	 //out is a static number
				//Println is used to print text enter name and gives output
	 
	 name=sc.toString();//taking name sc
	 System.out.println("rollno: "+rollno );
	 // system is used to return code
			 //out is a static number
						//Println is used to print text enter name and gives output
	 rollno=sc.nextInt();//rollno equal to sc
 }
 }
 
/* class Demo{
	 
	 public static void main(String []args) throws IOException{
		 
		 Student s =new Student();
		 s.accept();
		 
	 }*/
	 
	 
 
 
 

