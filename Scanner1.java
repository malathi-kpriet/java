
//Built -in package


import java.util.Scanner;

public class Scanner1{

	public static void main(String[] args){


		Scanner Obj= new Scanner(System.in);        // to get input from user
		System.out.println("Enter your name");

		String name=Obj.nextLine();        //to reads the user input
		System.out.println(name);
}
}