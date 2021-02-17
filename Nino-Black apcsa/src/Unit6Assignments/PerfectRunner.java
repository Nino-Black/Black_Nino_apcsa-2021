package Unit6Assignments;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

import java.util.Scanner; 

public class PerfectRunner
{
	public static void main( String args[] )
	{
		//add test cases
		Perfect test = new Perfect();
		Scanner keyboard = new Scanner(System.in);
		out.print("Enter a number :: ");
		int num = keyboard.nextInt();
		test.setNum(num);
		System.out.println(test.toString());														
	}
}