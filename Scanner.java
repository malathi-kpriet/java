
//Built -in package


import java.util.Scanner;

public class Scanner{

	public static void main(String[] args){


		Scanner Obj= new Scanner(System.in);        // to get input from user
		System.out.println("Enter your name");

		String name=Obj.nextline();        //to reads the user input
		System.out.println(name);
}
}