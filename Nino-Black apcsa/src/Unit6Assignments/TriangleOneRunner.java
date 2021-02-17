package Unit6Assignments;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

import java.util.Scanner;

public class TriangleOneRunner
{
	public static void main ( String[] args )
	{
		//add test cases
		TriangleOne test = new TriangleOne();
		Scanner keyboard = new Scanner(System.in);
		out.print("Enter a word :: ");
		String word = keyboard.next();
		test.setWord(word);
		test.print();
		System.out.println("");
	}
}