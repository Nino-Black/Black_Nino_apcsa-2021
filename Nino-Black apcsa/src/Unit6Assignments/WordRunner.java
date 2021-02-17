package Unit6Assignments;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

import java.util.Scanner;

public class WordRunner
{
	public static void main ( String[] args )
	{
		//add test cases	
		Word test = new Word();
		Scanner keyboard = new Scanner(System.in);
		out.print("Enter a word :: ");
		String word = keyboard.next();
		test.setString(word);
		System.out.println(test.getFirstChar());
		System.out.println(test.getLastChar());
		System.out.println(test.getBackWards());
		System.out.println(test.toString());
	}
}