package Unit11Assignments;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWordRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		String choice = "";

		do
		{
			out.print("Enter a word : ");
			String word = keyboard.next();

			printTriangle(word);

			System.out.println("\nDo you want to enter more sample input? ");

			choice = keyboard.next();
		}
		while (choice.equals("y")||choice.equals("Y"));
	}
	
	public static void printTriangle(String word)
	{
		for (int i = 0; i < word.length(); i++) {
			for (int j = 0; j <= i; j++) {
				out.print(word.substring(0, i + 1));
			}
			out.println();
		}
	}
}