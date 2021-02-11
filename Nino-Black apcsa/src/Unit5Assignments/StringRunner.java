package Unit5Assignments;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

import Unit4Assignments.Discount;

public class StringRunner
{
	public static void main ( String[] args )
	{
		StringOddOrEven test = new StringOddOrEven();
        Scanner keyboard = new Scanner(System.in);
		out.print("Enter a word :: ");
		String word = keyboard.next();
		test.setString(word);
		System.out.println(test.toString());
	}
}