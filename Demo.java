package package2;//created package package2

import java.io.IOException;
//ioexception is a class of exception that was raised due to inptu or output

import package1.Student;
//initializing package1 and student

public class Demo {
	//creating class demo
	//classes are the basics of opp(object oriented programming

	 public static void main(String []args) throws IOException{
			//TODO Auto-generated method stub
				//Here public is a access modifier which defines who can access this method
				//Here static a keyword which identifies class related thing
				//void is used to define return type of the method,void means method wont return any value
				//main is name of method
				//declares method String[]
				//String[]args means arguments will be passed into main method and says that main() as a parameter
			 
			 Student s =new Student();//taking new student
			 s.accept();//accepting
			 
		 }

}